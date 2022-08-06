package g.b.c.a.k0;

import g.b.c.a.w;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.interfaces.RSAPublicKey;
import java.util.Arrays;

/* compiled from: RsaSsaPssVerifyJce */
public final class p0 implements w {
    private final RSAPublicKey a;
    private final c0 b;
    private final c0 c;

    /* renamed from: d  reason: collision with root package name */
    private final int f9660d;

    public p0(RSAPublicKey rSAPublicKey, c0 c0Var, c0 c0Var2, int i2) {
        r0.d(c0Var);
        r0.c(rSAPublicKey.getModulus().bitLength());
        this.a = rSAPublicKey;
        this.b = c0Var;
        this.c = c0Var2;
        this.f9660d = i2;
    }

    private void a(byte[] bArr, byte[] bArr2, int i2) {
        byte[] bArr3 = bArr2;
        r0.d(this.b);
        MessageDigest a2 = a0.f9630i.a(q0.e(this.b));
        byte[] digest = a2.digest(bArr);
        int digestLength = a2.getDigestLength();
        int length = bArr3.length;
        if (length < this.f9660d + digestLength + 2) {
            throw new GeneralSecurityException("inconsistent");
        } else if (bArr3[bArr3.length - 1] == -68) {
            int i3 = length - digestLength;
            int i4 = i3 - 1;
            byte[] copyOf = Arrays.copyOf(bArr3, i4);
            byte[] copyOfRange = Arrays.copyOfRange(bArr3, copyOf.length, copyOf.length + digestLength);
            int i5 = 0;
            while (true) {
                int i6 = i4;
                MessageDigest messageDigest = a2;
                byte[] bArr4 = digest;
                long j2 = (((long) length) * 8) - ((long) i2);
                if (((long) i5) < j2) {
                    if (((copyOf[i5 / 8] >> (7 - (i5 % 8))) & 1) == 0) {
                        i5++;
                        i4 = i6;
                        a2 = messageDigest;
                        digest = bArr4;
                    } else {
                        throw new GeneralSecurityException("inconsistent");
                    }
                } else {
                    byte[] d2 = q0.d(copyOfRange, i6, this.c);
                    int length2 = d2.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i7 = 0; i7 < length2; i7++) {
                        bArr5[i7] = (byte) (d2[i7] ^ copyOf[i7]);
                    }
                    for (int i8 = 0; ((long) i8) <= j2; i8++) {
                        int i9 = i8 / 8;
                        bArr5[i9] = (byte) ((~(1 << (7 - (i8 % 8)))) & bArr5[i9]);
                    }
                    int i10 = 0;
                    while (true) {
                        int i11 = this.f9660d;
                        if (i10 < (i3 - i11) - 2) {
                            if (bArr5[i10] == 0) {
                                i10++;
                            } else {
                                throw new GeneralSecurityException("inconsistent");
                            }
                        } else if (bArr5[(i3 - i11) - 2] == 1) {
                            byte[] copyOfRange2 = Arrays.copyOfRange(bArr5, length2 - i11, length2);
                            int i12 = digestLength + 8;
                            byte[] bArr6 = new byte[(this.f9660d + i12)];
                            byte[] bArr7 = bArr4;
                            System.arraycopy(bArr7, 0, bArr6, 8, bArr7.length);
                            System.arraycopy(copyOfRange2, 0, bArr6, i12, copyOfRange2.length);
                            if (!j.b(messageDigest.digest(bArr6), copyOfRange)) {
                                throw new GeneralSecurityException("inconsistent");
                            }
                            return;
                        } else {
                            throw new GeneralSecurityException("inconsistent");
                        }
                    }
                }
            }
        } else {
            throw new GeneralSecurityException("inconsistent");
        }
    }

    public void b(byte[] bArr, byte[] bArr2) {
        BigInteger publicExponent = this.a.getPublicExponent();
        BigInteger modulus = this.a.getModulus();
        int bitLength = (modulus.bitLength() + 7) / 8;
        int bitLength2 = ((modulus.bitLength() - 1) + 7) / 8;
        if (bitLength == bArr.length) {
            BigInteger a2 = q0.a(bArr);
            if (a2.compareTo(modulus) < 0) {
                a(bArr2, q0.b(a2.modPow(publicExponent, modulus), bitLength2), modulus.bitLength() - 1);
                return;
            }
            throw new GeneralSecurityException("signature out of range");
        }
        throw new GeneralSecurityException("invalid signature's length");
    }
}
