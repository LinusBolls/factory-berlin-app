package g.b.c.a.k0;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: AesCtrJceCipher */
public final class c implements g0 {

    /* renamed from: d  reason: collision with root package name */
    private static final ThreadLocal<Cipher> f9633d = new a();
    private final SecretKeySpec a;
    private final int b;
    private final int c;

    /* compiled from: AesCtrJceCipher */
    class a extends ThreadLocal<Cipher> {
        a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Cipher initialValue() {
            try {
                return a0.f9627f.a("AES/CTR/NoPadding");
            } catch (GeneralSecurityException e2) {
                throw new IllegalStateException(e2);
            }
        }
    }

    public c(byte[] bArr, int i2) {
        r0.a(bArr.length);
        this.a = new SecretKeySpec(bArr, "AES");
        int blockSize = f9633d.get().getBlockSize();
        this.c = blockSize;
        if (i2 < 12 || i2 > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.b = i2;
    }

    private void c(byte[] bArr, int i2, int i3, byte[] bArr2, int i4, byte[] bArr3, boolean z) {
        Cipher cipher = f9633d.get();
        byte[] bArr4 = new byte[this.c];
        System.arraycopy(bArr3, 0, bArr4, 0, this.b);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        if (z) {
            cipher.init(1, this.a, ivParameterSpec);
        } else {
            cipher.init(2, this.a, ivParameterSpec);
        }
        if (cipher.doFinal(bArr, i2, i3, bArr2, i4) != i3) {
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
    }

    public byte[] a(byte[] bArr) {
        int length = bArr.length;
        int i2 = this.b;
        if (length <= Integer.MAX_VALUE - i2) {
            byte[] bArr2 = new byte[(bArr.length + i2)];
            byte[] c2 = l0.c(i2);
            System.arraycopy(c2, 0, bArr2, 0, this.b);
            c(bArr, 0, bArr.length, bArr2, this.b, c2, true);
            return bArr2;
        }
        throw new GeneralSecurityException("plaintext length can not exceed " + (Integer.MAX_VALUE - this.b));
    }

    public byte[] b(byte[] bArr) {
        int length = bArr.length;
        int i2 = this.b;
        if (length >= i2) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, 0, bArr2, 0, i2);
            int length2 = bArr.length;
            int i3 = this.b;
            byte[] bArr3 = new byte[(length2 - i3)];
            c(bArr, i3, bArr.length - i3, bArr3, 0, bArr2, false);
            return bArr3;
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
