package g.b.c.a.c0;

import com.google.crypto.tink.shaded.protobuf.i;
import com.google.crypto.tink.shaded.protobuf.p;
import g.b.c.a.d;
import g.b.c.a.h0.t;
import g.b.c.a.h0.u;
import g.b.c.a.h0.v0;
import g.b.c.a.i;
import g.b.c.a.j;
import g.b.c.a.k0.g;
import g.b.c.a.k0.l0;
import g.b.c.a.k0.r0;
import g.b.c.a.x;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;

/* compiled from: AesSivKeyManager */
public final class a extends j<t> {

    /* renamed from: g.b.c.a.c0.a$a  reason: collision with other inner class name */
    /* compiled from: AesSivKeyManager */
    class C0641a extends j.b<d, t> {
        C0641a(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public d a(t tVar) {
            return new g(tVar.P().y());
        }
    }

    /* compiled from: AesSivKeyManager */
    class b extends j.a<u, t> {
        b(Class cls) {
            super(cls);
        }

        /* renamed from: e */
        public t a(u uVar) {
            t.b R = t.R();
            R.D(i.g(l0.c(uVar.O())));
            R.E(a.this.l());
            return (t) R.k();
        }

        /* renamed from: f */
        public u c(i iVar) {
            return u.Q(iVar, p.b());
        }

        /* renamed from: g */
        public void d(u uVar) {
            if (uVar.O() != 64) {
                throw new InvalidAlgorithmParameterException("invalid key size: " + uVar.O() + ". Valid keys must have 64 bytes.");
            }
        }
    }

    a() {
        super(t.class, new C0641a(d.class));
    }

    public static final g.b.c.a.i j() {
        return k(64, i.b.TINK);
    }

    private static g.b.c.a.i k(int i2, i.b bVar) {
        u.b P = u.P();
        P.D(i2);
        return g.b.c.a.i.a(new a().c(), ((u) P.k()).f(), bVar);
    }

    public static void n(boolean z) {
        x.r(new a(), z);
    }

    public String c() {
        return "type.googleapis.com/google.crypto.tink.AesSivKey";
    }

    public j.a<u, t> e() {
        return new b(u.class);
    }

    public v0.c f() {
        return v0.c.SYMMETRIC;
    }

    public int l() {
        return 0;
    }

    /* renamed from: m */
    public t g(com.google.crypto.tink.shaded.protobuf.i iVar) {
        return t.S(iVar, p.b());
    }

    /* renamed from: o */
    public void i(t tVar) {
        r0.e(tVar.Q(), l());
        if (tVar.P().size() != 64) {
            throw new InvalidKeyException("invalid key size: " + tVar.P().size() + ". Valid keys must have 64 bytes.");
        }
    }
}
