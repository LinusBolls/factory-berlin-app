package e.r.a;

import android.content.Context;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;

/* compiled from: MasterKey */
public final class c {
    private final String a;

    /* compiled from: MasterKey */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[C0583c.values().length];
            a = iArr;
            try {
                iArr[C0583c.AES256_GCM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* compiled from: MasterKey */
    public static final class b {
        private final String a;
        private KeyGenParameterSpec b;
        private C0583c c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f8875d;

        /* renamed from: e  reason: collision with root package name */
        private int f8876e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f8877f;

        /* renamed from: g  reason: collision with root package name */
        private final Context f8878g;

        public b(Context context) {
            this(context, "_androidx_security_master_key_");
        }

        private c b() {
            if (this.c == null && this.b == null) {
                throw new IllegalArgumentException("build() called before setKeyGenParameterSpec or setKeyScheme.");
            }
            if (this.c == C0583c.AES256_GCM) {
                KeyGenParameterSpec.Builder keySize = new KeyGenParameterSpec.Builder(this.a, 3).setBlockModes(new String[]{"GCM"}).setEncryptionPaddings(new String[]{"NoPadding"}).setKeySize(256);
                if (this.f8875d) {
                    keySize.setUserAuthenticationRequired(true).setUserAuthenticationValidityDurationSeconds(this.f8876e);
                }
                if (Build.VERSION.SDK_INT >= 28 && this.f8877f && this.f8878g.getPackageManager().hasSystemFeature("android.hardware.strongbox_keystore")) {
                    keySize.setIsStrongBoxBacked(true);
                }
                this.b = keySize.build();
            }
            KeyGenParameterSpec keyGenParameterSpec = this.b;
            if (keyGenParameterSpec != null) {
                return new c(d.c(keyGenParameterSpec), this.b);
            }
            throw new NullPointerException("KeyGenParameterSpec was null after build() check");
        }

        public c a() {
            if (Build.VERSION.SDK_INT >= 23) {
                return b();
            }
            return new c(this.a, (Object) null);
        }

        public b c(C0583c cVar) {
            if (a.a[cVar.ordinal()] != 1) {
                throw new IllegalArgumentException("Unsupported scheme: " + cVar);
            } else if (Build.VERSION.SDK_INT < 23 || this.b == null) {
                this.c = cVar;
                return this;
            } else {
                throw new IllegalArgumentException("KeyScheme set after setting a KeyGenParamSpec");
            }
        }

        public b(Context context, String str) {
            this.f8878g = context.getApplicationContext();
            this.a = str;
        }
    }

    /* renamed from: e.r.a.c$c  reason: collision with other inner class name */
    /* compiled from: MasterKey */
    public enum C0583c {
        AES256_GCM
    }

    c(String str, Object obj) {
        this.a = str;
        if (Build.VERSION.SDK_INT >= 23) {
            KeyGenParameterSpec keyGenParameterSpec = (KeyGenParameterSpec) obj;
        }
    }

    /* access modifiers changed from: package-private */
    public String a() {
        return this.a;
    }

    public boolean b() {
        if (Build.VERSION.SDK_INT < 23) {
            return false;
        }
        try {
            KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
            instance.load((KeyStore.LoadStoreParameter) null);
            return instance.containsAlias(this.a);
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException unused) {
            return false;
        }
    }

    public String toString() {
        return "MasterKey{keyAlias=" + this.a + ", isKeyStoreBacked=" + b() + "}";
    }
}
