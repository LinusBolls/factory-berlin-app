package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.util.RequestPayload;

public class JsonParseException extends JsonProcessingException {
    protected transient JsonParser _processor;
    protected RequestPayload _requestPayload;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JsonParseException(JsonParser jsonParser, String str) {
        super(str, jsonParser == null ? null : jsonParser.getCurrentLocation());
        this._processor = jsonParser;
    }

    public String getMessage() {
        String message = super.getMessage();
        if (this._requestPayload == null) {
            return message;
        }
        return message + "\nRequest payload : " + this._requestPayload.toString();
    }

    public JsonParseException withRequestPayload(RequestPayload requestPayload) {
        this._requestPayload = requestPayload;
        return this;
    }

    public JsonParser getProcessor() {
        return this._processor;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JsonParseException(JsonParser jsonParser, String str, Throwable th) {
        super(str, jsonParser == null ? null : jsonParser.getCurrentLocation(), th);
        this._processor = jsonParser;
    }
}
