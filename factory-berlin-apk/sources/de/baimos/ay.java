package de.baimos;

import de.baimos.blueid.sdk.metrics.AndroidSdkMetrics;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.Signature;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;

public abstract class ay {

    /* renamed from: d  reason: collision with root package name */
    public static String f8207d = "AndroidKeyStore";

    public ba a(PrivateKey privateKey) {
        String algorithm = privateKey.getAlgorithm();
        if ("RSA".equals(algorithm)) {
            return ba.SHA256withRSA;
        }
        if ("EC".equals(algorithm)) {
            return ba.SHA256withECDSA;
        }
        throw new InvalidKeyException("Expected either RSA or EC private key but was " + algorithm);
    }

    public Key a(String str) {
        throw new UnsupportedOperationException();
    }

    public Key a(String str, String str2) {
        throw new UnsupportedOperationException();
    }

    public KeyPair a(int i2, String str, String str2) {
        throw new UnsupportedOperationException();
    }

    public KeyPair a(String str, String str2, String str3) {
        throw new UnsupportedOperationException();
    }

    public PrivateKey a(String str, String str2, AndroidSdkMetrics androidSdkMetrics) {
        throw new UnsupportedOperationException();
    }

    public Signature a(PrivateKey privateKey, ba baVar) {
        try {
            a();
            Signature instance = Signature.getInstance(baVar.name());
            instance.initSign(privateKey);
            return instance;
        } finally {
            c();
        }
    }

    public Cipher a(int i2, Key key) {
        return a("RSA/ECB/PKCS1Padding", i2, key, (byte[]) null);
    }

    public Cipher a(int i2, Key key, byte[] bArr) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public Cipher a(String str, int i2, Key key, byte[] bArr) {
        try {
            a();
            Cipher instance = Cipher.getInstance(str);
            if (bArr == null) {
                instance.init(i2, key);
            } else {
                instance.init(i2, key, new IvParameterSpec(bArr));
            }
            return instance;
        } finally {
            c();
        }
    }

    public void a() {
    }

    public Set<String> b() {
        throw new UnsupportedOperationException();
    }

    public void b(String str) {
        throw new UnsupportedOperationException();
    }

    public void c() {
    }
}
