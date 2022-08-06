package g.b.c.a.k0;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: AesGcmJce */
public final class f implements g.b.c.a.a {
    private static final ThreadLocal<Cipher> b = new a();
    private final SecretKey a;

    /* compiled from: AesGcmJce */
    class a extends ThreadLocal<Cipher> {
        a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Cipher initialValue() {
            try {
                return a0.f9627f.a("AES/GCM/NoPadding");
            } catch (GeneralSecurityException e2) {
                throw new IllegalStateException(e2);
            }
        }
    }

    public f(byte[] bArr) {
        r0.a(bArr.length);
        this.a = new SecretKeySpec(bArr, "AES");
    }

    private static AlgorithmParameterSpec c(byte[] bArr) {
        return d(bArr, 0, bArr.length);
    }

    private static AlgorithmParameterSpec d(byte[] bArr, int i2, int i3) {
        try {
            Class.forName("javax.crypto.spec.GCMParameterSpec");
            return new GCMParameterSpec(128, bArr, i2, i3);
        } catch (ClassNotFoundException unused) {
            if (q0.c()) {
                return new IvParameterSpec(bArr, i2, i3);
            }
            throw new GeneralSecurityException("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
        }
    }

    public byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr.length <= 2147483619) {
            byte[] bArr3 = new byte[(bArr.length + 12 + 16)];
            byte[] c = l0.c(12);
            System.arraycopy(c, 0, bArr3, 0, 12);
            b.get().init(1, this.a, c(c));
            if (!(bArr2 == null || bArr2.length == 0)) {
                b.get().updateAAD(bArr2);
            }
            int doFinal = b.get().doFinal(bArr, 0, bArr.length, bArr3, 12);
            if (doFinal == bArr.length + 16) {
                return bArr3;
            }
            throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", new Object[]{16, Integer.valueOf(doFinal - bArr.length)}));
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    public byte[] b(byte[] bArr, byte[] bArr2) {
        if (bArr.length >= 28) {
            b.get().init(2, this.a, d(bArr, 0, 12));
            if (!(bArr2 == null || bArr2.length == 0)) {
                b.get().updateAAD(bArr2);
            }
            return b.get().doFinal(bArr, 12, bArr.length - 12);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
