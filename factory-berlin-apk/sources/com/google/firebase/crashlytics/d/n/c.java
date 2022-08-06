package com.google.firebase.crashlytics.d.n;

import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: CodedOutputStream */
public final class c implements Flushable {

    /* renamed from: g  reason: collision with root package name */
    private final byte[] f4098g;

    /* renamed from: h  reason: collision with root package name */
    private final int f4099h;

    /* renamed from: i  reason: collision with root package name */
    private int f4100i = 0;

    /* renamed from: j  reason: collision with root package name */
    private final OutputStream f4101j;

    /* compiled from: CodedOutputStream */
    static class a extends IOException {
        a() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
    }

    private c(OutputStream outputStream, byte[] bArr) {
        this.f4101j = outputStream;
        this.f4098g = bArr;
        this.f4099h = bArr.length;
    }

    public static int C(int i2) {
        return (i2 >> 31) ^ (i2 << 1);
    }

    public static c D(OutputStream outputStream) {
        return E(outputStream, 4096);
    }

    public static c E(OutputStream outputStream, int i2) {
        return new c(outputStream, new byte[i2]);
    }

    private void F() {
        OutputStream outputStream = this.f4101j;
        if (outputStream != null) {
            outputStream.write(this.f4098g, 0, this.f4100i);
            this.f4100i = 0;
            return;
        }
        throw new a();
    }

    public static int a(int i2, boolean z) {
        return r(i2) + b(z);
    }

    public static int b(boolean z) {
        return 1;
    }

    public static int c(int i2, a aVar) {
        return r(i2) + f(aVar);
    }

    public static int f(a aVar) {
        return m(aVar.f()) + aVar.f();
    }

    public static int h(int i2, int i3) {
        return r(i2) + i(i3);
    }

    public static int i(int i2) {
        return l(i2);
    }

    public static int j(int i2, float f2) {
        return r(i2) + k(f2);
    }

    public static int k(float f2) {
        return 4;
    }

    public static int l(int i2) {
        if (i2 >= 0) {
            return m(i2);
        }
        return 10;
    }

    public static int m(int i2) {
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

    public static int n(long j2) {
        if ((-128 & j2) == 0) {
            return 1;
        }
        if ((-16384 & j2) == 0) {
            return 2;
        }
        if ((-2097152 & j2) == 0) {
            return 3;
        }
        if ((-268435456 & j2) == 0) {
            return 4;
        }
        if ((-34359738368L & j2) == 0) {
            return 5;
        }
        if ((-4398046511104L & j2) == 0) {
            return 6;
        }
        if ((-562949953421312L & j2) == 0) {
            return 7;
        }
        if ((-72057594037927936L & j2) == 0) {
            return 8;
        }
        return (j2 & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static int o(int i2, int i3) {
        return r(i2) + q(i3);
    }

    public static int q(int i2) {
        return m(C(i2));
    }

    public static int r(int i2) {
        return m(e.a(i2, 0));
    }

    public static int w(int i2, int i3) {
        return r(i2) + x(i3);
    }

    public static int x(int i2) {
        return m(i2);
    }

    public static int y(int i2, long j2) {
        return r(i2) + z(j2);
    }

    public static int z(long j2) {
        return n(j2);
    }

    public void G(int i2, boolean z) {
        f0(i2, 0);
        I(z);
    }

    public void I(boolean z) {
        S(z ? 1 : 0);
    }

    public void J(int i2, a aVar) {
        f0(i2, 2);
        K(aVar);
    }

    public void K(a aVar) {
        Z(aVar.f());
        T(aVar);
    }

    public void L(int i2, int i3) {
        f0(i2, 0);
        M(i3);
    }

    public void M(int i2) {
        P(i2);
    }

    public void N(int i2, float f2) {
        f0(i2, 5);
        O(f2);
    }

    public void O(float f2) {
        X(Float.floatToRawIntBits(f2));
    }

    public void P(int i2) {
        if (i2 >= 0) {
            Z(i2);
        } else {
            b0((long) i2);
        }
    }

    public void Q(byte b) {
        if (this.f4100i == this.f4099h) {
            F();
        }
        byte[] bArr = this.f4098g;
        int i2 = this.f4100i;
        this.f4100i = i2 + 1;
        bArr[i2] = b;
    }

    public void S(int i2) {
        Q((byte) i2);
    }

    public void T(a aVar) {
        U(aVar, 0, aVar.f());
    }

    public void U(a aVar, int i2, int i3) {
        int i4 = this.f4099h;
        int i5 = this.f4100i;
        if (i4 - i5 >= i3) {
            aVar.d(this.f4098g, i2, i5, i3);
            this.f4100i += i3;
            return;
        }
        int i6 = i4 - i5;
        aVar.d(this.f4098g, i2, i5, i6);
        int i7 = i2 + i6;
        int i8 = i3 - i6;
        this.f4100i = this.f4099h;
        F();
        if (i8 <= this.f4099h) {
            aVar.d(this.f4098g, i7, 0, i8);
            this.f4100i = i8;
            return;
        }
        InputStream e2 = aVar.e();
        long j2 = (long) i7;
        if (j2 == e2.skip(j2)) {
            while (i8 > 0) {
                int min = Math.min(i8, this.f4099h);
                int read = e2.read(this.f4098g, 0, min);
                if (read == min) {
                    this.f4101j.write(this.f4098g, 0, read);
                    i8 -= read;
                } else {
                    throw new IllegalStateException("Read failed.");
                }
            }
            return;
        }
        throw new IllegalStateException("Skip failed.");
    }

    public void V(byte[] bArr) {
        W(bArr, 0, bArr.length);
    }

    public void W(byte[] bArr, int i2, int i3) {
        int i4 = this.f4099h;
        int i5 = this.f4100i;
        if (i4 - i5 >= i3) {
            System.arraycopy(bArr, i2, this.f4098g, i5, i3);
            this.f4100i += i3;
            return;
        }
        int i6 = i4 - i5;
        System.arraycopy(bArr, i2, this.f4098g, i5, i6);
        int i7 = i2 + i6;
        int i8 = i3 - i6;
        this.f4100i = this.f4099h;
        F();
        if (i8 <= this.f4099h) {
            System.arraycopy(bArr, i7, this.f4098g, 0, i8);
            this.f4100i = i8;
            return;
        }
        this.f4101j.write(bArr, i7, i8);
    }

    public void X(int i2) {
        S(i2 & 255);
        S((i2 >> 8) & 255);
        S((i2 >> 16) & 255);
        S((i2 >> 24) & 255);
    }

    public void Z(int i2) {
        while ((i2 & -128) != 0) {
            S((i2 & 127) | 128);
            i2 >>>= 7;
        }
        S(i2);
    }

    public void b0(long j2) {
        while ((-128 & j2) != 0) {
            S((((int) j2) & 127) | 128);
            j2 >>>= 7;
        }
        S((int) j2);
    }

    public void c0(int i2, int i3) {
        f0(i2, 0);
        e0(i3);
    }

    public void e0(int i2) {
        Z(C(i2));
    }

    public void f0(int i2, int i3) {
        Z(e.a(i2, i3));
    }

    public void flush() {
        if (this.f4101j != null) {
            F();
        }
    }

    public void g0(int i2, int i3) {
        f0(i2, 0);
        h0(i3);
    }

    public void h0(int i2) {
        Z(i2);
    }

    public void i0(int i2, long j2) {
        f0(i2, 0);
        j0(j2);
    }

    public void j0(long j2) {
        b0(j2);
    }
}
