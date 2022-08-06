package l;

import java.util.Arrays;
import kotlin.jvm.internal.k;

/* compiled from: -Base64.kt */
public final class a {
    private static final byte[] a = i.f11104k.d("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").n();

    static {
        i.f11104k.d("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_").n();
    }

    public static final byte[] a(String str) {
        int i2;
        k.f(str, "$this$decodeBase64ToArray");
        int length = str.length();
        while (length > 0 && ((r5 = str.charAt(length - 1)) == '=' || r5 == 10 || r5 == 13 || r5 == ' ' || r5 == 9)) {
            length--;
        }
        int i3 = (int) ((((long) length) * 6) / 8);
        byte[] bArr = new byte[i3];
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < length; i7++) {
            char charAt = str.charAt(i7);
            if ('A' <= charAt && 'Z' >= charAt) {
                i2 = charAt - 'A';
            } else if ('a' <= charAt && 'z' >= charAt) {
                i2 = charAt - 'G';
            } else if ('0' <= charAt && '9' >= charAt) {
                i2 = charAt + 4;
            } else if (charAt == '+' || charAt == '-') {
                i2 = 62;
            } else if (charAt == '/' || charAt == '_') {
                i2 = 63;
            } else {
                if (!(charAt == 10 || charAt == 13 || charAt == ' ' || charAt == 9)) {
                    return null;
                }
            }
            i5 = (i5 << 6) | i2;
            i4++;
            if (i4 % 4 == 0) {
                int i8 = i6 + 1;
                bArr[i6] = (byte) (i5 >> 16);
                int i9 = i8 + 1;
                bArr[i8] = (byte) (i5 >> 8);
                bArr[i9] = (byte) i5;
                i6 = i9 + 1;
            }
        }
        int i10 = i4 % 4;
        if (i10 == 1) {
            return null;
        }
        if (i10 == 2) {
            bArr[i6] = (byte) ((i5 << 12) >> 16);
            i6++;
        } else if (i10 == 3) {
            int i11 = i5 << 6;
            int i12 = i6 + 1;
            bArr[i6] = (byte) (i11 >> 16);
            i6 = i12 + 1;
            bArr[i12] = (byte) (i11 >> 8);
        }
        if (i6 == i3) {
            return bArr;
        }
        byte[] copyOf = Arrays.copyOf(bArr, i6);
        k.b(copyOf, "java.util.Arrays.copyOf(this, newSize)");
        return copyOf;
    }

    public static final String b(byte[] bArr, byte[] bArr2) {
        k.f(bArr, "$this$encodeBase64");
        k.f(bArr2, "map");
        byte[] bArr3 = new byte[(((bArr.length + 2) / 3) * 4)];
        int length = bArr.length - (bArr.length % 3);
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = i2 + 1;
            byte b = bArr[i2];
            int i5 = i4 + 1;
            byte b2 = bArr[i4];
            int i6 = i5 + 1;
            byte b3 = bArr[i5];
            int i7 = i3 + 1;
            bArr3[i3] = bArr2[(b & 255) >> 2];
            int i8 = i7 + 1;
            bArr3[i7] = bArr2[((b & 3) << 4) | ((b2 & 255) >> 4)];
            int i9 = i8 + 1;
            bArr3[i8] = bArr2[((b2 & 15) << 2) | ((b3 & 255) >> 6)];
            i3 = i9 + 1;
            bArr3[i9] = bArr2[b3 & 63];
            i2 = i6;
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b4 = bArr[i2];
            int i10 = i3 + 1;
            bArr3[i3] = bArr2[(b4 & 255) >> 2];
            int i11 = i10 + 1;
            bArr3[i10] = bArr2[(b4 & 3) << 4];
            byte b5 = (byte) 61;
            bArr3[i11] = b5;
            bArr3[i11 + 1] = b5;
        } else if (length2 == 2) {
            int i12 = i2 + 1;
            byte b6 = bArr[i2];
            byte b7 = bArr[i12];
            int i13 = i3 + 1;
            bArr3[i3] = bArr2[(b6 & 255) >> 2];
            int i14 = i13 + 1;
            bArr3[i13] = bArr2[((b6 & 3) << 4) | ((b7 & 255) >> 4)];
            bArr3[i14] = bArr2[(b7 & 15) << 2];
            bArr3[i14 + 1] = (byte) 61;
        }
        return b.b(bArr3);
    }

    public static /* synthetic */ String c(byte[] bArr, byte[] bArr2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            bArr2 = a;
        }
        return b(bArr, bArr2);
    }
}
