package com.google.android.gms.internal.measurement;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
public final class b7 {
    static final Charset a = Charset.forName("UTF-8");
    public static final byte[] b;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        b = bArr;
        ByteBuffer.wrap(bArr);
        byte[] bArr2 = b;
        e6.b(bArr2, 0, bArr2.length, false);
    }

    static int a(int i2, byte[] bArr, int i3, int i4) {
        for (int i5 = i3; i5 < i3 + i4; i5++) {
            i2 = (i2 * 31) + bArr[i5];
        }
        return i2;
    }

    public static int b(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    public static int c(boolean z) {
        return z ? 1231 : 1237;
    }

    static <T> T d(T t) {
        if (t != null) {
            return t;
        }
        throw null;
    }

    static Object e(Object obj, Object obj2) {
        i8 e2 = ((j8) obj).e();
        e2.l0((j8) obj2);
        return e2.o();
    }

    static <T> T f(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    static boolean g(j8 j8Var) {
        if (!(j8Var instanceof l5)) {
            return false;
        }
        l5 l5Var = (l5) j8Var;
        return false;
    }

    public static boolean h(byte[] bArr) {
        return y9.f(bArr);
    }

    public static String i(byte[] bArr) {
        return new String(bArr, a);
    }

    public static int j(byte[] bArr) {
        int length = bArr.length;
        int a2 = a(length, bArr, 0, length);
        if (a2 == 0) {
            return 1;
        }
        return a2;
    }
}
