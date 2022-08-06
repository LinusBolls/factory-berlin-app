package com.microsoft.appcenter.utils.n;

import android.content.Context;
import android.security.keystore.KeyGenParameterSpec;
import com.microsoft.appcenter.utils.n.e;
import java.security.KeyStore;
import java.util.Calendar;
import javax.crypto.spec.IvParameterSpec;

/* compiled from: CryptoAesHandler */
class a implements b {
    a() {
    }

    public byte[] a(e.C0132e eVar, int i2, KeyStore.Entry entry, byte[] bArr) {
        e.d b = eVar.b("AES/CBC/PKCS7Padding", "AndroidKeyStoreBCWorkaround");
        b.c(1, ((KeyStore.SecretKeyEntry) entry).getSecretKey());
        byte[] a = b.a();
        byte[] b2 = b.b(bArr);
        byte[] bArr2 = new byte[(a.length + b2.length)];
        System.arraycopy(a, 0, bArr2, 0, a.length);
        System.arraycopy(b2, 0, bArr2, a.length, b2.length);
        return bArr2;
    }

    public void b(e.C0132e eVar, String str, Context context) {
        Calendar instance = Calendar.getInstance();
        instance.add(1, 1);
        e.f a = eVar.a("AES", "AndroidKeyStore");
        a.b(new KeyGenParameterSpec.Builder(str, 3).setBlockModes(new String[]{"CBC"}).setEncryptionPaddings(new String[]{"PKCS7Padding"}).setKeySize(256).setKeyValidityForOriginationEnd(instance.getTime()).build());
        a.a();
    }

    public String c() {
        return "AES/CBC/PKCS7Padding/256";
    }

    public byte[] d(e.C0132e eVar, int i2, KeyStore.Entry entry, byte[] bArr) {
        e.d b = eVar.b("AES/CBC/PKCS7Padding", "AndroidKeyStoreBCWorkaround");
        int d2 = b.d();
        b.e(2, ((KeyStore.SecretKeyEntry) entry).getSecretKey(), new IvParameterSpec(bArr, 0, d2));
        return b.f(bArr, d2, bArr.length - d2);
    }
}
