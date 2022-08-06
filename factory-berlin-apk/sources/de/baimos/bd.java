package de.baimos;

import java.nio.charset.Charset;

public final class bd {
    public static final Charset a = Charset.forName("UTF-8");

    public static String a(byte[] bArr) {
        return new String(new cl().a(bArr), a);
    }

    public static byte[] a(String str) {
        return new cl().b(str.getBytes(a));
    }
}
