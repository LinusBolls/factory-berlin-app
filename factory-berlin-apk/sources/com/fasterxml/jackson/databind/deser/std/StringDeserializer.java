package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;

@JacksonStdImpl
public class StringDeserializer extends StdScalarDeserializer<String> {
    public static final StringDeserializer instance = new StringDeserializer();

    public StringDeserializer() {
        super((Class<?>) String.class);
    }

    public Object getEmptyValue(DeserializationContext deserializationContext) {
        return "";
    }

    public boolean isCachable() {
        return true;
    }

    public String deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        String valueAsString;
        if (jsonParser.hasToken(JsonToken.VALUE_STRING)) {
            return jsonParser.getText();
        }
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken == JsonToken.START_ARRAY) {
            return (String) _deserializeFromArray(jsonParser, deserializationContext);
        }
        if (currentToken == JsonToken.VALUE_EMBEDDED_OBJECT) {
            Object embeddedObject = jsonParser.getEmbeddedObject();
            if (embeddedObject == null) {
                return null;
            }
            if (embeddedObject instanceof byte[]) {
                return deserializationContext.getBase64Variant().encode((byte[]) embeddedObject, false);
            }
            return embeddedObject.toString();
        } else if (!currentToken.isScalarValue() || (valueAsString = jsonParser.getValueAsString()) == null) {
            return (String) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser);
        } else {
            return valueAsString;
        }
    }

    public String deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) {
        return deserialize(jsonParser, deserializationContext);
    }
}
