package g.b.c.a.i0;

import com.google.crypto.tink.shaded.protobuf.i;
import com.google.crypto.tink.shaded.protobuf.p;
import g.b.c.a.h0.h1;
import g.b.c.a.h0.i1;
import g.b.c.a.h0.j1;
import g.b.c.a.h0.k1;
import g.b.c.a.h0.v0;
import g.b.c.a.j;
import g.b.c.a.k0.a0;
import g.b.c.a.k0.m0;
import g.b.c.a.k0.n0;
import g.b.c.a.k0.r0;
import g.b.c.a.u;
import g.b.c.a.v;
import g.b.c.a.x;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAKeyGenParameterSpec;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.security.spec.RSAPublicKeySpec;

/* compiled from: RsaSsaPkcs1SignKeyManager */
public final class g extends u<j1, k1> {
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final byte[] f9622d = "Tink and Wycheproof.".getBytes(Charset.forName("UTF-8"));

    /* compiled from: RsaSsaPkcs1SignKeyManager */
    class a extends j.b<v, j1> {
        a(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public v a(j1 j1Var) {
            KeyFactory a = a0.f9632k.a("RSA");
            m0 m0Var = new m0((RSAPrivateCrtKey) a.generatePrivate(new RSAPrivateCrtKeySpec(new BigInteger(1, j1Var.a0().T().y()), new BigInteger(1, j1Var.a0().S().y()), new BigInteger(1, j1Var.W().y()), new BigInteger(1, j1Var.Z().y()), new BigInteger(1, j1Var.b0().y()), new BigInteger(1, j1Var.X().y()), new BigInteger(1, j1Var.Y().y()), new BigInteger(1, j1Var.V().y()))), k.c(j1Var.a0().U().O()));
            try {
                new n0((RSAPublicKey) a.generatePublic(new RSAPublicKeySpec(new BigInteger(1, j1Var.a0().T().y()), new BigInteger(1, j1Var.a0().S().y()))), k.c(j1Var.a0().U().O())).c(m0Var.a(g.f9622d), g.f9622d);
                return m0Var;
            } catch (GeneralSecurityException e2) {
                throw new RuntimeException("Security bug: signing with private key followed by verifying with public key failed" + e2);
            }
        }
    }

    /* compiled from: RsaSsaPkcs1SignKeyManager */
    class b extends j.a<h1, j1> {
        b(Class cls) {
            super(cls);
        }

        /* renamed from: e */
        public j1 a(h1 h1Var) {
            i1 O = h1Var.O();
            KeyPairGenerator a = a0.f9631j.a("RSA");
            a.initialize(new RSAKeyGenParameterSpec(h1Var.N(), new BigInteger(1, h1Var.P().y())));
            KeyPair generateKeyPair = a.generateKeyPair();
            RSAPublicKey rSAPublicKey = (RSAPublicKey) generateKeyPair.getPublic();
            RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) generateKeyPair.getPrivate();
            k1.b W = k1.W();
            W.G(g.this.k());
            W.F(O);
            W.D(i.g(rSAPublicKey.getPublicExponent().toByteArray()));
            W.E(i.g(rSAPublicKey.getModulus().toByteArray()));
            j1.b d0 = j1.d0();
            d0.M(g.this.k());
            d0.I((k1) W.k());
            d0.E(i.g(rSAPrivateCrtKey.getPrivateExponent().toByteArray()));
            d0.H(i.g(rSAPrivateCrtKey.getPrimeP().toByteArray()));
            d0.J(i.g(rSAPrivateCrtKey.getPrimeQ().toByteArray()));
            d0.F(i.g(rSAPrivateCrtKey.getPrimeExponentP().toByteArray()));
            d0.G(i.g(rSAPrivateCrtKey.getPrimeExponentQ().toByteArray()));
            d0.D(i.g(rSAPrivateCrtKey.getCrtCoefficient().toByteArray()));
            return (j1) d0.k();
        }

        /* renamed from: f */
        public h1 c(i iVar) {
            return h1.Q(iVar, p.b());
        }

        /* renamed from: g */
        public void d(h1 h1Var) {
            k.e(h1Var.O());
            r0.c(h1Var.N());
        }
    }

    g() {
        super(j1.class, k1.class, new a(v.class));
    }

    public static void m(boolean z) {
        x.q(new g(), new h(), z);
    }

    public String c() {
        return "type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey";
    }

    public j.a<h1, j1> e() {
        return new b(h1.class);
    }

    public v0.c f() {
        return v0.c.ASYMMETRIC_PRIVATE;
    }

    public int k() {
        return 0;
    }

    /* renamed from: l */
    public j1 g(i iVar) {
        return j1.e0(iVar, p.b());
    }

    /* renamed from: n */
    public void i(j1 j1Var) {
        r0.e(j1Var.c0(), k());
        r0.c(new BigInteger(1, j1Var.a0().T().y()).bitLength());
        k.e(j1Var.a0().U());
    }
}
