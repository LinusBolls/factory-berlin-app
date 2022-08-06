package de.baimos.blueid.sdk.api.response;

import de.baimos.blueid.sdk.api.exceptions.ResponseDataParseException;
import java.nio.ByteBuffer;

public class a implements ResponseDataParser {
    public ResponseObject parseResponseData(int i2, ByteBuffer byteBuffer) {
        byte b = byteBuffer.get() & 255;
        if (b < LockServerLogLevel.values().length) {
            return LockServerLogLevel.values()[b];
        }
        throw new ResponseDataParseException("unknown logLevel " + b);
    }
}
