package g.b.c.a.k0;

import g.b.c.a.v;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
import javax.crypto.Cipher;

/* compiled from: RsaSsaPssSignJce */
public final class o0 implements v {
    private final RSAPrivateCrtKey a;
    private final RSAPublicKey b;
    private final c0 c;

    /* renamed from: d  reason: collision with root package name */
    private final c0 f9658d;

    /* renamed from: e  reason: collision with root package name */
    private final int f9659e;

    public o0(RSAPrivateCrtKey rSAPrivateCrtKey, c0 c0Var, c0 c0Var2, int i2) {
        r0.d(c0Var);
        r0.c(rSAPrivateCrtKey.getModulus().bitLength());
        this.a = rSAPrivateCrtKey;
        this.b = (RSAPublicKey) a0.f9632k.a("RSA").generatePublic(new RSAPublicKeySpec(rSAPrivateCrtKey.getModulus(), rSAPrivateCrtKey.getPublicExponent()));
        this.c = c0Var;
        this.f9658d = c0Var2;
        this.f9659e = i2;
    }

    private byte[] a(byte[] bArr, int i2) {
        int i3 = i2;
        r0.d(this.c);
        MessageDigest a2 = a0.f9630i.a(q0.e(this.c));
        byte[] digest = a2.digest(bArr);
        int digestLength = a2.getDigestLength();
        int i4 = ((i3 - 1) / 8) + 1;
        int i5 = this.f9659e;
        if (i4 >= digestLength + i5 + 2) {
            byte[] c2 = l0.c(i5);
            int i6 = digestLength + 8;
            byte[] bArr2 = new byte[(this.f9659e + i6)];
            System.arraycopy(digest, 0, bArr2, 8, digestLength);
            System.arraycopy(c2, 0, bArr2, i6, c2.length);
            byte[] digest2 = a2.digest(bArr2);
            int i7 = (i4 - digestLength) - 1;
            byte[] bArr3 = new byte[i7];
            int i8 = this.f9659e;
            bArr3[((i4 - i8) - digestLength) - 2] = 1;
            System.arraycopy(c2, 0, bArr3, ((i4 - i8) - digestLength) - 1, c2.length);
            byte[] d2 = q0.d(digest2, i7, this.f9658d);
            byte[] bArr4 = new byte[i7];
            for (int i9 = 0; i9 < i7; i9++) {
                bArr4[i9] = (byte) (bArr3[i9] ^ d2[i9]);
            }
            for (int i10 = 0; ((long) i10) < (((long) i4) * 8) - ((long) i3); i10++) {
                int i11 = i10 / 8;
                bArr4[i11] = (byte) ((~(1 << (7 - (i10 % 8)))) & bArr4[i11]);
            }
            int i12 = digestLength + i7;
            byte[] bArr5 = new byte[(i12 + 1)];
            System.arraycopy(bArr4, 0, bArr5, 0, i7);
            System.arraycopy(digest2, 0, bArr5, i7, digest2.length);
            bArr5[i12] = -68;
            return bArr5;
        }
        throw new GeneralSecurityException("encoding error");
    }

    private byte[] b(byte[] bArr) {
        Cipher a2 = a0.f9627f.a("RSA/ECB/NOPADDING");
        a2.init(2, this.a);
        byte[] doFinal = a2.doFinal(bArr);
        Cipher a3 = a0.f9627f.a("RSA/ECB/NOPADDING");
        a3.init(1, this.b);
        if (new BigInteger(1, bArr).equals(new BigInteger(1, a3.doFinal(doFinal)))) {
            return doFinal;
        }
        throw new RuntimeException("Security bug: RSA signature computation error");
    }

    public byte[] c(byte[] bArr) {
        return b(a(bArr, this.b.getModulus().bitLength() - 1));
    }
}
