package g.b.c.a.i0;

import com.google.crypto.tink.shaded.protobuf.i;
import com.google.crypto.tink.shaded.protobuf.p;
import g.b.c.a.h0.m1;
import g.b.c.a.h0.o1;
import g.b.c.a.h0.v0;
import g.b.c.a.j;
import g.b.c.a.k0.a0;
import g.b.c.a.k0.p0;
import g.b.c.a.k0.r0;
import g.b.c.a.w;
import java.math.BigInteger;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;

/* compiled from: RsaSsaPssVerifyKeyManager */
class j extends g.b.c.a.j<o1> {

    /* compiled from: RsaSsaPssVerifyKeyManager */
    class a extends j.b<w, o1> {
        a(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public w a(o1 o1Var) {
            m1 U = o1Var.U();
            return new p0((RSAPublicKey) a0.f9632k.a("RSA").generatePublic(new RSAPublicKeySpec(new BigInteger(1, o1Var.T().y()), new BigInteger(1, o1Var.S().y()))), k.c(U.Q()), k.c(U.O()), U.P());
        }
    }

    public j() {
        super(o1.class, new a(w.class));
    }

    public String c() {
        return "type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey";
    }

    public v0.c f() {
        return v0.c.ASYMMETRIC_PUBLIC;
    }

    public int j() {
        return 0;
    }

    /* renamed from: k */
    public o1 g(i iVar) {
        return o1.X(iVar, p.b());
    }

    /* renamed from: l */
    public void i(o1 o1Var) {
        r0.e(o1Var.V(), j());
        r0.c(new BigInteger(1, o1Var.T().y()).bitLength());
        k.f(o1Var.U());
    }
}
