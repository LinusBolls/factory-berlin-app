package com.google.android.gms.internal.measurement;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
final class x3 {
    static int a(int i2, int i3, int i4) {
        return (i2 & (~i4)) | (i3 & i4);
    }

    static int b(Object obj, int i2) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i2] & 255;
        }
        if (obj instanceof short[]) {
            return ((short[]) obj)[i2] & 65535;
        }
        return ((int[]) obj)[i2];
    }

    static int c(@NullableDecl Object obj, @NullableDecl Object obj2, int i2, Object obj3, int[] iArr, Object[] objArr, @NullableDecl Object[] objArr2) {
        int i3;
        int i4;
        int b = z3.b(obj);
        int i5 = b & i2;
        int b2 = b(obj3, i5);
        if (b2 == 0) {
            return -1;
        }
        int i6 = ~i2;
        int i7 = b & i6;
        int i8 = -1;
        while (true) {
            i3 = b2 - 1;
            i4 = iArr[i3];
            if ((i4 & i6) != i7 || !z2.a(obj, objArr[i3]) || (objArr2 != null && !z2.a(obj2, objArr2[i3]))) {
                int i9 = i4 & i2;
                if (i9 == 0) {
                    return -1;
                }
                int i10 = i9;
                i8 = i3;
                b2 = i10;
            }
        }
        int i11 = i4 & i2;
        if (i8 == -1) {
            e(obj3, i5, i11);
        } else {
            iArr[i8] = a(iArr[i8], i11, i2);
        }
        return i3;
    }

    static Object d(int i2) {
        if (i2 < 2 || i2 > 1073741824 || Integer.highestOneBit(i2) != i2) {
            StringBuilder sb = new StringBuilder(52);
            sb.append("must be power of 2 between 2^1 and 2^30: ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 <= 256) {
            return new byte[i2];
        } else {
            if (i2 <= 65536) {
                return new short[i2];
            }
            return new int[i2];
        }
    }

    static void e(Object obj, int i2, int i3) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i2] = (byte) i3;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i2] = (short) i3;
        } else {
            ((int[]) obj)[i2] = i3;
        }
    }

    static int f(int i2) {
        return (i2 < 32 ? 4 : 2) * (i2 + 1);
    }
}
