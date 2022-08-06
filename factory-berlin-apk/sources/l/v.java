package l;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.jvm.internal.k;

/* compiled from: RealBufferedSource.kt */
public final class v implements h {

    /* renamed from: g  reason: collision with root package name */
    public final f f11130g = new f();

    /* renamed from: h  reason: collision with root package name */
    public boolean f11131h;

    /* renamed from: i  reason: collision with root package name */
    public final b0 f11132i;

    public v(b0 b0Var) {
        k.f(b0Var, "source");
        this.f11132i = b0Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long A0() {
        /*
            r5 = this;
            r0 = 1
            r5.s0(r0)
            r0 = 0
        L_0x0006:
            int r1 = r0 + 1
            long r2 = (long) r1
            boolean r2 = r5.C(r2)
            if (r2 == 0) goto L_0x0062
            l.f r2 = r5.f11130g
            long r3 = (long) r0
            byte r2 = r2.b0(r3)
            r3 = 48
            byte r3 = (byte) r3
            if (r2 < r3) goto L_0x0020
            r3 = 57
            byte r3 = (byte) r3
            if (r2 <= r3) goto L_0x0035
        L_0x0020:
            r3 = 97
            byte r3 = (byte) r3
            if (r2 < r3) goto L_0x002a
            r3 = 102(0x66, float:1.43E-43)
            byte r3 = (byte) r3
            if (r2 <= r3) goto L_0x0035
        L_0x002a:
            r3 = 65
            byte r3 = (byte) r3
            if (r2 < r3) goto L_0x0037
            r3 = 70
            byte r3 = (byte) r3
            if (r2 <= r3) goto L_0x0035
            goto L_0x0037
        L_0x0035:
            r0 = r1
            goto L_0x0006
        L_0x0037:
            if (r0 == 0) goto L_0x003a
            goto L_0x0062
        L_0x003a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Expected leading [0-9a-fA-F] character but was 0x"
            r0.append(r1)
            r1 = 16
            int unused = kotlin.j0.b.a(r1)
            int unused = kotlin.j0.b.a(r1)
            java.lang.String r1 = java.lang.Integer.toString(r2, r1)
            java.lang.String r2 = "java.lang.Integer.toStri…(this, checkRadix(radix))"
            kotlin.jvm.internal.k.b(r1, r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            r1.<init>(r0)
            throw r1
        L_0x0062:
            l.f r0 = r5.f11130g
            long r0 = r0.A0()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.v.A0():long");
    }

    public boolean C(long j2) {
        if (!(j2 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
        } else if (!this.f11131h) {
            while (this.f11130g.T0() < j2) {
                if (this.f11132i.g0(this.f11130g, (long) 8192) == -1) {
                    return false;
                }
            }
            return true;
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    public String C0(Charset charset) {
        k.f(charset, "charset");
        this.f11130g.t(this.f11132i);
        return this.f11130g.C0(charset);
    }

    public InputStream D0() {
        return new a(this);
    }

    public int E0(s sVar) {
        k.f(sVar, "options");
        if (!this.f11131h) {
            while (true) {
                int d2 = l.d0.a.d(this.f11130g, sVar, true);
                if (d2 == -2) {
                    if (this.f11132i.g0(this.f11130g, (long) 8192) == -1) {
                        break;
                    }
                } else if (d2 != -1) {
                    this.f11130g.x((long) sVar.g()[d2].G());
                    return d2;
                }
            }
            return -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    public String N() {
        return h0(Long.MAX_VALUE);
    }

    public long P(i iVar) {
        k.f(iVar, "bytes");
        return h(iVar, 0);
    }

    public boolean Q() {
        if (!(!this.f11131h)) {
            throw new IllegalStateException("closed".toString());
        } else if (!this.f11130g.Q() || this.f11132i.g0(this.f11130g, (long) 8192) != -1) {
            return false;
        } else {
            return true;
        }
    }

    public byte[] S(long j2) {
        s0(j2);
        return this.f11130g.S(j2);
    }

    public long a(byte b) {
        return b(b, 0, Long.MAX_VALUE);
    }

    public long b(byte b, long j2, long j3) {
        boolean z = true;
        if (!this.f11131h) {
            if (0 > j2 || j3 < j2) {
                z = false;
            }
            if (z) {
                while (j2 < j3) {
                    long r0 = this.f11130g.r0(b, j2, j3);
                    if (r0 != -1) {
                        return r0;
                    }
                    long T0 = this.f11130g.T0();
                    if (T0 >= j3 || this.f11132i.g0(this.f11130g, (long) 8192) == -1) {
                        return -1;
                    }
                    j2 = Math.max(j2, T0);
                }
                return -1;
            }
            throw new IllegalArgumentException(("fromIndex=" + j2 + " toIndex=" + j3).toString());
        }
        throw new IllegalStateException("closed".toString());
    }

    public long c0(i iVar) {
        k.f(iVar, "targetBytes");
        return i(iVar, 0);
    }

    public void close() {
        if (!this.f11131h) {
            this.f11131h = true;
            this.f11132i.close();
            this.f11130g.h();
        }
    }

    public f d() {
        return this.f11130g;
    }

    public c0 e() {
        return this.f11132i.e();
    }

    public long e0() {
        int i2;
        s0(1);
        long j2 = 0;
        while (true) {
            long j3 = j2 + 1;
            if (!C(j3)) {
                break;
            }
            byte b0 = this.f11130g.b0(j2);
            if ((b0 >= ((byte) 48) && b0 <= ((byte) 57)) || (j2 == 0 && b0 == ((byte) 45))) {
                j2 = j3;
            } else if (i2 == 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("Expected leading [0-9] or '-' character but was 0x");
                int unused = b.a(16);
                int unused2 = b.a(16);
                String num = Integer.toString(b0, 16);
                k.b(num, "java.lang.Integer.toStri…(this, checkRadix(radix))");
                sb.append(num);
                throw new NumberFormatException(sb.toString());
            }
        }
        return this.f11130g.e0();
    }

    public long g0(f fVar, long j2) {
        k.f(fVar, "sink");
        if (!(j2 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
        } else if (!(true ^ this.f11131h)) {
            throw new IllegalStateException("closed".toString());
        } else if (this.f11130g.T0() == 0 && this.f11132i.g0(this.f11130g, (long) 8192) == -1) {
            return -1;
        } else {
            return this.f11130g.g0(fVar, Math.min(j2, this.f11130g.T0()));
        }
    }

    public long h(i iVar, long j2) {
        k.f(iVar, "bytes");
        if (!this.f11131h) {
            while (true) {
                long w0 = this.f11130g.w0(iVar, j2);
                if (w0 != -1) {
                    return w0;
                }
                long T0 = this.f11130g.T0();
                if (this.f11132i.g0(this.f11130g, (long) 8192) == -1) {
                    return -1;
                }
                j2 = Math.max(j2, (T0 - ((long) iVar.G())) + 1);
            }
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    public String h0(long j2) {
        if (j2 >= 0) {
            long j3 = j2 == Long.MAX_VALUE ? Long.MAX_VALUE : j2 + 1;
            byte b = (byte) 10;
            long b2 = b(b, 0, j3);
            if (b2 != -1) {
                return l.d0.a.c(this.f11130g, b2);
            }
            if (j3 < Long.MAX_VALUE && C(j3) && this.f11130g.b0(j3 - 1) == ((byte) 13) && C(1 + j3) && this.f11130g.b0(j3) == b) {
                return l.d0.a.c(this.f11130g, j3);
            }
            f fVar = new f();
            f fVar2 = this.f11130g;
            fVar2.F(fVar, 0, Math.min((long) 32, fVar2.T0()));
            throw new EOFException("\\n not found: limit=" + Math.min(this.f11130g.T0(), j2) + " content=" + fVar.K0().t() + "…");
        }
        throw new IllegalArgumentException(("limit < 0: " + j2).toString());
    }

    public long i(i iVar, long j2) {
        k.f(iVar, "targetBytes");
        if (!this.f11131h) {
            while (true) {
                long F0 = this.f11130g.F0(iVar, j2);
                if (F0 != -1) {
                    return F0;
                }
                long T0 = this.f11130g.T0();
                if (this.f11132i.g0(this.f11130g, (long) 8192) == -1) {
                    return -1;
                }
                j2 = Math.max(j2, T0);
            }
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    public boolean isOpen() {
        return !this.f11131h;
    }

    public boolean j(long j2, i iVar, int i2, int i3) {
        k.f(iVar, "bytes");
        if (!this.f11131h) {
            if (j2 >= 0 && i2 >= 0 && i3 >= 0 && iVar.G() - i2 >= i3) {
                int i4 = 0;
                while (i4 < i3) {
                    long j3 = ((long) i4) + j2;
                    if (C(1 + j3) && this.f11130g.b0(j3) == iVar.l(i2 + i4)) {
                        i4++;
                    }
                }
                return true;
            }
            return false;
        }
        throw new IllegalStateException("closed".toString());
    }

    public long j0(z zVar) {
        k.f(zVar, "sink");
        long j2 = 0;
        while (this.f11132i.g0(this.f11130g, (long) 8192) != -1) {
            long z = this.f11130g.z();
            if (z > 0) {
                j2 += z;
                zVar.p(this.f11130g, z);
            }
        }
        if (this.f11130g.T0() <= 0) {
            return j2;
        }
        long T0 = j2 + this.f11130g.T0();
        f fVar = this.f11130g;
        zVar.p(fVar, fVar.T0());
        return T0;
    }

    public int k() {
        s0(4);
        return this.f11130g.M0();
    }

    public short l() {
        s0(2);
        return this.f11130g.N0();
    }

    public int read(ByteBuffer byteBuffer) {
        k.f(byteBuffer, "sink");
        if (this.f11130g.T0() == 0 && this.f11132i.g0(this.f11130g, (long) 8192) == -1) {
            return -1;
        }
        return this.f11130g.read(byteBuffer);
    }

    public byte readByte() {
        s0(1);
        return this.f11130g.readByte();
    }

    public int readInt() {
        s0(4);
        return this.f11130g.readInt();
    }

    public short readShort() {
        s0(2);
        return this.f11130g.readShort();
    }

    public void s0(long j2) {
        if (!C(j2)) {
            throw new EOFException();
        }
    }

    public String toString() {
        return "buffer(" + this.f11132i + ')';
    }

    public i w(long j2) {
        s0(j2);
        return this.f11130g.w(j2);
    }

    public void x(long j2) {
        if (!this.f11131h) {
            while (j2 > 0) {
                if (this.f11130g.T0() == 0 && this.f11132i.g0(this.f11130g, (long) 8192) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j2, this.f11130g.T0());
                this.f11130g.x(min);
                j2 -= min;
            }
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    public boolean y0(long j2, i iVar) {
        k.f(iVar, "bytes");
        return j(j2, iVar, 0, iVar.G());
    }

    /* compiled from: RealBufferedSource.kt */
    public static final class a extends InputStream {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ v f11133g;

        a(v vVar) {
            this.f11133g = vVar;
        }

        public int available() {
            v vVar = this.f11133g;
            if (!vVar.f11131h) {
                return (int) Math.min(vVar.f11130g.T0(), (long) Integer.MAX_VALUE);
            }
            throw new IOException("closed");
        }

        public void close() {
            this.f11133g.close();
        }

        public int read() {
            v vVar = this.f11133g;
            if (!vVar.f11131h) {
                if (vVar.f11130g.T0() == 0) {
                    v vVar2 = this.f11133g;
                    if (vVar2.f11132i.g0(vVar2.f11130g, (long) 8192) == -1) {
                        return -1;
                    }
                }
                return this.f11133g.f11130g.readByte() & 255;
            }
            throw new IOException("closed");
        }

        public String toString() {
            return this.f11133g + ".inputStream()";
        }

        public int read(byte[] bArr, int i2, int i3) {
            k.f(bArr, "data");
            if (!this.f11133g.f11131h) {
                c.b((long) bArr.length, (long) i2, (long) i3);
                if (this.f11133g.f11130g.T0() == 0) {
                    v vVar = this.f11133g;
                    if (vVar.f11132i.g0(vVar.f11130g, (long) 8192) == -1) {
                        return -1;
                    }
                }
                return this.f11133g.f11130g.I0(bArr, i2, i3);
            }
            throw new IOException("closed");
        }
    }
}
