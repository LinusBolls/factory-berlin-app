package de.baimos.blueid.sdk.api.response;

import de.baimos.blueid.sdk.api.exceptions.ResponseDataParseException;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

public class c {
    private static Map<Integer, ResponseDataParser> a = new HashMap<Integer, ResponseDataParser>() {
        {
            put(0, new e());
            put(1, new d());
            put(2, new b());
            put(3, new a());
            put(4, new f());
            put(5, new h());
            put(6, new g());
            put(7, new i());
        }
    };
    private static final int b = 2;

    public static ResponseObject a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        if (bArr.length >= 2) {
            byte b2 = bArr[0] & 255;
            byte b3 = bArr[1] & 255;
            ResponseDataParser responseDataParser = a.get(Integer.valueOf(b2));
            ByteBuffer wrap = ByteBuffer.wrap(bArr, 2, bArr.length - 2);
            return responseDataParser == null ? new BinaryData(b2, b3, wrap) : responseDataParser.parseResponseData(b3, wrap);
        }
        throw new ResponseDataParseException("Response data too small. Please make sure that the secured object is valid.");
    }
}
