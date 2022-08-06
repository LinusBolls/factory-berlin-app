package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonArrayFormatVisitor;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.std.StaticListSerializerBase;
import java.util.Collection;

@JacksonStdImpl
public class StringCollectionSerializer extends StaticListSerializerBase<Collection<String>> {
    public static final StringCollectionSerializer instance = new StringCollectionSerializer();

    protected StringCollectionSerializer() {
        super(Collection.class);
    }

    private final void serializeContents(Collection<String> collection, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        int i2 = 0;
        try {
            for (String next : collection) {
                if (next == null) {
                    serializerProvider.defaultSerializeNull(jsonGenerator);
                } else {
                    jsonGenerator.writeString(next);
                }
                i2++;
            }
        } catch (Exception e2) {
            wrapAndThrow(serializerProvider, (Throwable) e2, (Object) collection, 0);
            throw null;
        }
    }

    public JsonSerializer<?> _withResolved(BeanProperty beanProperty, Boolean bool) {
        return new StringCollectionSerializer(this, bool);
    }

    /* access modifiers changed from: protected */
    public void acceptContentVisitor(JsonArrayFormatVisitor jsonArrayFormatVisitor) {
        jsonArrayFormatVisitor.itemsFormat(JsonFormatTypes.STRING);
    }

    /* access modifiers changed from: protected */
    public JsonNode contentSchema() {
        return createSchemaNode("string", true);
    }

    protected StringCollectionSerializer(StringCollectionSerializer stringCollectionSerializer, Boolean bool) {
        super(stringCollectionSerializer, bool);
    }

    public void serialize(Collection<String> collection, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        jsonGenerator.setCurrentValue(collection);
        int size = collection.size();
        if (size != 1 || ((this._unwrapSingle != null || !serializerProvider.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) && this._unwrapSingle != Boolean.TRUE)) {
            jsonGenerator.writeStartArray(size);
            serializeContents(collection, jsonGenerator, serializerProvider);
            jsonGenerator.writeEndArray();
            return;
        }
        serializeContents(collection, jsonGenerator, serializerProvider);
    }

    public void serializeWithType(Collection<String> collection, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
        jsonGenerator.setCurrentValue(collection);
        WritableTypeId writeTypePrefix = typeSerializer.writeTypePrefix(jsonGenerator, typeSerializer.typeId(collection, JsonToken.START_ARRAY));
        serializeContents(collection, jsonGenerator, serializerProvider);
        typeSerializer.writeTypeSuffix(jsonGenerator, writeTypePrefix);
    }
}
