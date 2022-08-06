package com.google.android.gms.common.util;

public class j {
    private static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private static final char[] b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String a(byte[] bArr) {
        char[] cArr = new char[(bArr.length << 1)];
        int i2 = 0;
        for (byte b2 : bArr) {
            byte b3 = b2 & 255;
            int i3 = i2 + 1;
            char[] cArr2 = b;
            cArr[i2] = cArr2[b3 >>> 4];
            i2 = i3 + 1;
            cArr[i3] = cArr2[b3 & 15];
        }
        return new String(cArr);
    }

    public static String b(byte[] bArr) {
        return c(bArr, false);
    }

    public static String c(byte[] bArr, boolean z) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length << 1);
        int i2 = 0;
        while (i2 < length && (!z || i2 != length - 1 || (bArr[i2] & 255) != 0)) {
            sb.append(a[(bArr[i2] & 240) >>> 4]);
            sb.append(a[bArr[i2] & 15]);
            i2++;
        }
        return sb.toString();
    }
}
