package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
final class y9 {
    private static final z9 a;

    static {
        z9 z9Var;
        if (!(v9.m() && v9.r()) || q5.b()) {
            z9Var = new da();
        } else {
            z9Var = new fa();
        }
        a = z9Var;
    }

    static int d(CharSequence charSequence) {
        int length = charSequence.length();
        int i2 = 0;
        int i3 = 0;
        while (i3 < length && charSequence.charAt(i3) < 128) {
            i3++;
        }
        int i4 = length;
        while (true) {
            if (i3 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i3);
            if (charAt < 2048) {
                i4 += (127 - charAt) >>> 31;
                i3++;
            } else {
                int length2 = charSequence.length();
                while (i3 < length2) {
                    char charAt2 = charSequence.charAt(i3);
                    if (charAt2 < 2048) {
                        i2 += (127 - charAt2) >>> 31;
                    } else {
                        i2 += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i3) >= 65536) {
                                i3++;
                            } else {
                                throw new ba(i3, length2);
                            }
                        }
                    }
                    i3++;
                }
                i4 += i2;
            }
        }
        if (i4 >= length) {
            return i4;
        }
        StringBuilder sb = new StringBuilder(54);
        sb.append("UTF-8 length does not fit in int: ");
        sb.append(((long) i4) + 4294967296L);
        throw new IllegalArgumentException(sb.toString());
    }

    static int e(CharSequence charSequence, byte[] bArr, int i2, int i3) {
        return a.b(charSequence, bArr, i2, i3);
    }

    public static boolean f(byte[] bArr) {
        return a.c(bArr, 0, bArr.length);
    }

    public static boolean g(byte[] bArr, int i2, int i3) {
        return a.c(bArr, i2, i3);
    }

    /* access modifiers changed from: private */
    public static int h(int i2) {
        if (i2 > -12) {
            return -1;
        }
        return i2;
    }

    /* access modifiers changed from: private */
    public static int i(int i2, int i3) {
        if (i2 > -12 || i3 > -65) {
            return -1;
        }
        return i2 ^ (i3 << 8);
    }

    /* access modifiers changed from: private */
    public static int j(int i2, int i3, int i4) {
        if (i2 > -12 || i3 > -65 || i4 > -65) {
            return -1;
        }
        return (i2 ^ (i3 << 8)) ^ (i4 << 16);
    }

    static String k(byte[] bArr, int i2, int i3) {
        return a.d(bArr, i2, i3);
    }

    /* access modifiers changed from: private */
    public static int m(byte[] bArr, int i2, int i3) {
        byte b = bArr[i2 - 1];
        int i4 = i3 - i2;
        if (i4 == 0) {
            return h(b);
        }
        if (i4 == 1) {
            return i(b, bArr[i2]);
        }
        if (i4 == 2) {
            return j(b, bArr[i2], bArr[i2 + 1]);
        }
        throw new AssertionError();
    }
}
