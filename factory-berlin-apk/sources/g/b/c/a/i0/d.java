package g.b.c.a.i0;

import com.google.crypto.tink.shaded.protobuf.i;
import com.google.crypto.tink.shaded.protobuf.p;
import g.b.c.a.h0.l0;
import g.b.c.a.h0.v0;
import g.b.c.a.j;
import g.b.c.a.k0.r0;
import g.b.c.a.k0.x;
import g.b.c.a.w;
import java.security.GeneralSecurityException;

/* compiled from: Ed25519PublicKeyManager */
class d extends j<l0> {

    /* compiled from: Ed25519PublicKeyManager */
    class a extends j.b<w, l0> {
        a(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public w a(l0 l0Var) {
            return new x(l0Var.Q().y());
        }
    }

    public d() {
        super(l0.class, new a(w.class));
    }

    public String c() {
        return "type.googleapis.com/google.crypto.tink.Ed25519PublicKey";
    }

    public v0.c f() {
        return v0.c.ASYMMETRIC_PUBLIC;
    }

    public int j() {
        return 0;
    }

    /* renamed from: k */
    public l0 g(i iVar) {
        return l0.T(iVar, p.b());
    }

    /* renamed from: l */
    public void i(l0 l0Var) {
        r0.e(l0Var.R(), j());
        if (l0Var.Q().size() != 32) {
            throw new GeneralSecurityException("invalid Ed25519 public key: incorrect key length");
        }
    }
}
