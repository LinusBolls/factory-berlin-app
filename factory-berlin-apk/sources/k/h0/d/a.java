package k.h0.d;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import k.a0;
import k.c;
import k.d0;
import k.e;
import k.e0;
import k.h0.d.c;
import k.r;
import k.u;
import k.w;
import kotlin.jvm.internal.k;
import l.b0;
import l.c0;
import l.f;
import l.g;
import l.h;
import l.p;
import l.z;

/* compiled from: CacheInterceptor.kt */
public final class a implements w {
    public static final C0739a c = new C0739a((DefaultConstructorMarker) null);
    private final c b;

    /* renamed from: k.h0.d.a$a  reason: collision with other inner class name */
    /* compiled from: CacheInterceptor.kt */
    public static final class C0739a {
        private C0739a() {
        }

        /* access modifiers changed from: private */
        public final u c(u uVar, u uVar2) {
            u.a aVar = new u.a();
            int size = uVar.size();
            for (int i2 = 0; i2 < size; i2++) {
                String d2 = uVar.d(i2);
                String j2 = uVar.j(i2);
                if ((!p.q("Warning", d2, true) || !p.D(j2, d.F, false, 2, (Object) null)) && (d(d2) || !e(d2) || uVar2.a(d2) == null)) {
                    aVar.c(d2, j2);
                }
            }
            int size2 = uVar2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                String d3 = uVar2.d(i3);
                if (!d(d3) && e(d3)) {
                    aVar.c(d3, uVar2.j(i3));
                }
            }
            return aVar.e();
        }

        private final boolean d(String str) {
            if (p.q("Content-Length", str, true) || p.q("Content-Encoding", str, true) || p.q("Content-Type", str, true)) {
                return true;
            }
            return false;
        }

        private final boolean e(String str) {
            if (p.q("Connection", str, true) || p.q("Keep-Alive", str, true) || p.q("Proxy-Authenticate", str, true) || p.q("Proxy-Authorization", str, true) || p.q("TE", str, true) || p.q("Trailers", str, true) || p.q("Transfer-Encoding", str, true) || p.q("Upgrade", str, true)) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: private */
        public final d0 f(d0 d0Var) {
            if ((d0Var != null ? d0Var.a() : null) == null) {
                return d0Var;
            }
            d0.a K = d0Var.K();
            K.b((e0) null);
            return K.c();
        }

        public /* synthetic */ C0739a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: CacheInterceptor.kt */
    public static final class b implements b0 {

        /* renamed from: g  reason: collision with root package name */
        private boolean f10367g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ h f10368h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ b f10369i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ g f10370j;

        b(h hVar, b bVar, g gVar) {
            this.f10368h = hVar;
            this.f10369i = bVar;
            this.f10370j = gVar;
        }

        public void close() {
            if (!this.f10367g && !k.h0.b.p(this, 100, TimeUnit.MILLISECONDS)) {
                this.f10367g = true;
                this.f10369i.a();
            }
            this.f10368h.close();
        }

        public c0 e() {
            return this.f10368h.e();
        }

        public long g0(f fVar, long j2) {
            k.f(fVar, "sink");
            try {
                long g0 = this.f10368h.g0(fVar, j2);
                if (g0 == -1) {
                    if (!this.f10367g) {
                        this.f10367g = true;
                        this.f10370j.close();
                    }
                    return -1;
                }
                fVar.F(this.f10370j.d(), fVar.T0() - g0, g0);
                this.f10370j.d0();
                return g0;
            } catch (IOException e2) {
                if (!this.f10367g) {
                    this.f10367g = true;
                    this.f10369i.a();
                }
                throw e2;
            }
        }
    }

    public a(c cVar) {
        this.b = cVar;
    }

    private final d0 b(b bVar, d0 d0Var) {
        if (bVar == null) {
            return d0Var;
        }
        z b2 = bVar.b();
        e0 a = d0Var.a();
        if (a != null) {
            b bVar2 = new b(a.n(), bVar, p.c(b2));
            String q = d0.q(d0Var, "Content-Type", (String) null, 2, (Object) null);
            long i2 = d0Var.a().i();
            d0.a K = d0Var.K();
            K.b(new k.h0.f.h(q, i2, p.d(bVar2)));
            return K.c();
        }
        k.m();
        throw null;
    }

    public d0 a(w.a aVar) {
        r rVar;
        e0 a;
        e0 a2;
        k.f(aVar, "chain");
        e call = aVar.call();
        c cVar = this.b;
        d0 b2 = cVar != null ? cVar.b(aVar.j()) : null;
        c b3 = new c.b(System.currentTimeMillis(), aVar.j(), b2).b();
        k.b0 b4 = b3.b();
        d0 a3 = b3.a();
        k.c cVar2 = this.b;
        if (cVar2 != null) {
            cVar2.q(b3);
        }
        okhttp3.internal.connection.e eVar = (okhttp3.internal.connection.e) (!(call instanceof okhttp3.internal.connection.e) ? null : call);
        if (eVar == null || (rVar = eVar.u()) == null) {
            rVar = r.a;
        }
        if (!(b2 == null || a3 != null || (a2 = b2.a()) == null)) {
            k.h0.b.j(a2);
        }
        if (b4 == null && a3 == null) {
            d0.a aVar2 = new d0.a();
            aVar2.r(aVar.j());
            aVar2.p(a0.HTTP_1_1);
            aVar2.g(504);
            aVar2.m("Unsatisfiable Request (only-if-cached)");
            aVar2.b(k.h0.b.c);
            aVar2.s(-1);
            aVar2.q(System.currentTimeMillis());
            d0 c2 = aVar2.c();
            rVar.A(call, c2);
            return c2;
        } else if (b4 != null) {
            if (a3 != null) {
                rVar.a(call, a3);
            } else if (this.b != null) {
                rVar.c(call);
            }
            try {
                d0 a4 = aVar.a(b4);
                if (!(a4 != null || b2 == null || a == null)) {
                }
                if (a3 != null) {
                    if (a4 == null || a4.j() != 304) {
                        e0 a5 = a3.a();
                        if (a5 != null) {
                            k.h0.b.j(a5);
                        }
                    } else {
                        d0.a K = a3.K();
                        K.k(c.c(a3.y(), a4.y()));
                        K.s(a4.b0());
                        K.q(a4.U());
                        K.d(c.f(a3));
                        K.n(c.f(a4));
                        d0 c3 = K.c();
                        e0 a6 = a4.a();
                        if (a6 != null) {
                            a6.close();
                            k.c cVar3 = this.b;
                            if (cVar3 != null) {
                                cVar3.o();
                                this.b.y(a3, c3);
                                rVar.b(call, c3);
                                return c3;
                            }
                            k.m();
                            throw null;
                        }
                        k.m();
                        throw null;
                    }
                }
                if (a4 != null) {
                    d0.a K2 = a4.K();
                    K2.d(c.f(a3));
                    K2.n(c.f(a4));
                    d0 c4 = K2.c();
                    if (this.b != null) {
                        if (k.h0.f.e.b(c4) && c.c.a(c4, b4)) {
                            d0 b5 = b(this.b.j(c4), c4);
                            if (a3 != null) {
                                rVar.c(call);
                            }
                            return b5;
                        } else if (k.h0.f.f.a.a(b4.h())) {
                            try {
                                this.b.k(b4);
                            } catch (IOException unused) {
                            }
                        }
                    }
                    return c4;
                }
                k.m();
                throw null;
            } finally {
                if (!(b2 == null || (a = b2.a()) == null)) {
                    k.h0.b.j(a);
                }
            }
        } else if (a3 != null) {
            d0.a K3 = a3.K();
            K3.d(c.f(a3));
            d0 c5 = K3.c();
            rVar.b(call, c5);
            return c5;
        } else {
            k.m();
            throw null;
        }
    }
}
