package g.b.c.a.a0;

import com.google.crypto.tink.shaded.protobuf.p;
import g.b.c.a.h0.i;
import g.b.c.a.h0.k;
import g.b.c.a.h0.v0;
import g.b.c.a.j;
import g.b.c.a.k0.c;
import g.b.c.a.k0.g0;
import g.b.c.a.k0.l0;
import g.b.c.a.k0.r0;
import java.security.GeneralSecurityException;

/* compiled from: AesCtrKeyManager */
public class d extends j<i> {

    /* compiled from: AesCtrKeyManager */
    class a extends j.b<g0, i> {
        a(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public g0 a(i iVar) {
            return new c(iVar.R().y(), iVar.S().O());
        }
    }

    /* compiled from: AesCtrKeyManager */
    class b extends j.a<g.b.c.a.h0.j, i> {
        b(Class cls) {
            super(cls);
        }

        /* renamed from: e */
        public i a(g.b.c.a.h0.j jVar) {
            i.b U = i.U();
            U.E(jVar.P());
            U.D(com.google.crypto.tink.shaded.protobuf.i.g(l0.c(jVar.O())));
            U.F(d.this.k());
            return (i) U.k();
        }

        /* renamed from: f */
        public g.b.c.a.h0.j c(com.google.crypto.tink.shaded.protobuf.i iVar) {
            return g.b.c.a.h0.j.Q(iVar, p.b());
        }

        /* renamed from: g */
        public void d(g.b.c.a.h0.j jVar) {
            r0.a(jVar.O());
            d.this.n(jVar.P());
        }
    }

    d() {
        super(i.class, new a(g0.class));
    }

    /* access modifiers changed from: private */
    public void n(k kVar) {
        if (kVar.O() < 12 || kVar.O() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }

    public String c() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    public j.a<g.b.c.a.h0.j, i> e() {
        return new b(g.b.c.a.h0.j.class);
    }

    public v0.c f() {
        return v0.c.SYMMETRIC;
    }

    public int k() {
        return 0;
    }

    /* renamed from: l */
    public i g(com.google.crypto.tink.shaded.protobuf.i iVar) {
        return i.V(iVar, p.b());
    }

    /* renamed from: m */
    public void i(i iVar) {
        r0.e(iVar.T(), k());
        r0.a(iVar.R().size());
        n(iVar.S());
    }
}
