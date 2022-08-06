package g.b.c.a.k0;

import g.b.c.a.w;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.interfaces.RSAPublicKey;

/* compiled from: RsaSsaPkcs1VerifyJce */
public final class n0 implements w {
    private final RSAPublicKey a;
    private final c0 b;

    /* compiled from: RsaSsaPkcs1VerifyJce */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                g.b.c.a.k0.c0[] r0 = g.b.c.a.k0.c0.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                g.b.c.a.k0.c0 r1 = g.b.c.a.k0.c0.SHA256     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001d }
                g.b.c.a.k0.c0 r1 = g.b.c.a.k0.c0.SHA512     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: g.b.c.a.k0.n0.a.<clinit>():void");
        }
    }

    public n0(RSAPublicKey rSAPublicKey, c0 c0Var) {
        r0.d(c0Var);
        r0.c(rSAPublicKey.getModulus().bitLength());
        this.a = rSAPublicKey;
        this.b = c0Var;
    }

    private byte[] a(byte[] bArr, int i2, c0 c0Var) {
        r0.d(c0Var);
        MessageDigest a2 = a0.f9630i.a(q0.e(this.b));
        a2.update(bArr);
        byte[] digest = a2.digest();
        byte[] b2 = b(c0Var);
        int length = b2.length + digest.length;
        if (i2 >= length + 11) {
            byte[] bArr2 = new byte[i2];
            bArr2[0] = 0;
            int i3 = 2;
            bArr2[1] = 1;
            int i4 = 0;
            while (i4 < (i2 - length) - 3) {
                bArr2[i3] = -1;
                i4++;
                i3++;
            }
            int i5 = i3 + 1;
            bArr2[i3] = 0;
            System.arraycopy(b2, 0, bArr2, i5, b2.length);
            System.arraycopy(digest, 0, bArr2, i5 + b2.length, digest.length);
            return bArr2;
        }
        throw new GeneralSecurityException("intended encoded message length too short");
    }

    private byte[] b(c0 c0Var) {
        int i2 = a.a[c0Var.ordinal()];
        if (i2 == 1) {
            return e0.a("3031300d060960864801650304020105000420");
        }
        if (i2 == 2) {
            return e0.a("3051300d060960864801650304020305000440");
        }
        throw new GeneralSecurityException("Unsupported hash " + c0Var);
    }

    public void c(byte[] bArr, byte[] bArr2) {
        BigInteger publicExponent = this.a.getPublicExponent();
        BigInteger modulus = this.a.getModulus();
        int bitLength = (modulus.bitLength() + 7) / 8;
        if (bitLength == bArr.length) {
            BigInteger a2 = q0.a(bArr);
            if (a2.compareTo(modulus) >= 0) {
                throw new GeneralSecurityException("signature out of range");
            } else if (!j.b(q0.b(a2.modPow(publicExponent, modulus), bitLength), a(bArr2, bitLength, this.b))) {
                throw new GeneralSecurityException("invalid signature");
            }
        } else {
            throw new GeneralSecurityException("invalid signature's length");
        }
    }
}
