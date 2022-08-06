package g.b.c.a.i0;

import com.google.crypto.tink.shaded.protobuf.i;
import com.google.crypto.tink.shaded.protobuf.p;
import g.b.c.a.h0.j0;
import g.b.c.a.h0.k0;
import g.b.c.a.h0.l0;
import g.b.c.a.h0.v0;
import g.b.c.a.j;
import g.b.c.a.k0.r0;
import g.b.c.a.k0.w;
import g.b.c.a.u;
import g.b.c.a.v;
import g.b.c.a.x;
import java.security.GeneralSecurityException;

/* compiled from: Ed25519PrivateKeyManager */
public final class c extends u<k0, l0> {

    /* compiled from: Ed25519PrivateKeyManager */
    class a extends j.b<v, k0> {
        a(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public v a(k0 k0Var) {
            return new w(k0Var.Q().y());
        }
    }

    /* compiled from: Ed25519PrivateKeyManager */
    class b extends j.a<j0, k0> {
        b(Class cls) {
            super(cls);
        }

        /* renamed from: e */
        public k0 a(j0 j0Var) {
            w.a c = w.a.c();
            l0.b S = l0.S();
            S.E(c.this.j());
            S.D(i.g(c.b()));
            k0.b T = k0.T();
            T.F(c.this.j());
            T.D(i.g(c.a()));
            T.E((l0) S.k());
            return (k0) T.k();
        }

        /* renamed from: f */
        public j0 c(i iVar) {
            return j0.N(iVar, p.b());
        }

        /* renamed from: g */
        public void d(j0 j0Var) {
        }
    }

    c() {
        super(k0.class, l0.class, new a(v.class));
    }

    public static void l(boolean z) {
        x.q(new c(), new d(), z);
    }

    public String c() {
        return "type.googleapis.com/google.crypto.tink.Ed25519PrivateKey";
    }

    public j.a<j0, k0> e() {
        return new b(j0.class);
    }

    public v0.c f() {
        return v0.c.ASYMMETRIC_PRIVATE;
    }

    public int j() {
        return 0;
    }

    /* renamed from: k */
    public k0 g(i iVar) {
        return k0.U(iVar, p.b());
    }

    /* renamed from: m */
    public void i(k0 k0Var) {
        r0.e(k0Var.S(), j());
        new d().i(k0Var.R());
        if (k0Var.Q().size() != 32) {
            throw new GeneralSecurityException("invalid Ed25519 private key: incorrect key length");
        }
    }
}
