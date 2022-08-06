package okhttp3.internal.connection;

import java.io.IOException;
import java.net.ProtocolException;
import k.c0;
import k.d0;
import k.e0;
import k.h0.f.d;
import k.h0.f.h;
import k.r;
import kotlin.jvm.internal.k;
import l.b0;
import l.f;
import l.j;
import l.p;
import l.z;

/* compiled from: Exchange.kt */
public final class c {
    private boolean a;
    private final f b;
    private final e c;

    /* renamed from: d  reason: collision with root package name */
    private final r f11267d;

    /* renamed from: e  reason: collision with root package name */
    private final d f11268e;

    /* renamed from: f  reason: collision with root package name */
    private final d f11269f;

    /* compiled from: Exchange.kt */
    private final class a extends j {

        /* renamed from: h  reason: collision with root package name */
        private boolean f11270h;

        /* renamed from: i  reason: collision with root package name */
        private long f11271i;

        /* renamed from: j  reason: collision with root package name */
        private boolean f11272j;

        /* renamed from: k  reason: collision with root package name */
        private final long f11273k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ c f11274l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(c cVar, z zVar, long j2) {
            super(zVar);
            k.f(zVar, "delegate");
            this.f11274l = cVar;
            this.f11273k = j2;
        }

        private final <E extends IOException> E b(E e2) {
            if (this.f11270h) {
                return e2;
            }
            this.f11270h = true;
            return this.f11274l.a(this.f11271i, false, true, e2);
        }

        public void close() {
            if (!this.f11272j) {
                this.f11272j = true;
                long j2 = this.f11273k;
                if (j2 == -1 || this.f11271i == j2) {
                    try {
                        super.close();
                        b((IOException) null);
                    } catch (IOException e2) {
                        throw b(e2);
                    }
                } else {
                    throw new ProtocolException("unexpected end of stream");
                }
            }
        }

        public void flush() {
            try {
                super.flush();
            } catch (IOException e2) {
                throw b(e2);
            }
        }

        public void p(f fVar, long j2) {
            k.f(fVar, "source");
            if (!this.f11272j) {
                long j3 = this.f11273k;
                if (j3 == -1 || this.f11271i + j2 <= j3) {
                    try {
                        super.p(fVar, j2);
                        this.f11271i += j2;
                    } catch (IOException e2) {
                        throw b(e2);
                    }
                } else {
                    throw new ProtocolException("expected " + this.f11273k + " bytes but received " + (this.f11271i + j2));
                }
            } else {
                throw new IllegalStateException("closed".toString());
            }
        }
    }

    /* compiled from: Exchange.kt */
    public final class b extends l.k {

        /* renamed from: h  reason: collision with root package name */
        private long f11275h;

        /* renamed from: i  reason: collision with root package name */
        private boolean f11276i = true;

        /* renamed from: j  reason: collision with root package name */
        private boolean f11277j;

        /* renamed from: k  reason: collision with root package name */
        private boolean f11278k;

        /* renamed from: l  reason: collision with root package name */
        private final long f11279l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ c f11280m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(c cVar, b0 b0Var, long j2) {
            super(b0Var);
            k.f(b0Var, "delegate");
            this.f11280m = cVar;
            this.f11279l = j2;
            if (j2 == 0) {
                b((IOException) null);
            }
        }

        public final <E extends IOException> E b(E e2) {
            if (this.f11277j) {
                return e2;
            }
            this.f11277j = true;
            if (e2 == null && this.f11276i) {
                this.f11276i = false;
                this.f11280m.i().w(this.f11280m.g());
            }
            return this.f11280m.a(this.f11275h, true, false, e2);
        }

        public void close() {
            if (!this.f11278k) {
                this.f11278k = true;
                try {
                    super.close();
                    b((IOException) null);
                } catch (IOException e2) {
                    throw b(e2);
                }
            }
        }

        public long g0(f fVar, long j2) {
            k.f(fVar, "sink");
            if (!this.f11278k) {
                try {
                    long g0 = a().g0(fVar, j2);
                    if (this.f11276i) {
                        this.f11276i = false;
                        this.f11280m.i().w(this.f11280m.g());
                    }
                    if (g0 == -1) {
                        b((IOException) null);
                        return -1;
                    }
                    long j3 = this.f11275h + g0;
                    if (this.f11279l != -1) {
                        if (j3 > this.f11279l) {
                            throw new ProtocolException("expected " + this.f11279l + " bytes but received " + j3);
                        }
                    }
                    this.f11275h = j3;
                    if (j3 == this.f11279l) {
                        b((IOException) null);
                    }
                    return g0;
                } catch (IOException e2) {
                    throw b(e2);
                }
            } else {
                throw new IllegalStateException("closed".toString());
            }
        }
    }

    public c(e eVar, r rVar, d dVar, d dVar2) {
        k.f(eVar, "call");
        k.f(rVar, "eventListener");
        k.f(dVar, "finder");
        k.f(dVar2, "codec");
        this.c = eVar;
        this.f11267d = rVar;
        this.f11268e = dVar;
        this.f11269f = dVar2;
        this.b = dVar2.h();
    }

    private final void s(IOException iOException) {
        this.f11268e.h(iOException);
        this.f11269f.h().H(this.c, iOException);
    }

    public final <E extends IOException> E a(long j2, boolean z, boolean z2, E e2) {
        if (e2 != null) {
            s(e2);
        }
        if (z2) {
            if (e2 != null) {
                this.f11267d.s(this.c, e2);
            } else {
                this.f11267d.q(this.c, j2);
            }
        }
        if (z) {
            if (e2 != null) {
                this.f11267d.x(this.c, e2);
            } else {
                this.f11267d.v(this.c, j2);
            }
        }
        return this.c.A(this, z2, z, e2);
    }

    public final void b() {
        this.f11269f.cancel();
    }

    public final z c(k.b0 b0Var, boolean z) {
        k.f(b0Var, "request");
        this.a = z;
        c0 a2 = b0Var.a();
        if (a2 != null) {
            long a3 = a2.a();
            this.f11267d.r(this.c);
            return new a(this, this.f11269f.f(b0Var, a3), a3);
        }
        k.m();
        throw null;
    }

    public final void d() {
        this.f11269f.cancel();
        this.c.A(this, true, true, null);
    }

    public final void e() {
        try {
            this.f11269f.a();
        } catch (IOException e2) {
            this.f11267d.s(this.c, e2);
            s(e2);
            throw e2;
        }
    }

    public final void f() {
        try {
            this.f11269f.c();
        } catch (IOException e2) {
            this.f11267d.s(this.c, e2);
            s(e2);
            throw e2;
        }
    }

    public final e g() {
        return this.c;
    }

    public final f h() {
        return this.b;
    }

    public final r i() {
        return this.f11267d;
    }

    public final d j() {
        return this.f11268e;
    }

    public final boolean k() {
        return !k.a(this.f11268e.d().l().i(), this.b.A().a().l().i());
    }

    public final boolean l() {
        return this.a;
    }

    public final void m() {
        this.f11269f.h().z();
    }

    public final void n() {
        this.c.A(this, true, false, null);
    }

    public final e0 o(d0 d0Var) {
        k.f(d0Var, "response");
        try {
            String q = d0.q(d0Var, "Content-Type", (String) null, 2, (Object) null);
            long d2 = this.f11269f.d(d0Var);
            return new h(q, d2, p.d(new b(this, this.f11269f.e(d0Var), d2)));
        } catch (IOException e2) {
            this.f11267d.x(this.c, e2);
            s(e2);
            throw e2;
        }
    }

    public final d0.a p(boolean z) {
        try {
            d0.a g2 = this.f11269f.g(z);
            if (g2 != null) {
                g2.l(this);
            }
            return g2;
        } catch (IOException e2) {
            this.f11267d.x(this.c, e2);
            s(e2);
            throw e2;
        }
    }

    public final void q(d0 d0Var) {
        k.f(d0Var, "response");
        this.f11267d.y(this.c, d0Var);
    }

    public final void r() {
        this.f11267d.z(this.c);
    }

    public final void t(k.b0 b0Var) {
        k.f(b0Var, "request");
        try {
            this.f11267d.u(this.c);
            this.f11269f.b(b0Var);
            this.f11267d.t(this.c, b0Var);
        } catch (IOException e2) {
            this.f11267d.s(this.c, e2);
            s(e2);
            throw e2;
        }
    }
}
