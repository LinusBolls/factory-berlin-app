package g.b.c.a.f0;

import com.google.crypto.tink.shaded.protobuf.i;
import com.google.crypto.tink.shaded.protobuf.p;
import g.b.c.a.h0.a;
import g.b.c.a.h0.c;
import g.b.c.a.h0.v0;
import g.b.c.a.j;
import g.b.c.a.k0.l0;
import g.b.c.a.k0.r0;
import g.b.c.a.q;
import g.b.c.a.x;
import java.security.GeneralSecurityException;

/* compiled from: AesCmacKeyManager */
public final class a extends j<g.b.c.a.h0.a> {

    /* renamed from: g.b.c.a.f0.a$a  reason: collision with other inner class name */
    /* compiled from: AesCmacKeyManager */
    class C0644a extends j.b<q, g.b.c.a.h0.a> {
        C0644a(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public q a(g.b.c.a.h0.a aVar) {
            return new g.b.c.a.k0.a(aVar.Q().y(), aVar.R().O());
        }
    }

    /* compiled from: AesCmacKeyManager */
    class b extends j.a<g.b.c.a.h0.b, g.b.c.a.h0.a> {
        b(a aVar, Class cls) {
            super(cls);
        }

        /* renamed from: e */
        public g.b.c.a.h0.a a(g.b.c.a.h0.b bVar) {
            a.b T = g.b.c.a.h0.a.T();
            T.F(0);
            T.D(i.g(l0.c(bVar.N())));
            T.E(bVar.O());
            return (g.b.c.a.h0.a) T.k();
        }

        /* renamed from: f */
        public g.b.c.a.h0.b c(i iVar) {
            return g.b.c.a.h0.b.P(iVar, p.b());
        }

        /* renamed from: g */
        public void d(g.b.c.a.h0.b bVar) {
            a.p(bVar.O());
            a.q(bVar.N());
        }
    }

    a() {
        super(g.b.c.a.h0.a.class, new C0644a(q.class));
    }

    public static void n(boolean z) {
        x.r(new a(), z);
    }

    /* access modifiers changed from: private */
    public static void p(c cVar) {
        if (cVar.O() < 10) {
            throw new GeneralSecurityException("tag size too short");
        } else if (cVar.O() > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    /* access modifiers changed from: private */
    public static void q(int i2) {
        if (i2 != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 16 bytes");
        }
    }

    public String c() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    public j.a<g.b.c.a.h0.b, g.b.c.a.h0.a> e() {
        return new b(this, g.b.c.a.h0.b.class);
    }

    public v0.c f() {
        return v0.c.SYMMETRIC;
    }

    public int l() {
        return 0;
    }

    /* renamed from: m */
    public g.b.c.a.h0.a g(i iVar) {
        return g.b.c.a.h0.a.U(iVar, p.b());
    }

    /* renamed from: o */
    public void i(g.b.c.a.h0.a aVar) {
        r0.e(aVar.S(), l());
        q(aVar.Q().size());
        p(aVar.R());
    }
}
