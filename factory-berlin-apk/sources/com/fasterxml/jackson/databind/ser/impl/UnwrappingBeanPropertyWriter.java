package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;

public class UnwrappingBeanPropertyWriter extends BeanPropertyWriter implements Serializable {
    protected final NameTransformer _nameTransformer;

    public UnwrappingBeanPropertyWriter(BeanPropertyWriter beanPropertyWriter, NameTransformer nameTransformer) {
        super(beanPropertyWriter);
        this._nameTransformer = nameTransformer;
    }

    /* access modifiers changed from: protected */
    public void _depositSchemaProperty(ObjectNode objectNode, JsonNode jsonNode) {
        JsonNode jsonNode2 = jsonNode.get("properties");
        if (jsonNode2 != null) {
            Iterator<Map.Entry<String, JsonNode>> fields = jsonNode2.fields();
            while (fields.hasNext()) {
                Map.Entry next = fields.next();
                String str = (String) next.getKey();
                NameTransformer nameTransformer = this._nameTransformer;
                if (nameTransformer != null) {
                    str = nameTransformer.transform(str);
                }
                objectNode.set(str, (JsonNode) next.getValue());
            }
        }
    }

    /* access modifiers changed from: protected */
    public JsonSerializer<Object> _findAndAddDynamic(PropertySerializerMap propertySerializerMap, Class<?> cls, SerializerProvider serializerProvider) {
        JsonSerializer<Object> jsonSerializer;
        JavaType javaType = this._nonTrivialBaseType;
        if (javaType != null) {
            jsonSerializer = serializerProvider.findValueSerializer(serializerProvider.constructSpecializedType(javaType, cls), (BeanProperty) this);
        } else {
            jsonSerializer = serializerProvider.findValueSerializer(cls, (BeanProperty) this);
        }
        NameTransformer nameTransformer = this._nameTransformer;
        if (jsonSerializer.isUnwrappingSerializer() && (jsonSerializer instanceof UnwrappingBeanSerializer)) {
            nameTransformer = NameTransformer.chainedTransformer(nameTransformer, ((UnwrappingBeanSerializer) jsonSerializer)._nameTransformer);
        }
        JsonSerializer<Object> unwrappingSerializer = jsonSerializer.unwrappingSerializer(nameTransformer);
        this._dynamicSerializers = this._dynamicSerializers.newWith(cls, unwrappingSerializer);
        return unwrappingSerializer;
    }

    /* access modifiers changed from: protected */
    public UnwrappingBeanPropertyWriter _new(NameTransformer nameTransformer, SerializedString serializedString) {
        return new UnwrappingBeanPropertyWriter(this, nameTransformer, serializedString);
    }

    public void assignSerializer(JsonSerializer<Object> jsonSerializer) {
        if (jsonSerializer != null) {
            NameTransformer nameTransformer = this._nameTransformer;
            if (jsonSerializer.isUnwrappingSerializer() && (jsonSerializer instanceof UnwrappingBeanSerializer)) {
                nameTransformer = NameTransformer.chainedTransformer(nameTransformer, ((UnwrappingBeanSerializer) jsonSerializer)._nameTransformer);
            }
            jsonSerializer = jsonSerializer.unwrappingSerializer(nameTransformer);
        }
        super.assignSerializer(jsonSerializer);
    }

    public void depositSchemaProperty(final JsonObjectFormatVisitor jsonObjectFormatVisitor, SerializerProvider serializerProvider) {
        JsonSerializer<Object> unwrappingSerializer = serializerProvider.findValueSerializer(getType(), (BeanProperty) this).unwrappingSerializer(this._nameTransformer);
        if (unwrappingSerializer.isUnwrappingSerializer()) {
            unwrappingSerializer.acceptJsonFormatVisitor(new JsonFormatVisitorWrapper.Base(this, serializerProvider) {
                public JsonObjectFormatVisitor expectObjectFormat(JavaType javaType) {
                    return jsonObjectFormatVisitor;
                }
            }, getType());
        } else {
            super.depositSchemaProperty(jsonObjectFormatVisitor, serializerProvider);
        }
    }

    public void serializeAsField(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        Object obj2 = get(obj);
        if (obj2 != null) {
            JsonSerializer<Object> jsonSerializer = this._serializer;
            if (jsonSerializer == null) {
                Class<?> cls = obj2.getClass();
                PropertySerializerMap propertySerializerMap = this._dynamicSerializers;
                JsonSerializer<Object> serializerFor = propertySerializerMap.serializerFor(cls);
                jsonSerializer = serializerFor == null ? _findAndAddDynamic(propertySerializerMap, cls, serializerProvider) : serializerFor;
            }
            Object obj3 = this._suppressableValue;
            if (obj3 != null) {
                if (BeanPropertyWriter.MARKER_FOR_EMPTY == obj3) {
                    if (jsonSerializer.isEmpty(serializerProvider, obj2)) {
                        return;
                    }
                } else if (obj3.equals(obj2)) {
                    return;
                }
            }
            if (obj2 != obj || !_handleSelfReference(obj, jsonGenerator, serializerProvider, jsonSerializer)) {
                if (!jsonSerializer.isUnwrappingSerializer()) {
                    jsonGenerator.writeFieldName((SerializableString) this._name);
                }
                TypeSerializer typeSerializer = this._typeSerializer;
                if (typeSerializer == null) {
                    jsonSerializer.serialize(obj2, jsonGenerator, serializerProvider);
                } else {
                    jsonSerializer.serializeWithType(obj2, jsonGenerator, serializerProvider, typeSerializer);
                }
            }
        }
    }

    public UnwrappingBeanPropertyWriter rename(NameTransformer nameTransformer) {
        return _new(NameTransformer.chainedTransformer(nameTransformer, this._nameTransformer), new SerializedString(nameTransformer.transform(this._name.getValue())));
    }

    protected UnwrappingBeanPropertyWriter(UnwrappingBeanPropertyWriter unwrappingBeanPropertyWriter, NameTransformer nameTransformer, SerializedString serializedString) {
        super((BeanPropertyWriter) unwrappingBeanPropertyWriter, serializedString);
        this._nameTransformer = nameTransformer;
    }
}
