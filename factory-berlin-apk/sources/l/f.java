package l;

import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import kotlin.TypeCastException;
import kotlin.j0.d;
import kotlin.jvm.internal.k;

/* compiled from: Buffer.kt */
public final class f implements h, g, Cloneable, ByteChannel {

    /* renamed from: g  reason: collision with root package name */
    public w f11099g;

    /* renamed from: h  reason: collision with root package name */
    private long f11100h;

    /* compiled from: Buffer.kt */
    public static final class b extends OutputStream {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ f f11102g;

        b(f fVar) {
            this.f11102g = fVar;
        }

        public void close() {
        }

        public void flush() {
        }

        public String toString() {
            return this.f11102g + ".outputStream()";
        }

        public void write(int i2) {
            this.f11102g.a1(i2);
        }

        public void write(byte[] bArr, int i2, int i3) {
            k.f(bArr, "data");
            this.f11102g.Z0(bArr, i2, i3);
        }
    }

    public /* bridge */ /* synthetic */ g A() {
        M();
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0097, code lost:
        if (r8 != r9) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0099, code lost:
        r15.f11099g = r6.b();
        l.x.b(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a3, code lost:
        r6.b = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a5, code lost:
        if (r1 != false) goto L_0x00ab;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007c A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long A0() {
        /*
            r15 = this;
            long r0 = r15.T0()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x00ba
            r0 = 0
            r4 = r2
            r1 = 0
        L_0x000d:
            l.w r6 = r15.f11099g
            if (r6 == 0) goto L_0x00b5
            byte[] r7 = r6.a
            int r8 = r6.b
            int r9 = r6.c
        L_0x0017:
            if (r8 >= r9) goto L_0x0097
            byte r10 = r7[r8]
            r11 = 48
            byte r11 = (byte) r11
            if (r10 < r11) goto L_0x0028
            r12 = 57
            byte r12 = (byte) r12
            if (r10 > r12) goto L_0x0028
            int r11 = r10 - r11
            goto L_0x0042
        L_0x0028:
            r11 = 97
            byte r11 = (byte) r11
            if (r10 < r11) goto L_0x0037
            r12 = 102(0x66, float:1.43E-43)
            byte r12 = (byte) r12
            if (r10 > r12) goto L_0x0037
        L_0x0032:
            int r11 = r10 - r11
            int r11 = r11 + 10
            goto L_0x0042
        L_0x0037:
            r11 = 65
            byte r11 = (byte) r11
            if (r10 < r11) goto L_0x0078
            r12 = 70
            byte r12 = (byte) r12
            if (r10 > r12) goto L_0x0078
            goto L_0x0032
        L_0x0042:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r14 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r14 != 0) goto L_0x0052
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L_0x0017
        L_0x0052:
            l.f r0 = new l.f
            r0.<init>()
            r0.c1(r4)
            r0.a1(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Number too large: "
            r2.append(r3)
            java.lang.String r0 = r0.P0()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x0078:
            if (r0 == 0) goto L_0x007c
            r1 = 1
            goto L_0x0097
        L_0x007c:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.append(r2)
            java.lang.String r2 = l.c.e(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0097:
            if (r8 != r9) goto L_0x00a3
            l.w r7 = r6.b()
            r15.f11099g = r7
            l.x.b(r6)
            goto L_0x00a5
        L_0x00a3:
            r6.b = r8
        L_0x00a5:
            if (r1 != 0) goto L_0x00ab
            l.w r6 = r15.f11099g
            if (r6 != 0) goto L_0x000d
        L_0x00ab:
            long r1 = r15.T0()
            long r6 = (long) r0
            long r1 = r1 - r6
            r15.S0(r1)
            return r4
        L_0x00b5:
            kotlin.jvm.internal.k.m()
            r0 = 0
            throw r0
        L_0x00ba:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.f.A0():long");
    }

    public /* bridge */ /* synthetic */ g B(int i2) {
        e1(i2);
        return this;
    }

    public boolean C(long j2) {
        return this.f11100h >= j2;
    }

    public String C0(Charset charset) {
        k.f(charset, "charset");
        return O0(this.f11100h, charset);
    }

    public final f D() {
        f fVar = new f();
        if (T0() != 0) {
            w wVar = this.f11099g;
            if (wVar != null) {
                w d2 = wVar.d();
                fVar.f11099g = d2;
                d2.f11137g = d2;
                d2.f11136f = d2;
                w wVar2 = wVar.f11136f;
                while (wVar2 != wVar) {
                    w wVar3 = d2.f11137g;
                    if (wVar3 == null) {
                        k.m();
                        throw null;
                    } else if (wVar2 != null) {
                        wVar3.c(wVar2.d());
                        wVar2 = wVar2.f11136f;
                    } else {
                        k.m();
                        throw null;
                    }
                }
                fVar.S0(T0());
            } else {
                k.m();
                throw null;
            }
        }
        return fVar;
    }

    public InputStream D0() {
        return new a(this);
    }

    public int E0(s sVar) {
        k.f(sVar, "options");
        int e2 = l.d0.a.e(this, sVar, false, 2, (Object) null);
        if (e2 == -1) {
            return -1;
        }
        x((long) sVar.g()[e2].G());
        return e2;
    }

    public final f F(f fVar, long j2, long j3) {
        k.f(fVar, "out");
        c.b(T0(), j2, j3);
        if (j3 != 0) {
            fVar.S0(fVar.T0() + j3);
            w wVar = this.f11099g;
            while (wVar != null) {
                int i2 = wVar.c;
                int i3 = wVar.b;
                if (j2 >= ((long) (i2 - i3))) {
                    j2 -= (long) (i2 - i3);
                    wVar = wVar.f11136f;
                } else {
                    while (j3 > 0) {
                        if (wVar != null) {
                            w d2 = wVar.d();
                            int i4 = d2.b + ((int) j2);
                            d2.b = i4;
                            d2.c = Math.min(i4 + ((int) j3), d2.c);
                            w wVar2 = fVar.f11099g;
                            if (wVar2 == null) {
                                d2.f11137g = d2;
                                d2.f11136f = d2;
                                fVar.f11099g = d2;
                            } else if (wVar2 != null) {
                                w wVar3 = wVar2.f11137g;
                                if (wVar3 != null) {
                                    wVar3.c(d2);
                                } else {
                                    k.m();
                                    throw null;
                                }
                            } else {
                                k.m();
                                throw null;
                            }
                            j3 -= (long) (d2.c - d2.b);
                            wVar = wVar.f11136f;
                            j2 = 0;
                        } else {
                            k.m();
                            throw null;
                        }
                    }
                }
            }
            k.m();
            throw null;
        }
        return this;
    }

    public long F0(i iVar, long j2) {
        long j3;
        int i2;
        int i3;
        int i4;
        k.f(iVar, "targetBytes");
        long j4 = 0;
        if (j2 >= 0) {
            w wVar = this.f11099g;
            if (wVar == null) {
                return -1;
            }
            if (T0() - j2 < j2) {
                j3 = T0();
                while (j3 > j2) {
                    wVar = wVar.f11137g;
                    if (wVar != null) {
                        j3 -= (long) (wVar.c - wVar.b);
                    } else {
                        k.m();
                        throw null;
                    }
                }
                if (wVar == null) {
                    return -1;
                }
                if (iVar.G() == 2) {
                    byte l2 = iVar.l(0);
                    byte l3 = iVar.l(1);
                    while (j3 < T0()) {
                        byte[] bArr = wVar.a;
                        i3 = (int) ((((long) wVar.b) + j2) - j3);
                        int i5 = wVar.c;
                        while (i3 < i5) {
                            byte b2 = bArr[i3];
                            if (!(b2 == l2 || b2 == l3)) {
                                i3++;
                            }
                        }
                        j3 += (long) (wVar.c - wVar.b);
                        wVar = wVar.f11136f;
                        if (wVar != null) {
                            j2 = j3;
                        } else {
                            k.m();
                            throw null;
                        }
                    }
                    return -1;
                }
                byte[] v = iVar.v();
                while (j3 < T0()) {
                    byte[] bArr2 = wVar.a;
                    i2 = (int) ((((long) wVar.b) + j2) - j3);
                    int i6 = wVar.c;
                    while (i2 < i6) {
                        byte b3 = bArr2[i2];
                        for (byte b4 : v) {
                            if (b3 == b4) {
                                i4 = wVar.b;
                                return ((long) (i3 - i4)) + j3;
                            }
                        }
                        i2++;
                    }
                    j3 += (long) (wVar.c - wVar.b);
                    wVar = wVar.f11136f;
                    if (wVar != null) {
                        j2 = j3;
                    } else {
                        k.m();
                        throw null;
                    }
                }
                return -1;
            }
            while (true) {
                long j5 = ((long) (wVar.c - wVar.b)) + j4;
                if (j5 <= j2) {
                    wVar = wVar.f11136f;
                    if (wVar != null) {
                        j4 = j5;
                    } else {
                        k.m();
                        throw null;
                    }
                } else if (wVar == null) {
                    return -1;
                } else {
                    if (iVar.G() == 2) {
                        byte l4 = iVar.l(0);
                        byte l5 = iVar.l(1);
                        while (j3 < T0()) {
                            byte[] bArr3 = wVar.a;
                            int i7 = (int) ((((long) wVar.b) + j2) - j3);
                            int i8 = wVar.c;
                            while (i3 < i8) {
                                byte b5 = bArr3[i3];
                                if (!(b5 == l4 || b5 == l5)) {
                                    i7 = i3 + 1;
                                }
                            }
                            j4 = j3 + ((long) (wVar.c - wVar.b));
                            wVar = wVar.f11136f;
                            if (wVar != null) {
                                j2 = j4;
                            } else {
                                k.m();
                                throw null;
                            }
                        }
                        return -1;
                    }
                    byte[] v2 = iVar.v();
                    while (j3 < T0()) {
                        byte[] bArr4 = wVar.a;
                        int i9 = (int) ((((long) wVar.b) + j2) - j3);
                        int i10 = wVar.c;
                        while (i2 < i10) {
                            byte b6 = bArr4[i2];
                            int length = v2.length;
                            int i11 = 0;
                            while (i11 < length) {
                                if (b6 != v2[i11]) {
                                    i11++;
                                }
                            }
                            i9 = i2 + 1;
                        }
                        j4 = j3 + ((long) (wVar.c - wVar.b));
                        wVar = wVar.f11136f;
                        if (wVar != null) {
                            j2 = j4;
                        } else {
                            k.m();
                            throw null;
                        }
                    }
                    return -1;
                }
            }
            i4 = wVar.b;
            return ((long) (i3 - i4)) + j3;
            i4 = wVar.b;
            return ((long) (i3 - i4)) + j3;
        }
        throw new IllegalArgumentException(("fromIndex < 0: " + j2).toString());
    }

    public OutputStream G0() {
        return new b(this);
    }

    public /* bridge */ /* synthetic */ g H(int i2) {
        d1(i2);
        return this;
    }

    public boolean H0(long j2, i iVar, int i2, int i3) {
        k.f(iVar, "bytes");
        if (j2 < 0 || i2 < 0 || i3 < 0 || T0() - j2 < ((long) i3) || iVar.G() - i2 < i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (b0(((long) i4) + j2) != iVar.l(i2 + i4)) {
                return false;
            }
        }
        return true;
    }

    public int I0(byte[] bArr, int i2, int i3) {
        k.f(bArr, "sink");
        c.b((long) bArr.length, (long) i2, (long) i3);
        w wVar = this.f11099g;
        if (wVar == null) {
            return -1;
        }
        int min = Math.min(i3, wVar.c - wVar.b);
        byte[] bArr2 = wVar.a;
        int i4 = wVar.b;
        byte[] unused = i.d(bArr2, bArr, i2, i4, i4 + min);
        wVar.b += min;
        S0(T0() - ((long) min));
        if (wVar.b != wVar.c) {
            return min;
        }
        this.f11099g = wVar.b();
        x.b(wVar);
        return min;
    }

    public byte[] J0() {
        return S(T0());
    }

    public i K0() {
        return w(T0());
    }

    public void L0(byte[] bArr) {
        k.f(bArr, "sink");
        int i2 = 0;
        while (i2 < bArr.length) {
            int I0 = I0(bArr, i2, bArr.length - i2);
            if (I0 != -1) {
                i2 += I0;
            } else {
                throw new EOFException();
            }
        }
    }

    public f M() {
        return this;
    }

    public int M0() {
        return c.c(readInt());
    }

    public String N() {
        return h0(Long.MAX_VALUE);
    }

    public short N0() {
        return c.d(readShort());
    }

    public String O0(long j2, Charset charset) {
        k.f(charset, "charset");
        int i2 = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
        if (!(i2 >= 0 && j2 <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(("byteCount: " + j2).toString());
        } else if (this.f11100h < j2) {
            throw new EOFException();
        } else if (i2 == 0) {
            return "";
        } else {
            w wVar = this.f11099g;
            if (wVar != null) {
                int i3 = wVar.b;
                if (((long) i3) + j2 > ((long) wVar.c)) {
                    return new String(S(j2), charset);
                }
                int i4 = (int) j2;
                String str = new String(wVar.a, i3, i4, charset);
                int i5 = wVar.b + i4;
                wVar.b = i5;
                this.f11100h -= j2;
                if (i5 == wVar.c) {
                    this.f11099g = wVar.b();
                    x.b(wVar);
                }
                return str;
            }
            k.m();
            throw null;
        }
    }

    public long P(i iVar) {
        k.f(iVar, "bytes");
        return w0(iVar, 0);
    }

    public String P0() {
        return O0(this.f11100h, d.a);
    }

    public boolean Q() {
        return this.f11100h == 0;
    }

    public String Q0(long j2) {
        return O0(j2, d.a);
    }

    public /* bridge */ /* synthetic */ g R(int i2) {
        a1(i2);
        return this;
    }

    public int R0() {
        byte b2;
        int i2;
        byte b3;
        if (T0() != 0) {
            byte b0 = b0(0);
            int i3 = 1;
            if ((b0 & 128) == 0) {
                b3 = b0 & Byte.MAX_VALUE;
                i2 = 1;
                b2 = 0;
            } else if ((b0 & 224) == 192) {
                b3 = b0 & 31;
                i2 = 2;
                b2 = 128;
            } else if ((b0 & 240) == 224) {
                b3 = b0 & 15;
                i2 = 3;
                b2 = 2048;
            } else if ((b0 & 248) == 240) {
                b3 = b0 & 7;
                i2 = 4;
                b2 = 65536;
            } else {
                x(1);
                return 65533;
            }
            long j2 = (long) i2;
            if (T0() >= j2) {
                while (i3 < i2) {
                    long j3 = (long) i3;
                    byte b02 = b0(j3);
                    if ((b02 & 192) == 128) {
                        b3 = (b3 << 6) | (b02 & 63);
                        i3++;
                    } else {
                        x(j3);
                        return 65533;
                    }
                }
                x(j2);
                if (b3 > 1114111) {
                    return 65533;
                }
                if ((55296 <= b3 && 57343 >= b3) || b3 < b2) {
                    return 65533;
                }
                return b3;
            }
            throw new EOFException("size < " + i2 + ": " + T0() + " (to read code point prefixed 0x" + c.e(b0) + ')');
        }
        throw new EOFException();
    }

    public byte[] S(long j2) {
        if (!(j2 >= 0 && j2 <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(("byteCount: " + j2).toString());
        } else if (T0() >= j2) {
            byte[] bArr = new byte[((int) j2)];
            L0(bArr);
            return bArr;
        } else {
            throw new EOFException();
        }
    }

    public final void S0(long j2) {
        this.f11100h = j2;
    }

    public final long T0() {
        return this.f11100h;
    }

    public f U() {
        return this;
    }

    public final i U0() {
        if (T0() <= ((long) Integer.MAX_VALUE)) {
            return V0((int) T0());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + T0()).toString());
    }

    public final i V0(int i2) {
        if (i2 == 0) {
            return i.f11103j;
        }
        c.b(T0(), 0, (long) i2);
        w wVar = this.f11099g;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            if (wVar != null) {
                int i6 = wVar.c;
                int i7 = wVar.b;
                if (i6 != i7) {
                    i4 += i6 - i7;
                    i5++;
                    wVar = wVar.f11136f;
                } else {
                    throw new AssertionError("s.limit == s.pos");
                }
            } else {
                k.m();
                throw null;
            }
        }
        byte[][] bArr = new byte[i5][];
        int[] iArr = new int[(i5 * 2)];
        w wVar2 = this.f11099g;
        int i8 = 0;
        while (i3 < i2) {
            if (wVar2 != null) {
                bArr[i8] = wVar2.a;
                i3 += wVar2.c - wVar2.b;
                iArr[i8] = Math.min(i3, i2);
                iArr[i8 + i5] = wVar2.b;
                wVar2.f11134d = true;
                i8++;
                wVar2 = wVar2.f11136f;
            } else {
                k.m();
                throw null;
            }
        }
        return new y(bArr, iArr);
    }

    public final w W0(int i2) {
        boolean z = true;
        if (i2 < 1 || i2 > 8192) {
            z = false;
        }
        if (z) {
            w wVar = this.f11099g;
            if (wVar == null) {
                w c = x.c();
                this.f11099g = c;
                c.f11137g = c;
                c.f11136f = c;
                return c;
            } else if (wVar != null) {
                w wVar2 = wVar.f11137g;
                if (wVar2 == null) {
                    k.m();
                    throw null;
                } else if (wVar2.c + i2 <= 8192 && wVar2.f11135e) {
                    return wVar2;
                } else {
                    w c2 = x.c();
                    wVar2.c(c2);
                    return c2;
                }
            } else {
                k.m();
                throw null;
            }
        } else {
            throw new IllegalArgumentException("unexpected capacity".toString());
        }
    }

    public f X0(i iVar) {
        k.f(iVar, "byteString");
        iVar.M(this, 0, iVar.G());
        return this;
    }

    public /* bridge */ /* synthetic */ g Y(byte[] bArr) {
        Y0(bArr);
        return this;
    }

    public f Y0(byte[] bArr) {
        k.f(bArr, "source");
        Z0(bArr, 0, bArr.length);
        return this;
    }

    public f Z0(byte[] bArr, int i2, int i3) {
        k.f(bArr, "source");
        long j2 = (long) i3;
        c.b((long) bArr.length, (long) i2, j2);
        int i4 = i3 + i2;
        while (i2 < i4) {
            w W0 = W0(1);
            int min = Math.min(i4 - i2, 8192 - W0.c);
            int i5 = i2 + min;
            byte[] unused = i.d(bArr, W0.a, W0.c, i2, i5);
            W0.c += min;
            i2 = i5;
        }
        S0(T0() + j2);
        return this;
    }

    public /* bridge */ /* synthetic */ g a0(i iVar) {
        X0(iVar);
        return this;
    }

    public f a1(int i2) {
        w W0 = W0(1);
        byte[] bArr = W0.a;
        int i3 = W0.c;
        W0.c = i3 + 1;
        bArr[i3] = (byte) i2;
        S0(T0() + 1);
        return this;
    }

    public final byte b0(long j2) {
        c.b(T0(), j2, 1);
        w wVar = this.f11099g;
        if (wVar == null) {
            k.m();
            throw null;
        } else if (T0() - j2 < j2) {
            long T0 = T0();
            while (T0 > j2) {
                wVar = wVar.f11137g;
                if (wVar != null) {
                    T0 -= (long) (wVar.c - wVar.b);
                } else {
                    k.m();
                    throw null;
                }
            }
            if (wVar != null) {
                return wVar.a[(int) ((((long) wVar.b) + j2) - T0)];
            }
            k.m();
            throw null;
        } else {
            long j3 = 0;
            while (true) {
                int i2 = wVar.c;
                int i3 = wVar.b;
                long j4 = ((long) (i2 - i3)) + j3;
                if (j4 <= j2) {
                    wVar = wVar.f11136f;
                    if (wVar != null) {
                        j3 = j4;
                    } else {
                        k.m();
                        throw null;
                    }
                } else if (wVar != null) {
                    return wVar.a[(int) ((((long) i3) + j2) - j3)];
                } else {
                    k.m();
                    throw null;
                }
            }
        }
    }

    public f b1(long j2) {
        int i2 = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
        if (i2 == 0) {
            a1(48);
        } else {
            boolean z = false;
            int i3 = 1;
            if (i2 < 0) {
                j2 = -j2;
                if (j2 < 0) {
                    h1("-9223372036854775808");
                } else {
                    z = true;
                }
            }
            if (j2 >= 100000000) {
                i3 = j2 < 1000000000000L ? j2 < 10000000000L ? j2 < 1000000000 ? 9 : 10 : j2 < 100000000000L ? 11 : 12 : j2 < 1000000000000000L ? j2 < 10000000000000L ? 13 : j2 < 100000000000000L ? 14 : 15 : j2 < 100000000000000000L ? j2 < 10000000000000000L ? 16 : 17 : j2 < 1000000000000000000L ? 18 : 19;
            } else if (j2 >= 10000) {
                i3 = j2 < 1000000 ? j2 < 100000 ? 5 : 6 : j2 < 10000000 ? 7 : 8;
            } else if (j2 >= 100) {
                i3 = j2 < 1000 ? 3 : 4;
            } else if (j2 >= 10) {
                i3 = 2;
            }
            if (z) {
                i3++;
            }
            w W0 = W0(i3);
            byte[] bArr = W0.a;
            int i4 = W0.c + i3;
            while (j2 != 0) {
                long j3 = (long) 10;
                i4--;
                bArr[i4] = l.d0.a.a()[(int) (j2 % j3)];
                j2 /= j3;
            }
            if (z) {
                bArr[i4 - 1] = (byte) 45;
            }
            W0.c += i3;
            S0(T0() + ((long) i3));
        }
        return this;
    }

    public long c0(i iVar) {
        k.f(iVar, "targetBytes");
        return F0(iVar, 0);
    }

    public f c1(long j2) {
        if (j2 == 0) {
            a1(48);
        } else {
            long j3 = (j2 >>> 1) | j2;
            long j4 = j3 | (j3 >>> 2);
            long j5 = j4 | (j4 >>> 4);
            long j6 = j5 | (j5 >>> 8);
            long j7 = j6 | (j6 >>> 16);
            long j8 = j7 | (j7 >>> 32);
            long j9 = j8 - ((j8 >>> 1) & 6148914691236517205L);
            long j10 = ((j9 >>> 2) & 3689348814741910323L) + (j9 & 3689348814741910323L);
            long j11 = ((j10 >>> 4) + j10) & 1085102592571150095L;
            long j12 = j11 + (j11 >>> 8);
            long j13 = j12 + (j12 >>> 16);
            int i2 = (int) ((((j13 & 63) + ((j13 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
            w W0 = W0(i2);
            byte[] bArr = W0.a;
            int i3 = W0.c;
            for (int i4 = (i3 + i2) - 1; i4 >= i3; i4--) {
                bArr[i4] = l.d0.a.a()[(int) (15 & j2)];
                j2 >>>= 4;
            }
            W0.c += i2;
            S0(T0() + ((long) i2));
        }
        return this;
    }

    public void close() {
    }

    public f d() {
        return this;
    }

    public /* bridge */ /* synthetic */ g d0() {
        U();
        return this;
    }

    public f d1(int i2) {
        w W0 = W0(4);
        byte[] bArr = W0.a;
        int i3 = W0.c;
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i2 >>> 24) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i2 >>> 16) & 255);
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((i2 >>> 8) & 255);
        bArr[i6] = (byte) (i2 & 255);
        W0.c = i6 + 1;
        S0(T0() + 4);
        return this;
    }

    public c0 e() {
        return c0.f11087d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a9, code lost:
        if (r10 != r11) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ab, code lost:
        r0.f11099g = r16.b();
        l.x.b(r16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b5, code lost:
        r16.b = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b9, code lost:
        if (r7 != false) goto L_0x00bf;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long e0() {
        /*
            r17 = this;
            r0 = r17
            long r1 = r17.T0()
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x00d2
            r1 = -7
            r5 = 0
            r6 = 0
            r7 = 0
        L_0x0011:
            l.w r8 = r0.f11099g
            if (r8 == 0) goto L_0x00cd
            byte[] r9 = r8.a
            int r10 = r8.b
            int r11 = r8.c
        L_0x001b:
            r12 = 1
            if (r10 >= r11) goto L_0x00a6
            byte r13 = r9[r10]
            r14 = 48
            byte r14 = (byte) r14
            if (r13 < r14) goto L_0x0071
            r15 = 57
            byte r15 = (byte) r15
            if (r13 > r15) goto L_0x0071
            int r14 = r14 - r13
            r15 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r12 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r12 < 0) goto L_0x0046
            r15 = r7
            r16 = r8
            if (r12 != 0) goto L_0x003f
            long r7 = (long) r14
            int r12 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r12 >= 0) goto L_0x003f
            goto L_0x0046
        L_0x003f:
            r7 = 10
            long r3 = r3 * r7
            long r7 = (long) r14
            long r3 = r3 + r7
            goto L_0x007f
        L_0x0046:
            l.f r1 = new l.f
            r1.<init>()
            r1.b1(r3)
            r1.a1(r13)
            if (r6 != 0) goto L_0x0056
            r1.readByte()
        L_0x0056:
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Number too large: "
            r3.append(r4)
            java.lang.String r1 = r1.P0()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L_0x0071:
            r15 = r7
            r16 = r8
            r7 = 45
            byte r7 = (byte) r7
            if (r13 != r7) goto L_0x0087
            if (r5 != 0) goto L_0x0087
            r6 = 1
            long r1 = r1 - r6
            r6 = 1
        L_0x007f:
            int r10 = r10 + 1
            int r5 = r5 + 1
            r7 = r15
            r8 = r16
            goto L_0x001b
        L_0x0087:
            if (r5 == 0) goto L_0x008b
            r7 = 1
            goto L_0x00a9
        L_0x008b:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Expected leading [0-9] or '-' character but was 0x"
            r2.append(r3)
            java.lang.String r3 = l.c.e(r13)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x00a6:
            r15 = r7
            r16 = r8
        L_0x00a9:
            if (r10 != r11) goto L_0x00b5
            l.w r8 = r16.b()
            r0.f11099g = r8
            l.x.b(r16)
            goto L_0x00b9
        L_0x00b5:
            r8 = r16
            r8.b = r10
        L_0x00b9:
            if (r7 != 0) goto L_0x00bf
            l.w r8 = r0.f11099g
            if (r8 != 0) goto L_0x0011
        L_0x00bf:
            long r1 = r17.T0()
            long r7 = (long) r5
            long r1 = r1 - r7
            r0.S0(r1)
            if (r6 == 0) goto L_0x00cb
            goto L_0x00cc
        L_0x00cb:
            long r3 = -r3
        L_0x00cc:
            return r3
        L_0x00cd:
            kotlin.jvm.internal.k.m()
            r1 = 0
            throw r1
        L_0x00d2:
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l.f.e0():long");
    }

    public f e1(int i2) {
        w W0 = W0(2);
        byte[] bArr = W0.a;
        int i3 = W0.c;
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i2 >>> 8) & 255);
        bArr[i4] = (byte) (i2 & 255);
        W0.c = i4 + 1;
        S0(T0() + 2);
        return this;
    }

    /* JADX WARNING: type inference failed for: r20v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r3 = 1
            if (r0 != r1) goto L_0x000a
        L_0x0007:
            r2 = 1
            goto L_0x008b
        L_0x000a:
            boolean r4 = r1 instanceof l.f
            if (r4 != 0) goto L_0x0011
        L_0x000e:
            r2 = 0
            goto L_0x008b
        L_0x0011:
            long r4 = r19.T0()
            l.f r1 = (l.f) r1
            long r6 = r1.T0()
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x0020
            goto L_0x000e
        L_0x0020:
            long r4 = r19.T0()
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x002b
            goto L_0x0007
        L_0x002b:
            l.w r4 = r0.f11099g
            r5 = 0
            if (r4 == 0) goto L_0x0090
            l.w r1 = r1.f11099g
            if (r1 == 0) goto L_0x008c
            int r8 = r4.b
            int r9 = r1.b
            r10 = r6
        L_0x0039:
            long r12 = r19.T0()
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 >= 0) goto L_0x0007
            int r12 = r4.c
            int r12 = r12 - r8
            int r13 = r1.c
            int r13 = r13 - r9
            int r12 = java.lang.Math.min(r12, r13)
            long r12 = (long) r12
            r14 = r6
        L_0x004d:
            int r16 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r16 >= 0) goto L_0x0068
            byte[] r2 = r4.a
            int r17 = r8 + 1
            byte r2 = r2[r8]
            byte[] r8 = r1.a
            int r18 = r9 + 1
            byte r8 = r8[r9]
            if (r2 == r8) goto L_0x0060
            goto L_0x000e
        L_0x0060:
            r8 = 1
            long r14 = r14 + r8
            r8 = r17
            r9 = r18
            goto L_0x004d
        L_0x0068:
            int r2 = r4.c
            if (r8 != r2) goto L_0x0079
            l.w r2 = r4.f11136f
            if (r2 == 0) goto L_0x0075
            int r4 = r2.b
            r8 = r4
            r4 = r2
            goto L_0x0079
        L_0x0075:
            kotlin.jvm.internal.k.m()
            throw r5
        L_0x0079:
            int r2 = r1.c
            if (r9 != r2) goto L_0x0089
            l.w r1 = r1.f11136f
            if (r1 == 0) goto L_0x0085
            int r2 = r1.b
            r9 = r2
            goto L_0x0089
        L_0x0085:
            kotlin.jvm.internal.k.m()
            throw r5
        L_0x0089:
            long r10 = r10 + r12
            goto L_0x0039
        L_0x008b:
            return r2
        L_0x008c:
            kotlin.jvm.internal.k.m()
            throw r5
        L_0x0090:
            kotlin.jvm.internal.k.m()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: l.f.equals(java.lang.Object):boolean");
    }

    public f f1(String str, int i2, int i3, Charset charset) {
        k.f(str, "string");
        k.f(charset, "charset");
        boolean z = true;
        if (i2 >= 0) {
            if (i3 >= i2) {
                if (i3 > str.length()) {
                    z = false;
                }
                if (!z) {
                    throw new IllegalArgumentException(("endIndex > string.length: " + i3 + " > " + str.length()).toString());
                } else if (k.a(charset, d.a)) {
                    i1(str, i2, i3);
                    return this;
                } else {
                    String substring = str.substring(i2, i3);
                    k.b(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    if (substring != null) {
                        byte[] bytes = substring.getBytes(charset);
                        k.b(bytes, "(this as java.lang.String).getBytes(charset)");
                        Z0(bytes, 0, bytes.length);
                        return this;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
            } else {
                throw new IllegalArgumentException(("endIndex < beginIndex: " + i3 + " < " + i2).toString());
            }
        } else {
            throw new IllegalArgumentException(("beginIndex < 0: " + i2).toString());
        }
    }

    public void flush() {
    }

    public /* bridge */ /* synthetic */ g g(byte[] bArr, int i2, int i3) {
        Z0(bArr, i2, i3);
        return this;
    }

    public long g0(f fVar, long j2) {
        k.f(fVar, "sink");
        if (!(j2 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
        } else if (T0() == 0) {
            return -1;
        } else {
            if (j2 > T0()) {
                j2 = T0();
            }
            fVar.p(this, j2);
            return j2;
        }
    }

    public f g1(String str, Charset charset) {
        k.f(str, "string");
        k.f(charset, "charset");
        f1(str, 0, str.length(), charset);
        return this;
    }

    public final void h() {
        x(T0());
    }

    public String h0(long j2) {
        if (j2 >= 0) {
            long j3 = Long.MAX_VALUE;
            if (j2 != Long.MAX_VALUE) {
                j3 = j2 + 1;
            }
            byte b2 = (byte) 10;
            long r0 = r0(b2, 0, j3);
            if (r0 != -1) {
                return l.d0.a.c(this, r0);
            }
            if (j3 < T0() && b0(j3 - 1) == ((byte) 13) && b0(j3) == b2) {
                return l.d0.a.c(this, j3);
            }
            f fVar = new f();
            F(fVar, 0, Math.min((long) 32, T0()));
            throw new EOFException("\\n not found: limit=" + Math.min(T0(), j2) + " content=" + fVar.K0().t() + 8230);
        }
        throw new IllegalArgumentException(("limit < 0: " + j2).toString());
    }

    public f h1(String str) {
        k.f(str, "string");
        i1(str, 0, str.length());
        return this;
    }

    public int hashCode() {
        w wVar = this.f11099g;
        if (wVar == null) {
            return 0;
        }
        int i2 = 1;
        do {
            int i3 = wVar.c;
            for (int i4 = wVar.b; i4 < i3; i4++) {
                i2 = (i2 * 31) + wVar.a[i4];
            }
            wVar = wVar.f11136f;
            if (wVar == null) {
                k.m();
                throw null;
            }
        } while (wVar != this.f11099g);
        return i2;
    }

    public f i1(String str, int i2, int i3) {
        k.f(str, "string");
        if (i2 >= 0) {
            if (i3 >= i2) {
                if (i3 <= str.length()) {
                    while (i2 < i3) {
                        char charAt = str.charAt(i2);
                        if (charAt < 128) {
                            w W0 = W0(1);
                            byte[] bArr = W0.a;
                            int i4 = W0.c - i2;
                            int min = Math.min(i3, 8192 - i4);
                            int i5 = i2 + 1;
                            bArr[i2 + i4] = (byte) charAt;
                            while (i5 < min) {
                                char charAt2 = str.charAt(i5);
                                if (charAt2 >= 128) {
                                    break;
                                }
                                bArr[i5 + i4] = (byte) charAt2;
                                i5++;
                            }
                            int i6 = W0.c;
                            int i7 = (i4 + i5) - i6;
                            W0.c = i6 + i7;
                            S0(T0() + ((long) i7));
                            i2 = i5;
                        } else {
                            if (charAt < 2048) {
                                w W02 = W0(2);
                                byte[] bArr2 = W02.a;
                                int i8 = W02.c;
                                bArr2[i8] = (byte) ((charAt >> 6) | 192);
                                bArr2[i8 + 1] = (byte) ((charAt & '?') | 128);
                                W02.c = i8 + 2;
                                S0(T0() + 2);
                            } else if (charAt < 55296 || charAt > 57343) {
                                w W03 = W0(3);
                                byte[] bArr3 = W03.a;
                                int i9 = W03.c;
                                bArr3[i9] = (byte) ((charAt >> 12) | 224);
                                bArr3[i9 + 1] = (byte) ((63 & (charAt >> 6)) | 128);
                                bArr3[i9 + 2] = (byte) ((charAt & '?') | 128);
                                W03.c = i9 + 3;
                                S0(T0() + 3);
                            } else {
                                int i10 = i2 + 1;
                                char charAt3 = i10 < i3 ? str.charAt(i10) : 0;
                                if (charAt > 56319 || 56320 > charAt3 || 57343 < charAt3) {
                                    a1(63);
                                    i2 = i10;
                                } else {
                                    int i11 = (((charAt & 1023) << 10) | (charAt3 & 1023)) + 0;
                                    w W04 = W0(4);
                                    byte[] bArr4 = W04.a;
                                    int i12 = W04.c;
                                    bArr4[i12] = (byte) ((i11 >> 18) | 240);
                                    bArr4[i12 + 1] = (byte) (((i11 >> 12) & 63) | 128);
                                    bArr4[i12 + 2] = (byte) (((i11 >> 6) & 63) | 128);
                                    bArr4[i12 + 3] = (byte) ((i11 & 63) | 128);
                                    W04.c = i12 + 4;
                                    S0(T0() + 4);
                                    i2 += 2;
                                }
                            }
                            i2++;
                        }
                    }
                    return this;
                }
                throw new IllegalArgumentException(("endIndex > string.length: " + i3 + " > " + str.length()).toString());
            }
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i3 + " < " + i2).toString());
        }
        throw new IllegalArgumentException(("beginIndex < 0: " + i2).toString());
    }

    public boolean isOpen() {
        return true;
    }

    public long j0(z zVar) {
        k.f(zVar, "sink");
        long T0 = T0();
        if (T0 > 0) {
            zVar.p(this, T0);
        }
        return T0;
    }

    public f j1(int i2) {
        if (i2 < 128) {
            a1(i2);
        } else if (i2 < 2048) {
            w W0 = W0(2);
            byte[] bArr = W0.a;
            int i3 = W0.c;
            bArr[i3] = (byte) ((i2 >> 6) | 192);
            bArr[i3 + 1] = (byte) ((i2 & 63) | 128);
            W0.c = i3 + 2;
            S0(T0() + 2);
        } else if (55296 <= i2 && 57343 >= i2) {
            a1(63);
        } else if (i2 < 65536) {
            w W02 = W0(3);
            byte[] bArr2 = W02.a;
            int i4 = W02.c;
            bArr2[i4] = (byte) ((i2 >> 12) | 224);
            bArr2[i4 + 1] = (byte) (((i2 >> 6) & 63) | 128);
            bArr2[i4 + 2] = (byte) ((i2 & 63) | 128);
            W02.c = i4 + 3;
            S0(T0() + 3);
        } else if (i2 <= 1114111) {
            w W03 = W0(4);
            byte[] bArr3 = W03.a;
            int i5 = W03.c;
            bArr3[i5] = (byte) ((i2 >> 18) | 240);
            bArr3[i5 + 1] = (byte) (((i2 >> 12) & 63) | 128);
            bArr3[i5 + 2] = (byte) (((i2 >> 6) & 63) | 128);
            bArr3[i5 + 3] = (byte) ((i2 & 63) | 128);
            W03.c = i5 + 4;
            S0(T0() + 4);
        } else {
            throw new IllegalArgumentException("Unexpected code point: 0x" + c.f(i2));
        }
        return this;
    }

    public void p(f fVar, long j2) {
        w wVar;
        k.f(fVar, "source");
        if (fVar != this) {
            c.b(fVar.T0(), 0, j2);
            while (j2 > 0) {
                w wVar2 = fVar.f11099g;
                if (wVar2 != null) {
                    int i2 = wVar2.c;
                    if (wVar2 != null) {
                        if (j2 < ((long) (i2 - wVar2.b))) {
                            w wVar3 = this.f11099g;
                            if (wVar3 == null) {
                                wVar = null;
                            } else if (wVar3 != null) {
                                wVar = wVar3.f11137g;
                            } else {
                                k.m();
                                throw null;
                            }
                            if (wVar != null && wVar.f11135e) {
                                if ((((long) wVar.c) + j2) - ((long) (wVar.f11134d ? 0 : wVar.b)) <= ((long) 8192)) {
                                    w wVar4 = fVar.f11099g;
                                    if (wVar4 != null) {
                                        wVar4.f(wVar, (int) j2);
                                        fVar.S0(fVar.T0() - j2);
                                        S0(T0() + j2);
                                        return;
                                    }
                                    k.m();
                                    throw null;
                                }
                            }
                            w wVar5 = fVar.f11099g;
                            if (wVar5 != null) {
                                fVar.f11099g = wVar5.e((int) j2);
                            } else {
                                k.m();
                                throw null;
                            }
                        }
                        w wVar6 = fVar.f11099g;
                        if (wVar6 != null) {
                            long j3 = (long) (wVar6.c - wVar6.b);
                            fVar.f11099g = wVar6.b();
                            w wVar7 = this.f11099g;
                            if (wVar7 == null) {
                                this.f11099g = wVar6;
                                wVar6.f11137g = wVar6;
                                wVar6.f11136f = wVar6;
                            } else if (wVar7 != null) {
                                w wVar8 = wVar7.f11137g;
                                if (wVar8 != null) {
                                    wVar8.c(wVar6);
                                    wVar6.a();
                                } else {
                                    k.m();
                                    throw null;
                                }
                            } else {
                                k.m();
                                throw null;
                            }
                            fVar.S0(fVar.T0() - j3);
                            S0(T0() + j3);
                            j2 -= j3;
                        } else {
                            k.m();
                            throw null;
                        }
                    } else {
                        k.m();
                        throw null;
                    }
                } else {
                    k.m();
                    throw null;
                }
            }
            return;
        }
        throw new IllegalArgumentException("source == this".toString());
    }

    public long r0(byte b2, long j2, long j3) {
        long j4;
        int i2;
        byte b3 = b2;
        long j5 = j2;
        long j6 = j3;
        long j7 = 0;
        if (0 <= j5 && j6 >= j5) {
            if (j6 > T0()) {
                j6 = T0();
            }
            if (j5 == j6) {
                return -1;
            }
            w wVar = this.f11099g;
            if (wVar != null) {
                if (T0() - j5 < j5) {
                    j4 = T0();
                    while (j4 > j5) {
                        wVar = wVar.f11137g;
                        if (wVar != null) {
                            j4 -= (long) (wVar.c - wVar.b);
                        } else {
                            k.m();
                            throw null;
                        }
                    }
                    if (wVar != null) {
                        while (j4 < j6) {
                            byte[] bArr = wVar.a;
                            int min = (int) Math.min((long) wVar.c, (((long) wVar.b) + j6) - j4);
                            i2 = (int) ((((long) wVar.b) + j5) - j4);
                            while (i2 < min) {
                                if (bArr[i2] != b3) {
                                    i2++;
                                }
                            }
                            j4 += (long) (wVar.c - wVar.b);
                            wVar = wVar.f11136f;
                            if (wVar != null) {
                                j5 = j4;
                            } else {
                                k.m();
                                throw null;
                            }
                        }
                    }
                } else {
                    while (true) {
                        long j8 = ((long) (wVar.c - wVar.b)) + j7;
                        if (j8 <= j5) {
                            wVar = wVar.f11136f;
                            if (wVar != null) {
                                j7 = j8;
                            } else {
                                k.m();
                                throw null;
                            }
                        } else if (wVar != null) {
                            while (j4 < j6) {
                                byte[] bArr2 = wVar.a;
                                int min2 = (int) Math.min((long) wVar.c, (((long) wVar.b) + j6) - j4);
                                int i3 = (int) ((((long) wVar.b) + j5) - j4);
                                while (i2 < min2) {
                                    if (bArr2[i2] != b3) {
                                        i3 = i2 + 1;
                                    }
                                }
                                j7 = j4 + ((long) (wVar.c - wVar.b));
                                wVar = wVar.f11136f;
                                if (wVar != null) {
                                    j5 = j7;
                                } else {
                                    k.m();
                                    throw null;
                                }
                            }
                        }
                    }
                }
                return ((long) (i2 - wVar.b)) + j4;
            }
            return -1;
        }
        throw new IllegalArgumentException(("size=" + T0() + " fromIndex=" + j5 + " toIndex=" + j6).toString());
    }

    public int read(ByteBuffer byteBuffer) {
        k.f(byteBuffer, "sink");
        w wVar = this.f11099g;
        if (wVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), wVar.c - wVar.b);
        byteBuffer.put(wVar.a, wVar.b, min);
        int i2 = wVar.b + min;
        wVar.b = i2;
        this.f11100h -= (long) min;
        if (i2 == wVar.c) {
            this.f11099g = wVar.b();
            x.b(wVar);
        }
        return min;
    }

    public byte readByte() {
        if (T0() != 0) {
            w wVar = this.f11099g;
            if (wVar != null) {
                int i2 = wVar.b;
                int i3 = wVar.c;
                int i4 = i2 + 1;
                byte b2 = wVar.a[i2];
                S0(T0() - 1);
                if (i4 == i3) {
                    this.f11099g = wVar.b();
                    x.b(wVar);
                } else {
                    wVar.b = i4;
                }
                return b2;
            }
            k.m();
            throw null;
        }
        throw new EOFException();
    }

    public int readInt() {
        if (T0() >= 4) {
            w wVar = this.f11099g;
            if (wVar != null) {
                int i2 = wVar.b;
                int i3 = wVar.c;
                if (((long) (i3 - i2)) < 4) {
                    return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
                }
                byte[] bArr = wVar.a;
                int i4 = i2 + 1;
                int i5 = i4 + 1;
                byte b2 = ((bArr[i2] & 255) << 24) | ((bArr[i4] & 255) << 16);
                int i6 = i5 + 1;
                byte b3 = b2 | ((bArr[i5] & 255) << 8);
                int i7 = i6 + 1;
                byte b4 = b3 | (bArr[i6] & 255);
                S0(T0() - 4);
                if (i7 == i3) {
                    this.f11099g = wVar.b();
                    x.b(wVar);
                } else {
                    wVar.b = i7;
                }
                return b4;
            }
            k.m();
            throw null;
        }
        throw new EOFException();
    }

    public short readShort() {
        if (T0() >= 2) {
            w wVar = this.f11099g;
            if (wVar != null) {
                int i2 = wVar.b;
                int i3 = wVar.c;
                if (i3 - i2 < 2) {
                    return (short) (((readByte() & 255) << 8) | (readByte() & 255));
                }
                byte[] bArr = wVar.a;
                int i4 = i2 + 1;
                int i5 = i4 + 1;
                byte b2 = ((bArr[i2] & 255) << 8) | (bArr[i4] & 255);
                S0(T0() - 2);
                if (i5 == i3) {
                    this.f11099g = wVar.b();
                    x.b(wVar);
                } else {
                    wVar.b = i5;
                }
                return (short) b2;
            }
            k.m();
            throw null;
        }
        throw new EOFException();
    }

    public /* bridge */ /* synthetic */ g s(String str, int i2, int i3) {
        i1(str, i2, i3);
        return this;
    }

    public void s0(long j2) {
        if (this.f11100h < j2) {
            throw new EOFException();
        }
    }

    public long t(b0 b0Var) {
        k.f(b0Var, "source");
        long j2 = 0;
        while (true) {
            long g0 = b0Var.g0(this, (long) 8192);
            if (g0 == -1) {
                return j2;
            }
            j2 += g0;
        }
    }

    public String toString() {
        return U0().toString();
    }

    public /* bridge */ /* synthetic */ g u(long j2) {
        c1(j2);
        return this;
    }

    public /* bridge */ /* synthetic */ g u0(String str) {
        h1(str);
        return this;
    }

    public f v() {
        return this;
    }

    public /* bridge */ /* synthetic */ g v0(long j2) {
        b1(j2);
        return this;
    }

    public i w(long j2) {
        if (!(j2 >= 0 && j2 <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(("byteCount: " + j2).toString());
        } else if (T0() < j2) {
            throw new EOFException();
        } else if (j2 < ((long) 4096)) {
            return new i(S(j2));
        } else {
            i V0 = V0((int) j2);
            x(j2);
            return V0;
        }
    }

    public long w0(i iVar, long j2) {
        long j3 = j2;
        k.f(iVar, "bytes");
        if (iVar.G() > 0) {
            long j4 = 0;
            if (j3 >= 0) {
                w wVar = this.f11099g;
                if (wVar != null) {
                    if (T0() - j3 < j3) {
                        long T0 = T0();
                        while (T0 > j3) {
                            wVar = wVar.f11137g;
                            if (wVar != null) {
                                T0 -= (long) (wVar.c - wVar.b);
                            } else {
                                k.m();
                                throw null;
                            }
                        }
                        if (wVar != null) {
                            byte[] v = iVar.v();
                            byte b2 = v[0];
                            int G = iVar.G();
                            long T02 = (T0() - ((long) G)) + 1;
                            while (T0 < T02) {
                                byte[] bArr = wVar.a;
                                long j5 = T0;
                                int min = (int) Math.min((long) wVar.c, (((long) wVar.b) + T02) - T0);
                                for (int i2 = (int) ((((long) wVar.b) + j3) - j5); i2 < min; i2++) {
                                    if (bArr[i2] == b2 && l.d0.a.b(wVar, i2 + 1, v, 1, G)) {
                                        return ((long) (i2 - wVar.b)) + j5;
                                    }
                                }
                                T0 = j5 + ((long) (wVar.c - wVar.b));
                                wVar = wVar.f11136f;
                                if (wVar != null) {
                                    j3 = T0;
                                } else {
                                    k.m();
                                    throw null;
                                }
                            }
                        }
                    } else {
                        while (true) {
                            long j6 = ((long) (wVar.c - wVar.b)) + j4;
                            if (j6 <= j3) {
                                wVar = wVar.f11136f;
                                if (wVar != null) {
                                    j4 = j6;
                                } else {
                                    k.m();
                                    throw null;
                                }
                            } else if (wVar != null) {
                                byte[] v2 = iVar.v();
                                byte b3 = v2[0];
                                int G2 = iVar.G();
                                long T03 = (T0() - ((long) G2)) + 1;
                                while (j4 < T03) {
                                    byte[] bArr2 = wVar.a;
                                    long j7 = T03;
                                    int min2 = (int) Math.min((long) wVar.c, (((long) wVar.b) + T03) - j4);
                                    for (int i3 = (int) ((((long) wVar.b) + j3) - j4); i3 < min2; i3++) {
                                        if (bArr2[i3] == b3) {
                                            if (l.d0.a.b(wVar, i3 + 1, v2, 1, G2)) {
                                                return ((long) (i3 - wVar.b)) + j4;
                                            }
                                        }
                                    }
                                    j4 += (long) (wVar.c - wVar.b);
                                    wVar = wVar.f11136f;
                                    if (wVar != null) {
                                        j3 = j4;
                                        T03 = j7;
                                    } else {
                                        k.m();
                                        throw null;
                                    }
                                }
                            }
                        }
                    }
                }
                return -1;
            }
            throw new IllegalArgumentException(("fromIndex < 0: " + j3).toString());
        }
        throw new IllegalArgumentException("bytes is empty".toString());
    }

    public int write(ByteBuffer byteBuffer) {
        k.f(byteBuffer, "source");
        int remaining = byteBuffer.remaining();
        int i2 = remaining;
        while (i2 > 0) {
            w W0 = W0(1);
            int min = Math.min(i2, 8192 - W0.c);
            byteBuffer.get(W0.a, W0.c, min);
            i2 -= min;
            W0.c += min;
        }
        this.f11100h += (long) remaining;
        return remaining;
    }

    public void x(long j2) {
        while (j2 > 0) {
            w wVar = this.f11099g;
            if (wVar != null) {
                int min = (int) Math.min(j2, (long) (wVar.c - wVar.b));
                long j3 = (long) min;
                S0(T0() - j3);
                j2 -= j3;
                int i2 = wVar.b + min;
                wVar.b = i2;
                if (i2 == wVar.c) {
                    this.f11099g = wVar.b();
                    x.b(wVar);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    /* renamed from: y */
    public f clone() {
        return D();
    }

    public boolean y0(long j2, i iVar) {
        k.f(iVar, "bytes");
        return H0(j2, iVar, 0, iVar.G());
    }

    public final long z() {
        long T0 = T0();
        if (T0 == 0) {
            return 0;
        }
        w wVar = this.f11099g;
        if (wVar != null) {
            w wVar2 = wVar.f11137g;
            if (wVar2 != null) {
                int i2 = wVar2.c;
                if (i2 < 8192 && wVar2.f11135e) {
                    T0 -= (long) (i2 - wVar2.b);
                }
                return T0;
            }
            k.m();
            throw null;
        }
        k.m();
        throw null;
    }

    /* compiled from: Buffer.kt */
    public static final class a extends InputStream {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ f f11101g;

        a(f fVar) {
            this.f11101g = fVar;
        }

        public int available() {
            return (int) Math.min(this.f11101g.T0(), (long) Integer.MAX_VALUE);
        }

        public void close() {
        }

        public int read() {
            if (this.f11101g.T0() > 0) {
                return this.f11101g.readByte() & 255;
            }
            return -1;
        }

        public String toString() {
            return this.f11101g + ".inputStream()";
        }

        public int read(byte[] bArr, int i2, int i3) {
            k.f(bArr, "sink");
            return this.f11101g.I0(bArr, i2, i3);
        }
    }
}
