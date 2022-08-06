package de.baimos.blueid.sdk.api.response;

import de.baimos.blueid.sdk.api.exceptions.ResponseDataParseException;
import de.baimos.blueid.sdk.api.response.UserAccessLog;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class d implements ResponseDataParser {
    private static final int a = 10;
    private static final int b = 16;
    private static final int c = 5;

    private static long a(ByteBuffer byteBuffer) {
        return ((long) byteBuffer.getInt()) & 4294967295L;
    }

    private static String a(ByteBuffer byteBuffer, int i2) {
        StringBuilder sb = new StringBuilder();
        int i3 = 0;
        while (byteBuffer.remaining() > 0 && i3 < i2) {
            char c2 = (char) byteBuffer.get();
            if (c2 != 0) {
                sb.append(c2);
            }
            i3++;
        }
        return sb.toString();
    }

    /* renamed from: a */
    public UserAccessLog parseResponseData(int i2, ByteBuffer byteBuffer) {
        try {
            ArrayList arrayList = new ArrayList();
            while (byteBuffer.remaining() > 0) {
                arrayList.add(new UserAccessLog.Entry(a(byteBuffer), a(byteBuffer), a(byteBuffer, 16), a(byteBuffer, 10), a(byteBuffer, 5), byteBuffer.get() & 255));
            }
            Collections.sort(arrayList, new Comparator<UserAccessLog.Entry>() {
                /* renamed from: a */
                public int compare(UserAccessLog.Entry entry, UserAccessLog.Entry entry2) {
                    int i2 = ((entry2.logEntryId - entry.logEntryId) > 0 ? 1 : ((entry2.logEntryId - entry.logEntryId) == 0 ? 0 : -1));
                    if (i2 < 0) {
                        return -1;
                    }
                    return i2 > 0 ? 1 : 0;
                }
            });
            return new UserAccessLog(arrayList);
        } catch (BufferUnderflowException e2) {
            throw new ResponseDataParseException("Expected more data. Please make sure that the secured object is valid and the connection is reliable.", e2);
        }
    }
}
