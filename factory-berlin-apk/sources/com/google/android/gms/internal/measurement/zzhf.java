package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
public abstract class zzhf extends u5 {
    private static final Logger b = Logger.getLogger(zzhf.class.getName());
    /* access modifiers changed from: private */
    public static final boolean c = v9.m();
    l6 a;

    /* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
    static class a extends zzhf {

        /* renamed from: d  reason: collision with root package name */
        private final byte[] f2660d;

        /* renamed from: e  reason: collision with root package name */
        private final int f2661e;

        /* renamed from: f  reason: collision with root package name */
        private int f2662f;

        a(byte[] bArr, int i2, int i3) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            } else if ((i3 | 0 | (bArr.length - i3)) >= 0) {
                this.f2660d = bArr;
                this.f2662f = 0;
                this.f2661e = i3;
            } else {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), 0, Integer.valueOf(i3)}));
            }
        }

        private final void G0(byte[] bArr, int i2, int i3) {
            try {
                System.arraycopy(bArr, i2, this.f2660d, this.f2662f, i3);
                this.f2662f += i3;
            } catch (IndexOutOfBoundsException e2) {
                throw new zza(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f2662f), Integer.valueOf(this.f2661e), Integer.valueOf(i3)}), e2);
            }
        }

        public final void O(int i2) {
            if (!zzhf.c || q5.b() || b() < 5) {
                while ((i2 & -128) != 0) {
                    byte[] bArr = this.f2660d;
                    int i3 = this.f2662f;
                    this.f2662f = i3 + 1;
                    bArr[i3] = (byte) ((i2 & 127) | 128);
                    i2 >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f2660d;
                    int i4 = this.f2662f;
                    this.f2662f = i4 + 1;
                    bArr2[i4] = (byte) i2;
                } catch (IndexOutOfBoundsException e2) {
                    throw new zza(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f2662f), Integer.valueOf(this.f2661e), 1}), e2);
                }
            } else if ((i2 & -128) == 0) {
                byte[] bArr3 = this.f2660d;
                int i5 = this.f2662f;
                this.f2662f = i5 + 1;
                v9.l(bArr3, (long) i5, (byte) i2);
            } else {
                byte[] bArr4 = this.f2660d;
                int i6 = this.f2662f;
                this.f2662f = i6 + 1;
                v9.l(bArr4, (long) i6, (byte) (i2 | 128));
                int i7 = i2 >>> 7;
                if ((i7 & -128) == 0) {
                    byte[] bArr5 = this.f2660d;
                    int i8 = this.f2662f;
                    this.f2662f = i8 + 1;
                    v9.l(bArr5, (long) i8, (byte) i7);
                    return;
                }
                byte[] bArr6 = this.f2660d;
                int i9 = this.f2662f;
                this.f2662f = i9 + 1;
                v9.l(bArr6, (long) i9, (byte) (i7 | 128));
                int i10 = i7 >>> 7;
                if ((i10 & -128) == 0) {
                    byte[] bArr7 = this.f2660d;
                    int i11 = this.f2662f;
                    this.f2662f = i11 + 1;
                    v9.l(bArr7, (long) i11, (byte) i10);
                    return;
                }
                byte[] bArr8 = this.f2660d;
                int i12 = this.f2662f;
                this.f2662f = i12 + 1;
                v9.l(bArr8, (long) i12, (byte) (i10 | 128));
                int i13 = i10 >>> 7;
                if ((i13 & -128) == 0) {
                    byte[] bArr9 = this.f2660d;
                    int i14 = this.f2662f;
                    this.f2662f = i14 + 1;
                    v9.l(bArr9, (long) i14, (byte) i13);
                    return;
                }
                byte[] bArr10 = this.f2660d;
                int i15 = this.f2662f;
                this.f2662f = i15 + 1;
                v9.l(bArr10, (long) i15, (byte) (i13 | 128));
                byte[] bArr11 = this.f2660d;
                int i16 = this.f2662f;
                this.f2662f = i16 + 1;
                v9.l(bArr11, (long) i16, (byte) (i13 >>> 7));
            }
        }

        public final void P(int i2, int i3) {
            m(i2, 0);
            j(i3);
        }

        public final void R(int i2, t5 t5Var) {
            m(1, 3);
            Y(2, i2);
            o(3, t5Var);
            m(1, 4);
        }

        public final void T(byte[] bArr, int i2, int i3) {
            O(i3);
            G0(bArr, 0, i3);
        }

        public final void Y(int i2, int i3) {
            m(i2, 0);
            O(i3);
        }

        public final void Z(int i2, long j2) {
            m(i2, 1);
            a0(j2);
        }

        public final void a(byte[] bArr, int i2, int i3) {
            G0(bArr, i2, i3);
        }

        public final void a0(long j2) {
            try {
                byte[] bArr = this.f2660d;
                int i2 = this.f2662f;
                int i3 = i2 + 1;
                this.f2662f = i3;
                bArr[i2] = (byte) ((int) j2);
                byte[] bArr2 = this.f2660d;
                int i4 = i3 + 1;
                this.f2662f = i4;
                bArr2[i3] = (byte) ((int) (j2 >> 8));
                byte[] bArr3 = this.f2660d;
                int i5 = i4 + 1;
                this.f2662f = i5;
                bArr3[i4] = (byte) ((int) (j2 >> 16));
                byte[] bArr4 = this.f2660d;
                int i6 = i5 + 1;
                this.f2662f = i6;
                bArr4[i5] = (byte) ((int) (j2 >> 24));
                byte[] bArr5 = this.f2660d;
                int i7 = i6 + 1;
                this.f2662f = i7;
                bArr5[i6] = (byte) ((int) (j2 >> 32));
                byte[] bArr6 = this.f2660d;
                int i8 = i7 + 1;
                this.f2662f = i8;
                bArr6[i7] = (byte) ((int) (j2 >> 40));
                byte[] bArr7 = this.f2660d;
                int i9 = i8 + 1;
                this.f2662f = i9;
                bArr7[i8] = (byte) ((int) (j2 >> 48));
                byte[] bArr8 = this.f2660d;
                this.f2662f = i9 + 1;
                bArr8[i9] = (byte) ((int) (j2 >> 56));
            } catch (IndexOutOfBoundsException e2) {
                throw new zza(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f2662f), Integer.valueOf(this.f2661e), 1}), e2);
            }
        }

        public final int b() {
            return this.f2661e - this.f2662f;
        }

        public final void f0(int i2) {
            try {
                byte[] bArr = this.f2660d;
                int i3 = this.f2662f;
                int i4 = i3 + 1;
                this.f2662f = i4;
                bArr[i3] = (byte) i2;
                byte[] bArr2 = this.f2660d;
                int i5 = i4 + 1;
                this.f2662f = i5;
                bArr2[i4] = (byte) (i2 >> 8);
                byte[] bArr3 = this.f2660d;
                int i6 = i5 + 1;
                this.f2662f = i6;
                bArr3[i5] = (byte) (i2 >> 16);
                byte[] bArr4 = this.f2660d;
                this.f2662f = i6 + 1;
                bArr4[i6] = (byte) (i2 >>> 24);
            } catch (IndexOutOfBoundsException e2) {
                throw new zza(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f2662f), Integer.valueOf(this.f2661e), 1}), e2);
            }
        }

        public final void g(byte b) {
            try {
                byte[] bArr = this.f2660d;
                int i2 = this.f2662f;
                this.f2662f = i2 + 1;
                bArr[i2] = b;
            } catch (IndexOutOfBoundsException e2) {
                throw new zza(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f2662f), Integer.valueOf(this.f2661e), 1}), e2);
            }
        }

        public final void j(int i2) {
            if (i2 >= 0) {
                O(i2);
            } else {
                t((long) i2);
            }
        }

        public final void k0(int i2, int i3) {
            m(i2, 5);
            f0(i3);
        }

        public final void m(int i2, int i3) {
            O((i2 << 3) | i3);
        }

        public final void n(int i2, long j2) {
            m(i2, 0);
            t(j2);
        }

        public final void o(int i2, t5 t5Var) {
            m(i2, 2);
            u(t5Var);
        }

        public final void p(int i2, j8 j8Var) {
            m(1, 3);
            Y(2, i2);
            m(3, 2);
            v(j8Var);
            m(1, 4);
        }

        /* access modifiers changed from: package-private */
        public final void q(int i2, j8 j8Var, y8 y8Var) {
            m(i2, 2);
            k5 k5Var = (k5) j8Var;
            int j2 = k5Var.j();
            if (j2 == -1) {
                j2 = y8Var.f(k5Var);
                k5Var.k(j2);
            }
            O(j2);
            y8Var.h(j8Var, this.a);
        }

        public final void r(int i2, String str) {
            m(i2, 2);
            w(str);
        }

        public final void s(int i2, boolean z) {
            m(i2, 0);
            g(z ? (byte) 1 : 0);
        }

        public final void t(long j2) {
            if (!zzhf.c || b() < 10) {
                while ((j2 & -128) != 0) {
                    byte[] bArr = this.f2660d;
                    int i2 = this.f2662f;
                    this.f2662f = i2 + 1;
                    bArr[i2] = (byte) ((((int) j2) & 127) | 128);
                    j2 >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f2660d;
                    int i3 = this.f2662f;
                    this.f2662f = i3 + 1;
                    bArr2[i3] = (byte) ((int) j2);
                } catch (IndexOutOfBoundsException e2) {
                    throw new zza(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f2662f), Integer.valueOf(this.f2661e), 1}), e2);
                }
            } else {
                while ((j2 & -128) != 0) {
                    byte[] bArr3 = this.f2660d;
                    int i4 = this.f2662f;
                    this.f2662f = i4 + 1;
                    v9.l(bArr3, (long) i4, (byte) ((((int) j2) & 127) | 128));
                    j2 >>>= 7;
                }
                byte[] bArr4 = this.f2660d;
                int i5 = this.f2662f;
                this.f2662f = i5 + 1;
                v9.l(bArr4, (long) i5, (byte) ((int) j2));
            }
        }

        public final void u(t5 t5Var) {
            O(t5Var.d());
            t5Var.l(this);
        }

        public final void v(j8 j8Var) {
            O(j8Var.d());
            j8Var.f(this);
        }

        public final void w(String str) {
            int i2 = this.f2662f;
            try {
                int p0 = zzhf.p0(str.length() * 3);
                int p02 = zzhf.p0(str.length());
                if (p02 == p0) {
                    int i3 = i2 + p02;
                    this.f2662f = i3;
                    int e2 = y9.e(str, this.f2660d, i3, b());
                    this.f2662f = i2;
                    O((e2 - i2) - p02);
                    this.f2662f = e2;
                    return;
                }
                O(y9.d(str));
                this.f2662f = y9.e(str, this.f2660d, this.f2662f, b());
            } catch (ba e3) {
                this.f2662f = i2;
                x(str, e3);
            } catch (IndexOutOfBoundsException e4) {
                throw new zza(e4);
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
    public static class zza extends IOException {
        zza() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        zza(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        zza(java.lang.String r3, java.lang.Throwable r4) {
            /*
                r2 = this;
                java.lang.String r3 = java.lang.String.valueOf(r3)
                int r0 = r3.length()
                java.lang.String r1 = "CodedOutputStream was writing to a flat byte array and ran out of space.: "
                if (r0 == 0) goto L_0x0011
                java.lang.String r3 = r1.concat(r3)
                goto L_0x0016
            L_0x0011:
                java.lang.String r3 = new java.lang.String
                r3.<init>(r1)
            L_0x0016:
                r2.<init>(r3, r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzhf.zza.<init>(java.lang.String, java.lang.Throwable):void");
        }
    }

    private zzhf() {
    }

    public static int A(float f2) {
        return 4;
    }

    public static int A0(int i2) {
        return 4;
    }

    public static int B(int i2, double d2) {
        return p0(i2 << 3) + 8;
    }

    public static int B0(int i2, int i3) {
        return p0(i2 << 3) + 4;
    }

    public static int C(int i2, float f2) {
        return p0(i2 << 3) + 4;
    }

    public static int C0(int i2) {
        return l0(i2);
    }

    public static int D(int i2, n7 n7Var) {
        return (p0(8) << 1) + q0(2, i2) + c(3, n7Var);
    }

    public static int D0(int i2, int i3) {
        return p0(i2 << 3) + l0(i3);
    }

    public static int E(int i2, j8 j8Var) {
        return (p0(8) << 1) + q0(2, i2) + p0(24) + J(j8Var);
    }

    @Deprecated
    public static int E0(int i2) {
        return p0(i2);
    }

    static int F(int i2, j8 j8Var, y8 y8Var) {
        return p0(i2 << 3) + e(j8Var, y8Var);
    }

    private static int F0(int i2) {
        return (i2 >> 31) ^ (i2 << 1);
    }

    public static int G(int i2, String str) {
        return p0(i2 << 3) + K(str);
    }

    public static int H(int i2, boolean z) {
        return p0(i2 << 3) + 1;
    }

    public static int I(t5 t5Var) {
        int d2 = t5Var.d();
        return p0(d2) + d2;
    }

    public static int J(j8 j8Var) {
        int d2 = j8Var.d();
        return p0(d2) + d2;
    }

    public static int K(String str) {
        int i2;
        try {
            i2 = y9.d(str);
        } catch (ba unused) {
            i2 = str.getBytes(b7.a).length;
        }
        return p0(i2) + i2;
    }

    public static int L(boolean z) {
        return 1;
    }

    public static int M(byte[] bArr) {
        int length = bArr.length;
        return p0(length) + length;
    }

    public static int U(int i2, t5 t5Var) {
        int p0 = p0(i2 << 3);
        int d2 = t5Var.d();
        return p0 + p0(d2) + d2;
    }

    @Deprecated
    static int V(int i2, j8 j8Var, y8 y8Var) {
        int p0 = p0(i2 << 3) << 1;
        k5 k5Var = (k5) j8Var;
        int j2 = k5Var.j();
        if (j2 == -1) {
            j2 = y8Var.f(k5Var);
            k5Var.k(j2);
        }
        return p0 + j2;
    }

    @Deprecated
    public static int W(j8 j8Var) {
        return j8Var.d();
    }

    public static int c(int i2, n7 n7Var) {
        int p0 = p0(i2 << 3);
        int b2 = n7Var.b();
        return p0 + p0(b2) + b2;
    }

    public static int c0(int i2, long j2) {
        return p0(i2 << 3) + j0(j2);
    }

    public static int d(n7 n7Var) {
        int b2 = n7Var.b();
        return p0(b2) + b2;
    }

    public static int d0(int i2, t5 t5Var) {
        return (p0(8) << 1) + q0(2, i2) + U(3, t5Var);
    }

    static int e(j8 j8Var, y8 y8Var) {
        k5 k5Var = (k5) j8Var;
        int j2 = k5Var.j();
        if (j2 == -1) {
            j2 = y8Var.f(k5Var);
            k5Var.k(j2);
        }
        return p0(j2) + j2;
    }

    public static int e0(long j2) {
        return j0(j2);
    }

    public static zzhf f(byte[] bArr) {
        return new a(bArr, 0, bArr.length);
    }

    public static int h0(int i2) {
        return p0(i2 << 3);
    }

    public static int i0(int i2, long j2) {
        return p0(i2 << 3) + j0(j2);
    }

    public static int j0(long j2) {
        int i2;
        if ((-128 & j2) == 0) {
            return 1;
        }
        if (j2 < 0) {
            return 10;
        }
        if ((-34359738368L & j2) != 0) {
            i2 = 6;
            j2 >>>= 28;
        } else {
            i2 = 2;
        }
        if ((-2097152 & j2) != 0) {
            i2 += 2;
            j2 >>>= 14;
        }
        return (j2 & -16384) != 0 ? i2 + 1 : i2;
    }

    public static int l0(int i2) {
        if (i2 >= 0) {
            return p0(i2);
        }
        return 10;
    }

    public static int m0(int i2, int i3) {
        return p0(i2 << 3) + l0(i3);
    }

    public static int n0(int i2, long j2) {
        return p0(i2 << 3) + j0(z0(j2));
    }

    public static int o0(long j2) {
        return j0(z0(j2));
    }

    public static int p0(int i2) {
        if ((i2 & -128) == 0) {
            return 1;
        }
        if ((i2 & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i2) == 0) {
            return 3;
        }
        return (i2 & -268435456) == 0 ? 4 : 5;
    }

    public static int q0(int i2, int i3) {
        return p0(i2 << 3) + p0(i3);
    }

    public static int r0(int i2, long j2) {
        return p0(i2 << 3) + 8;
    }

    public static int s0(long j2) {
        return 8;
    }

    public static int t0(int i2) {
        return p0(F0(i2));
    }

    public static int u0(int i2, int i3) {
        return p0(i2 << 3) + p0(F0(i3));
    }

    public static int v0(int i2, long j2) {
        return p0(i2 << 3) + 8;
    }

    public static int w0(long j2) {
        return 8;
    }

    public static int x0(int i2) {
        return 4;
    }

    public static int y0(int i2, int i3) {
        return p0(i2 << 3) + 4;
    }

    public static int z(double d2) {
        return 8;
    }

    private static long z0(long j2) {
        return (j2 >> 63) ^ (j2 << 1);
    }

    public final void N() {
        if (b() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public abstract void O(int i2);

    public abstract void P(int i2, int i3);

    public final void Q(int i2, long j2) {
        n(i2, z0(j2));
    }

    public abstract void R(int i2, t5 t5Var);

    public final void S(long j2) {
        t(z0(j2));
    }

    /* access modifiers changed from: package-private */
    public abstract void T(byte[] bArr, int i2, int i3);

    public final void X(int i2) {
        O(F0(i2));
    }

    public abstract void Y(int i2, int i3);

    public abstract void Z(int i2, long j2);

    public abstract void a0(long j2);

    public abstract int b();

    public abstract void f0(int i2);

    public abstract void g(byte b2);

    public final void g0(int i2, int i3) {
        Y(i2, F0(i3));
    }

    public final void h(double d2) {
        a0(Double.doubleToRawLongBits(d2));
    }

    public final void i(float f2) {
        f0(Float.floatToRawIntBits(f2));
    }

    public abstract void j(int i2);

    public final void k(int i2, double d2) {
        Z(i2, Double.doubleToRawLongBits(d2));
    }

    public abstract void k0(int i2, int i3);

    public final void l(int i2, float f2) {
        k0(i2, Float.floatToRawIntBits(f2));
    }

    public abstract void m(int i2, int i3);

    public abstract void n(int i2, long j2);

    public abstract void o(int i2, t5 t5Var);

    public abstract void p(int i2, j8 j8Var);

    /* access modifiers changed from: package-private */
    public abstract void q(int i2, j8 j8Var, y8 y8Var);

    public abstract void r(int i2, String str);

    public abstract void s(int i2, boolean z);

    public abstract void t(long j2);

    public abstract void u(t5 t5Var);

    public abstract void v(j8 j8Var);

    public abstract void w(String str);

    /* access modifiers changed from: package-private */
    public final void x(String str, ba baVar) {
        b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", baVar);
        byte[] bytes = str.getBytes(b7.a);
        try {
            O(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e2) {
            throw new zza(e2);
        } catch (zza e3) {
            throw e3;
        }
    }

    public final void y(boolean z) {
        g(z ? (byte) 1 : 0);
    }
}
