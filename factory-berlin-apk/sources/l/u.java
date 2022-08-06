package l;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.k;

/* compiled from: RealBufferedSink.kt */
public final class u implements g {

    /* renamed from: g  reason: collision with root package name */
    public final f f11127g = new f();

    /* renamed from: h  reason: collision with root package name */
    public boolean f11128h;

    /* renamed from: i  reason: collision with root package name */
    public final z f11129i;

    public u(z zVar) {
        k.f(zVar, "sink");
        this.f11129i = zVar;
    }

    public g A() {
        if (!this.f11128h) {
            long T0 = this.f11127g.T0();
            if (T0 > 0) {
                this.f11129i.p(this.f11127g, T0);
            }
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public g B(int i2) {
        if (!this.f11128h) {
            this.f11127g.e1(i2);
            d0();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public g H(int i2) {
        if (!this.f11128h) {
            this.f11127g.d1(i2);
            return d0();
        }
        throw new IllegalStateException("closed".toString());
    }

    public g R(int i2) {
        if (!this.f11128h) {
            this.f11127g.a1(i2);
            d0();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public g Y(byte[] bArr) {
        k.f(bArr, "source");
        if (!this.f11128h) {
            this.f11127g.Y0(bArr);
            d0();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public g a0(i iVar) {
        k.f(iVar, "byteString");
        if (!this.f11128h) {
            this.f11127g.X0(iVar);
            d0();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public void close() {
        if (!this.f11128h) {
            Throwable th = null;
            try {
                if (this.f11127g.T0() > 0) {
                    this.f11129i.p(this.f11127g, this.f11127g.T0());
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f11129i.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            this.f11128h = true;
            if (th != null) {
                throw th;
            }
        }
    }

    public f d() {
        return this.f11127g;
    }

    public g d0() {
        if (!this.f11128h) {
            long z = this.f11127g.z();
            if (z > 0) {
                this.f11129i.p(this.f11127g, z);
            }
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public c0 e() {
        return this.f11129i.e();
    }

    public void flush() {
        if (!this.f11128h) {
            if (this.f11127g.T0() > 0) {
                z zVar = this.f11129i;
                f fVar = this.f11127g;
                zVar.p(fVar, fVar.T0());
            }
            this.f11129i.flush();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    public g g(byte[] bArr, int i2, int i3) {
        k.f(bArr, "source");
        if (!this.f11128h) {
            this.f11127g.Z0(bArr, i2, i3);
            d0();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public boolean isOpen() {
        return !this.f11128h;
    }

    public void p(f fVar, long j2) {
        k.f(fVar, "source");
        if (!this.f11128h) {
            this.f11127g.p(fVar, j2);
            d0();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    public g s(String str, int i2, int i3) {
        k.f(str, "string");
        if (!this.f11128h) {
            this.f11127g.i1(str, i2, i3);
            d0();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public long t(b0 b0Var) {
        k.f(b0Var, "source");
        long j2 = 0;
        while (true) {
            long g0 = b0Var.g0(this.f11127g, (long) 8192);
            if (g0 == -1) {
                return j2;
            }
            j2 += g0;
            d0();
        }
    }

    public String toString() {
        return "buffer(" + this.f11129i + ')';
    }

    public g u(long j2) {
        if (!this.f11128h) {
            this.f11127g.c1(j2);
            return d0();
        }
        throw new IllegalStateException("closed".toString());
    }

    public g u0(String str) {
        k.f(str, "string");
        if (!this.f11128h) {
            this.f11127g.h1(str);
            return d0();
        }
        throw new IllegalStateException("closed".toString());
    }

    public f v() {
        return this.f11127g;
    }

    public g v0(long j2) {
        if (!this.f11128h) {
            this.f11127g.b1(j2);
            d0();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public int write(ByteBuffer byteBuffer) {
        k.f(byteBuffer, "source");
        if (!this.f11128h) {
            int write = this.f11127g.write(byteBuffer);
            d0();
            return write;
        }
        throw new IllegalStateException("closed".toString());
    }
}
