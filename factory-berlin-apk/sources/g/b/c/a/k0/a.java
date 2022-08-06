package g.b.c.a.k0;

import g.b.c.a.q;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: AesCmac */
public final class a implements q {
    private final SecretKey a;
    private final int b;
    private byte[] c;

    /* renamed from: d  reason: collision with root package name */
    private byte[] f9624d;

    public a(byte[] bArr, int i2) {
        r0.a(bArr.length);
        if (i2 < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, min is 10 bytes");
        } else if (i2 <= 16) {
            this.a = new SecretKeySpec(bArr, "AES");
            this.b = i2;
            c();
        } else {
            throw new InvalidAlgorithmParameterException("tag size too large, max is 16 bytes");
        }
    }

    private void c() {
        Cipher d2 = d();
        d2.init(1, this.a);
        byte[] b2 = h.b(d2.doFinal(new byte[16]));
        this.c = b2;
        this.f9624d = h.b(b2);
    }

    private static Cipher d() {
        return a0.f9627f.a("AES/ECB/NoPadding");
    }

    public void a(byte[] bArr, byte[] bArr2) {
        if (!j.b(bArr, b(bArr2))) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }

    public byte[] b(byte[] bArr) {
        byte[] bArr2;
        Cipher d2 = d();
        d2.init(1, this.a);
        int max = Math.max(1, (int) Math.ceil(((double) bArr.length) / 16.0d));
        if (max * 16 == bArr.length) {
            bArr2 = j.d(bArr, (max - 1) * 16, this.c, 0, 16);
        } else {
            bArr2 = j.e(h.a(Arrays.copyOfRange(bArr, (max - 1) * 16, bArr.length)), this.f9624d);
        }
        byte[] bArr3 = new byte[16];
        for (int i2 = 0; i2 < max - 1; i2++) {
            bArr3 = d2.doFinal(j.d(bArr3, 0, bArr, i2 * 16, 16));
        }
        byte[] e2 = j.e(bArr2, bArr3);
        byte[] bArr4 = new byte[this.b];
        System.arraycopy(d2.doFinal(e2), 0, bArr4, 0, this.b);
        return bArr4;
    }
}
