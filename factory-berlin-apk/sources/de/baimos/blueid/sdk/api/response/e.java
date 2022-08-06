package de.baimos.blueid.sdk.api.response;

import java.nio.ByteBuffer;

public class e implements ResponseDataParser {
    public ResponseObject parseResponseData(int i2, ByteBuffer byteBuffer) {
        return new UserSpecifiedData(byteBuffer);
    }
}
