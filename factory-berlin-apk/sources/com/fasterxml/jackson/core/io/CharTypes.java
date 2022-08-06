package com.fasterxml.jackson.core.io;

import java.util.Arrays;

public final class CharTypes {
    private static final byte[] HB;
    private static final char[] HC;
    private static final int[] sHexValues;
    private static final int[] sInputCodes;
    private static final int[] sInputCodesComment;
    private static final int[] sInputCodesJsNames;
    private static final int[] sInputCodesUTF8;
    private static final int[] sInputCodesUtf8JsNames;
    private static final int[] sOutputEscapes128;

    static {
        char[] charArray = "0123456789ABCDEF".toCharArray();
        HC = charArray;
        int length = charArray.length;
        HB = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            HB[i2] = (byte) HC[i2];
        }
        int[] iArr = new int[256];
        for (int i3 = 0; i3 < 32; i3++) {
            iArr[i3] = -1;
        }
        iArr[34] = 1;
        iArr[92] = 1;
        sInputCodes = iArr;
        int length2 = iArr.length;
        int[] iArr2 = new int[length2];
        System.arraycopy(iArr, 0, iArr2, 0, length2);
        for (int i4 = 128; i4 < 256; i4++) {
            iArr2[i4] = (i4 & 224) == 192 ? 2 : (i4 & 240) == 224 ? 3 : (i4 & 248) == 240 ? 4 : -1;
        }
        sInputCodesUTF8 = iArr2;
        int[] iArr3 = new int[256];
        Arrays.fill(iArr3, -1);
        for (int i5 = 33; i5 < 256; i5++) {
            if (Character.isJavaIdentifierPart((char) i5)) {
                iArr3[i5] = 0;
            }
        }
        iArr3[64] = 0;
        iArr3[35] = 0;
        iArr3[42] = 0;
        iArr3[45] = 0;
        iArr3[43] = 0;
        sInputCodesJsNames = iArr3;
        int[] iArr4 = new int[256];
        System.arraycopy(iArr3, 0, iArr4, 0, 256);
        Arrays.fill(iArr4, 128, 128, 0);
        sInputCodesUtf8JsNames = iArr4;
        int[] iArr5 = new int[256];
        System.arraycopy(sInputCodesUTF8, 128, iArr5, 128, 128);
        Arrays.fill(iArr5, 0, 32, -1);
        iArr5[9] = 0;
        iArr5[10] = 10;
        iArr5[13] = 13;
        iArr5[42] = 42;
        sInputCodesComment = iArr5;
        int[] iArr6 = new int[256];
        System.arraycopy(sInputCodesUTF8, 128, iArr6, 128, 128);
        Arrays.fill(iArr6, 0, 32, -1);
        iArr6[32] = 1;
        iArr6[9] = 1;
        iArr6[10] = 10;
        iArr6[13] = 13;
        iArr6[47] = 47;
        iArr6[35] = 35;
        int[] iArr7 = new int[128];
        for (int i6 = 0; i6 < 32; i6++) {
            iArr7[i6] = -1;
        }
        iArr7[34] = 34;
        iArr7[92] = 92;
        iArr7[8] = 98;
        iArr7[9] = 116;
        iArr7[12] = 102;
        iArr7[10] = 110;
        iArr7[13] = 114;
        sOutputEscapes128 = iArr7;
        int[] iArr8 = new int[128];
        sHexValues = iArr8;
        Arrays.fill(iArr8, -1);
        for (int i7 = 0; i7 < 10; i7++) {
            sHexValues[i7 + 48] = i7;
        }
        for (int i8 = 0; i8 < 6; i8++) {
            int[] iArr9 = sHexValues;
            int i9 = i8 + 10;
            iArr9[i8 + 97] = i9;
            iArr9[i8 + 65] = i9;
        }
    }

    public static void appendQuoted(StringBuilder sb, String str) {
        int[] iArr = sOutputEscapes128;
        int length = iArr.length;
        int length2 = str.length();
        for (int i2 = 0; i2 < length2; i2++) {
            char charAt = str.charAt(i2);
            if (charAt >= length || iArr[charAt] == 0) {
                sb.append(charAt);
            } else {
                sb.append('\\');
                int i3 = iArr[charAt];
                if (i3 < 0) {
                    sb.append('u');
                    sb.append('0');
                    sb.append('0');
                    sb.append(HC[charAt >> 4]);
                    sb.append(HC[charAt & 15]);
                } else {
                    sb.append((char) i3);
                }
            }
        }
    }

    public static int charToHex(int i2) {
        if (i2 > 127) {
            return -1;
        }
        return sHexValues[i2];
    }

    public static byte[] copyHexBytes() {
        return (byte[]) HB.clone();
    }

    public static char[] copyHexChars() {
        return (char[]) HC.clone();
    }

    public static int[] get7BitOutputEscapes() {
        return sOutputEscapes128;
    }

    public static int[] getInputCodeComment() {
        return sInputCodesComment;
    }

    public static int[] getInputCodeLatin1() {
        return sInputCodes;
    }

    public static int[] getInputCodeLatin1JsNames() {
        return sInputCodesJsNames;
    }

    public static int[] getInputCodeUtf8() {
        return sInputCodesUTF8;
    }

    public static int[] getInputCodeUtf8JsNames() {
        return sInputCodesUtf8JsNames;
    }
}
