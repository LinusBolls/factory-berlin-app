package g.b.c.a.a0;

import com.google.crypto.tink.shaded.protobuf.i;
import g.b.c.a.h0.b1;
import g.b.c.a.h0.c1;
import g.b.c.a.h0.v0;
import g.b.c.a.j;
import g.b.c.a.k0.r0;
import g.b.c.a.p;
import g.b.c.a.x;

/* compiled from: KmsAeadKeyManager */
public class h extends j<b1> {

    /* compiled from: KmsAeadKeyManager */
    class a extends j.b<g.b.c.a.a, b1> {
        a(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public g.b.c.a.a a(b1 b1Var) {
            String O = b1Var.P().O();
            return p.a(O).b(O);
        }
    }

    /* compiled from: KmsAeadKeyManager */
    class b extends j.a<c1, b1> {
        b(Class cls) {
            super(cls);
        }

        /* renamed from: e */
        public b1 a(c1 c1Var) {
            b1.b R = b1.R();
            R.D(c1Var);
            R.E(h.this.j());
            return (b1) R.k();
        }

        /* renamed from: f */
        public c1 c(i iVar) {
            return c1.P(iVar, com.google.crypto.tink.shaded.protobuf.p.b());
        }

        /* renamed from: g */
        public void d(c1 c1Var) {
        }
    }

    h() {
        super(b1.class, new a(g.b.c.a.a.class));
    }

    public static void l(boolean z) {
        x.r(new h(), z);
    }

    public String c() {
        return "type.googleapis.com/google.crypto.tink.KmsAeadKey";
    }

    public j.a<c1, b1> e() {
        return new b(c1.class);
    }

    public v0.c f() {
        return v0.c.REMOTE;
    }

    public int j() {
        return 0;
    }

    /* renamed from: k */
    public b1 g(i iVar) {
        return b1.S(iVar, com.google.crypto.tink.shaded.protobuf.p.b());
    }

    /* renamed from: m */
    public void i(b1 b1Var) {
        r0.e(b1Var.Q(), j());
    }
}
