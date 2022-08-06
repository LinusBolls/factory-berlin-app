package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
final class aa {
    /* access modifiers changed from: private */
    public static void f(byte b, byte b2, byte b3, byte b4, char[] cArr, int i2) {
        if (o(b2) || (((b << 28) + (b2 + 112)) >> 30) != 0 || o(b3) || o(b4)) {
            throw zzig.f();
        }
        byte b5 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
        cArr[i2] = (char) ((b5 >>> 10) + 55232);
        cArr[i2 + 1] = (char) ((b5 & 1023) + 56320);
    }

    /* access modifiers changed from: private */
    public static void g(byte b, byte b2, byte b3, char[] cArr, int i2) {
        if (o(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || o(b3)))) {
            throw zzig.f();
        }
        cArr[i2] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
    }

    /* access modifiers changed from: private */
    public static void h(byte b, byte b2, char[] cArr, int i2) {
        if (b < -62 || o(b2)) {
            throw zzig.f();
        }
        cArr[i2] = (char) (((b & 31) << 6) | (b2 & 63));
    }

    /* access modifiers changed from: private */
    public static void i(byte b, char[] cArr, int i2) {
        cArr[i2] = (char) b;
    }

    /* access modifiers changed from: private */
    public static boolean l(byte b) {
        return b >= 0;
    }

    /* access modifiers changed from: private */
    public static boolean m(byte b) {
        return b < -32;
    }

    /* access modifiers changed from: private */
    public static boolean n(byte b) {
        return b < -16;
    }

    private static boolean o(byte b) {
        return b > -65;
    }
}
