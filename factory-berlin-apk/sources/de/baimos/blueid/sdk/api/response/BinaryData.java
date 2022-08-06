package de.baimos.blueid.sdk.api.response;

import java.nio.ByteBuffer;

public class BinaryData implements ResponseObject {
    private ByteBuffer data;
    private int type;
    private int version;

    BinaryData(int i2, int i3, ByteBuffer byteBuffer) {
        this.type = i2;
        this.version = i3;
        this.data = byteBuffer.asReadOnlyBuffer();
    }

    public ByteBuffer getData() {
        return this.data;
    }

    public int getType() {
        return this.type;
    }

    public int getVersion() {
        return this.version;
    }

    public String toString() {
        return "BinaryData{data=" + this.data + '}';
    }
}
