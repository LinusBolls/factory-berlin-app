package de.baimos;

import android.content.Context;
import android.os.Build;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.security.Key;
import java.security.KeyStore;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class az {
    public static final SecureRandom a = new SecureRandom();
    private static final dr b = ds.a(az.class);
    private static ay c;

    public static int a(Key key, byte[] bArr, OutputStream outputStream) {
        try {
            Cipher a2 = a().a(1, key, (byte[]) null);
            byte[] iv = a2.getIV();
            outputStream.write(iv);
            int i2 = 0;
            int length = iv.length + 0;
            int length2 = bArr.length;
            while (length2 > 1024) {
                byte[] update = a2.update(bArr, i2, 1024);
                outputStream.write(update);
                length += update.length;
                i2 += 1024;
                length2 -= 1024;
            }
            byte[] doFinal = a2.doFinal(bArr, i2, length2);
            outputStream.write(doFinal);
            return length + doFinal.length;
        } catch (Exception e2) {
            throw new ax(e2);
        }
    }

    public static synchronized ay a() {
        ay ayVar;
        synchronized (az.class) {
            if (c == null) {
                b.b("Crypto Provider not initialized yet, initializing with null context!");
                a((Context) null);
            }
            ayVar = c;
        }
        return ayVar;
    }

    public static Key a(byte[] bArr) {
        return new SecretKeySpec(bArr, "AES");
    }

    public static synchronized void a(Context context) {
        synchronized (az.class) {
            boolean z = false;
            try {
                if (KeyStore.getInstance("AndroidKeyStore") != null) {
                    z = true;
                }
            } catch (Exception unused) {
            }
            if (!z) {
                b.b("AndroidKeyStore not available, storing keys in memory only!");
            }
            if (z) {
                if (!"robolectric".equals(Build.FINGERPRINT)) {
                    c = new aw(context);
                }
            }
            c = new bc();
        }
    }

    public static byte[] a(int i2) {
        byte[] bArr = new byte[i2];
        a.nextBytes(bArr);
        return bArr;
    }

    public static byte[] a(Key key, InputStream inputStream) {
        int read;
        try {
            byte[] bArr = new byte[16];
            if (inputStream.read(bArr) == 16) {
                Cipher a2 = a().a(2, key, bArr);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                int i2 = 0;
                do {
                    byte[] bArr2 = new byte[1024];
                    read = inputStream.read(bArr2);
                    if (read > -1) {
                        i2 += read;
                        byte[] update = a2.update(bArr2, 0, read);
                        if (update != null) {
                            byteArrayOutputStream.write(update);
                            continue;
                        } else {
                            continue;
                        }
                    }
                } while (read > -1);
                if (i2 > 0) {
                    byteArrayOutputStream.write(a2.doFinal());
                }
                return byteArrayOutputStream.toByteArray();
            }
            throw new IllegalArgumentException("format error");
        } catch (Exception e2) {
            throw new ax(e2);
        }
    }

    public static byte[] a(byte[] bArr, int i2) {
        if (bArr == null || bArr.length < 2) {
            throw new IllegalArgumentException("expected at least 2 bytes!");
        } else if (bArr[0] == 48) {
            if (bArr.length != bArr[1] + 2) {
                throw new IllegalArgumentException("input length does not match!");
            } else if (bArr[2] == 2) {
                byte b2 = bArr[3];
                byte[] bArr2 = new byte[b2];
                System.arraycopy(bArr, 4, bArr2, 0, b2);
                byte[] b3 = b(bArr2, i2);
                int i3 = b2 + 4;
                if (bArr[i3] == 2) {
                    byte b4 = bArr[i3 + 1];
                    byte[] bArr3 = new byte[b4];
                    System.arraycopy(bArr, i3 + 2, bArr3, 0, b4);
                    byte[] b5 = b(bArr3, i2);
                    if (b3.length == b5.length) {
                        return cg.a(b3, b5);
                    }
                    throw new IllegalArgumentException("component lengths differ!");
                }
                throw new IllegalArgumentException("no Integer found on seq2!");
            } else {
                throw new IllegalArgumentException("no Integer found on seq 1!");
            }
        } else {
            throw new IllegalArgumentException("no ASN1 sequence!");
        }
    }

    private static byte[] b(byte[] bArr, int i2) {
        return bArr.length == i2 ? bArr : ch.a(new BigInteger(bArr), i2);
    }
}
