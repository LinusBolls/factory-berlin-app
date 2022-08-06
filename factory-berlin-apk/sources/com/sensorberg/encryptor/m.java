package com.sensorberg.encryptor;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.TypeCastException;
import kotlin.j0.d;
import kotlin.jvm.internal.k;

/* compiled from: Operation.kt */
public final class m {
    private static final String a = "pref_secure_key_id";
    private static final int b = 16;
    private static final int c = 12;

    /* renamed from: d  reason: collision with root package name */
    private static final int f5107d = 128;

    /* renamed from: e  reason: collision with root package name */
    private static final String f5108e = "AES";

    /* renamed from: f  reason: collision with root package name */
    private static final String f5109f = "RSA/ECB/PKCS1Padding";

    /* renamed from: g  reason: collision with root package name */
    private static final String f5110g = "AES/GCM/NoPadding";

    /* renamed from: h  reason: collision with root package name */
    private static final SecureRandom f5111h = new SecureRandom();

    /* renamed from: i  reason: collision with root package name */
    public static final m f5112i = new m();

    private m() {
    }

    public final String a(c cVar, SecretKey secretKey) {
        k.f(cVar, "message");
        k.f(secretKey, "key");
        Cipher instance = Cipher.getInstance(f5110g);
        instance.init(2, secretKey, new GCMParameterSpec(f5107d, Base64.decode(cVar.d(), 0)));
        byte[] doFinal = instance.doFinal(Base64.decode(cVar.c(), 0));
        k.b(doFinal, "bytes");
        return new String(doFinal, d.a);
    }

    public final c b(String str, String str2, SecretKey secretKey) {
        k.f(str, "alias");
        k.f(str2, "data");
        k.f(secretKey, "key");
        byte[] bArr = new byte[c];
        f5111h.nextBytes(bArr);
        Cipher instance = Cipher.getInstance(f5110g);
        instance.init(1, secretKey, new GCMParameterSpec(f5107d, bArr));
        byte[] bytes = str2.getBytes(d.a);
        k.b(bytes, "(this as java.lang.String).getBytes(charset)");
        String encodeToString = Base64.encodeToString(instance.doFinal(bytes), 0);
        k.b(encodeToString, "Base64.encodeToString(cipherText, 0)");
        String encodeToString2 = Base64.encodeToString(bArr, 0);
        k.b(encodeToString2, "Base64.encodeToString(iv, 0)");
        return new c(str, encodeToString, encodeToString2);
    }

    public final SecretKey c() {
        byte[] bArr = new byte[b];
        f5111h.nextBytes(bArr);
        return new SecretKeySpec(bArr, f5108e);
    }

    public final String d(SharedPreferences sharedPreferences) {
        k.f(sharedPreferences, "p");
        String string = sharedPreferences.getString(a, (String) null);
        if (TextUtils.isEmpty(string)) {
            string = "key_" + UUID.randomUUID();
            sharedPreferences.edit().putString(a, string).apply();
        }
        k.b(string, "key");
        return string;
    }

    public final boolean e(SharedPreferences sharedPreferences) {
        k.f(sharedPreferences, "p");
        return !sharedPreferences.contains(a);
    }

    public final SecretKey f(String str, PrivateKey privateKey) {
        k.f(str, "wrappedKeyData");
        k.f(privateKey, "keyToUnWrapWith");
        byte[] decode = Base64.decode(str, 0);
        Cipher instance = Cipher.getInstance(f5109f);
        instance.init(4, privateKey);
        Key unwrap = instance.unwrap(decode, f5108e, 3);
        if (unwrap != null) {
            return (SecretKey) unwrap;
        }
        throw new TypeCastException("null cannot be cast to non-null type javax.crypto.SecretKey");
    }

    public final String g(SecretKey secretKey, PublicKey publicKey) {
        k.f(secretKey, "keyToBeWrapped");
        k.f(publicKey, "keyToWrapWith");
        Cipher instance = Cipher.getInstance(f5109f);
        instance.init(3, publicKey);
        String encodeToString = Base64.encodeToString(instance.wrap(secretKey), 0);
        k.b(encodeToString, "Base64.encodeToString(decodedData, Base64.DEFAULT)");
        return encodeToString;
    }
}
