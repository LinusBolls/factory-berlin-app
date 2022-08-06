package g.b.c.a.e0.a;

import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import g.b.c.a.k0.l0;
import g.b.c.a.k0.r0;
import g.b.c.a.o;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.util.Arrays;
import java.util.Locale;
import javax.crypto.KeyGenerator;

/* compiled from: AndroidKeystoreKmsClient */
public final class c implements o {
    private final String a;
    private final KeyStore b;

    /* compiled from: AndroidKeystoreKmsClient */
    public static final class b {
        String a = null;
        KeyStore b = null;

        public b() {
            if (c.f()) {
                try {
                    KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
                    this.b = instance;
                    instance.load((KeyStore.LoadStoreParameter) null);
                } catch (IOException | GeneralSecurityException e2) {
                    throw new IllegalStateException(e2);
                }
            } else {
                throw new IllegalStateException("need Android Keystore on Android M or newer");
            }
        }

        public c a() {
            return new c(this);
        }

        public b b(KeyStore keyStore) {
            if (keyStore != null) {
                this.b = keyStore;
                return this;
            }
            throw new IllegalArgumentException("val cannot be null");
        }
    }

    public static void d(String str) {
        if (!new c().e(str)) {
            String b2 = r0.b("android-keystore://", str);
            KeyGenerator instance = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            instance.init(new KeyGenParameterSpec.Builder(b2, 3).setKeySize(256).setBlockModes(new String[]{"GCM"}).setEncryptionPaddings(new String[]{"NoPadding"}).build());
            instance.generateKey();
            return;
        }
        throw new IllegalArgumentException(String.format("cannot generate a new key %s because it already exists; please delete it with deleteKey() and try again", new Object[]{str}));
    }

    /* access modifiers changed from: private */
    public static boolean f() {
        return Build.VERSION.SDK_INT >= 23;
    }

    private static g.b.c.a.a g(g.b.c.a.a aVar) {
        byte[] c = l0.c(10);
        byte[] bArr = new byte[0];
        if (Arrays.equals(c, aVar.b(aVar.a(c, bArr), bArr))) {
            return aVar;
        }
        throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
    }

    public boolean a(String str) {
        String str2 = this.a;
        if (str2 != null && str2.equals(str)) {
            return true;
        }
        if (this.a != null || !str.toLowerCase(Locale.US).startsWith("android-keystore://")) {
            return false;
        }
        return true;
    }

    public g.b.c.a.a b(String str) {
        String str2 = this.a;
        if (str2 == null || str2.equals(str)) {
            b bVar = new b(r0.b("android-keystore://", str), this.b);
            g(bVar);
            return bVar;
        }
        throw new GeneralSecurityException(String.format("this client is bound to %s, cannot load keys bound to %s", new Object[]{this.a, str}));
    }

    /* access modifiers changed from: package-private */
    public boolean e(String str) {
        return this.b.containsAlias(r0.b("android-keystore://", str));
    }

    public c() {
        this(new b());
    }

    private c(b bVar) {
        this.a = bVar.a;
        this.b = bVar.b;
    }
}
