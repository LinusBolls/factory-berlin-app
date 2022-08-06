package de.baimos;

import java.math.BigInteger;

public final class ch {
    public static byte[] a(BigInteger bigInteger, int i2) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length == i2) {
            return byteArray;
        }
        byte[] bArr = new byte[i2];
        if (byteArray.length < i2) {
            System.arraycopy(byteArray, 0, bArr, i2 - byteArray.length, byteArray.length);
        } else {
            System.arraycopy(byteArray, byteArray.length - i2, bArr, 0, i2);
        }
        return bArr;
    }
}
