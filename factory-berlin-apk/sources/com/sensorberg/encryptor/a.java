package com.sensorberg.encryptor;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.security.KeyPairGeneratorSpec;
import android.security.keystore.KeyGenParameterSpec;
import java.math.BigInteger;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import java.util.Calendar;
import javax.security.auth.x500.X500Principal;
import kotlin.TypeCastException;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.x;

/* compiled from: AndroidKeyStore.kt */
public final class a {
    private final String a = "RSA";
    private final String b = "AndroidKeyStore";
    private final Calendar c = Calendar.getInstance();

    /* renamed from: d  reason: collision with root package name */
    private final Calendar f5071d;

    /* renamed from: e  reason: collision with root package name */
    private final String f5072e;

    /* renamed from: f  reason: collision with root package name */
    private final String f5073f;

    /* renamed from: g  reason: collision with root package name */
    private final Context f5074g;

    /* renamed from: com.sensorberg.encryptor.a$a  reason: collision with other inner class name */
    /* compiled from: AndroidKeyStore.kt */
    public static final class C0157a {
        private final PrivateKey a;
        private final PublicKey b;

        public C0157a(PrivateKey privateKey, PublicKey publicKey) {
            k.f(privateKey, "privateKey");
            k.f(publicKey, "publicKey");
            this.a = privateKey;
            this.b = publicKey;
        }

        public final PrivateKey a() {
            return this.a;
        }

        public final PublicKey b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0157a)) {
                return false;
            }
            C0157a aVar = (C0157a) obj;
            return k.a(this.a, aVar.a) && k.a(this.b, aVar.b);
        }

        public int hashCode() {
            PrivateKey privateKey = this.a;
            int i2 = 0;
            int hashCode = (privateKey != null ? privateKey.hashCode() : 0) * 31;
            PublicKey publicKey = this.b;
            if (publicKey != null) {
                i2 = publicKey.hashCode();
            }
            return hashCode + i2;
        }

        public String toString() {
            return "AndroidKeyPair(privateKey=" + this.a + ", publicKey=" + this.b + ")";
        }
    }

    public a(String str, String str2, Context context) {
        k.f(str, "alias");
        k.f(str2, "keyAlias");
        k.f(context, "context");
        this.f5072e = str;
        this.f5073f = str2;
        this.f5074g = context;
        Calendar instance = Calendar.getInstance();
        this.f5071d = instance;
        instance.add(1, 20);
    }

    private final AlgorithmParameterSpec c(Context context, String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return d(str);
        }
        return e(context, str);
    }

    @TargetApi(23)
    private final AlgorithmParameterSpec d(String str) {
        KeyGenParameterSpec.Builder encryptionPaddings = new KeyGenParameterSpec.Builder(str, 3).setBlockModes(new String[]{"CBC"}).setEncryptionPaddings(new String[]{"PKCS1Padding"});
        Calendar calendar = this.c;
        k.b(calendar, "START_DATE");
        KeyGenParameterSpec.Builder keyValidityStart = encryptionPaddings.setKeyValidityStart(calendar.getTime());
        Calendar calendar2 = this.f5071d;
        k.b(calendar2, "END_DATE");
        KeyGenParameterSpec build = keyValidityStart.setKeyValidityEnd(calendar2.getTime()).build();
        k.b(build, "KeyGenParameterSpec.Buil…ND_DATE.time)\n\t\t\t.build()");
        return build;
    }

    private final AlgorithmParameterSpec e(Context context, String str) {
        KeyPairGeneratorSpec.Builder alias = new KeyPairGeneratorSpec.Builder(context).setAlias(str);
        Calendar calendar = this.c;
        k.b(calendar, "START_DATE");
        KeyPairGeneratorSpec.Builder startDate = alias.setStartDate(calendar.getTime());
        Calendar calendar2 = this.f5071d;
        k.b(calendar2, "END_DATE");
        KeyPairGeneratorSpec.Builder endDate = startDate.setEndDate(calendar2.getTime());
        x xVar = x.a;
        String format = String.format("CN=%s, O=%s, C=Germany", Arrays.copyOf(new Object[]{str, context.getPackageName()}, 2));
        k.b(format, "java.lang.String.format(format, *args)");
        KeyPairGeneratorSpec build = endDate.setSubject(new X500Principal(format)).setSerialNumber(BigInteger.ONE).build();
        k.b(build, "KeyPairGeneratorSpec.Bui…gInteger.ONE)\n\t\t\t.build()");
        return build;
    }

    private final KeyPairGenerator f(Context context, String str) {
        KeyPairGenerator instance = KeyPairGenerator.getInstance(this.a, this.b);
        instance.initialize(c(context, str));
        k.b(instance, "kpg");
        return instance;
    }

    public final void a() {
        n.a.a.k(this.f5072e + ". Destroying keys from the AndroidKeyStore", new Object[0]);
        KeyStore instance = KeyStore.getInstance(this.b);
        instance.load((KeyStore.LoadStoreParameter) null);
        if (instance.containsAlias(this.f5073f)) {
            instance.deleteEntry(this.f5073f);
        }
    }

    public final C0157a b() {
        n.a.a.j(this.f5072e + ". Generating new key from the AndroidKeyStore", new Object[0]);
        KeyStore instance = KeyStore.getInstance(this.b);
        instance.load((KeyStore.LoadStoreParameter) null);
        if (!instance.containsAlias(this.f5073f)) {
            KeyPair generateKeyPair = f(this.f5074g, this.f5073f).generateKeyPair();
            k.b(generateKeyPair, "keyPair");
            PrivateKey privateKey = generateKeyPair.getPrivate();
            PublicKey publicKey = generateKeyPair.getPublic();
            if (privateKey == null || publicKey == null) {
                throw new IllegalStateException("Failed to generate keys from AndroidKeyStore");
            }
            n.a.a.a(this.f5072e + ". Successfully generated keys from AndroidKeyStore", new Object[0]);
            return new C0157a(privateKey, publicKey);
        }
        throw new IllegalStateException("AndroidKeyStore already contains this key");
    }

    public final C0157a g() {
        n.a.a.j(this.f5072e + ". Restoring key from the AndroidKeyStore", new Object[0]);
        KeyStore instance = KeyStore.getInstance(this.b);
        instance.load((KeyStore.LoadStoreParameter) null);
        if (instance.containsAlias(this.f5073f)) {
            KeyStore.Entry entry = instance.getEntry(this.f5073f, (KeyStore.ProtectionParameter) null);
            if (entry != null) {
                KeyStore.PrivateKeyEntry privateKeyEntry = (KeyStore.PrivateKeyEntry) entry;
                PrivateKey privateKey = privateKeyEntry.getPrivateKey();
                Certificate certificate = privateKeyEntry.getCertificate();
                k.b(certificate, "privateKeyEntry.certificate");
                PublicKey publicKey = certificate.getPublicKey();
                if (privateKey == null || publicKey == null) {
                    throw new IllegalStateException("Failed to restore keys from AndroidKeyStore");
                }
                n.a.a.a(this.f5072e + ". Successfully restored keys from AndroidKeyStore", new Object[0]);
                return new C0157a(privateKey, publicKey);
            }
            throw new TypeCastException("null cannot be cast to non-null type java.security.KeyStore.PrivateKeyEntry");
        }
        throw new IllegalStateException("AndroidKeyStore does not contain this key");
    }
}
