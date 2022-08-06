package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.JsonFactory;

public class MappingJsonFactory extends JsonFactory {
    public MappingJsonFactory() {
        this((ObjectMapper) null);
    }

    public JsonFactory copy() {
        _checkInvalidCopy(MappingJsonFactory.class);
        return new MappingJsonFactory(this, (ObjectMapper) null);
    }

    public String getFormatName() {
        return "JSON";
    }

    public MappingJsonFactory(ObjectMapper objectMapper) {
        super(objectMapper);
        if (objectMapper == null) {
            setCodec(new ObjectMapper((JsonFactory) this));
        }
    }

    public final ObjectMapper getCodec() {
        return (ObjectMapper) this._objectCodec;
    }

    public MappingJsonFactory(JsonFactory jsonFactory, ObjectMapper objectMapper) {
        super(jsonFactory, objectMapper);
        if (objectMapper == null) {
            setCodec(new ObjectMapper((JsonFactory) this));
        }
    }
}
