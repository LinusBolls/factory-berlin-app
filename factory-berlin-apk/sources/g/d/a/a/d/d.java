package g.d.a.a.d;

import android.content.Context;
import android.security.KeyPairGeneratorSpec;
import java.math.BigInteger;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.util.GregorianCalendar;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.security.auth.x500.X500Principal;

public class d {
    private final Cipher a = Cipher.getInstance("RSA/ECB/PKCS1Padding");
    private final KeyPair b;

    public d(Context context, String str) {
        KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
        instance.load((KeyStore.LoadStoreParameter) null);
        if (!instance.containsAlias(str)) {
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            GregorianCalendar gregorianCalendar2 = new GregorianCalendar();
            gregorianCalendar2.add(1, 100);
            KeyPairGeneratorSpec build = new KeyPairGeneratorSpec.Builder(context).setAlias(str).setSubject(new X500Principal("CN=".concat(String.valueOf(str)))).setSerialNumber(BigInteger.ONE).setStartDate(gregorianCalendar.getTime()).setEndDate(gregorianCalendar2.getTime()).build();
            KeyPairGenerator instance2 = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
            instance2.initialize(build);
            instance2.generateKeyPair();
        }
        KeyStore.PrivateKeyEntry privateKeyEntry = (KeyStore.PrivateKeyEntry) instance.getEntry(str, (KeyStore.ProtectionParameter) null);
        this.b = new KeyPair(privateKeyEntry.getCertificate().getPublicKey(), privateKeyEntry.getPrivateKey());
    }

    public SecretKey a(byte[] bArr) {
        this.a.init(4, this.b.getPrivate());
        return (SecretKey) this.a.unwrap(bArr, "AES", 3);
    }

    public byte[] b(SecretKey secretKey) {
        this.a.init(3, this.b.getPublic());
        return this.a.wrap(secretKey);
    }
}
