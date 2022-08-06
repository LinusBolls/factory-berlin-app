package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.q0;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: Internal */
public final class a0 {
    static final Charset a = Charset.forName("UTF-8");
    public static final byte[] b;

    /* compiled from: Internal */
    public interface a extends i<Boolean> {
    }

    /* compiled from: Internal */
    public interface b extends i<Double> {
    }

    /* compiled from: Internal */
    public interface c {
        int m();
    }

    /* compiled from: Internal */
    public interface d<T extends c> {
        T a(int i2);
    }

    /* compiled from: Internal */
    public interface e {
        boolean a(int i2);
    }

    /* compiled from: Internal */
    public interface f extends i<Float> {
    }

    /* compiled from: Internal */
    public interface g extends i<Integer> {
    }

    /* compiled from: Internal */
    public interface h extends i<Long> {
    }

    /* compiled from: Internal */
    public interface i<E> extends List<E>, RandomAccess {
        boolean O();

        void t();

        i<E> w(int i2);
    }

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        b = bArr;
        ByteBuffer.wrap(bArr);
        j.f(b);
    }

    static <T> T a(T t) {
        if (t != null) {
            return t;
        }
        throw null;
    }

    static <T> T b(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    public static int c(boolean z) {
        return z ? 1231 : 1237;
    }

    public static int d(byte[] bArr) {
        return e(bArr, 0, bArr.length);
    }

    static int e(byte[] bArr, int i2, int i3) {
        int i4 = i(i3, bArr, i2, i3);
        if (i4 == 0) {
            return 1;
        }
        return i4;
    }

    public static int f(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    public static boolean g(byte[] bArr) {
        return r1.m(bArr);
    }

    static Object h(Object obj, Object obj2) {
        q0.a e2 = ((q0) obj).e();
        e2.q((q0) obj2);
        return e2.L();
    }

    static int i(int i2, byte[] bArr, int i3, int i4) {
        for (int i5 = i3; i5 < i3 + i4; i5++) {
            i2 = (i2 * 31) + bArr[i5];
        }
        return i2;
    }

    public static String j(byte[] bArr) {
        return new String(bArr, a);
    }
}
