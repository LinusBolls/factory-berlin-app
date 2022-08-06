package com.microsoft.appcenter.utils;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: HashUtils */
public class f {
    private static final char[] a = "0123456789abcdef".toCharArray();

    private static String a(byte[] bArr) {
        char[] cArr = new char[(bArr.length * 2)];
        for (int i2 = 0; i2 < bArr.length; i2++) {
            byte b = bArr[i2] & 255;
            int i3 = i2 * 2;
            char[] cArr2 = a;
            cArr[i3] = cArr2[b >>> 4];
            cArr[i3 + 1] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    public static String b(String str) {
        return c(str, "UTF-8");
    }

    static String c(String str, String str2) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.update(str.getBytes(str2));
            return a(instance.digest());
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException e2) {
            throw new RuntimeException(e2);
        }
    }
}
