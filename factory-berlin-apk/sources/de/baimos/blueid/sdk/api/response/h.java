package de.baimos.blueid.sdk.api.response;

import java.nio.ByteBuffer;

public class h implements ResponseDataParser {
    public ResponseObject parseResponseData(int i2, ByteBuffer byteBuffer) {
        return LockServerBatteryState.getStateForRawValue(byteBuffer.get() & 255);
    }
}
