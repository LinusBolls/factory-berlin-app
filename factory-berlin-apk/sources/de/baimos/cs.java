package de.baimos;

import java.io.UnsupportedEncodingException;

public final class cs {
    public static int a(String str, String str2, int i2) {
        if (str.indexOf(str2, i2) == -1) {
            return -1;
        }
        while (true) {
            int indexOf = str.indexOf(str2, i2 + 1);
            if (indexOf == -1) {
                return i2;
            }
            i2 = indexOf;
        }
    }

    public static boolean a(String str) {
        return str == null || str.trim().equals("");
    }

    public static String[] a(String str, String str2) {
        int i2 = 1;
        int i3 = 0;
        while (true) {
            i3 = str.indexOf(str2, i3);
            if (i3 <= -1) {
                break;
            } else if (i3 == 0) {
                str = str.substring(str2.length());
            } else if (i3 == str.length() - str2.length()) {
                str = str.substring(0, str.length() - str2.length());
            } else {
                i2++;
                i3 += str2.length();
            }
        }
        String[] strArr = new String[i2];
        int i4 = 0;
        while (true) {
            int indexOf = str.indexOf(str2);
            if (indexOf > -1) {
                strArr[i4] = str.substring(0, indexOf);
                str = str.substring(indexOf + str2.length());
                i4++;
            } else {
                strArr[i4] = str;
                return strArr;
            }
        }
    }

    public static byte[] b(String str) {
        try {
            return str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
            throw new RuntimeException("utf8 not supported");
        }
    }
}
