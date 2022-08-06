package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import java.util.HashMap;
import java.util.List;

public final class PropertyBasedCreator {
    protected final SettableBeanProperty[] _allProperties;
    protected final int _propertyCount;
    protected final HashMap<String, SettableBeanProperty> _propertyLookup;
    protected final ValueInstantiator _valueInstantiator;

    static class CaseInsensitiveMap extends HashMap<String, SettableBeanProperty> {
        CaseInsensitiveMap() {
        }

        public SettableBeanProperty get(Object obj) {
            return (SettableBeanProperty) super.get(((String) obj).toLowerCase());
        }

        public SettableBeanProperty put(String str, SettableBeanProperty settableBeanProperty) {
            return (SettableBeanProperty) super.put(str.toLowerCase(), settableBeanProperty);
        }
    }

    protected PropertyBasedCreator(DeserializationContext deserializationContext, ValueInstantiator valueInstantiator, SettableBeanProperty[] settableBeanPropertyArr, boolean z, boolean z2) {
        this._valueInstantiator = valueInstantiator;
        if (z) {
            this._propertyLookup = new CaseInsensitiveMap();
        } else {
            this._propertyLookup = new HashMap<>();
        }
        int length = settableBeanPropertyArr.length;
        this._propertyCount = length;
        this._allProperties = new SettableBeanProperty[length];
        if (z2) {
            DeserializationConfig config = deserializationContext.getConfig();
            for (SettableBeanProperty settableBeanProperty : settableBeanPropertyArr) {
                if (!settableBeanProperty.isIgnorable()) {
                    List<PropertyName> findAliases = settableBeanProperty.findAliases(config);
                    if (!findAliases.isEmpty()) {
                        for (PropertyName simpleName : findAliases) {
                            this._propertyLookup.put(simpleName.getSimpleName(), settableBeanProperty);
                        }
                    }
                }
            }
        }
        for (int i2 = 0; i2 < length; i2++) {
            SettableBeanProperty settableBeanProperty2 = settableBeanPropertyArr[i2];
            this._allProperties[i2] = settableBeanProperty2;
            if (!settableBeanProperty2.isIgnorable()) {
                this._propertyLookup.put(settableBeanProperty2.getName(), settableBeanProperty2);
            }
        }
    }

    public static PropertyBasedCreator construct(DeserializationContext deserializationContext, ValueInstantiator valueInstantiator, SettableBeanProperty[] settableBeanPropertyArr, BeanPropertyMap beanPropertyMap) {
        int length = settableBeanPropertyArr.length;
        SettableBeanProperty[] settableBeanPropertyArr2 = new SettableBeanProperty[length];
        for (int i2 = 0; i2 < length; i2++) {
            SettableBeanProperty settableBeanProperty = settableBeanPropertyArr[i2];
            if (!settableBeanProperty.hasValueDeserializer()) {
                settableBeanProperty = settableBeanProperty.withValueDeserializer(deserializationContext.findContextualValueDeserializer(settableBeanProperty.getType(), settableBeanProperty));
            }
            settableBeanPropertyArr2[i2] = settableBeanProperty;
        }
        return new PropertyBasedCreator(deserializationContext, valueInstantiator, settableBeanPropertyArr2, beanPropertyMap.isCaseInsensitive(), beanPropertyMap.hasAliases());
    }

    public Object build(DeserializationContext deserializationContext, PropertyValueBuffer propertyValueBuffer) {
        Object createFromObjectWith = this._valueInstantiator.createFromObjectWith(deserializationContext, this._allProperties, propertyValueBuffer);
        if (createFromObjectWith != null) {
            createFromObjectWith = propertyValueBuffer.handleIdValue(deserializationContext, createFromObjectWith);
            for (PropertyValue buffered = propertyValueBuffer.buffered(); buffered != null; buffered = buffered.next) {
                buffered.assign(createFromObjectWith);
            }
        }
        return createFromObjectWith;
    }

    public SettableBeanProperty findCreatorProperty(String str) {
        return this._propertyLookup.get(str);
    }

    public PropertyValueBuffer startBuilding(JsonParser jsonParser, DeserializationContext deserializationContext, ObjectIdReader objectIdReader) {
        return new PropertyValueBuffer(jsonParser, deserializationContext, this._propertyCount, objectIdReader);
    }

    public static PropertyBasedCreator construct(DeserializationContext deserializationContext, ValueInstantiator valueInstantiator, SettableBeanProperty[] settableBeanPropertyArr, boolean z) {
        int length = settableBeanPropertyArr.length;
        SettableBeanProperty[] settableBeanPropertyArr2 = new SettableBeanProperty[length];
        for (int i2 = 0; i2 < length; i2++) {
            SettableBeanProperty settableBeanProperty = settableBeanPropertyArr[i2];
            if (!settableBeanProperty.hasValueDeserializer()) {
                settableBeanProperty = settableBeanProperty.withValueDeserializer(deserializationContext.findContextualValueDeserializer(settableBeanProperty.getType(), settableBeanProperty));
            }
            settableBeanPropertyArr2[i2] = settableBeanProperty;
        }
        return new PropertyBasedCreator(deserializationContext, valueInstantiator, settableBeanPropertyArr2, z, false);
    }
}
