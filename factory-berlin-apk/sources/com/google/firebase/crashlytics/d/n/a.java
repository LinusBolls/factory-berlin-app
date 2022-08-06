package com.google.firebase.crashlytics.d.n;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

/* compiled from: ByteString */
final class a {
    private final byte[] a;
    private volatile int b = 0;

    private a(byte[] bArr) {
        this.a = bArr;
    }

    public static a a(byte[] bArr) {
        return b(bArr, 0, bArr.length);
    }

    public static a b(byte[] bArr, int i2, int i3) {
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i2, bArr2, 0, i3);
        return new a(bArr2);
    }

    public static a c(String str) {
        try {
            return new a(str.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException("UTF-8 not supported.", e2);
        }
    }

    public void d(byte[] bArr, int i2, int i3, int i4) {
        System.arraycopy(this.a, i2, bArr, i3, i4);
    }

    public InputStream e() {
        return new ByteArrayInputStream(this.a);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        byte[] bArr = this.a;
        int length = bArr.length;
        byte[] bArr2 = ((a) obj).a;
        if (length != bArr2.length) {
            return false;
        }
        for (int i2 = 0; i2 < length; i2++) {
            if (bArr[i2] != bArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    public int f() {
        return this.a.length;
    }

    public int hashCode() {
        int i2 = this.b;
        if (i2 == 0) {
            int i3 = r1;
            for (byte b2 : this.a) {
                i3 = (i3 * 31) + b2;
            }
            i2 = i3 == 0 ? 1 : i3;
            this.b = i2;
        }
        return i2;
    }
}
