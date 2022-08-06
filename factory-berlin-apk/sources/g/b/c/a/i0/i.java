package g.b.c.a.i0;

import com.google.crypto.tink.shaded.protobuf.p;
import g.b.c.a.h0.l1;
import g.b.c.a.h0.m1;
import g.b.c.a.h0.n1;
import g.b.c.a.h0.o1;
import g.b.c.a.h0.v0;
import g.b.c.a.j;
import g.b.c.a.k0.a0;
import g.b.c.a.k0.o0;
import g.b.c.a.k0.p0;
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

/* compiled from: RsaSsaPssSignKeyManager */
public final class i extends u<n1, o1> {
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final byte[] f9623d = "Tink and Wycheproof.".getBytes(Charset.forName("UTF-8"));

    /* compiled from: RsaSsaPssSignKeyManager */
    class a extends j.b<v, n1> {
        a(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public v a(n1 n1Var) {
            KeyFactory a = a0.f9632k.a("RSA");
            m1 U = n1Var.a0().U();
            o0 o0Var = new o0((RSAPrivateCrtKey) a.generatePrivate(new RSAPrivateCrtKeySpec(new BigInteger(1, n1Var.a0().T().y()), new BigInteger(1, n1Var.a0().S().y()), new BigInteger(1, n1Var.W().y()), new BigInteger(1, n1Var.Z().y()), new BigInteger(1, n1Var.b0().y()), new BigInteger(1, n1Var.X().y()), new BigInteger(1, n1Var.Y().y()), new BigInteger(1, n1Var.V().y()))), k.c(U.Q()), k.c(U.O()), U.P());
            try {
                new p0((RSAPublicKey) a.generatePublic(new RSAPublicKeySpec(new BigInteger(1, n1Var.a0().T().y()), new BigInteger(1, n1Var.a0().S().y()))), k.c(U.Q()), k.c(U.O()), U.P()).b(o0Var.c(i.f9623d), i.f9623d);
                return o0Var;
            } catch (GeneralSecurityException e2) {
                throw new RuntimeException("Security bug: signing with private key followed by verifying with public key failed" + e2);
            }
        }
    }

    /* compiled from: RsaSsaPssSignKeyManager */
    class b extends j.a<l1, n1> {
        b(Class cls) {
            super(cls);
        }

        /* renamed from: e */
        public n1 a(l1 l1Var) {
            m1 O = l1Var.O();
            r0.c(l1Var.N());
            r0.d(k.c(O.Q()));
            KeyPairGenerator a = a0.f9631j.a("RSA");
            a.initialize(new RSAKeyGenParameterSpec(l1Var.N(), new BigInteger(1, l1Var.P().y())));
            KeyPair generateKeyPair = a.generateKeyPair();
            RSAPublicKey rSAPublicKey = (RSAPublicKey) generateKeyPair.getPublic();
            RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) generateKeyPair.getPrivate();
            o1.b W = o1.W();
            W.G(i.this.k());
            W.F(O);
            W.D(com.google.crypto.tink.shaded.protobuf.i.g(rSAPublicKey.getPublicExponent().toByteArray()));
            W.E(com.google.crypto.tink.shaded.protobuf.i.g(rSAPublicKey.getModulus().toByteArray()));
            n1.b d0 = n1.d0();
            d0.M(i.this.k());
            d0.I((o1) W.k());
            d0.E(com.google.crypto.tink.shaded.protobuf.i.g(rSAPrivateCrtKey.getPrivateExponent().toByteArray()));
            d0.H(com.google.crypto.tink.shaded.protobuf.i.g(rSAPrivateCrtKey.getPrimeP().toByteArray()));
            d0.J(com.google.crypto.tink.shaded.protobuf.i.g(rSAPrivateCrtKey.getPrimeQ().toByteArray()));
            d0.F(com.google.crypto.tink.shaded.protobuf.i.g(rSAPrivateCrtKey.getPrimeExponentP().toByteArray()));
            d0.G(com.google.crypto.tink.shaded.protobuf.i.g(rSAPrivateCrtKey.getPrimeExponentQ().toByteArray()));
            d0.D(com.google.crypto.tink.shaded.protobuf.i.g(rSAPrivateCrtKey.getCrtCoefficient().toByteArray()));
            return (n1) d0.k();
        }

        /* renamed from: f */
        public l1 c(com.google.crypto.tink.shaded.protobuf.i iVar) {
            return l1.Q(iVar, p.b());
        }

        /* renamed from: g */
        public void d(l1 l1Var) {
            k.f(l1Var.O());
            r0.c(l1Var.N());
        }
    }

    i() {
        super(n1.class, o1.class, new a(v.class));
    }

    public static void m(boolean z) {
        x.q(new i(), new j(), z);
    }

    public String c() {
        return "type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey";
    }

    public j.a<l1, n1> e() {
        return new b(l1.class);
    }

    public v0.c f() {
        return v0.c.ASYMMETRIC_PRIVATE;
    }

    public int k() {
        return 0;
    }

    /* renamed from: l */
    public n1 g(com.google.crypto.tink.shaded.protobuf.i iVar) {
        return n1.e0(iVar, p.b());
    }

    /* renamed from: n */
    public void i(n1 n1Var) {
        r0.e(n1Var.c0(), k());
        r0.c(new BigInteger(1, n1Var.a0().T().y()).bitLength());
        k.f(n1Var.a0().U());
    }
}
