package de.baimos.blueid.sdk.api;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.security.keystore.KeyInfo;
import de.baimos.ab;
import de.baimos.ac;
import de.baimos.ay;
import de.baimos.az;
import de.baimos.bj;
import de.baimos.blueid.sdk.conn.SdkClientFactory;
import de.baimos.blueid.sdk.conn.channels.socket.SocketCommunicationChannel;
import de.baimos.blueid.sdk.conn.protocols.Protocol;
import de.baimos.blueid.sdk.metrics.AndroidSdkMetrics;
import de.baimos.cp;
import de.baimos.cq;
import de.baimos.dr;
import de.baimos.ds;
import de.baimos.e;
import de.baimos.f;
import de.baimos.g;
import de.baimos.p;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyStoreException;
import java.security.PrivateKey;
import java.security.UnrecoverableKeyException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;

public class a {
    private static final String DB_KEY = "system";
    private static final dr log = ds.a(a.class);

    private static Key createSymmetricKey43(Context context, String str, String str2, AndroidSdkMetrics androidSdkMetrics) {
        log.d("Generate key using Android 4.3 API");
        KeyPair a = az.a().a(2048, str, str2);
        byte[] a2 = az.a(16);
        byte[] cryptAsymmetrical = cryptAsymmetrical(a.getPublic(), a2, androidSdkMetrics);
        writeFileContents(context.getDir(str, 0).getAbsolutePath() + "/init", cryptAsymmetrical);
        return az.a(a2);
    }

    private static Key createSymmetricKey60(Context context, String str, String str2) {
        log.d("Generate key using Android 6.0 API");
        return az.a().a(str, str2);
    }

    private static byte[] cryptAsymmetrical(Key key, byte[] bArr, AndroidSdkMetrics androidSdkMetrics) {
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        try {
            return az.a().a(key instanceof PrivateKey ? 2 : 1, key).doFinal(bArr);
        } catch (Exception e2) {
            log.a("failed to load key", e2);
            androidSdkMetrics.addMessage("failed to load key", e2);
            return null;
        }
    }

    public static BlueIDMobileDeviceImpl init(Context context, String str) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            String str2 = packageInfo.versionName;
            System.setProperty("android.app.name", packageInfo.packageName);
            System.setProperty("android.app.version", str2);
            if (SdkInfo.DEBUG_LOG_BLE) {
                bj.a = context;
            }
            az.a(context);
            de.baimos.blueid.sdk.metrics.a aVar = new de.baimos.blueid.sdk.metrics.a();
            return new BlueIDMobileDeviceImpl(context.getDir(str, 0).getAbsolutePath(), initClientFactory(context), initCrypto(context, str, aVar), aVar);
        } catch (PackageManager.NameNotFoundException e2) {
            throw new RuntimeException(e2);
        }
    }

    private static SdkClientFactory initClientFactory(Context context) {
        Class cls;
        SdkClientFactory sdkClientFactory = new SdkClientFactory();
        sdkClientFactory.a((Channel) new e(context));
        sdkClientFactory.a((Channel) new SocketCommunicationChannel(context));
        g gVar = new g(context);
        sdkClientFactory.a((Channel) gVar);
        if (Boolean.getBoolean("net.blueid.sdk.USE_BLE_V5")) {
            log.b("USING WORK IN PROGRESS BLE CLIENT IMPLEMENTATION");
            cls = p.class;
        } else {
            log.d("using ble client v4");
            cls = f.class;
        }
        sdkClientFactory.a(gVar, cls);
        ac acVar = new ac(context);
        sdkClientFactory.a((Channel) acVar);
        sdkClientFactory.a(acVar, ab.class);
        if (Boolean.getBoolean("net.blueid.sdk.ENABLE_NO_SECURITY_PROTOCOL")) {
            log.b("Enabling NoSecurity protocol");
            sdkClientFactory.a(Protocol.NOSECURITY_1_0);
        }
        sdkClientFactory.a(Protocol.MICRO_1_0);
        return sdkClientFactory;
    }

    private static Key initCrypto(Context context, String str, AndroidSdkMetrics androidSdkMetrics) {
        ay a = az.a();
        try {
            String str2 = str + "_" + DB_KEY;
            Key key = null;
            try {
                key = a.a(str2);
            } catch (Exception e2) {
                if (!(e2 instanceof KeyStoreException)) {
                    if (!(e2 instanceof UnrecoverableKeyException)) {
                        log.b("failed to recover key", e2);
                        androidSdkMetrics.addMessage(e2);
                    }
                }
                log.d("failed to retrieve entry, retrying it", e2);
                key = a.a(str2);
                androidSdkMetrics.addMessage(e2);
            }
            if (key != null) {
                printKeyInfo(key, androidSdkMetrics);
                if (key instanceof SecretKey) {
                    log.d("found symmetric key");
                    return key;
                } else if (key instanceof PrivateKey) {
                    log.d("found key pair");
                    byte[] cryptAsymmetrical = cryptAsymmetrical(key, cp.a(context.getDir(str, 0).getAbsolutePath() + "/init"), androidSdkMetrics);
                    if (cryptAsymmetrical != null) {
                        return az.a(cryptAsymmetrical);
                    }
                } else {
                    log.a("unknown key type " + key);
                }
            }
            a.b(str2);
            if (Build.VERSION.SDK_INT >= 23) {
                if (!"true".equals(System.getProperty("de.baimos.blueid.sdk.force43"))) {
                    return createSymmetricKey60(context, str, DB_KEY);
                }
            }
            return createSymmetricKey43(context, str, DB_KEY, androidSdkMetrics);
        } catch (RuntimeException e3) {
            throw e3;
        } catch (Exception e4) {
            throw new RuntimeException(e4);
        }
    }

    private static void printKeyInfo(Key key, AndroidSdkMetrics androidSdkMetrics) {
        KeySpec keySpec;
        try {
            if (Build.VERSION.SDK_INT < 23 || "robolectric".equals(Build.FINGERPRINT)) {
                dr drVar = log;
                drVar.c("sdk version: " + Build.VERSION.SDK_INT);
                return;
            }
            if (key instanceof SecretKey) {
                SecretKey secretKey = (SecretKey) key;
                keySpec = SecretKeyFactory.getInstance(secretKey.getAlgorithm(), ay.f8207d).getKeySpec(secretKey, KeyInfo.class);
            } else if (key instanceof PrivateKey) {
                PrivateKey privateKey = (PrivateKey) key;
                keySpec = KeyFactory.getInstance(privateKey.getAlgorithm(), ay.f8207d).getKeySpec(privateKey, KeyInfo.class);
            } else {
                return;
            }
            KeyInfo keyInfo = (KeyInfo) keySpec;
            dr drVar2 = log;
            drVar2.c("key is inside secure hardware: " + keyInfo.isInsideSecureHardware());
        } catch (Exception e2) {
            log.c("failed to get key info", e2);
            androidSdkMetrics.addMessage("failed to get key info", e2);
        }
    }

    private static void writeFileContents(String str, byte[] bArr) {
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(str);
            try {
                fileOutputStream2.write(bArr);
                fileOutputStream2.flush();
                cq.a((OutputStream) fileOutputStream2);
            } catch (Exception e2) {
                e = e2;
                fileOutputStream = fileOutputStream2;
                try {
                    throw new RuntimeException(e);
                } catch (Throwable th) {
                    th = th;
                    cq.a((OutputStream) fileOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = fileOutputStream2;
                cq.a((OutputStream) fileOutputStream);
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            throw new RuntimeException(e);
        }
    }
}
