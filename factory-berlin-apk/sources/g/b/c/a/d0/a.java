package g.b.c.a.d0;

import com.google.crypto.tink.shaded.protobuf.i;
import com.google.crypto.tink.shaded.protobuf.p;
import g.b.c.a.e;
import g.b.c.a.h0.e0;
import g.b.c.a.h0.f0;
import g.b.c.a.h0.g0;
import g.b.c.a.h0.h0;
import g.b.c.a.h0.i0;
import g.b.c.a.h0.v0;
import g.b.c.a.j;
import g.b.c.a.k0.r0;
import g.b.c.a.k0.s;
import g.b.c.a.k0.y;
import g.b.c.a.u;
import g.b.c.a.x;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;

/* compiled from: EciesAeadHkdfPrivateKeyManager */
public final class a extends u<g0, h0> {

    /* renamed from: g.b.c.a.d0.a$a  reason: collision with other inner class name */
    /* compiled from: EciesAeadHkdfPrivateKeyManager */
    class C0642a extends j.b<e, g0> {
        C0642a(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public e a(g0 g0Var) {
            f0 S = g0Var.R().S();
            i0 Q = S.Q();
            return new s(y.f(f.a(Q.N()), g0Var.Q().y()), Q.Q().y(), f.b(Q.P()), f.c(S.P()), new g(S.O().N()));
        }
    }

    /* compiled from: EciesAeadHkdfPrivateKeyManager */
    class b extends j.a<e0, g0> {
        b(Class cls) {
            super(cls);
        }

        /* renamed from: e */
        public g0 a(e0 e0Var) {
            KeyPair c = y.c(f.a(e0Var.N().Q().N()));
            ECPoint w = ((ECPublicKey) c.getPublic()).getW();
            h0.b W = h0.W();
            W.E(a.this.j());
            W.D(e0Var.N());
            W.F(i.g(w.getAffineX().toByteArray()));
            W.G(i.g(w.getAffineY().toByteArray()));
            g0.b T = g0.T();
            T.F(a.this.j());
            T.E((h0) W.k());
            T.D(i.g(((ECPrivateKey) c.getPrivate()).getS().toByteArray()));
            return (g0) T.k();
        }

        /* renamed from: f */
        public e0 c(i iVar) {
            return e0.O(iVar, p.b());
        }

        /* renamed from: g */
        public void d(e0 e0Var) {
            f.d(e0Var.N());
        }
    }

    a() {
        super(g0.class, h0.class, new C0642a(e.class));
    }

    public static void l(boolean z) {
        x.q(new a(), new b(), z);
    }

    public String c() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey";
    }

    public j.a<e0, g0> e() {
        return new b(e0.class);
    }

    public v0.c f() {
        return v0.c.ASYMMETRIC_PRIVATE;
    }

    public int j() {
        return 0;
    }

    /* renamed from: k */
    public g0 g(i iVar) {
        return g0.U(iVar, p.b());
    }

    /* renamed from: m */
    public void i(g0 g0Var) {
        if (!g0Var.Q().isEmpty()) {
            r0.e(g0Var.S(), j());
            f.d(g0Var.R().S());
            return;
        }
        throw new GeneralSecurityException("invalid ECIES private key");
    }
}
