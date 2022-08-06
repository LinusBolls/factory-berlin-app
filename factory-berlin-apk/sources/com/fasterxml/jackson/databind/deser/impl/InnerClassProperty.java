package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.lang.reflect.Constructor;

public final class InnerClassProperty extends SettableBeanProperty.Delegating {
    protected final transient Constructor<?> _creator;

    public InnerClassProperty(SettableBeanProperty settableBeanProperty, Constructor<?> constructor) {
        super(settableBeanProperty);
        this._creator = constructor;
    }

    public void deserializeAndSet(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) {
        Object obj2;
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            obj2 = this._valueDeserializer.getNullValue(deserializationContext);
        } else {
            TypeDeserializer typeDeserializer = this._valueTypeDeserializer;
            if (typeDeserializer != null) {
                obj2 = this._valueDeserializer.deserializeWithType(jsonParser, deserializationContext, typeDeserializer);
            } else {
                try {
                    Object newInstance = this._creator.newInstance(new Object[]{obj});
                    this._valueDeserializer.deserialize(jsonParser, deserializationContext, newInstance);
                    obj2 = newInstance;
                } catch (Exception e2) {
                    ClassUtil.unwrapAndThrowAsIAE(e2, String.format("Failed to instantiate class %s, problem: %s", new Object[]{this._creator.getDeclaringClass().getName(), e2.getMessage()}));
                    throw null;
                }
            }
        }
        set(obj, obj2);
    }

    public Object deserializeSetAndReturn(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) {
        return setAndReturn(obj, deserialize(jsonParser, deserializationContext));
    }

    /* access modifiers changed from: protected */
    public SettableBeanProperty withDelegate(SettableBeanProperty settableBeanProperty) {
        if (settableBeanProperty == this.delegate) {
            return this;
        }
        return new InnerClassProperty(settableBeanProperty, this._creator);
    }
}
