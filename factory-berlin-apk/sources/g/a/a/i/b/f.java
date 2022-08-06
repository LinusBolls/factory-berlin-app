package g.a.a.i.b;

import g.a.a.g;
import g.a.a.h.r.a.d;
import g.a.a.h.r.a.e;
import g.a.a.h.s.c;
import g.a.a.h.s.q;
import k.d0;
import k.w;
import l.b0;
import l.k;
import l.z;

/* compiled from: SensorbergApolloHttpCache */
public final class f implements g.a.a.h.r.a.a {
    private final e a;
    private final c b;

    /* compiled from: SensorbergApolloHttpCache */
    class a extends k {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ g.a.a.h.r.a.c f9109h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ boolean f9110i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ String f9111j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b0 b0Var, g.a.a.h.r.a.c cVar, boolean z, String str) {
            super(b0Var);
            this.f9109h = cVar;
            this.f9110i = z;
            this.f9111j = str;
        }

        public void close() {
            super.close();
            f.this.e(this.f9109h);
            if (this.f9110i) {
                f.this.b(this.f9111j);
            }
        }
    }

    public f(e eVar, g gVar) {
        q.b(eVar, "cacheStore == null");
        this.a = eVar;
        this.b = new c(gVar);
    }

    private void c(d dVar) {
        if (dVar != null) {
            try {
                dVar.a();
            } catch (Exception e2) {
                this.b.g(e2, "Failed to abort cache record edit", new Object[0]);
            }
        }
    }

    private void f(z zVar) {
        try {
            zVar.close();
        } catch (Exception e2) {
            this.b.g(e2, "Failed to close sink", new Object[0]);
        }
    }

    public w a() {
        return new g(this, this.b);
    }

    public void b(String str) {
        try {
            i(str);
        } catch (Exception e2) {
            this.b.g(e2, "Failed to remove cached record for key: %s", str);
        }
    }

    /* access modifiers changed from: package-private */
    public d0 d(d0 d0Var, String str) {
        z b2;
        if (i.l(d0Var.Z())) {
            return d0Var;
        }
        d dVar = null;
        try {
            dVar = this.a.b(str);
            if (dVar != null) {
                b2 = dVar.b();
                new e(d0Var).g(b2);
                f(b2);
                d0.a K = d0Var.K();
                K.b(new d(dVar, d0Var, this.b));
                return K.c();
            }
        } catch (Exception e2) {
            c(dVar);
            this.b.d(e2, "Failed to proxy http response for key: %s", str);
        } catch (Throwable th) {
            f(b2);
            throw th;
        }
        return d0Var;
    }

    /* access modifiers changed from: package-private */
    public void e(g.a.a.h.r.a.c cVar) {
        if (cVar != null) {
            try {
                cVar.close();
            } catch (Exception e2) {
                this.b.g(e2, "Failed to close cache record", new Object[0]);
            }
        }
    }

    public d0 g(String str) {
        return h(str, false);
    }

    public d0 h(String str, boolean z) {
        g.a.a.h.r.a.c cVar;
        try {
            cVar = this.a.a(str);
            if (cVar == null) {
                return null;
            }
            try {
                a aVar = new a(cVar.a(), cVar, z, str);
                d0 e2 = new e(cVar.b()).e();
                String n2 = e2.n("Content-Type");
                String n3 = e2.n("Content-Length");
                d0.a K = e2.K();
                K.b(new a(aVar, n2, n3));
                return K.c();
            } catch (Exception e3) {
                e = e3;
                e(cVar);
                this.b.d(e, "Failed to read http cache entry for key: %s", str);
                return null;
            }
        } catch (Exception e4) {
            e = e4;
            cVar = null;
            e(cVar);
            this.b.d(e, "Failed to read http cache entry for key: %s", str);
            return null;
        }
    }

    public void i(String str) {
        this.a.remove(str);
    }

    /* access modifiers changed from: package-private */
    public void j(d0 d0Var, String str) {
        z b2;
        z c;
        d dVar = null;
        try {
            dVar = this.a.b(str);
            if (dVar != null) {
                b2 = dVar.b();
                new e(d0Var).g(b2);
                f(b2);
                c = dVar.c();
                i.b(d0Var, c);
                f(c);
                dVar.commit();
            }
        } catch (Exception e2) {
            c(dVar);
            this.b.d(e2, "Failed to cache http response for key: %s", str);
        } catch (Throwable th) {
            f(c);
            throw th;
        }
    }
}
