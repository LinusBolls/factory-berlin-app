package g.b.c.a.k0;

import g.b.c.a.d;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.Collection;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: AesSiv */
public final class g implements d {
    private static final Collection<Integer> c = Arrays.asList(new Integer[]{64});

    /* renamed from: d  reason: collision with root package name */
    private static final byte[] f9643d = new byte[16];

    /* renamed from: e  reason: collision with root package name */
    private static final byte[] f9644e = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};
    private final a a;
    private final byte[] b;

    public g(byte[] bArr) {
        if (c.contains(Integer.valueOf(bArr.length))) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length / 2);
            this.b = Arrays.copyOfRange(bArr, bArr.length / 2, bArr.length);
            this.a = new a(copyOfRange, 16);
            return;
        }
        throw new InvalidKeyException("invalid key size: " + bArr.length + " bytes; key must have 64 bytes");
    }

    private byte[] c(byte[]... bArr) {
        byte[] bArr2;
        byte[] bArr3;
        if (bArr.length == 0) {
            return this.a.b(f9644e);
        }
        byte[] b2 = this.a.b(f9643d);
        for (int i2 = 0; i2 < bArr.length - 1; i2++) {
            if (bArr[i2] == null) {
                bArr3 = new byte[0];
            } else {
                bArr3 = bArr[i2];
            }
            b2 = j.e(h.b(b2), this.a.b(bArr3));
        }
        byte[] bArr4 = bArr[bArr.length - 1];
        if (bArr4.length >= 16) {
            bArr2 = j.f(bArr4, b2);
        } else {
            bArr2 = j.e(h.a(bArr4), h.b(b2));
        }
        return this.a.b(bArr2);
    }

    public byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr.length <= 2147483631) {
            Cipher a2 = a0.f9627f.a("AES/CTR/NoPadding");
            byte[] c2 = c(bArr2, bArr);
            byte[] bArr3 = (byte[]) c2.clone();
            bArr3[8] = (byte) (bArr3[8] & Byte.MAX_VALUE);
            bArr3[12] = (byte) (bArr3[12] & Byte.MAX_VALUE);
            a2.init(1, new SecretKeySpec(this.b, "AES"), new IvParameterSpec(bArr3));
            return j.a(c2, a2.doFinal(bArr));
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    public byte[] b(byte[] bArr, byte[] bArr2) {
        if (bArr.length >= 16) {
            Cipher a2 = a0.f9627f.a("AES/CTR/NoPadding");
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 16);
            byte[] bArr3 = (byte[]) copyOfRange.clone();
            bArr3[8] = (byte) (bArr3[8] & Byte.MAX_VALUE);
            bArr3[12] = (byte) (bArr3[12] & Byte.MAX_VALUE);
            a2.init(2, new SecretKeySpec(this.b, "AES"), new IvParameterSpec(bArr3));
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 16, bArr.length);
            byte[] doFinal = a2.doFinal(copyOfRange2);
            if (copyOfRange2.length == 0 && doFinal == null && q0.c()) {
                doFinal = new byte[0];
            }
            if (j.b(copyOfRange, c(bArr2, doFinal))) {
                return doFinal;
            }
            throw new AEADBadTagException("Integrity check failed.");
        }
        throw new GeneralSecurityException("Ciphertext too short.");
    }
}
