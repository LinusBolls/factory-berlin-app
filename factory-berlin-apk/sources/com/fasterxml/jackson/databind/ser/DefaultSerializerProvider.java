package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonschema.JsonSchema;
import com.fasterxml.jackson.databind.jsonschema.SchemaAware;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ser.impl.WritableObjectId;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

public abstract class DefaultSerializerProvider extends SerializerProvider implements Serializable {
    protected transient JsonGenerator _generator;
    protected transient ArrayList<ObjectIdGenerator<?>> _objectIdGenerators;
    protected transient Map<Object, WritableObjectId> _seenObjectIds;

    public static final class Impl extends DefaultSerializerProvider {
        public Impl() {
        }

        public DefaultSerializerProvider copy() {
            if (Impl.class == Impl.class) {
                return new Impl(this);
            }
            DefaultSerializerProvider.super.copy();
            throw null;
        }

        public Impl(Impl impl) {
            super(impl);
        }

        public Impl createInstance(SerializationConfig serializationConfig, SerializerFactory serializerFactory) {
            return new Impl(this, serializationConfig, serializerFactory);
        }

        protected Impl(SerializerProvider serializerProvider, SerializationConfig serializationConfig, SerializerFactory serializerFactory) {
            super(serializerProvider, serializationConfig, serializerFactory);
        }
    }

    protected DefaultSerializerProvider() {
    }

    private final void _serialize(JsonGenerator jsonGenerator, Object obj, JsonSerializer<Object> jsonSerializer, PropertyName propertyName) {
        try {
            jsonGenerator.writeStartObject();
            jsonGenerator.writeFieldName(propertyName.simpleAsEncoded(this._config));
            jsonSerializer.serialize(obj, jsonGenerator, this);
            jsonGenerator.writeEndObject();
        } catch (Exception e2) {
            throw _wrapAsIOE(jsonGenerator, e2);
        }
    }

    private IOException _wrapAsIOE(JsonGenerator jsonGenerator, Exception exc) {
        if (exc instanceof IOException) {
            return (IOException) exc;
        }
        String exceptionMessage = ClassUtil.exceptionMessage(exc);
        if (exceptionMessage == null) {
            exceptionMessage = "[no message for " + exc.getClass().getName() + "]";
        }
        return new JsonMappingException((Closeable) jsonGenerator, exceptionMessage, (Throwable) exc);
    }

    /* access modifiers changed from: protected */
    public Map<Object, WritableObjectId> _createObjectIdMap() {
        if (isEnabled(SerializationFeature.USE_EQUALITY_FOR_OBJECT_ID)) {
            return new HashMap();
        }
        return new IdentityHashMap();
    }

    /* access modifiers changed from: protected */
    public void _serializeNull(JsonGenerator jsonGenerator) {
        try {
            getDefaultNullValueSerializer().serialize(null, jsonGenerator, this);
        } catch (Exception e2) {
            throw _wrapAsIOE(jsonGenerator, e2);
        }
    }

    public void acceptJsonFormatVisitor(JavaType javaType, JsonFormatVisitorWrapper jsonFormatVisitorWrapper) {
        if (javaType != null) {
            jsonFormatVisitorWrapper.setProvider(this);
            findValueSerializer(javaType, (BeanProperty) null).acceptJsonFormatVisitor(jsonFormatVisitorWrapper, javaType);
            return;
        }
        throw new IllegalArgumentException("A class must be provided");
    }

    public DefaultSerializerProvider copy() {
        throw new IllegalStateException("DefaultSerializerProvider sub-class not overriding copy()");
    }

    public abstract DefaultSerializerProvider createInstance(SerializationConfig serializationConfig, SerializerFactory serializerFactory);

    public WritableObjectId findObjectId(Object obj, ObjectIdGenerator<?> objectIdGenerator) {
        Map<Object, WritableObjectId> map = this._seenObjectIds;
        if (map == null) {
            this._seenObjectIds = _createObjectIdMap();
        } else {
            WritableObjectId writableObjectId = map.get(obj);
            if (writableObjectId != null) {
                return writableObjectId;
            }
        }
        ObjectIdGenerator<?> objectIdGenerator2 = null;
        ArrayList<ObjectIdGenerator<?>> arrayList = this._objectIdGenerators;
        if (arrayList != null) {
            int i2 = 0;
            int size = arrayList.size();
            while (true) {
                if (i2 >= size) {
                    break;
                }
                ObjectIdGenerator<?> objectIdGenerator3 = this._objectIdGenerators.get(i2);
                if (objectIdGenerator3.canUseFor(objectIdGenerator)) {
                    objectIdGenerator2 = objectIdGenerator3;
                    break;
                }
                i2++;
            }
        } else {
            this._objectIdGenerators = new ArrayList<>(8);
        }
        if (objectIdGenerator2 == null) {
            objectIdGenerator2 = objectIdGenerator.newForSerialization(this);
            this._objectIdGenerators.add(objectIdGenerator2);
        }
        WritableObjectId writableObjectId2 = new WritableObjectId(objectIdGenerator2);
        this._seenObjectIds.put(obj, writableObjectId2);
        return writableObjectId2;
    }

    @Deprecated
    public JsonSchema generateJsonSchema(Class<?> cls) {
        JsonSerializer<Object> findValueSerializer = findValueSerializer(cls, (BeanProperty) null);
        JsonNode schema = findValueSerializer instanceof SchemaAware ? ((SchemaAware) findValueSerializer).getSchema(this, (Type) null) : JsonSchema.getDefaultSchemaNode();
        if (schema instanceof ObjectNode) {
            return new JsonSchema((ObjectNode) schema);
        }
        throw new IllegalArgumentException("Class " + cls.getName() + " would not be serialized as a JSON object and therefore has no schema");
    }

    public JsonGenerator getGenerator() {
        return this._generator;
    }

    public boolean hasSerializerFor(Class<?> cls, AtomicReference<Throwable> atomicReference) {
        if (cls == Object.class && !this._config.isEnabled(SerializationFeature.FAIL_ON_EMPTY_BEANS)) {
            return true;
        }
        try {
            if (_findExplicitUntypedSerializer(cls) != null) {
                return true;
            }
            return false;
        } catch (JsonMappingException e2) {
            if (atomicReference != null) {
                atomicReference.set(e2);
            }
            return false;
        } catch (RuntimeException e3) {
            if (atomicReference != null) {
                atomicReference.set(e3);
                return false;
            }
            throw e3;
        }
    }

    public Object includeFilterInstance(BeanPropertyDefinition beanPropertyDefinition, Class<?> cls) {
        Object obj = null;
        if (cls == null) {
            return null;
        }
        HandlerInstantiator handlerInstantiator = this._config.getHandlerInstantiator();
        if (handlerInstantiator != null) {
            obj = handlerInstantiator.includeFilterInstance(this._config, beanPropertyDefinition, cls);
        }
        return obj == null ? ClassUtil.createInstance(cls, this._config.canOverrideAccessModifiers()) : obj;
    }

    public boolean includeFilterSuppressNulls(Object obj) {
        if (obj == null) {
            return true;
        }
        try {
            return obj.equals((Object) null);
        } catch (Throwable th) {
            reportBadDefinition(obj.getClass(), String.format("Problem determining whether filter of type '%s' should filter out `null` values: (%s) %s", new Object[]{obj.getClass().getName(), th.getClass().getName(), ClassUtil.exceptionMessage(th)}), th);
            throw null;
        }
    }

    public void serializePolymorphic(JsonGenerator jsonGenerator, Object obj, JavaType javaType, JsonSerializer<Object> jsonSerializer, TypeSerializer typeSerializer) {
        boolean z;
        this._generator = jsonGenerator;
        if (obj == null) {
            _serializeNull(jsonGenerator);
            return;
        }
        if (javaType != null && !javaType.getRawClass().isAssignableFrom(obj.getClass())) {
            _reportIncompatibleRootType(obj, javaType);
        }
        if (jsonSerializer == null) {
            if (javaType == null || !javaType.isContainerType()) {
                jsonSerializer = findValueSerializer(obj.getClass(), (BeanProperty) null);
            } else {
                jsonSerializer = findValueSerializer(javaType, (BeanProperty) null);
            }
        }
        PropertyName fullRootName = this._config.getFullRootName();
        if (fullRootName == null) {
            z = this._config.isEnabled(SerializationFeature.WRAP_ROOT_VALUE);
            if (z) {
                jsonGenerator.writeStartObject();
                jsonGenerator.writeFieldName(this._config.findRootName(obj.getClass()).simpleAsEncoded(this._config));
            }
        } else if (fullRootName.isEmpty()) {
            z = false;
        } else {
            jsonGenerator.writeStartObject();
            jsonGenerator.writeFieldName(fullRootName.getSimpleName());
            z = true;
        }
        try {
            jsonSerializer.serializeWithType(obj, jsonGenerator, this, typeSerializer);
            if (z) {
                jsonGenerator.writeEndObject();
            }
        } catch (Exception e2) {
            throw _wrapAsIOE(jsonGenerator, e2);
        }
    }

    public void serializeValue(JsonGenerator jsonGenerator, Object obj) {
        this._generator = jsonGenerator;
        if (obj == null) {
            _serializeNull(jsonGenerator);
            return;
        }
        Class<?> cls = obj.getClass();
        JsonSerializer<Object> findTypedValueSerializer = findTypedValueSerializer(cls, true, (BeanProperty) null);
        PropertyName fullRootName = this._config.getFullRootName();
        if (fullRootName == null) {
            if (this._config.isEnabled(SerializationFeature.WRAP_ROOT_VALUE)) {
                _serialize(jsonGenerator, obj, findTypedValueSerializer, this._config.findRootName(cls));
                return;
            }
        } else if (!fullRootName.isEmpty()) {
            _serialize(jsonGenerator, obj, findTypedValueSerializer, fullRootName);
            return;
        }
        _serialize(jsonGenerator, obj, findTypedValueSerializer);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: java.lang.Class<com.fasterxml.jackson.databind.JsonSerializer$None>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: com.fasterxml.jackson.databind.JsonSerializer<?>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> serializerInstance(com.fasterxml.jackson.databind.introspect.Annotated r4, java.lang.Object r5) {
        /*
            r3 = this;
            r0 = 0
            if (r5 != 0) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.fasterxml.jackson.databind.JsonSerializer
            if (r1 == 0) goto L_0x000b
            com.fasterxml.jackson.databind.JsonSerializer r5 = (com.fasterxml.jackson.databind.JsonSerializer) r5
            goto L_0x0044
        L_0x000b:
            boolean r1 = r5 instanceof java.lang.Class
            if (r1 == 0) goto L_0x006b
            java.lang.Class r5 = (java.lang.Class) r5
            java.lang.Class<com.fasterxml.jackson.databind.JsonSerializer$None> r1 = com.fasterxml.jackson.databind.JsonSerializer.None.class
            if (r5 == r1) goto L_0x006a
            boolean r1 = com.fasterxml.jackson.databind.util.ClassUtil.isBogusClass(r5)
            if (r1 == 0) goto L_0x001c
            goto L_0x006a
        L_0x001c:
            java.lang.Class<com.fasterxml.jackson.databind.JsonSerializer> r1 = com.fasterxml.jackson.databind.JsonSerializer.class
            boolean r1 = r1.isAssignableFrom(r5)
            if (r1 == 0) goto L_0x0048
            com.fasterxml.jackson.databind.SerializationConfig r1 = r3._config
            com.fasterxml.jackson.databind.cfg.HandlerInstantiator r1 = r1.getHandlerInstantiator()
            if (r1 != 0) goto L_0x002d
            goto L_0x0033
        L_0x002d:
            com.fasterxml.jackson.databind.SerializationConfig r0 = r3._config
            com.fasterxml.jackson.databind.JsonSerializer r0 = r1.serializerInstance(r0, r4, r5)
        L_0x0033:
            if (r0 != 0) goto L_0x0043
            com.fasterxml.jackson.databind.SerializationConfig r4 = r3._config
            boolean r4 = r4.canOverrideAccessModifiers()
            java.lang.Object r4 = com.fasterxml.jackson.databind.util.ClassUtil.createInstance(r5, r4)
            r5 = r4
            com.fasterxml.jackson.databind.JsonSerializer r5 = (com.fasterxml.jackson.databind.JsonSerializer) r5
            goto L_0x0044
        L_0x0043:
            r5 = r0
        L_0x0044:
            r3._handleResolvable(r5)
            return r5
        L_0x0048:
            com.fasterxml.jackson.databind.JavaType r4 = r4.getType()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "AnnotationIntrospector returned Class "
            r1.append(r2)
            java.lang.String r5 = r5.getName()
            r1.append(r5)
            java.lang.String r5 = "; expected Class<JsonSerializer>"
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r3.reportBadDefinition(r4, r5)
            throw r0
        L_0x006a:
            return r0
        L_0x006b:
            com.fasterxml.jackson.databind.JavaType r4 = r4.getType()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "AnnotationIntrospector returned serializer definition of type "
            r1.append(r2)
            java.lang.Class r5 = r5.getClass()
            java.lang.String r5 = r5.getName()
            r1.append(r5)
            java.lang.String r5 = "; expected type JsonSerializer or Class<JsonSerializer> instead"
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r3.reportBadDefinition(r4, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.serializerInstance(com.fasterxml.jackson.databind.introspect.Annotated, java.lang.Object):com.fasterxml.jackson.databind.JsonSerializer");
    }

    protected DefaultSerializerProvider(SerializerProvider serializerProvider, SerializationConfig serializationConfig, SerializerFactory serializerFactory) {
        super(serializerProvider, serializationConfig, serializerFactory);
    }

    protected DefaultSerializerProvider(DefaultSerializerProvider defaultSerializerProvider) {
        super(defaultSerializerProvider);
    }

    private final void _serialize(JsonGenerator jsonGenerator, Object obj, JsonSerializer<Object> jsonSerializer) {
        try {
            jsonSerializer.serialize(obj, jsonGenerator, this);
        } catch (Exception e2) {
            throw _wrapAsIOE(jsonGenerator, e2);
        }
    }

    public void serializeValue(JsonGenerator jsonGenerator, Object obj, JavaType javaType) {
        this._generator = jsonGenerator;
        if (obj == null) {
            _serializeNull(jsonGenerator);
            return;
        }
        if (!javaType.getRawClass().isAssignableFrom(obj.getClass())) {
            _reportIncompatibleRootType(obj, javaType);
        }
        JsonSerializer<Object> findTypedValueSerializer = findTypedValueSerializer(javaType, true, (BeanProperty) null);
        PropertyName fullRootName = this._config.getFullRootName();
        if (fullRootName == null) {
            if (this._config.isEnabled(SerializationFeature.WRAP_ROOT_VALUE)) {
                _serialize(jsonGenerator, obj, findTypedValueSerializer, this._config.findRootName(javaType));
                return;
            }
        } else if (!fullRootName.isEmpty()) {
            _serialize(jsonGenerator, obj, findTypedValueSerializer, fullRootName);
            return;
        }
        _serialize(jsonGenerator, obj, findTypedValueSerializer);
    }

    public void serializeValue(JsonGenerator jsonGenerator, Object obj, JavaType javaType, JsonSerializer<Object> jsonSerializer) {
        PropertyName propertyName;
        this._generator = jsonGenerator;
        if (obj == null) {
            _serializeNull(jsonGenerator);
            return;
        }
        if (javaType != null && !javaType.getRawClass().isAssignableFrom(obj.getClass())) {
            _reportIncompatibleRootType(obj, javaType);
        }
        if (jsonSerializer == null) {
            jsonSerializer = findTypedValueSerializer(javaType, true, (BeanProperty) null);
        }
        PropertyName fullRootName = this._config.getFullRootName();
        if (fullRootName == null) {
            if (this._config.isEnabled(SerializationFeature.WRAP_ROOT_VALUE)) {
                if (javaType == null) {
                    propertyName = this._config.findRootName(obj.getClass());
                } else {
                    propertyName = this._config.findRootName(javaType);
                }
                _serialize(jsonGenerator, obj, jsonSerializer, propertyName);
                return;
            }
        } else if (!fullRootName.isEmpty()) {
            _serialize(jsonGenerator, obj, jsonSerializer, fullRootName);
            return;
        }
        _serialize(jsonGenerator, obj, jsonSerializer);
    }
}
