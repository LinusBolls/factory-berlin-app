package g.b.c.a.i0;

import com.google.crypto.tink.shaded.protobuf.i;
import com.google.crypto.tink.shaded.protobuf.p;
import g.b.c.a.h0.k1;
import g.b.c.a.h0.v0;
import g.b.c.a.j;
import g.b.c.a.k0.a0;
import g.b.c.a.k0.n0;
import g.b.c.a.k0.r0;
import g.b.c.a.w;
import java.math.BigInteger;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;

/* compiled from: RsaSsaPkcs1VerifyKeyManager */
class h extends j<k1> {

    /* compiled from: RsaSsaPkcs1VerifyKeyManager */
    class a extends j.b<w, k1> {
        a(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public w a(k1 k1Var) {
            return new n0((RSAPublicKey) a0.f9632k.a("RSA").generatePublic(new RSAPublicKeySpec(new BigInteger(1, k1Var.T().y()), new BigInteger(1, k1Var.S().y()))), k.c(k1Var.U().O()));
        }
    }

    public h() {
        super(k1.class, new a(w.class));
    }

    public String c() {
        return "type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey";
    }

    public v0.c f() {
        return v0.c.ASYMMETRIC_PUBLIC;
    }

    public int j() {
        return 0;
    }

    /* renamed from: k */
    public k1 g(i iVar) {
        return k1.X(iVar, p.b());
    }

    /* renamed from: l */
    public void i(k1 k1Var) {
        r0.e(k1Var.V(), j());
        r0.c(new BigInteger(1, k1Var.T().y()).bitLength());
        k.e(k1Var.U());
    }
}
