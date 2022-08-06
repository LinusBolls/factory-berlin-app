package de.baimos;

import de.baimos.blueid.sdk.metrics.AndroidSdkMetrics;
import java.security.Key;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.spec.ECGenParameterSpec;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class bc extends ay {
    private static final dr a = ds.a(bc.class);
    private Map<String, Object> b = new ConcurrentHashMap();

    public bc() {
        a.c("Using TestCryptoProvider");
    }

    public Key a(String str) {
        if (!this.b.containsKey(str)) {
            return null;
        }
        Object obj = this.b.get(str);
        if (obj instanceof SecretKey) {
            return (SecretKey) obj;
        }
        if (obj instanceof KeyPair) {
            return ((KeyPair) obj).getPrivate();
        }
        throw new RuntimeException("unknown store entry type " + obj.getClass());
    }

    public Key a(String str, String str2) {
        SecretKey generateKey = KeyGenerator.getInstance("AES").generateKey();
        Map<String, Object> map = this.b;
        map.put(str + "_" + str2, generateKey);
        return generateKey;
    }

    public KeyPair a(int i2, String str, String str2) {
        KeyPairGenerator instance = KeyPairGenerator.getInstance("RSA");
        instance.initialize(i2);
        KeyPair generateKeyPair = instance.generateKeyPair();
        Map<String, Object> map = this.b;
        map.put(str + "_" + str2, generateKeyPair);
        return generateKeyPair;
    }

    public KeyPair a(String str, String str2, String str3) {
        KeyPairGenerator instance = KeyPairGenerator.getInstance("EC");
        instance.initialize(new ECGenParameterSpec(str));
        KeyPair generateKeyPair = instance.generateKeyPair();
        Map<String, Object> map = this.b;
        map.put(str2 + "_" + str3, generateKeyPair);
        return generateKeyPair;
    }

    public PrivateKey a(String str, String str2, AndroidSdkMetrics androidSdkMetrics) {
        Map<String, Object> map = this.b;
        KeyPair keyPair = (KeyPair) map.get(str + "_" + str2);
        if (keyPair != null) {
            return keyPair.getPrivate();
        }
        dr drVar = a;
        drVar.b("did not find private key '" + str + "_" + str2 + "'! keys contained: " + this.b.keySet());
        return null;
    }

    public Cipher a(int i2, Key key, byte[] bArr) {
        return a("AES/CBC/PKCS5Padding", i2, key, bArr);
    }

    public Set<String> b() {
        return this.b.keySet();
    }

    public void b(String str) {
        this.b.remove(str);
    }
}
