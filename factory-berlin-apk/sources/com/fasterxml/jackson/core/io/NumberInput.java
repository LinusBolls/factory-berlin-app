package com.fasterxml.jackson.core.io;

import java.math.BigDecimal;

public final class NumberInput {
    static final String MAX_LONG_STR = String.valueOf(Long.MAX_VALUE);
    static final String MIN_LONG_STR_NO_SIGN = String.valueOf(Long.MIN_VALUE).substring(1);

    private static NumberFormatException _badBD(String str) {
        return new NumberFormatException("Value \"" + str + "\" can not be represented as BigDecimal");
    }

    public static boolean inLongRange(char[] cArr, int i2, int i3, boolean z) {
        String str = z ? MIN_LONG_STR_NO_SIGN : MAX_LONG_STR;
        int length = str.length();
        if (i3 < length) {
            return true;
        }
        if (i3 > length) {
            return false;
        }
        int i4 = 0;
        while (i4 < length) {
            int charAt = cArr[i2 + i4] - str.charAt(i4);
            if (charAt == 0) {
                i4++;
            } else if (charAt < 0) {
                return true;
            } else {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r5 = r5.trim();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int parseAsInt(java.lang.String r5, int r6) {
        /*
            if (r5 != 0) goto L_0x0003
            return r6
        L_0x0003:
            java.lang.String r5 = r5.trim()
            int r0 = r5.length()
            if (r0 != 0) goto L_0x000e
            return r6
        L_0x000e:
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L_0x0028
            char r3 = r5.charAt(r1)
            r4 = 43
            if (r3 != r4) goto L_0x0023
            java.lang.String r5 = r5.substring(r2)
            int r0 = r5.length()
            goto L_0x0028
        L_0x0023:
            r4 = 45
            if (r3 != r4) goto L_0x0028
            r1 = 1
        L_0x0028:
            if (r1 >= r0) goto L_0x0041
            char r2 = r5.charAt(r1)
            r3 = 57
            if (r2 > r3) goto L_0x003a
            r3 = 48
            if (r2 >= r3) goto L_0x0037
            goto L_0x003a
        L_0x0037:
            int r1 = r1 + 1
            goto L_0x0028
        L_0x003a:
            double r5 = parseDouble(r5)     // Catch:{ NumberFormatException -> 0x0040 }
            int r5 = (int) r5
            return r5
        L_0x0040:
            return r6
        L_0x0041:
            int r5 = java.lang.Integer.parseInt(r5)     // Catch:{ NumberFormatException -> 0x0046 }
            return r5
        L_0x0046:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.io.NumberInput.parseAsInt(java.lang.String, int):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r5 = r5.trim();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long parseAsLong(java.lang.String r5, long r6) {
        /*
            if (r5 != 0) goto L_0x0003
            return r6
        L_0x0003:
            java.lang.String r5 = r5.trim()
            int r0 = r5.length()
            if (r0 != 0) goto L_0x000e
            return r6
        L_0x000e:
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L_0x0028
            char r3 = r5.charAt(r1)
            r4 = 43
            if (r3 != r4) goto L_0x0023
            java.lang.String r5 = r5.substring(r2)
            int r0 = r5.length()
            goto L_0x0028
        L_0x0023:
            r4 = 45
            if (r3 != r4) goto L_0x0028
            r1 = 1
        L_0x0028:
            if (r1 >= r0) goto L_0x0041
            char r2 = r5.charAt(r1)
            r3 = 57
            if (r2 > r3) goto L_0x003a
            r3 = 48
            if (r2 >= r3) goto L_0x0037
            goto L_0x003a
        L_0x0037:
            int r1 = r1 + 1
            goto L_0x0028
        L_0x003a:
            double r5 = parseDouble(r5)     // Catch:{ NumberFormatException -> 0x0040 }
            long r5 = (long) r5
            return r5
        L_0x0040:
            return r6
        L_0x0041:
            long r5 = java.lang.Long.parseLong(r5)     // Catch:{ NumberFormatException -> 0x0046 }
            return r5
        L_0x0046:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.io.NumberInput.parseAsLong(java.lang.String, long):long");
    }

    public static BigDecimal parseBigDecimal(String str) {
        try {
            return new BigDecimal(str);
        } catch (NumberFormatException unused) {
            throw _badBD(str);
        }
    }

    public static double parseDouble(String str) {
        if ("2.2250738585072012e-308".equals(str)) {
            return Double.MIN_VALUE;
        }
        return Double.parseDouble(str);
    }

    public static int parseInt(char[] cArr, int i2, int i3) {
        int i4 = cArr[i2] - '0';
        if (i3 > 4) {
            int i5 = i2 + 1;
            int i6 = i5 + 1;
            int i7 = i6 + 1;
            i2 = i7 + 1;
            i4 = (((((((i4 * 10) + (cArr[i5] - '0')) * 10) + (cArr[i6] - '0')) * 10) + (cArr[i7] - '0')) * 10) + (cArr[i2] - '0');
            i3 -= 4;
            if (i3 > 4) {
                int i8 = i2 + 1;
                int i9 = i8 + 1;
                int i10 = i9 + 1;
                return (((((((i4 * 10) + (cArr[i8] - '0')) * 10) + (cArr[i9] - '0')) * 10) + (cArr[i10] - '0')) * 10) + (cArr[i10 + 1] - '0');
            }
        }
        if (i3 <= 1) {
            return i4;
        }
        int i11 = i2 + 1;
        int i12 = (i4 * 10) + (cArr[i11] - '0');
        if (i3 <= 2) {
            return i12;
        }
        int i13 = i11 + 1;
        int i14 = (i12 * 10) + (cArr[i13] - '0');
        return i3 > 3 ? (i14 * 10) + (cArr[i13 + 1] - '0') : i14;
    }

    public static long parseLong(char[] cArr, int i2, int i3) {
        int i4 = i3 - 9;
        return (((long) parseInt(cArr, i2, i4)) * 1000000000) + ((long) parseInt(cArr, i2 + i4, 9));
    }

    public static BigDecimal parseBigDecimal(char[] cArr) {
        return parseBigDecimal(cArr, 0, cArr.length);
    }

    public static long parseLong(String str) {
        if (str.length() <= 9) {
            return (long) parseInt(str);
        }
        return Long.parseLong(str);
    }

    public static boolean inLongRange(String str, boolean z) {
        String str2 = z ? MIN_LONG_STR_NO_SIGN : MAX_LONG_STR;
        int length = str2.length();
        int length2 = str.length();
        if (length2 < length) {
            return true;
        }
        if (length2 > length) {
            return false;
        }
        int i2 = 0;
        while (i2 < length) {
            int charAt = str.charAt(i2) - str2.charAt(i2);
            if (charAt == 0) {
                i2++;
            } else if (charAt < 0) {
                return true;
            } else {
                return false;
            }
        }
        return true;
    }

    public static BigDecimal parseBigDecimal(char[] cArr, int i2, int i3) {
        try {
            return new BigDecimal(cArr, i2, i3);
        } catch (NumberFormatException unused) {
            throw _badBD(new String(cArr, i2, i3));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0075, code lost:
        return java.lang.Integer.parseInt(r8);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int parseInt(java.lang.String r8) {
        /*
            r0 = 0
            char r1 = r8.charAt(r0)
            int r2 = r8.length()
            r3 = 1
            r4 = 45
            if (r1 != r4) goto L_0x000f
            r0 = 1
        L_0x000f:
            r4 = 10
            if (r0 == 0) goto L_0x0025
            if (r2 == r3) goto L_0x0020
            if (r2 <= r4) goto L_0x0018
            goto L_0x0020
        L_0x0018:
            r1 = 2
            char r3 = r8.charAt(r3)
            r1 = r3
            r3 = 2
            goto L_0x002e
        L_0x0020:
            int r8 = java.lang.Integer.parseInt(r8)
            return r8
        L_0x0025:
            r5 = 9
            if (r2 <= r5) goto L_0x002e
            int r8 = java.lang.Integer.parseInt(r8)
            return r8
        L_0x002e:
            r5 = 57
            if (r1 > r5) goto L_0x0084
            r6 = 48
            if (r1 >= r6) goto L_0x0037
            goto L_0x0084
        L_0x0037:
            int r1 = r1 - r6
            if (r3 >= r2) goto L_0x0080
            int r7 = r3 + 1
            char r3 = r8.charAt(r3)
            if (r3 > r5) goto L_0x007b
            if (r3 >= r6) goto L_0x0045
            goto L_0x007b
        L_0x0045:
            int r1 = r1 * 10
            int r3 = r3 - r6
            int r1 = r1 + r3
            if (r7 >= r2) goto L_0x0080
            int r3 = r7 + 1
            char r7 = r8.charAt(r7)
            if (r7 > r5) goto L_0x0076
            if (r7 >= r6) goto L_0x0056
            goto L_0x0076
        L_0x0056:
            int r1 = r1 * 10
            int r7 = r7 - r6
            int r1 = r1 + r7
            if (r3 >= r2) goto L_0x0080
        L_0x005c:
            int r7 = r3 + 1
            char r3 = r8.charAt(r3)
            if (r3 > r5) goto L_0x0071
            if (r3 >= r6) goto L_0x0067
            goto L_0x0071
        L_0x0067:
            int r1 = r1 * 10
            int r3 = r3 + -48
            int r1 = r1 + r3
            if (r7 < r2) goto L_0x006f
            goto L_0x0080
        L_0x006f:
            r3 = r7
            goto L_0x005c
        L_0x0071:
            int r8 = java.lang.Integer.parseInt(r8)
            return r8
        L_0x0076:
            int r8 = java.lang.Integer.parseInt(r8)
            return r8
        L_0x007b:
            int r8 = java.lang.Integer.parseInt(r8)
            return r8
        L_0x0080:
            if (r0 == 0) goto L_0x0083
            int r1 = -r1
        L_0x0083:
            return r1
        L_0x0084:
            int r8 = java.lang.Integer.parseInt(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.io.NumberInput.parseInt(java.lang.String):int");
    }
}
