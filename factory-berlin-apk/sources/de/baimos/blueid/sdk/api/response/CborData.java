package de.baimos.blueid.sdk.api.response;

import java.nio.ByteBuffer;

public class CborData implements ResponseObject {
    private ByteBuffer data;

    CborData(ByteBuffer byteBuffer) {
        this.data = byteBuffer.asReadOnlyBuffer();
    }

    public ByteBuffer getData() {
        return this.data;
    }

    public String toString() {
        return "CborData{data=" + this.data + '}';
    }
}
