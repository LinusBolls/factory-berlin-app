package g.b.c.a.a0;

import com.google.crypto.tink.shaded.protobuf.i;
import com.google.crypto.tink.shaded.protobuf.p;
import g.b.c.a.h0.p1;
import g.b.c.a.h0.q1;
import g.b.c.a.h0.v0;
import g.b.c.a.j;
import g.b.c.a.k0.l0;
import g.b.c.a.k0.r0;
import g.b.c.a.k0.t0;
import g.b.c.a.x;
import java.security.GeneralSecurityException;

/* compiled from: XChaCha20Poly1305KeyManager */
public class k extends j<p1> {

    /* compiled from: XChaCha20Poly1305KeyManager */
    class a extends j.b<g.b.c.a.a, p1> {
        a(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public g.b.c.a.a a(p1 p1Var) {
            return new t0(p1Var.P().y());
        }
    }

    /* compiled from: XChaCha20Poly1305KeyManager */
    class b extends j.a<q1, p1> {
        b(Class cls) {
            super(cls);
        }

        /* renamed from: e */
        public p1 a(q1 q1Var) {
            p1.b R = p1.R();
            R.E(k.this.j());
            R.D(i.g(l0.c(32)));
            return (p1) R.k();
        }

        /* renamed from: f */
        public q1 c(i iVar) {
            return q1.N(iVar, p.b());
        }

        /* renamed from: g */
        public void d(q1 q1Var) {
        }
    }

    k() {
        super(p1.class, new a(g.b.c.a.a.class));
    }

    public static void l(boolean z) {
        x.r(new k(), z);
    }

    public String c() {
        return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
    }

    public j.a<q1, p1> e() {
        return new b(q1.class);
    }

    public v0.c f() {
        return v0.c.SYMMETRIC;
    }

    public int j() {
        return 0;
    }

    /* renamed from: k */
    public p1 g(i iVar) {
        return p1.S(iVar, p.b());
    }

    /* renamed from: m */
    public void i(p1 p1Var) {
        r0.e(p1Var.Q(), j());
        if (p1Var.P().size() != 32) {
            throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
        }
    }
}
