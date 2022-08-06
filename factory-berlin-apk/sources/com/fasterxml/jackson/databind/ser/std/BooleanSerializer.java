package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import java.lang.reflect.Type;

@JacksonStdImpl
public final class BooleanSerializer extends StdScalarSerializer<Object> implements ContextualSerializer {
    protected final boolean _forPrimitive;

    static final class AsNumber extends StdScalarSerializer<Object> implements ContextualSerializer {
        protected final boolean _forPrimitive;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public AsNumber(boolean z) {
            super(z ? Boolean.TYPE : Boolean.class, false);
            this._forPrimitive = z;
        }

        public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) {
            visitIntFormat(jsonFormatVisitorWrapper, javaType, JsonParser.NumberType.INT);
        }

        public JsonSerializer<?> createContextual(SerializerProvider serializerProvider, BeanProperty beanProperty) {
            JsonFormat.Value findFormatOverrides = findFormatOverrides(serializerProvider, beanProperty, Boolean.class);
            return (findFormatOverrides == null || findFormatOverrides.getShape().isNumeric()) ? this : new BooleanSerializer(this._forPrimitive);
        }

        public void serialize(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
            jsonGenerator.writeNumber(Boolean.FALSE.equals(obj) ^ true ? 1 : 0);
        }

        public final void serializeWithType(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
            jsonGenerator.writeBoolean(Boolean.TRUE.equals(obj));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BooleanSerializer(boolean z) {
        super(z ? Boolean.TYPE : Boolean.class, false);
        this._forPrimitive = z;
    }

    public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) {
        jsonFormatVisitorWrapper.expectBooleanFormat(javaType);
    }

    public JsonSerializer<?> createContextual(SerializerProvider serializerProvider, BeanProperty beanProperty) {
        JsonFormat.Value findFormatOverrides = findFormatOverrides(serializerProvider, beanProperty, Boolean.class);
        return (findFormatOverrides == null || !findFormatOverrides.getShape().isNumeric()) ? this : new AsNumber(this._forPrimitive);
    }

    public JsonNode getSchema(SerializerProvider serializerProvider, Type type) {
        return createSchemaNode("boolean", !this._forPrimitive);
    }

    public void serialize(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        jsonGenerator.writeBoolean(Boolean.TRUE.equals(obj));
    }

    public final void serializeWithType(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
        jsonGenerator.writeBoolean(Boolean.TRUE.equals(obj));
    }
}
