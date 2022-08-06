package l.d0;

import java.util.Arrays;
import kotlin.jvm.internal.k;

/* compiled from: -Utf8.kt */
public final class d {
    public static final byte[] a(String str) {
        int i2;
        int i3;
        int i4;
        char charAt;
        int i5;
        k.f(str, "$this$commonAsUtf8ToByteArray");
        byte[] bArr = new byte[(str.length() * 4)];
        int length = str.length();
        int i6 = 0;
        while (i2 < length) {
            char charAt2 = str.charAt(i2);
            if (charAt2 >= 128) {
                int length2 = str.length();
                int i7 = i2;
                while (i2 < length2) {
                    char charAt3 = str.charAt(i2);
                    if (charAt3 < 128) {
                        int i8 = i7 + 1;
                        bArr[i7] = (byte) charAt3;
                        i2++;
                        while (i2 < length2 && str.charAt(i2) < 128) {
                            bArr[i8] = (byte) str.charAt(i2);
                            i2++;
                            i8++;
                        }
                        i7 = i8;
                    } else {
                        if (charAt3 < 2048) {
                            int i9 = i7 + 1;
                            bArr[i7] = (byte) ((charAt3 >> 6) | 192);
                            i3 = i9 + 1;
                            bArr[i9] = (byte) ((charAt3 & '?') | 128);
                        } else if (55296 > charAt3 || 57343 < charAt3) {
                            int i10 = i7 + 1;
                            bArr[i7] = (byte) ((charAt3 >> 12) | 224);
                            int i11 = i10 + 1;
                            bArr[i10] = (byte) (((charAt3 >> 6) & 63) | 128);
                            i3 = i11 + 1;
                            bArr[i11] = (byte) ((charAt3 & '?') | 128);
                        } else if (charAt3 > 56319 || length2 <= (i4 = i2 + 1) || 56320 > (charAt = str.charAt(i4)) || 57343 < charAt) {
                            i3 = i7 + 1;
                            bArr[i7] = 63;
                        } else {
                            int charAt4 = ((charAt3 << 10) + str.charAt(i4)) - 56613888;
                            int i12 = i7 + 1;
                            bArr[i7] = (byte) ((charAt4 >> 18) | 240);
                            int i13 = i12 + 1;
                            bArr[i12] = (byte) (((charAt4 >> 12) & 63) | 128);
                            int i14 = i13 + 1;
                            bArr[i13] = (byte) (((charAt4 >> 6) & 63) | 128);
                            i3 = i14 + 1;
                            bArr[i14] = (byte) ((charAt4 & 63) | 128);
                            i5 = i2 + 2;
                            i7 = i3;
                        }
                        i5 = i2 + 1;
                        i7 = i3;
                    }
                }
                byte[] copyOf = Arrays.copyOf(bArr, i7);
                k.b(copyOf, "java.util.Arrays.copyOf(this, newSize)");
                return copyOf;
            }
            bArr[i2] = (byte) charAt2;
            i6 = i2 + 1;
        }
        byte[] copyOf2 = Arrays.copyOf(bArr, str.length());
        k.b(copyOf2, "java.util.Arrays.copyOf(this, newSize)");
        return copyOf2;
    }
}
