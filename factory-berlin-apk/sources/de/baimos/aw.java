package de.baimos;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.security.KeyPairGeneratorSpec;
import android.security.keystore.KeyGenParameterSpec;
import de.baimos.blueid.sdk.metrics.AndroidSdkMetrics;
import java.math.BigInteger;
import java.security.Key;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.Security;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.ECGenParameterSpec;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.security.auth.x500.X500Principal;

class aw extends ay {

    /* renamed from: e  reason: collision with root package name */
    private static final dr f8204e = ds.a(aw.class);
    private Context a;
    private boolean b;
    private KeyStore c;

    /* renamed from: f  reason: collision with root package name */
    private boolean f8205f;

    /* renamed from: g  reason: collision with root package name */
    private int f8206g;

    public aw(Context context) {
        this.a = context;
        if (context != null) {
            this.b = Build.VERSION.SDK_INT < 23 || Boolean.getBoolean("de.baimos.blueid.sdk.force43");
            this.f8205f = d();
            try {
                KeyStore instance = KeyStore.getInstance(ay.f8207d);
                this.c = instance;
                instance.load((KeyStore.LoadStoreParameter) null);
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
        } else {
            throw new IllegalArgumentException("context must not be null");
        }
    }

    private int a(Provider provider) {
        Provider[] providers = Security.getProviders();
        int length = providers.length;
        int i2 = 1;
        int i3 = 0;
        while (i3 < length && providers[i3] != provider) {
            i2++;
            i3++;
        }
        return i2;
    }

    private static String b(String str, String str2) {
        return str + "_" + str2;
    }

    private static int c(String str) {
        if (str.startsWith("secp")) {
            return Integer.parseInt(str.substring(4, 7));
        }
        throw new IllegalArgumentException("Only secp***r1 curves are allowed!");
    }

    private boolean d() {
        boolean z = true;
        boolean z2 = Boolean.getBoolean("net.blueid.sdk.ENABLE_SPONGYCASTLE_WORKAROUND") || Boolean.getBoolean("net.blueid.sdk.ENABLE_SPONGYCASTLE_COEXISTENCE");
        Provider provider = Security.getProvider("SC");
        if (provider == null || !provider.getClass().getName().startsWith("org.spongycastle")) {
            z = false;
        }
        if (z2) {
            if (z) {
                f8204e.c("Workaround for SpongyCastle is active.");
            } else {
                f8204e.c("Workaround for SpongyCastle was activated but SpongyCastle is not present. Ignoring it.");
                return false;
            }
        } else if (z) {
            f8204e.b("WARNING: SpongyCastle detected! This may lead to unintended behavior or break things. Please refer to our BlueID documentation for further information.");
        }
        return z2;
    }

    public Key a(String str) {
        KeyStore.Entry entry = this.c.getEntry(str, (KeyStore.ProtectionParameter) null);
        if (entry == null) {
            return null;
        }
        if (entry instanceof KeyStore.SecretKeyEntry) {
            return ((KeyStore.SecretKeyEntry) entry).getSecretKey();
        }
        if (entry instanceof KeyStore.PrivateKeyEntry) {
            return ((KeyStore.PrivateKeyEntry) entry).getPrivateKey();
        }
        throw new RuntimeException("unknown store entry type " + entry.getClass());
    }

    public Key a(String str, String str2) {
        KeyGenerator instance = KeyGenerator.getInstance("AES", ay.f8207d);
        String b2 = b(str, str2);
        if (!this.b) {
            instance.init(new KeyGenParameterSpec.Builder(b2, 3).setBlockModes(new String[]{"CBC"}).setEncryptionPaddings(new String[]{"PKCS7Padding"}).build());
        }
        return instance.generateKey();
    }

    @SuppressLint({"WrongConstant"})
    public KeyPair a(int i2, String str, String str2) {
        AlgorithmParameterSpec algorithmParameterSpec;
        try {
            a();
            KeyPairGenerator instance = KeyPairGenerator.getInstance("RSA", ay.f8207d);
            String b2 = b(str, str2);
            if (this.b) {
                KeyPairGeneratorSpec.Builder keySize = new KeyPairGeneratorSpec.Builder(this.a).setAlias(b2).setKeyType("RSA").setKeySize(i2);
                algorithmParameterSpec = keySize.setSubject(new X500Principal("CN=" + b2)).setSerialNumber(BigInteger.ONE).setStartDate(new Date(0)).setEndDate(new Date(4102444800000L)).build();
            } else if (Build.VERSION.SDK_INT >= 23) {
                algorithmParameterSpec = new KeyGenParameterSpec.Builder(b2, 15).setKeySize(i2).setDigests(new String[]{"SHA-256", "SHA-512"}).setSignaturePaddings(new String[]{"PKCS1"}).setEncryptionPaddings(new String[]{"PKCS1Padding"}).build();
            } else {
                throw new RuntimeException("Invalid key RSA generator settings");
            }
            instance.initialize(algorithmParameterSpec);
            return instance.generateKeyPair();
        } finally {
            c();
        }
    }

    @SuppressLint({"WrongConstant"})
    public KeyPair a(String str, String str2, String str3) {
        KeyPairGenerator keyPairGenerator;
        AlgorithmParameterSpec algorithmParameterSpec;
        try {
            a();
            String b2 = b(str2, str3);
            if (this.b) {
                keyPairGenerator = KeyPairGenerator.getInstance("RSA", ay.f8207d);
                KeyPairGeneratorSpec.Builder keySize = new KeyPairGeneratorSpec.Builder(this.a).setAlias(b2).setKeyType("EC").setKeySize(c(str));
                algorithmParameterSpec = keySize.setSubject(new X500Principal("CN=" + b2)).setSerialNumber(new BigInteger(b2.getBytes())).setStartDate(new Date(0)).setEndDate(new Date(4102444800000L)).build();
            } else if (Build.VERSION.SDK_INT >= 23) {
                keyPairGenerator = KeyPairGenerator.getInstance("EC", ay.f8207d);
                algorithmParameterSpec = new KeyGenParameterSpec.Builder(b2, 12).setAlgorithmParameterSpec(new ECGenParameterSpec(str)).setDigests(new String[]{"SHA-256", "SHA-512", "NONE"}).build();
            } else {
                throw new RuntimeException("Invalid EC key generator settings");
            }
            keyPairGenerator.initialize(algorithmParameterSpec);
            return keyPairGenerator.generateKeyPair();
        } finally {
            c();
        }
    }

    public PrivateKey a(String str, String str2, AndroidSdkMetrics androidSdkMetrics) {
        try {
            return Build.VERSION.SDK_INT > 26 ? (PrivateKey) this.c.getKey(b(str, str2), (char[]) null) : ((KeyStore.PrivateKeyEntry) this.c.getEntry(b(str, str2), (KeyStore.ProtectionParameter) null)).getPrivateKey();
        } catch (Exception e2) {
            androidSdkMetrics.addMessage(e2);
            return null;
        }
    }

    public Cipher a(int i2, Key key, byte[] bArr) {
        return a("AES/CBC/PKCS7Padding", i2, key, bArr);
    }

    public void a() {
        if (this.f8205f) {
            Provider provider = Security.getProvider("SC");
            this.f8206g = a(provider);
            Security.removeProvider(provider.getName());
            Security.addProvider(provider);
            dr drVar = f8204e;
            drVar.c("Moving SpongyCastle at last position from " + this.f8206g);
        }
    }

    public Set<String> b() {
        return new HashSet(Collections.list(this.c.aliases()));
    }

    public void b(String str) {
        this.c.deleteEntry(str);
    }

    public void c() {
        if (this.f8205f) {
            Provider provider = Security.getProvider("SC");
            Security.removeProvider(provider.getName());
            int insertProviderAt = Security.insertProviderAt(provider, this.f8206g);
            dr drVar = f8204e;
            drVar.c("Restored SpongyCastle at position " + insertProviderAt);
        }
    }
}
