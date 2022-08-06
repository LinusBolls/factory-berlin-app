package de.baimos.blueid.sdk.api.response;

import java.nio.ByteBuffer;

public class f implements ResponseDataParser {
    public ResponseObject parseResponseData(int i2, ByteBuffer byteBuffer) {
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        return new LockServerVersion(new String(bArr));
    }
}
