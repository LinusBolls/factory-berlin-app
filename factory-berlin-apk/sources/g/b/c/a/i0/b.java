package g.b.c.a.i0;

import com.google.crypto.tink.shaded.protobuf.i;
import com.google.crypto.tink.shaded.protobuf.p;
import g.b.c.a.h0.b0;
import g.b.c.a.h0.v0;
import g.b.c.a.j;
import g.b.c.a.k0.q;
import g.b.c.a.k0.r0;
import g.b.c.a.k0.y;
import g.b.c.a.w;

/* compiled from: EcdsaVerifyKeyManager */
class b extends j<b0> {

    /* compiled from: EcdsaVerifyKeyManager */
    class a extends j.b<w, b0> {
        a(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public w a(b0 b0Var) {
            return new q(y.g(k.a(b0Var.S().N()), b0Var.U().y(), b0Var.V().y()), k.c(b0Var.S().Q()), k.b(b0Var.S().P()));
        }
    }

    public b() {
        super(b0.class, new a(w.class));
    }

    public String c() {
        return "type.googleapis.com/google.crypto.tink.EcdsaPublicKey";
    }

    public v0.c f() {
        return v0.c.ASYMMETRIC_PUBLIC;
    }

    public int j() {
        return 0;
    }

    /* renamed from: k */
    public b0 g(i iVar) {
        return b0.X(iVar, p.b());
    }

    /* renamed from: l */
    public void i(b0 b0Var) {
        r0.e(b0Var.T(), j());
        k.d(b0Var.S());
    }
}
