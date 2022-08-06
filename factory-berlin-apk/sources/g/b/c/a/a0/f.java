package g.b.c.a.a0;

import com.google.crypto.tink.shaded.protobuf.i;
import com.google.crypto.tink.shaded.protobuf.p;
import g.b.c.a.h0.r;
import g.b.c.a.h0.s;
import g.b.c.a.h0.v0;
import g.b.c.a.i;
import g.b.c.a.j;
import g.b.c.a.k0.l0;
import g.b.c.a.k0.r0;
import g.b.c.a.x;

/* compiled from: AesGcmKeyManager */
public final class f extends j<r> {

    /* compiled from: AesGcmKeyManager */
    class a extends j.b<g.b.c.a.a, r> {
        a(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public g.b.c.a.a a(r rVar) {
            return new g.b.c.a.k0.f(rVar.P().y());
        }
    }

    /* compiled from: AesGcmKeyManager */
    class b extends j.a<s, r> {
        b(Class cls) {
            super(cls);
        }

        /* renamed from: e */
        public r a(s sVar) {
            r.b R = r.R();
            R.D(i.g(l0.c(sVar.O())));
            R.E(f.this.l());
            return (r) R.k();
        }

        /* renamed from: f */
        public s c(i iVar) {
            return s.Q(iVar, p.b());
        }

        /* renamed from: g */
        public void d(s sVar) {
            r0.a(sVar.O());
        }
    }

    f() {
        super(r.class, new a(g.b.c.a.a.class));
    }

    public static final g.b.c.a.i j() {
        return k(32, i.b.TINK);
    }

    private static g.b.c.a.i k(int i2, i.b bVar) {
        s.b P = s.P();
        P.D(i2);
        return g.b.c.a.i.a(new f().c(), ((s) P.k()).f(), bVar);
    }

    public static void n(boolean z) {
        x.r(new f(), z);
    }

    public String c() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    public j.a<s, r> e() {
        return new b(s.class);
    }

    public v0.c f() {
        return v0.c.SYMMETRIC;
    }

    public int l() {
        return 0;
    }

    /* renamed from: m */
    public r g(com.google.crypto.tink.shaded.protobuf.i iVar) {
        return r.S(iVar, p.b());
    }

    /* renamed from: o */
    public void i(r rVar) {
        r0.e(rVar.Q(), l());
        r0.a(rVar.P().size());
    }
}
