package g.b.c.a.d0;

import com.google.crypto.tink.shaded.protobuf.i;
import com.google.crypto.tink.shaded.protobuf.p;
import g.b.c.a.f;
import g.b.c.a.h0.f0;
import g.b.c.a.h0.h0;
import g.b.c.a.h0.i0;
import g.b.c.a.h0.v0;
import g.b.c.a.j;
import g.b.c.a.k0.r0;
import g.b.c.a.k0.t;
import g.b.c.a.k0.y;

/* compiled from: EciesAeadHkdfPublicKeyManager */
class b extends j<h0> {

    /* compiled from: EciesAeadHkdfPublicKeyManager */
    class a extends j.b<f, h0> {
        a(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public f a(h0 h0Var) {
            f0 S = h0Var.S();
            i0 Q = S.Q();
            return new t(y.g(f.a(Q.N()), h0Var.U().y(), h0Var.V().y()), Q.Q().y(), f.b(Q.P()), f.c(S.P()), new g(S.O().N()));
        }
    }

    public b() {
        super(h0.class, new a(f.class));
    }

    public String c() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey";
    }

    public v0.c f() {
        return v0.c.ASYMMETRIC_PUBLIC;
    }

    public int j() {
        return 0;
    }

    /* renamed from: k */
    public h0 g(i iVar) {
        return h0.X(iVar, p.b());
    }

    /* renamed from: l */
    public void i(h0 h0Var) {
        r0.e(h0Var.T(), j());
        f.d(h0Var.S());
    }
}
