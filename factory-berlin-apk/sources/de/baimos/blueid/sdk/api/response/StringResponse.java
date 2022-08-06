package de.baimos.blueid.sdk.api.response;

public class StringResponse implements ResponseObject {
    private final String text;

    StringResponse(String str) {
        this.text = str;
    }

    public String getText() {
        return this.text;
    }

    public String toString() {
        return "StringResponse {text='" + this.text + '\'' + '}';
    }
}
