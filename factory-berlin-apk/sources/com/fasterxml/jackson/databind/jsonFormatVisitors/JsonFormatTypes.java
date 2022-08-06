package com.fasterxml.jackson.databind.jsonFormatVisitors;

import java.util.HashMap;
import java.util.Map;

public enum JsonFormatTypes {
    STRING,
    NUMBER,
    INTEGER,
    BOOLEAN,
    OBJECT,
    ARRAY,
    NULL,
    ANY;
    
    private static final Map<String, JsonFormatTypes> _byLCName = null;

    static {
        int i2;
        _byLCName = new HashMap();
        for (JsonFormatTypes jsonFormatTypes : values()) {
            _byLCName.put(jsonFormatTypes.name().toLowerCase(), jsonFormatTypes);
        }
    }
}
