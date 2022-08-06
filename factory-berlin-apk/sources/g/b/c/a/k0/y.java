package g.b.c.a.k0;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECField;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;

/* compiled from: EllipticCurves */
public final class y {

    /* compiled from: EllipticCurves */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        static {
            /*
                g.b.c.a.k0.y$b[] r0 = g.b.c.a.k0.y.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                b = r0
                r1 = 1
                g.b.c.a.k0.y$b r2 = g.b.c.a.k0.y.b.NIST_P256     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = b     // Catch:{ NoSuchFieldError -> 0x001d }
                g.b.c.a.k0.y$b r3 = g.b.c.a.k0.y.b.NIST_P384     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = b     // Catch:{ NoSuchFieldError -> 0x0028 }
                g.b.c.a.k0.y$b r4 = g.b.c.a.k0.y.b.NIST_P521     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                g.b.c.a.k0.y$d[] r3 = g.b.c.a.k0.y.d.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                a = r3
                g.b.c.a.k0.y$d r4 = g.b.c.a.k0.y.d.UNCOMPRESSED     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = a     // Catch:{ NoSuchFieldError -> 0x0043 }
                g.b.c.a.k0.y$d r3 = g.b.c.a.k0.y.d.DO_NOT_USE_CRUNCHY_UNCOMPRESSED     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x004d }
                g.b.c.a.k0.y$d r1 = g.b.c.a.k0.y.d.COMPRESSED     // Catch:{ NoSuchFieldError -> 0x004d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: g.b.c.a.k0.y.a.<clinit>():void");
        }
    }

    /* compiled from: EllipticCurves */
    public enum b {
        NIST_P256,
        NIST_P384,
        NIST_P521
    }

    /* compiled from: EllipticCurves */
    public enum c {
        IEEE_P1363,
        DER
    }

    /* compiled from: EllipticCurves */
    public enum d {
        UNCOMPRESSED,
        COMPRESSED,
        DO_NOT_USE_CRUNCHY_UNCOMPRESSED
    }

    static void a(ECPoint eCPoint, EllipticCurve ellipticCurve) {
        BigInteger h2 = h(ellipticCurve);
        BigInteger affineX = eCPoint.getAffineX();
        BigInteger affineY = eCPoint.getAffineY();
        if (affineX == null || affineY == null) {
            throw new GeneralSecurityException("point is at infinity");
        } else if (affineX.signum() == -1 || affineX.compareTo(h2) >= 0) {
            throw new GeneralSecurityException("x is out of range");
        } else if (affineY.signum() == -1 || affineY.compareTo(h2) >= 0) {
            throw new GeneralSecurityException("y is out of range");
        } else if (!affineY.multiply(affineY).mod(h2).equals(affineX.multiply(affineX).add(ellipticCurve.getA()).multiply(affineX).add(ellipticCurve.getB()).mod(h2))) {
            throw new GeneralSecurityException("Point is not on curve");
        }
    }

    static void b(ECPublicKey eCPublicKey) {
        a(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
    }

    public static KeyPair c(b bVar) {
        return d(e(bVar));
    }

    public static KeyPair d(ECParameterSpec eCParameterSpec) {
        KeyPairGenerator a2 = a0.f9631j.a("EC");
        a2.initialize(eCParameterSpec);
        return a2.generateKeyPair();
    }

    public static ECParameterSpec e(b bVar) {
        int i2 = a.b[bVar.ordinal()];
        if (i2 == 1) {
            return j();
        }
        if (i2 == 2) {
            return k();
        }
        if (i2 == 3) {
            return l();
        }
        throw new NoSuchAlgorithmException("curve not implemented:" + bVar);
    }

    public static ECPrivateKey f(b bVar, byte[] bArr) {
        return (ECPrivateKey) a0.f9632k.a("EC").generatePrivate(new ECPrivateKeySpec(new BigInteger(1, bArr), e(bVar)));
    }

    public static ECPublicKey g(b bVar, byte[] bArr, byte[] bArr2) {
        ECParameterSpec e2 = e(bVar);
        ECPoint eCPoint = new ECPoint(new BigInteger(1, bArr), new BigInteger(1, bArr2));
        a(eCPoint, e2.getCurve());
        return (ECPublicKey) a0.f9632k.a("EC").generatePublic(new ECPublicKeySpec(eCPoint, e2));
    }

    public static BigInteger h(EllipticCurve ellipticCurve) {
        ECField field = ellipticCurve.getField();
        if (field instanceof ECFieldFp) {
            return ((ECFieldFp) field).getP();
        }
        throw new GeneralSecurityException("Only curves over prime order fields are supported");
    }

    private static ECParameterSpec i(String str, String str2, String str3, String str4, String str5) {
        BigInteger bigInteger = new BigInteger(str);
        return new ECParameterSpec(new EllipticCurve(new ECFieldFp(bigInteger), bigInteger.subtract(new BigInteger("3")), new BigInteger(str3, 16)), new ECPoint(new BigInteger(str4, 16), new BigInteger(str5, 16)), new BigInteger(str2), 1);
    }

    public static ECParameterSpec j() {
        return i("115792089210356248762697446949407573530086143415290314195533631308867097853951", "115792089210356248762697446949407573529996955224135760342422259061068512044369", "5ac635d8aa3a93e7b3ebbd55769886bc651d06b0cc53b0f63bce3c3e27d2604b", "6b17d1f2e12c4247f8bce6e563a440f277037d812deb33a0f4a13945d898c296", "4fe342e2fe1a7f9b8ee7eb4a7c0f9e162bce33576b315ececbb6406837bf51f5");
    }

    public static ECParameterSpec k() {
        return i("39402006196394479212279040100143613805079739270465446667948293404245721771496870329047266088258938001861606973112319", "39402006196394479212279040100143613805079739270465446667946905279627659399113263569398956308152294913554433653942643", "b3312fa7e23ee7e4988e056be3f82d19181d9c6efe8141120314088f5013875ac656398d8a2ed19d2a85c8edd3ec2aef", "aa87ca22be8b05378eb1c71ef320ad746e1d3b628ba79b9859f741e082542a385502f25dbf55296c3a545e3872760ab7", "3617de4a96262c6f5d9e98bf9292dc29f8f41dbd289a147ce9da3113b5f0b8c00a60b1ce1d7e819d7a431d7c90ea0e5f");
    }

    public static ECParameterSpec l() {
        return i("6864797660130609714981900799081393217269435300143305409394463459185543183397656052122559640661454554977296311391480858037121987999716643812574028291115057151", "6864797660130609714981900799081393217269435300143305409394463459185543183397655394245057746333217197532963996371363321113864768612440380340372808892707005449", "051953eb9618e1c9a1f929a21a0b68540eea2da725b99b315f3b8b489918ef109e156193951ec7e937b1652c0bd3bb1bf073573df883d2c34f1ef451fd46b503f00", "c6858e06b70404e9cd9e3ecb662395b4429c648139053fb521f828af606b4d3dbaa14b5e77efe75928fe1dc127a2ffa8de3348b3c1856a429bf97e7e31c2e5bd66", "11839296a789a3bc0045c8a5fb42c7d1bd998f54449579b446817afbd17273e662c97ee72995ef42640c550b9013fad0761353c7086a272c24088be94769fd16650");
    }
}
