package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
public abstract class e6 {
    private e6() {
    }

    public static long a(long j2) {
        return (-(j2 & 1)) ^ (j2 >>> 1);
    }

    static e6 b(byte[] bArr, int i2, int i3, boolean z) {
        h6 h6Var = new h6(bArr, i3);
        try {
            h6Var.d(i3);
            return h6Var;
        } catch (zzig e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static int c(int i2) {
        return (-(i2 & 1)) ^ (i2 >>> 1);
    }
}
