package com.nytimes.android.external.cache;

/* compiled from: Ascii */
public final class c {
    public static boolean a(char c) {
        return c >= 'A' && c <= 'Z';
    }

    public static String b(String str) {
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            if (a(str.charAt(i2))) {
                char[] charArray = str.toCharArray();
                while (i2 < length) {
                    char c = charArray[i2];
                    if (a(c)) {
                        charArray[i2] = (char) (c ^ ' ');
                    }
                    i2++;
                }
                return String.valueOf(charArray);
            }
            i2++;
        }
        return str;
    }
}
