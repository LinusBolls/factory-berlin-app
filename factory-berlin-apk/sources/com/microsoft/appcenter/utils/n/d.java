package com.microsoft.appcenter.utils.n;

import android.annotation.SuppressLint;
import android.content.Context;
import android.security.KeyPairGeneratorSpec;
import com.microsoft.appcenter.utils.n.e;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.cert.CertificateExpiredException;
import java.security.cert.X509Certificate;
import java.util.Calendar;
import java.util.Date;
import javax.security.auth.x500.X500Principal;

/* compiled from: CryptoRsaHandler */
class d implements b {
    d() {
    }

    private e.d e(e.C0132e eVar, int i2) {
        return eVar.b("RSA/ECB/PKCS1Padding", i2 >= 23 ? "AndroidKeyStoreBCWorkaround" : "AndroidOpenSSL");
    }

    public byte[] a(e.C0132e eVar, int i2, KeyStore.Entry entry, byte[] bArr) {
        e.d e2 = e(eVar, i2);
        X509Certificate x509Certificate = (X509Certificate) ((KeyStore.PrivateKeyEntry) entry).getCertificate();
        try {
            x509Certificate.checkValidity();
            e2.c(1, x509Certificate.getPublicKey());
            return e2.b(bArr);
        } catch (CertificateExpiredException e3) {
            throw new InvalidKeyException(e3);
        }
    }

    @SuppressLint({"InlinedApi", "TrulyRandom"})
    public void b(e.C0132e eVar, String str, Context context) {
        Calendar instance = Calendar.getInstance();
        instance.add(1, 1);
        KeyPairGenerator instance2 = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
        KeyPairGeneratorSpec.Builder alias = new KeyPairGeneratorSpec.Builder(context).setAlias(str);
        instance2.initialize(alias.setSubject(new X500Principal("CN=" + str)).setStartDate(new Date()).setEndDate(instance.getTime()).setSerialNumber(BigInteger.TEN).setKeySize(2048).build());
        instance2.generateKeyPair();
    }

    public String c() {
        return "RSA/ECB/PKCS1Padding/2048";
    }

    public byte[] d(e.C0132e eVar, int i2, KeyStore.Entry entry, byte[] bArr) {
        e.d e2 = e(eVar, i2);
        e2.c(2, ((KeyStore.PrivateKeyEntry) entry).getPrivateKey());
        return e2.b(bArr);
    }
}
