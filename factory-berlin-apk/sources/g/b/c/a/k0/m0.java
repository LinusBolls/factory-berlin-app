package g.b.c.a.k0;

import g.b.c.a.v;
import java.security.Signature;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;

/* compiled from: RsaSsaPkcs1SignJce */
public final class m0 implements v {
    private final RSAPrivateCrtKey a;
    private final RSAPublicKey b;
    private final String c;

    public m0(RSAPrivateCrtKey rSAPrivateCrtKey, c0 c0Var) {
        r0.d(c0Var);
        r0.c(rSAPrivateCrtKey.getModulus().bitLength());
        this.a = rSAPrivateCrtKey;
        this.c = q0.g(c0Var);
        this.b = (RSAPublicKey) a0.f9632k.a("RSA").generatePublic(new RSAPublicKeySpec(rSAPrivateCrtKey.getModulus(), rSAPrivateCrtKey.getPublicExponent()));
    }

    public byte[] a(byte[] bArr) {
        Signature a2 = a0.f9629h.a(this.c);
        a2.initSign(this.a);
        a2.update(bArr);
        byte[] sign = a2.sign();
        Signature a3 = a0.f9629h.a(this.c);
        a3.initVerify(this.b);
        a3.update(bArr);
        if (a3.verify(sign)) {
            return sign;
        }
        throw new RuntimeException("Security bug: RSA signature computation error");
    }
}
