package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.r1;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class CodedOutputStream extends h {
    private static final Logger c = Logger.getLogger(CodedOutputStream.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f3697d = q1.C();
    l a;
    private boolean b;

    public static class OutOfSpaceException extends IOException {
        OutOfSpaceException() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        OutOfSpaceException(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        OutOfSpaceException(String str, Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th);
        }
    }

    private static class b extends CodedOutputStream {

        /* renamed from: e  reason: collision with root package name */
        private final byte[] f3698e;

        /* renamed from: f  reason: collision with root package name */
        private final int f3699f;

        /* renamed from: g  reason: collision with root package name */
        private int f3700g;

        b(byte[] bArr, int i2, int i3) {
            super();
            if (bArr != null) {
                int i4 = i2 + i3;
                if ((i2 | i3 | (bArr.length - i4)) >= 0) {
                    this.f3698e = bArr;
                    this.f3700g = i2;
                    this.f3699f = i4;
                    return;
                }
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i2), Integer.valueOf(i3)}));
            }
            throw new NullPointerException("buffer");
        }

        public final void B0(int i2, int i3) {
            T0(i2, 0);
            C0(i3);
        }

        public final void C0(int i2) {
            if (i2 >= 0) {
                V0(i2);
            } else {
                X0((long) i2);
            }
        }

        /* access modifiers changed from: package-private */
        public final void F0(int i2, q0 q0Var, g1 g1Var) {
            T0(i2, 2);
            V0(((a) q0Var).b(g1Var));
            g1Var.c(q0Var, this.a);
        }

        public final void G0(q0 q0Var) {
            V0(q0Var.c());
            q0Var.g(this);
        }

        public final void H0(int i2, q0 q0Var) {
            T0(1, 3);
            U0(2, i2);
            Z0(3, q0Var);
            T0(1, 4);
        }

        public final void I0(int i2, i iVar) {
            T0(1, 3);
            U0(2, i2);
            l0(3, iVar);
            T0(1, 4);
        }

        public final void R0(int i2, String str) {
            T0(i2, 2);
            S0(str);
        }

        public final void S0(String str) {
            int i2 = this.f3700g;
            try {
                int W = CodedOutputStream.W(str.length() * 3);
                int W2 = CodedOutputStream.W(str.length());
                if (W2 == W) {
                    int i3 = i2 + W2;
                    this.f3700g = i3;
                    int f2 = r1.f(str, this.f3698e, i3, f0());
                    this.f3700g = i2;
                    V0((f2 - i2) - W2);
                    this.f3700g = f2;
                    return;
                }
                V0(r1.g(str));
                this.f3700g = r1.f(str, this.f3698e, this.f3700g, f0());
            } catch (r1.d e2) {
                this.f3700g = i2;
                b0(str, e2);
            } catch (IndexOutOfBoundsException e3) {
                throw new OutOfSpaceException(e3);
            }
        }

        public final void T0(int i2, int i3) {
            V0(s1.c(i2, i3));
        }

        public final void U0(int i2, int i3) {
            T0(i2, 0);
            V0(i3);
        }

        public final void V0(int i2) {
            if (!CodedOutputStream.f3697d || d.c() || f0() < 5) {
                while ((i2 & -128) != 0) {
                    byte[] bArr = this.f3698e;
                    int i3 = this.f3700g;
                    this.f3700g = i3 + 1;
                    bArr[i3] = (byte) ((i2 & 127) | 128);
                    i2 >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f3698e;
                    int i4 = this.f3700g;
                    this.f3700g = i4 + 1;
                    bArr2[i4] = (byte) i2;
                } catch (IndexOutOfBoundsException e2) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f3700g), Integer.valueOf(this.f3699f), 1}), e2);
                }
            } else if ((i2 & -128) == 0) {
                byte[] bArr3 = this.f3698e;
                int i5 = this.f3700g;
                this.f3700g = i5 + 1;
                q1.I(bArr3, (long) i5, (byte) i2);
            } else {
                byte[] bArr4 = this.f3698e;
                int i6 = this.f3700g;
                this.f3700g = i6 + 1;
                q1.I(bArr4, (long) i6, (byte) (i2 | 128));
                int i7 = i2 >>> 7;
                if ((i7 & -128) == 0) {
                    byte[] bArr5 = this.f3698e;
                    int i8 = this.f3700g;
                    this.f3700g = i8 + 1;
                    q1.I(bArr5, (long) i8, (byte) i7);
                    return;
                }
                byte[] bArr6 = this.f3698e;
                int i9 = this.f3700g;
                this.f3700g = i9 + 1;
                q1.I(bArr6, (long) i9, (byte) (i7 | 128));
                int i10 = i7 >>> 7;
                if ((i10 & -128) == 0) {
                    byte[] bArr7 = this.f3698e;
                    int i11 = this.f3700g;
                    this.f3700g = i11 + 1;
                    q1.I(bArr7, (long) i11, (byte) i10);
                    return;
                }
                byte[] bArr8 = this.f3698e;
                int i12 = this.f3700g;
                this.f3700g = i12 + 1;
                q1.I(bArr8, (long) i12, (byte) (i10 | 128));
                int i13 = i10 >>> 7;
                if ((i13 & -128) == 0) {
                    byte[] bArr9 = this.f3698e;
                    int i14 = this.f3700g;
                    this.f3700g = i14 + 1;
                    q1.I(bArr9, (long) i14, (byte) i13);
                    return;
                }
                byte[] bArr10 = this.f3698e;
                int i15 = this.f3700g;
                this.f3700g = i15 + 1;
                q1.I(bArr10, (long) i15, (byte) (i13 | 128));
                byte[] bArr11 = this.f3698e;
                int i16 = this.f3700g;
                this.f3700g = i16 + 1;
                q1.I(bArr11, (long) i16, (byte) (i13 >>> 7));
            }
        }

        public final void W0(int i2, long j2) {
            T0(i2, 0);
            X0(j2);
        }

        public final void X0(long j2) {
            if (!CodedOutputStream.f3697d || f0() < 10) {
                while ((j2 & -128) != 0) {
                    byte[] bArr = this.f3698e;
                    int i2 = this.f3700g;
                    this.f3700g = i2 + 1;
                    bArr[i2] = (byte) ((((int) j2) & 127) | 128);
                    j2 >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f3698e;
                    int i3 = this.f3700g;
                    this.f3700g = i3 + 1;
                    bArr2[i3] = (byte) ((int) j2);
                } catch (IndexOutOfBoundsException e2) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f3700g), Integer.valueOf(this.f3699f), 1}), e2);
                }
            } else {
                while ((j2 & -128) != 0) {
                    byte[] bArr3 = this.f3698e;
                    int i4 = this.f3700g;
                    this.f3700g = i4 + 1;
                    q1.I(bArr3, (long) i4, (byte) ((((int) j2) & 127) | 128));
                    j2 >>>= 7;
                }
                byte[] bArr4 = this.f3698e;
                int i5 = this.f3700g;
                this.f3700g = i5 + 1;
                q1.I(bArr4, (long) i5, (byte) ((int) j2));
            }
        }

        public final void Y0(byte[] bArr, int i2, int i3) {
            try {
                System.arraycopy(bArr, i2, this.f3698e, this.f3700g, i3);
                this.f3700g += i3;
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f3700g), Integer.valueOf(this.f3699f), Integer.valueOf(i3)}), e2);
            }
        }

        public final void Z0(int i2, q0 q0Var) {
            T0(i2, 2);
            G0(q0Var);
        }

        public final void a(byte[] bArr, int i2, int i3) {
            Y0(bArr, i2, i3);
        }

        public final int f0() {
            return this.f3699f - this.f3700g;
        }

        public final void g0(byte b) {
            try {
                byte[] bArr = this.f3698e;
                int i2 = this.f3700g;
                this.f3700g = i2 + 1;
                bArr[i2] = b;
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f3700g), Integer.valueOf(this.f3699f), 1}), e2);
            }
        }

        public final void h0(int i2, boolean z) {
            T0(i2, 0);
            g0(z ? (byte) 1 : 0);
        }

        public final void k0(byte[] bArr, int i2, int i3) {
            V0(i3);
            Y0(bArr, i2, i3);
        }

        public final void l0(int i2, i iVar) {
            T0(i2, 2);
            m0(iVar);
        }

        public final void m0(i iVar) {
            V0(iVar.size());
            iVar.K(this);
        }

        public final void r0(int i2, int i3) {
            T0(i2, 5);
            s0(i3);
        }

        public final void s0(int i2) {
            try {
                byte[] bArr = this.f3698e;
                int i3 = this.f3700g;
                int i4 = i3 + 1;
                this.f3700g = i4;
                bArr[i3] = (byte) (i2 & 255);
                byte[] bArr2 = this.f3698e;
                int i5 = i4 + 1;
                this.f3700g = i5;
                bArr2[i4] = (byte) ((i2 >> 8) & 255);
                byte[] bArr3 = this.f3698e;
                int i6 = i5 + 1;
                this.f3700g = i6;
                bArr3[i5] = (byte) ((i2 >> 16) & 255);
                byte[] bArr4 = this.f3698e;
                this.f3700g = i6 + 1;
                bArr4[i6] = (byte) ((i2 >> 24) & 255);
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f3700g), Integer.valueOf(this.f3699f), 1}), e2);
            }
        }

        public final void t0(int i2, long j2) {
            T0(i2, 1);
            u0(j2);
        }

        public final void u0(long j2) {
            try {
                byte[] bArr = this.f3698e;
                int i2 = this.f3700g;
                int i3 = i2 + 1;
                this.f3700g = i3;
                bArr[i2] = (byte) (((int) j2) & 255);
                byte[] bArr2 = this.f3698e;
                int i4 = i3 + 1;
                this.f3700g = i4;
                bArr2[i3] = (byte) (((int) (j2 >> 8)) & 255);
                byte[] bArr3 = this.f3698e;
                int i5 = i4 + 1;
                this.f3700g = i5;
                bArr3[i4] = (byte) (((int) (j2 >> 16)) & 255);
                byte[] bArr4 = this.f3698e;
                int i6 = i5 + 1;
                this.f3700g = i6;
                bArr4[i5] = (byte) (((int) (j2 >> 24)) & 255);
                byte[] bArr5 = this.f3698e;
                int i7 = i6 + 1;
                this.f3700g = i7;
                bArr5[i6] = (byte) (((int) (j2 >> 32)) & 255);
                byte[] bArr6 = this.f3698e;
                int i8 = i7 + 1;
                this.f3700g = i8;
                bArr6[i7] = (byte) (((int) (j2 >> 40)) & 255);
                byte[] bArr7 = this.f3698e;
                int i9 = i8 + 1;
                this.f3700g = i9;
                bArr7[i8] = (byte) (((int) (j2 >> 48)) & 255);
                byte[] bArr8 = this.f3698e;
                this.f3700g = i9 + 1;
                bArr8[i9] = (byte) (((int) (j2 >> 56)) & 255);
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f3700g), Integer.valueOf(this.f3699f), 1}), e2);
            }
        }
    }

    public static int A(int i2, d0 d0Var) {
        return U(i2) + B(d0Var);
    }

    public static int B(d0 d0Var) {
        return C(d0Var.b());
    }

    static int C(int i2) {
        return W(i2) + i2;
    }

    public static int D(int i2, q0 q0Var) {
        return (U(1) * 2) + V(2, i2) + E(3, q0Var);
    }

    public static int E(int i2, q0 q0Var) {
        return U(i2) + G(q0Var);
    }

    static int F(int i2, q0 q0Var, g1 g1Var) {
        return U(i2) + H(q0Var, g1Var);
    }

    public static int G(q0 q0Var) {
        return C(q0Var.c());
    }

    static int H(q0 q0Var, g1 g1Var) {
        return C(((a) q0Var).b(g1Var));
    }

    public static int I(int i2, i iVar) {
        return (U(1) * 2) + V(2, i2) + g(3, iVar);
    }

    @Deprecated
    public static int J(int i2) {
        return W(i2);
    }

    public static int K(int i2, int i3) {
        return U(i2) + L(i3);
    }

    public static int L(int i2) {
        return 4;
    }

    public static int M(int i2, long j2) {
        return U(i2) + N(j2);
    }

    public static int N(long j2) {
        return 8;
    }

    public static int O(int i2, int i3) {
        return U(i2) + P(i3);
    }

    public static int P(int i2) {
        return W(Z(i2));
    }

    public static int Q(int i2, long j2) {
        return U(i2) + R(j2);
    }

    public static int R(long j2) {
        return Y(a0(j2));
    }

    public static int S(int i2, String str) {
        return U(i2) + T(str);
    }

    public static int T(String str) {
        int i2;
        try {
            i2 = r1.g(str);
        } catch (r1.d unused) {
            i2 = str.getBytes(a0.a).length;
        }
        return C(i2);
    }

    public static int U(int i2) {
        return W(s1.c(i2, 0));
    }

    public static int V(int i2, int i3) {
        return U(i2) + W(i3);
    }

    public static int W(int i2) {
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

    public static int X(int i2, long j2) {
        return U(i2) + Y(j2);
    }

    public static int Y(long j2) {
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

    public static int Z(int i2) {
        return (i2 >> 31) ^ (i2 << 1);
    }

    public static long a0(long j2) {
        return (j2 >> 63) ^ (j2 << 1);
    }

    public static int d(int i2, boolean z) {
        return U(i2) + e(z);
    }

    public static CodedOutputStream d0(byte[] bArr) {
        return e0(bArr, 0, bArr.length);
    }

    public static int e(boolean z) {
        return 1;
    }

    public static CodedOutputStream e0(byte[] bArr, int i2, int i3) {
        return new b(bArr, i2, i3);
    }

    public static int f(byte[] bArr) {
        return C(bArr.length);
    }

    public static int g(int i2, i iVar) {
        return U(i2) + h(iVar);
    }

    public static int h(i iVar) {
        return C(iVar.size());
    }

    public static int i(int i2, double d2) {
        return U(i2) + j(d2);
    }

    public static int j(double d2) {
        return 8;
    }

    public static int k(int i2, int i3) {
        return U(i2) + l(i3);
    }

    public static int l(int i2) {
        return w(i2);
    }

    public static int m(int i2, int i3) {
        return U(i2) + n(i3);
    }

    public static int n(int i2) {
        return 4;
    }

    public static int o(int i2, long j2) {
        return U(i2) + p(j2);
    }

    public static int p(long j2) {
        return 8;
    }

    public static int q(int i2, float f2) {
        return U(i2) + r(f2);
    }

    public static int r(float f2) {
        return 4;
    }

    @Deprecated
    static int s(int i2, q0 q0Var, g1 g1Var) {
        return (U(i2) * 2) + u(q0Var, g1Var);
    }

    @Deprecated
    public static int t(q0 q0Var) {
        return q0Var.c();
    }

    @Deprecated
    static int u(q0 q0Var, g1 g1Var) {
        return ((a) q0Var).b(g1Var);
    }

    public static int v(int i2, int i3) {
        return U(i2) + w(i3);
    }

    public static int w(int i2) {
        if (i2 >= 0) {
            return W(i2);
        }
        return 10;
    }

    public static int x(int i2, long j2) {
        return U(i2) + y(j2);
    }

    public static int y(long j2) {
        return Y(j2);
    }

    public static int z(int i2, d0 d0Var) {
        return (U(1) * 2) + V(2, i2) + A(3, d0Var);
    }

    /* access modifiers changed from: package-private */
    @Deprecated
    public final void A0(q0 q0Var, g1 g1Var) {
        g1Var.c(q0Var, this.a);
    }

    public abstract void B0(int i2, int i3);

    public abstract void C0(int i2);

    public final void D0(int i2, long j2) {
        W0(i2, j2);
    }

    public final void E0(long j2) {
        X0(j2);
    }

    /* access modifiers changed from: package-private */
    public abstract void F0(int i2, q0 q0Var, g1 g1Var);

    public abstract void G0(q0 q0Var);

    public abstract void H0(int i2, q0 q0Var);

    public abstract void I0(int i2, i iVar);

    public final void J0(int i2, int i3) {
        r0(i2, i3);
    }

    public final void K0(int i2) {
        s0(i2);
    }

    public final void L0(int i2, long j2) {
        t0(i2, j2);
    }

    public final void M0(long j2) {
        u0(j2);
    }

    public final void N0(int i2, int i3) {
        U0(i2, Z(i3));
    }

    public final void O0(int i2) {
        V0(Z(i2));
    }

    public final void P0(int i2, long j2) {
        W0(i2, a0(j2));
    }

    public final void Q0(long j2) {
        X0(a0(j2));
    }

    public abstract void R0(int i2, String str);

    public abstract void S0(String str);

    public abstract void T0(int i2, int i3);

    public abstract void U0(int i2, int i3);

    public abstract void V0(int i2);

    public abstract void W0(int i2, long j2);

    public abstract void X0(long j2);

    /* access modifiers changed from: package-private */
    public final void b0(String str, r1.d dVar) {
        c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", dVar);
        byte[] bytes = str.getBytes(a0.a);
        try {
            V0(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e2) {
            throw new OutOfSpaceException(e2);
        } catch (OutOfSpaceException e3) {
            throw e3;
        }
    }

    public final void c() {
        if (f0() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* access modifiers changed from: package-private */
    public boolean c0() {
        return this.b;
    }

    public abstract int f0();

    public abstract void g0(byte b2);

    public abstract void h0(int i2, boolean z);

    public final void i0(boolean z) {
        g0(z ? (byte) 1 : 0);
    }

    public final void j0(byte[] bArr) {
        k0(bArr, 0, bArr.length);
    }

    /* access modifiers changed from: package-private */
    public abstract void k0(byte[] bArr, int i2, int i3);

    public abstract void l0(int i2, i iVar);

    public abstract void m0(i iVar);

    public final void n0(int i2, double d2) {
        t0(i2, Double.doubleToRawLongBits(d2));
    }

    public final void o0(double d2) {
        u0(Double.doubleToRawLongBits(d2));
    }

    public final void p0(int i2, int i3) {
        B0(i2, i3);
    }

    public final void q0(int i2) {
        C0(i2);
    }

    public abstract void r0(int i2, int i3);

    public abstract void s0(int i2);

    public abstract void t0(int i2, long j2);

    public abstract void u0(long j2);

    public final void v0(int i2, float f2) {
        r0(i2, Float.floatToRawIntBits(f2));
    }

    public final void w0(float f2) {
        s0(Float.floatToRawIntBits(f2));
    }

    @Deprecated
    public final void x0(int i2, q0 q0Var) {
        T0(i2, 3);
        z0(q0Var);
        T0(i2, 4);
    }

    /* access modifiers changed from: package-private */
    @Deprecated
    public final void y0(int i2, q0 q0Var, g1 g1Var) {
        T0(i2, 3);
        A0(q0Var, g1Var);
        T0(i2, 4);
    }

    @Deprecated
    public final void z0(q0 q0Var) {
        q0Var.g(this);
    }

    private CodedOutputStream() {
    }
}
