package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonArrayFormatVisitor;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitable;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonIntegerFormatVisitor;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonNumberFormatVisitor;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonStringFormatVisitor;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat;
import com.fasterxml.jackson.databind.jsonschema.SchemaAware;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.PropertyFilter;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.Converter;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Map;

public abstract class StdSerializer<T> extends JsonSerializer<T> implements JsonFormatVisitable, SchemaAware, Serializable {
    private static final Object KEY_CONTENT_CONVERTER_LOCK = new Object();
    protected final Class<T> _handledType;

    protected StdSerializer(Class<T> cls) {
        this._handledType = cls;
    }

    protected static final boolean _neitherNull(Object obj, Object obj2) {
        return (obj == null || obj2 == null) ? false : true;
    }

    protected static final boolean _nonEmpty(Collection<?> collection) {
        return collection != null && !collection.isEmpty();
    }

    public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) {
        jsonFormatVisitorWrapper.expectAnyFormat(javaType);
    }

    /* access modifiers changed from: protected */
    public ObjectNode createSchemaNode(String str) {
        ObjectNode objectNode = JsonNodeFactory.instance.objectNode();
        objectNode.put("type", str);
        return objectNode;
    }

    /* access modifiers changed from: protected */
    public JsonSerializer<?> findAnnotatedContentSerializer(SerializerProvider serializerProvider, BeanProperty beanProperty) {
        Object findContentSerializer;
        if (beanProperty == null) {
            return null;
        }
        AnnotatedMember member = beanProperty.getMember();
        AnnotationIntrospector annotationIntrospector = serializerProvider.getAnnotationIntrospector();
        if (member == null || (findContentSerializer = annotationIntrospector.findContentSerializer(member)) == null) {
            return null;
        }
        return serializerProvider.serializerInstance(member, findContentSerializer);
    }

    /* access modifiers changed from: protected */
    public JsonSerializer<?> findContextualConvertingSerializer(SerializerProvider serializerProvider, BeanProperty beanProperty, JsonSerializer<?> jsonSerializer) {
        Map map = (Map) serializerProvider.getAttribute(KEY_CONTENT_CONVERTER_LOCK);
        if (map == null) {
            map = new IdentityHashMap();
            serializerProvider.setAttribute(KEY_CONTENT_CONVERTER_LOCK, map);
        } else if (map.get(beanProperty) != null) {
            return jsonSerializer;
        }
        map.put(beanProperty, Boolean.TRUE);
        try {
            JsonSerializer<?> findConvertingContentSerializer = findConvertingContentSerializer(serializerProvider, beanProperty, jsonSerializer);
            if (findConvertingContentSerializer != null) {
                return serializerProvider.handleSecondaryContextualization(findConvertingContentSerializer, beanProperty);
            }
            map.remove(beanProperty);
            return jsonSerializer;
        } finally {
            map.remove(beanProperty);
        }
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public JsonSerializer<?> findConvertingContentSerializer(SerializerProvider serializerProvider, BeanProperty beanProperty, JsonSerializer<?> jsonSerializer) {
        AnnotatedMember member;
        Object findSerializationContentConverter;
        AnnotationIntrospector annotationIntrospector = serializerProvider.getAnnotationIntrospector();
        if (!_neitherNull(annotationIntrospector, beanProperty) || (member = beanProperty.getMember()) == null || (findSerializationContentConverter = annotationIntrospector.findSerializationContentConverter(member)) == null) {
            return jsonSerializer;
        }
        Converter<Object, Object> converterInstance = serializerProvider.converterInstance(beanProperty.getMember(), findSerializationContentConverter);
        JavaType outputType = converterInstance.getOutputType(serializerProvider.getTypeFactory());
        JsonSerializer<Object> jsonSerializer2 = jsonSerializer;
        if (jsonSerializer == null) {
            jsonSerializer2 = jsonSerializer;
            if (!outputType.isJavaLangObject()) {
                jsonSerializer2 = serializerProvider.findValueSerializer(outputType);
            }
        }
        return new StdDelegatingSerializer(converterInstance, outputType, jsonSerializer2);
    }

    /* access modifiers changed from: protected */
    public Boolean findFormatFeature(SerializerProvider serializerProvider, BeanProperty beanProperty, Class<?> cls, JsonFormat.Feature feature) {
        JsonFormat.Value findFormatOverrides = findFormatOverrides(serializerProvider, beanProperty, cls);
        if (findFormatOverrides != null) {
            return findFormatOverrides.getFeature(feature);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public JsonFormat.Value findFormatOverrides(SerializerProvider serializerProvider, BeanProperty beanProperty, Class<?> cls) {
        if (beanProperty != null) {
            return beanProperty.findPropertyFormat(serializerProvider.getConfig(), cls);
        }
        return serializerProvider.getDefaultPropertyFormat(cls);
    }

    /* access modifiers changed from: protected */
    public PropertyFilter findPropertyFilter(SerializerProvider serializerProvider, Object obj, Object obj2) {
        FilterProvider filterProvider = serializerProvider.getFilterProvider();
        if (filterProvider == null) {
            Class handledType = handledType();
            serializerProvider.reportBadDefinition((Class<?>) handledType, "Cannot resolve PropertyFilter with id '" + obj + "'; no FilterProvider configured");
        }
        return filterProvider.findPropertyFilter(obj, obj2);
    }

    public JsonNode getSchema(SerializerProvider serializerProvider, Type type) {
        return createSchemaNode("string");
    }

    public Class<T> handledType() {
        return this._handledType;
    }

    /* access modifiers changed from: protected */
    public boolean isDefaultSerializer(JsonSerializer<?> jsonSerializer) {
        return ClassUtil.isJacksonStdImpl((Object) jsonSerializer);
    }

    /* access modifiers changed from: protected */
    public void visitArrayFormat(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType, JsonSerializer<?> jsonSerializer, JavaType javaType2) {
        JsonArrayFormatVisitor expectArrayFormat = jsonFormatVisitorWrapper.expectArrayFormat(javaType);
        if (_neitherNull(expectArrayFormat, jsonSerializer)) {
            expectArrayFormat.itemsFormat(jsonSerializer, javaType2);
        }
    }

    /* access modifiers changed from: protected */
    public void visitFloatFormat(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType, JsonParser.NumberType numberType) {
        JsonNumberFormatVisitor expectNumberFormat = jsonFormatVisitorWrapper.expectNumberFormat(javaType);
        if (expectNumberFormat != null) {
            expectNumberFormat.numberType(numberType);
        }
    }

    /* access modifiers changed from: protected */
    public void visitIntFormat(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType, JsonParser.NumberType numberType) {
        JsonIntegerFormatVisitor expectIntegerFormat = jsonFormatVisitorWrapper.expectIntegerFormat(javaType);
        if (_neitherNull(expectIntegerFormat, numberType)) {
            expectIntegerFormat.numberType(numberType);
        }
    }

    /* access modifiers changed from: protected */
    public void visitStringFormat(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) {
        jsonFormatVisitorWrapper.expectStringFormat(javaType);
    }

    public void wrapAndThrow(SerializerProvider serializerProvider, Throwable th, Object obj, String str) {
        while ((th instanceof InvocationTargetException) && th.getCause() != null) {
            th = th.getCause();
        }
        ClassUtil.throwIfError(th);
        boolean z = serializerProvider == null || serializerProvider.isEnabled(SerializationFeature.WRAP_EXCEPTIONS);
        if (th instanceof IOException) {
            if (!z || !(th instanceof JsonMappingException)) {
                throw ((IOException) th);
            }
        } else if (!z) {
            ClassUtil.throwIfRTE(th);
        }
        throw JsonMappingException.wrapWithPath(th, obj, str);
    }

    public JsonNode getSchema(SerializerProvider serializerProvider, Type type, boolean z) {
        ObjectNode objectNode = (ObjectNode) getSchema(serializerProvider, type);
        if (!z) {
            objectNode.put("required", !z);
        }
        return objectNode;
    }

    /* access modifiers changed from: protected */
    public void visitStringFormat(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType, JsonValueFormat jsonValueFormat) {
        JsonStringFormatVisitor expectStringFormat = jsonFormatVisitorWrapper.expectStringFormat(javaType);
        if (expectStringFormat != null) {
            expectStringFormat.format(jsonValueFormat);
        }
    }

    protected StdSerializer(JavaType javaType) {
        this._handledType = javaType.getRawClass();
    }

    /* access modifiers changed from: protected */
    public ObjectNode createSchemaNode(String str, boolean z) {
        ObjectNode createSchemaNode = createSchemaNode(str);
        if (!z) {
            createSchemaNode.put("required", !z);
        }
        return createSchemaNode;
    }

    /* access modifiers changed from: protected */
    public void visitArrayFormat(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType, JsonFormatTypes jsonFormatTypes) {
        JsonArrayFormatVisitor expectArrayFormat = jsonFormatVisitorWrapper.expectArrayFormat(javaType);
        if (expectArrayFormat != null) {
            expectArrayFormat.itemsFormat(jsonFormatTypes);
        }
    }

    /* access modifiers changed from: protected */
    public void visitIntFormat(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType, JsonParser.NumberType numberType, JsonValueFormat jsonValueFormat) {
        JsonIntegerFormatVisitor expectIntegerFormat = jsonFormatVisitorWrapper.expectIntegerFormat(javaType);
        if (expectIntegerFormat != null) {
            if (numberType != null) {
                expectIntegerFormat.numberType(numberType);
            }
            if (jsonValueFormat != null) {
                expectIntegerFormat.format(jsonValueFormat);
            }
        }
    }

    protected StdSerializer(Class<?> cls, boolean z) {
        this._handledType = cls;
    }

    protected StdSerializer(StdSerializer<?> stdSerializer) {
        this._handledType = stdSerializer._handledType;
    }

    public void wrapAndThrow(SerializerProvider serializerProvider, Throwable th, Object obj, int i2) {
        while ((th instanceof InvocationTargetException) && th.getCause() != null) {
            th = th.getCause();
        }
        ClassUtil.throwIfError(th);
        boolean z = serializerProvider == null || serializerProvider.isEnabled(SerializationFeature.WRAP_EXCEPTIONS);
        if (th instanceof IOException) {
            if (!z || !(th instanceof JsonMappingException)) {
                throw ((IOException) th);
            }
        } else if (!z) {
            ClassUtil.throwIfRTE(th);
        }
        throw JsonMappingException.wrapWithPath(th, obj, i2);
    }
}
