package g.e.n.e;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.k;

/* compiled from: Encryptor.kt */
public final class a {
    public static final a a = new a();

    private a() {
    }

    private final Cipher a(int i2, byte[] bArr, byte[] bArr2) {
        Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
        instance.init(i2, new SecretKeySpec(bArr, "AES"), new IvParameterSpec(bArr2));
        k.d(instance, "Cipher.getInstance(TRANS…tialisationVector))\n\t\t\t\t}");
        return instance;
    }

    public final byte[] b(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        k.e(bArr, "secret");
        k.e(bArr2, "input");
        k.e(bArr3, "initialisationVector");
        byte[] doFinal = a(1, bArr, bArr3).doFinal(bArr2);
        k.d(doFinal, "cipher(Cipher.ENCRYPT_MO…ctor)\n\t\t\t\t.doFinal(input)");
        return doFinal;
    }
}
