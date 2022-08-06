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
import java.util.List;

@JacksonStdImpl
public final class IndexedStringListSerializer extends StaticListSerializerBase<List<String>> {
    public static final IndexedStringListSerializer instance = new IndexedStringListSerializer();

    protected IndexedStringListSerializer() {
        super(List.class);
    }

    private final void serializeContents(List<String> list, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, int i2) {
        jsonGenerator.setCurrentValue(list);
        int i3 = 0;
        while (i3 < i2) {
            try {
                String str = list.get(i3);
                if (str == null) {
                    serializerProvider.defaultSerializeNull(jsonGenerator);
                } else {
                    jsonGenerator.writeString(str);
                }
                i3++;
            } catch (Exception e2) {
                wrapAndThrow(serializerProvider, (Throwable) e2, (Object) list, i3);
                throw null;
            }
        }
    }

    public JsonSerializer<?> _withResolved(BeanProperty beanProperty, Boolean bool) {
        return new IndexedStringListSerializer(this, bool);
    }

    /* access modifiers changed from: protected */
    public void acceptContentVisitor(JsonArrayFormatVisitor jsonArrayFormatVisitor) {
        jsonArrayFormatVisitor.itemsFormat(JsonFormatTypes.STRING);
    }

    /* access modifiers changed from: protected */
    public JsonNode contentSchema() {
        return createSchemaNode("string", true);
    }

    public IndexedStringListSerializer(IndexedStringListSerializer indexedStringListSerializer, Boolean bool) {
        super(indexedStringListSerializer, bool);
    }

    public void serialize(List<String> list, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        int size = list.size();
        if (size != 1 || ((this._unwrapSingle != null || !serializerProvider.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) && this._unwrapSingle != Boolean.TRUE)) {
            jsonGenerator.writeStartArray(size);
            serializeContents(list, jsonGenerator, serializerProvider, size);
            jsonGenerator.writeEndArray();
            return;
        }
        serializeContents(list, jsonGenerator, serializerProvider, 1);
    }

    public void serializeWithType(List<String> list, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
        WritableTypeId writeTypePrefix = typeSerializer.writeTypePrefix(jsonGenerator, typeSerializer.typeId(list, JsonToken.START_ARRAY));
        serializeContents(list, jsonGenerator, serializerProvider, list.size());
        typeSerializer.writeTypeSuffix(jsonGenerator, writeTypePrefix);
    }
}
