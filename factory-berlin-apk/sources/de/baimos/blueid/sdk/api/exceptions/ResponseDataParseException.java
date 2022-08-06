package de.baimos.blueid.sdk.api.exceptions;

public class ResponseDataParseException extends Exception {
    public ResponseDataParseException(String str) {
        super(str);
    }

    public ResponseDataParseException(String str, Throwable th) {
        super(str, th);
    }
}
