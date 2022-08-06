package de.baimos.blueid.sdk.api.response;

import java.nio.ByteBuffer;

public interface ResponseDataParser {
    ResponseObject parseResponseData(int i2, ByteBuffer byteBuffer);
}
