package com.google.android.gms.nearby.messages.internal;

import java.util.Arrays;

public class w {
    private static final char[] b = "0123456789abcdef".toCharArray();
    private final byte[] a;

    protected w(byte[] bArr) {
        this.a = bArr;
    }

    public static String b(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b2 : bArr) {
            sb.append(b[(b2 >> 4) & 15]);
            sb.append(b[b2 & 15]);
        }
        return sb.toString();
    }

    public final byte[] a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!obj.getClass().isAssignableFrom(getClass())) {
            return false;
        }
        return Arrays.equals(this.a, ((w) obj).a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public String toString() {
        return b(this.a);
    }
}
