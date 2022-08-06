package g.b.c.a.a0;

import com.google.crypto.tink.shaded.protobuf.i;
import com.google.crypto.tink.shaded.protobuf.p;
import g.b.c.a.h0.d;
import g.b.c.a.h0.e;
import g.b.c.a.h0.v0;
import g.b.c.a.j;
import g.b.c.a.k0.g0;
import g.b.c.a.k0.r0;
import g.b.c.a.k0.z;
import g.b.c.a.q;
import g.b.c.a.x;

/* compiled from: AesCtrHmacAeadKeyManager */
public final class c extends j<d> {

    /* compiled from: AesCtrHmacAeadKeyManager */
    class a extends j.b<g.b.c.a.a, d> {
        a(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public g.b.c.a.a a(d dVar) {
            return new z((g0) new d().d(dVar.Q(), g0.class), (q) new g.b.c.a.f0.b().d(dVar.R(), q.class), dVar.R().S().P());
        }
    }

    /* compiled from: AesCtrHmacAeadKeyManager */
    class b extends j.a<e, d> {
        b(Class cls) {
            super(cls);
        }

        /* renamed from: e */
        public d a(e eVar) {
            d.b T = d.T();
            T.D(new d().e().a(eVar.N()));
            T.E(new g.b.c.a.f0.b().e().a(eVar.O()));
            T.F(c.this.j());
            return (d) T.k();
        }

        /* renamed from: f */
        public e c(i iVar) {
            return e.P(iVar, p.b());
        }

        /* renamed from: g */
        public void d(e eVar) {
            new d().e().d(eVar.N());
            new g.b.c.a.f0.b().e().d(eVar.O());
            r0.a(eVar.N().O());
        }
    }

    c() {
        super(d.class, new a(g.b.c.a.a.class));
    }

    public static void l(boolean z) {
        x.r(new c(), z);
    }

    public String c() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    public j.a<e, d> e() {
        return new b(e.class);
    }

    public v0.c f() {
        return v0.c.SYMMETRIC;
    }

    public int j() {
        return 0;
    }

    /* renamed from: k */
    public d g(i iVar) {
        return d.U(iVar, p.b());
    }

    /* renamed from: m */
    public void i(d dVar) {
        r0.e(dVar.S(), j());
        new d().i(dVar.Q());
        new g.b.c.a.f0.b().i(dVar.R());
    }
}
