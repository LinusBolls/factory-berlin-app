package de.baimos;

public final class be {
    private static char a(int i2) {
        return (char) ((i2 < 0 || i2 > 9) ? (i2 - 10) + 97 : i2 + 48);
    }

    private static String a(byte b) {
        StringBuilder sb = new StringBuilder();
        sb.append(a((b >>> 4) & 15));
        sb.append(a((int) b & 15));
        return sb.toString();
    }

    public static String a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (byte a : bArr) {
            sb.append(a(a));
        }
        return sb.toString();
    }
}
