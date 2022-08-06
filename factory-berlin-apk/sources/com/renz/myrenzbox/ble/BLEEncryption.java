package com.renz.myrenzbox.ble;

import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class BLEEncryption {
    private String a;

    static {
        System.loadLibrary("hmacenc");
    }

    private String a() {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(this.a.getBytes(), 0, this.a.length());
            byte[] digest = instance.digest();
            StringBuffer stringBuffer = new StringBuffer();
            for (int i2 = 0; i2 < 8; i2++) {
                String hexString = Integer.toHexString(digest[i2] & 255);
                if (hexString.length() == 1) {
                    stringBuffer.append('0');
                }
                stringBuffer.append(hexString);
            }
            return stringBuffer.toString().toUpperCase();
        } catch (NoSuchAlgorithmException e2) {
            e2.printStackTrace();
            return "";
        }
    }

    private static byte[] b(byte[] bArr, byte[] bArr2) {
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec("f2e5ec31f57903c9".getBytes("UTF-8"));
            byte[] bArr3 = new byte[32];
            System.arraycopy(bArr2, 4, bArr3, 0, 32);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr3, "AES");
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS7Padding");
            instance.init(2, secretKeySpec, ivParameterSpec);
            return instance.doFinal(bArr);
        } catch (NoSuchAlgorithmException e2) {
            e2.printStackTrace();
            return null;
        } catch (NoSuchPaddingException e3) {
            e3.printStackTrace();
            return null;
        } catch (InvalidKeyException e4) {
            e4.printStackTrace();
            return null;
        } catch (InvalidAlgorithmParameterException e5) {
            e5.printStackTrace();
            return null;
        } catch (IllegalBlockSizeException e6) {
            e6.printStackTrace();
            return null;
        } catch (BadPaddingException e7) {
            e7.printStackTrace();
            return null;
        } catch (UnsupportedEncodingException e8) {
            e8.printStackTrace();
            return null;
        }
    }

    public byte[] c(String str) {
        try {
            byte[] decode = Base64.decode(str, 0);
            IvParameterSpec ivParameterSpec = new IvParameterSpec(a().getBytes("UTF-8"));
            SecretKeySpec secretKeySpec = new SecretKeySpec(e(), "AES");
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS7Padding");
            instance.init(2, secretKeySpec, ivParameterSpec);
            return instance.doFinal(decode);
        } catch (NoSuchAlgorithmException e2) {
            e2.printStackTrace();
            return null;
        } catch (NoSuchPaddingException e3) {
            e3.printStackTrace();
            return null;
        } catch (InvalidKeyException e4) {
            e4.printStackTrace();
            return null;
        } catch (InvalidAlgorithmParameterException e5) {
            e5.printStackTrace();
            return null;
        } catch (IllegalBlockSizeException e6) {
            e6.printStackTrace();
            return null;
        } catch (BadPaddingException e7) {
            e7.printStackTrace();
            return null;
        } catch (UnsupportedEncodingException e8) {
            e8.printStackTrace();
            return null;
        }
    }

    public String d(byte[] bArr) {
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(a().getBytes("UTF-8"));
            SecretKeySpec secretKeySpec = new SecretKeySpec(e(), "AES");
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS7Padding");
            instance.init(1, secretKeySpec, ivParameterSpec);
            return Base64.encodeToString(instance.doFinal(bArr), 0);
        } catch (NoSuchAlgorithmException e2) {
            e2.printStackTrace();
            return null;
        } catch (NoSuchPaddingException e3) {
            e3.printStackTrace();
            return null;
        } catch (InvalidKeyException e4) {
            e4.printStackTrace();
            return null;
        } catch (InvalidAlgorithmParameterException e5) {
            e5.printStackTrace();
            return null;
        } catch (IllegalBlockSizeException e6) {
            e6.printStackTrace();
            return null;
        } catch (BadPaddingException e7) {
            e7.printStackTrace();
            return null;
        } catch (UnsupportedEncodingException e8) {
            e8.printStackTrace();
            return null;
        }
    }

    public byte[] e() {
        String str;
        try {
            str = new String(Base64.decode("VGhlIGNoYW5nZSBvZiB5b3VyIHBhc3N3b3JkIHdhcyBub3Qgc3VjY2Vzc2Z1bC4gUGxlYXNlIHRyeSBpdCBhZ2Fpbi4=", 0), "UTF-8");
        } catch (UnsupportedEncodingException e2) {
            e2.printStackTrace();
            str = "";
        }
        return b(new byte[]{39, -120, -125, 96, -54, -27, 54, 13, -111, -100, -116, -51, -28, 1, 22, -47, 116, 57, -5, 20, -45, -101, -81, -29, 95, -91, 20, 101, 21, 98, -69, -43, 66, 41, -7, -39, 15, -68, -28, -35, 107, -56, 67, 74, -96, -78, -125, 45}, keygen(str).getBytes());
    }

    public void f(String str) {
        this.a = str;
    }

    public native String keygen(String str);
}
