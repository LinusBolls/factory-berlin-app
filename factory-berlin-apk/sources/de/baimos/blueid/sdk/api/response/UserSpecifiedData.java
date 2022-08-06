package de.baimos.blueid.sdk.api.response;

import java.nio.ByteBuffer;

public class UserSpecifiedData implements ResponseObject {
    private ByteBuffer data;

    UserSpecifiedData(ByteBuffer byteBuffer) {
        this.data = byteBuffer.asReadOnlyBuffer();
    }

    public ByteBuffer getData() {
        return this.data;
    }

    public String toString() {
        return "UserSpecifiedData{data=" + this.data + '}';
    }
}
