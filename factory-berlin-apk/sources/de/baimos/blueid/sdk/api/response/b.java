package de.baimos.blueid.sdk.api.response;

import java.nio.ByteBuffer;
import java.util.Date;

public class b implements ResponseDataParser {
    private static final long a = 1000;

    private static long a(ByteBuffer byteBuffer) {
        return ((long) byteBuffer.getInt()) & 4294967295L;
    }

    public ResponseObject parseResponseData(int i2, ByteBuffer byteBuffer) {
        return new LockServerTime(new Date(a(byteBuffer) * a));
    }
}
