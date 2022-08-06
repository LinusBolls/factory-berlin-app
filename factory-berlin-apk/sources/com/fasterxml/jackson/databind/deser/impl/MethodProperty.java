package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.Annotations;
import java.lang.reflect.Method;

public final class MethodProperty extends SettableBeanProperty {
    protected final AnnotatedMethod _annotated;
    protected final transient Method _setter;
    protected final boolean _skipNulls;

    public MethodProperty(BeanPropertyDefinition beanPropertyDefinition, JavaType javaType, TypeDeserializer typeDeserializer, Annotations annotations, AnnotatedMethod annotatedMethod) {
        super(beanPropertyDefinition, javaType, typeDeserializer, annotations);
        this._annotated = annotatedMethod;
        this._setter = annotatedMethod.getAnnotated();
        this._skipNulls = NullsConstantProvider.isSkipper(this._nullProvider);
    }

    public void deserializeAndSet(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) {
        Object obj2;
        if (!jsonParser.hasToken(JsonToken.VALUE_NULL)) {
            TypeDeserializer typeDeserializer = this._valueTypeDeserializer;
            if (typeDeserializer == null) {
                Object deserialize = this._valueDeserializer.deserialize(jsonParser, deserializationContext);
                if (deserialize != null) {
                    obj2 = deserialize;
                } else if (!this._skipNulls) {
                    obj2 = this._nullProvider.getNullValue(deserializationContext);
                } else {
                    return;
                }
            } else {
                obj2 = this._valueDeserializer.deserializeWithType(jsonParser, deserializationContext, typeDeserializer);
            }
        } else if (!this._skipNulls) {
            obj2 = this._nullProvider.getNullValue(deserializationContext);
        } else {
            return;
        }
        try {
            this._setter.invoke(obj, new Object[]{obj2});
        } catch (Exception e2) {
            _throwAsIOE(jsonParser, e2, obj2);
            throw null;
        }
    }

    public Object deserializeSetAndReturn(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) {
        Object obj2;
        if (!jsonParser.hasToken(JsonToken.VALUE_NULL)) {
            TypeDeserializer typeDeserializer = this._valueTypeDeserializer;
            if (typeDeserializer == null) {
                Object deserialize = this._valueDeserializer.deserialize(jsonParser, deserializationContext);
                if (deserialize != null) {
                    obj2 = deserialize;
                } else if (this._skipNulls) {
                    return obj;
                } else {
                    obj2 = this._nullProvider.getNullValue(deserializationContext);
                }
            } else {
                obj2 = this._valueDeserializer.deserializeWithType(jsonParser, deserializationContext, typeDeserializer);
            }
        } else if (this._skipNulls) {
            return obj;
        } else {
            obj2 = this._nullProvider.getNullValue(deserializationContext);
        }
        try {
            Object invoke = this._setter.invoke(obj, new Object[]{obj2});
            return invoke == null ? obj : invoke;
        } catch (Exception e2) {
            _throwAsIOE(jsonParser, e2, obj2);
            throw null;
        }
    }

    public void fixAccess(DeserializationConfig deserializationConfig) {
        this._annotated.fixAccess(deserializationConfig.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
    }

    public AnnotatedMember getMember() {
        return this._annotated;
    }

    public final void set(Object obj, Object obj2) {
        try {
            this._setter.invoke(obj, new Object[]{obj2});
        } catch (Exception e2) {
            _throwAsIOE(e2, obj2);
            throw null;
        }
    }

    public Object setAndReturn(Object obj, Object obj2) {
        try {
            Object invoke = this._setter.invoke(obj, new Object[]{obj2});
            return invoke == null ? obj : invoke;
        } catch (Exception e2) {
            _throwAsIOE(e2, obj2);
            throw null;
        }
    }

    public SettableBeanProperty withName(PropertyName propertyName) {
        return new MethodProperty(this, propertyName);
    }

    public SettableBeanProperty withNullProvider(NullValueProvider nullValueProvider) {
        return new MethodProperty(this, this._valueDeserializer, nullValueProvider);
    }

    public SettableBeanProperty withValueDeserializer(JsonDeserializer<?> jsonDeserializer) {
        JsonDeserializer<Object> jsonDeserializer2 = this._valueDeserializer;
        if (jsonDeserializer2 == jsonDeserializer) {
            return this;
        }
        NullValueProvider nullValueProvider = this._nullProvider;
        if (jsonDeserializer2 == nullValueProvider) {
            nullValueProvider = jsonDeserializer;
        }
        return new MethodProperty(this, jsonDeserializer, nullValueProvider);
    }

    protected MethodProperty(MethodProperty methodProperty, JsonDeserializer<?> jsonDeserializer, NullValueProvider nullValueProvider) {
        super(methodProperty, jsonDeserializer, nullValueProvider);
        this._annotated = methodProperty._annotated;
        this._setter = methodProperty._setter;
        this._skipNulls = NullsConstantProvider.isSkipper(nullValueProvider);
    }

    protected MethodProperty(MethodProperty methodProperty, PropertyName propertyName) {
        super(methodProperty, propertyName);
        this._annotated = methodProperty._annotated;
        this._setter = methodProperty._setter;
        this._skipNulls = methodProperty._skipNulls;
    }
}
