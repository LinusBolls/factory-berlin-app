package com.google.zxing.e.c;

import com.google.zxing.WriterException;
import com.google.zxing.e.b.b;
import com.google.zxing.e.b.c;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: Encoder */
public final class c {
    private static final int[] a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    /* compiled from: Encoder */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.google.zxing.e.b.b[] r0 = com.google.zxing.e.b.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                com.google.zxing.e.b.b r1 = com.google.zxing.e.b.b.NUMERIC     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.zxing.e.b.b r1 = com.google.zxing.e.b.b.ALPHANUMERIC     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.zxing.e.b.b r1 = com.google.zxing.e.b.b.BYTE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.zxing.e.b.b r1 = com.google.zxing.e.b.b.KANJI     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.e.c.c.a.<clinit>():void");
        }
    }

    static void a(String str, com.google.zxing.d.a aVar, String str2) {
        try {
            for (byte e2 : str.getBytes(str2)) {
                aVar.e(e2, 8);
            }
        } catch (UnsupportedEncodingException e3) {
            throw new WriterException((Throwable) e3);
        }
    }

    static void b(CharSequence charSequence, com.google.zxing.d.a aVar) {
        int length = charSequence.length();
        int i2 = 0;
        while (i2 < length) {
            int p = p(charSequence.charAt(i2));
            if (p != -1) {
                int i3 = i2 + 1;
                if (i3 < length) {
                    int p2 = p(charSequence.charAt(i3));
                    if (p2 != -1) {
                        aVar.e((p * 45) + p2, 11);
                        i2 += 2;
                    } else {
                        throw new WriterException();
                    }
                } else {
                    aVar.e(p, 6);
                    i2 = i3;
                }
            } else {
                throw new WriterException();
            }
        }
    }

    static void c(String str, b bVar, com.google.zxing.d.a aVar, String str2) {
        int i2 = a.a[bVar.ordinal()];
        if (i2 == 1) {
            h(str, aVar);
        } else if (i2 == 2) {
            b(str, aVar);
        } else if (i2 == 3) {
            a(str, aVar, str2);
        } else if (i2 == 4) {
            e(str, aVar);
        } else {
            throw new WriterException("Invalid mode: " + bVar);
        }
    }

    private static void d(com.google.zxing.d.c cVar, com.google.zxing.d.a aVar) {
        aVar.e(b.ECI.a(), 4);
        aVar.e(cVar.f(), 8);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0035 A[LOOP:0: B:4:0x0008->B:17:0x0035, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0044 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void e(java.lang.String r6, com.google.zxing.d.a r7) {
        /*
            java.lang.String r0 = "Shift_JIS"
            byte[] r6 = r6.getBytes(r0)     // Catch:{ UnsupportedEncodingException -> 0x004d }
            int r0 = r6.length
            r1 = 0
        L_0x0008:
            if (r1 >= r0) goto L_0x004c
            byte r2 = r6[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r3 = r1 + 1
            byte r3 = r6[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 8
            r2 = r2 | r3
            r3 = 33088(0x8140, float:4.6366E-41)
            r4 = -1
            if (r2 < r3) goto L_0x0024
            r5 = 40956(0x9ffc, float:5.7392E-41)
            if (r2 > r5) goto L_0x0024
        L_0x0022:
            int r2 = r2 - r3
            goto L_0x0033
        L_0x0024:
            r3 = 57408(0xe040, float:8.0446E-41)
            if (r2 < r3) goto L_0x0032
            r3 = 60351(0xebbf, float:8.457E-41)
            if (r2 > r3) goto L_0x0032
            r3 = 49472(0xc140, float:6.9325E-41)
            goto L_0x0022
        L_0x0032:
            r2 = -1
        L_0x0033:
            if (r2 == r4) goto L_0x0044
            int r3 = r2 >> 8
            int r3 = r3 * 192
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r3 = r3 + r2
            r2 = 13
            r7.e(r3, r2)
            int r1 = r1 + 2
            goto L_0x0008
        L_0x0044:
            com.google.zxing.WriterException r6 = new com.google.zxing.WriterException
            java.lang.String r7 = "Invalid byte sequence"
            r6.<init>((java.lang.String) r7)
            throw r6
        L_0x004c:
            return
        L_0x004d:
            r6 = move-exception
            com.google.zxing.WriterException r7 = new com.google.zxing.WriterException
            r7.<init>((java.lang.Throwable) r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.e.c.c.e(java.lang.String, com.google.zxing.d.a):void");
    }

    static void f(int i2, com.google.zxing.e.b.c cVar, b bVar, com.google.zxing.d.a aVar) {
        int f2 = bVar.f(cVar);
        int i3 = 1 << f2;
        if (i2 < i3) {
            aVar.e(i2, f2);
            return;
        }
        throw new WriterException(i2 + " is bigger than " + (i3 - 1));
    }

    static void g(b bVar, com.google.zxing.d.a aVar) {
        aVar.e(bVar.a(), 4);
    }

    static void h(CharSequence charSequence, com.google.zxing.d.a aVar) {
        int length = charSequence.length();
        int i2 = 0;
        while (i2 < length) {
            int charAt = charSequence.charAt(i2) - '0';
            int i3 = i2 + 2;
            if (i3 < length) {
                aVar.e((charAt * 100) + ((charSequence.charAt(i2 + 1) - '0') * 10) + (charSequence.charAt(i3) - '0'), 10);
                i2 += 3;
            } else {
                i2++;
                if (i2 < length) {
                    aVar.e((charAt * 10) + (charSequence.charAt(i2) - '0'), 7);
                    i2 = i3;
                } else {
                    aVar.e(charAt, 4);
                }
            }
        }
    }

    private static int i(b bVar, com.google.zxing.d.a aVar, com.google.zxing.d.a aVar2, com.google.zxing.e.b.c cVar) {
        return aVar.m() + bVar.f(cVar) + aVar2.m();
    }

    private static int j(b bVar) {
        return d.a(bVar) + d.c(bVar) + d.d(bVar) + d.e(bVar);
    }

    private static int k(com.google.zxing.d.a aVar, com.google.zxing.e.b.a aVar2, com.google.zxing.e.b.c cVar, b bVar) {
        int i2 = Integer.MAX_VALUE;
        int i3 = -1;
        for (int i4 = 0; i4 < 8; i4++) {
            e.a(aVar, aVar2, cVar, i4, bVar);
            int j2 = j(bVar);
            if (j2 < i2) {
                i3 = i4;
                i2 = j2;
            }
        }
        return i3;
    }

    private static b l(String str, String str2) {
        if ("Shift_JIS".equals(str2) && s(str)) {
            return b.KANJI;
        }
        boolean z = false;
        boolean z2 = false;
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (charAt >= '0' && charAt <= '9') {
                z2 = true;
            } else if (p(charAt) == -1) {
                return b.BYTE;
            } else {
                z = true;
            }
        }
        if (z) {
            return b.ALPHANUMERIC;
        }
        if (z2) {
            return b.NUMERIC;
        }
        return b.BYTE;
    }

    private static com.google.zxing.e.b.c m(int i2, com.google.zxing.e.b.a aVar) {
        for (int i3 = 1; i3 <= 40; i3++) {
            com.google.zxing.e.b.c e2 = com.google.zxing.e.b.c.e(i3);
            if (v(i2, e2, aVar)) {
                return e2;
            }
        }
        throw new WriterException("Data too big");
    }

    public static f n(String str, com.google.zxing.e.b.a aVar, Map<com.google.zxing.b, ?> map) {
        String str2;
        com.google.zxing.e.b.c cVar;
        com.google.zxing.d.c a2;
        if (map == null || !map.containsKey(com.google.zxing.b.CHARACTER_SET)) {
            str2 = "ISO-8859-1";
        } else {
            str2 = map.get(com.google.zxing.b.CHARACTER_SET).toString();
        }
        b l2 = l(str, str2);
        com.google.zxing.d.a aVar2 = new com.google.zxing.d.a();
        if (l2 == b.BYTE && !"ISO-8859-1".equals(str2) && (a2 = com.google.zxing.d.c.a(str2)) != null) {
            d(a2, aVar2);
        }
        g(l2, aVar2);
        com.google.zxing.d.a aVar3 = new com.google.zxing.d.a();
        c(str, l2, aVar3, str2);
        if (map == null || !map.containsKey(com.google.zxing.b.QR_VERSION)) {
            cVar = t(aVar, l2, aVar2, aVar3);
        } else {
            cVar = com.google.zxing.e.b.c.e(Integer.parseInt(map.get(com.google.zxing.b.QR_VERSION).toString()));
            if (!v(i(l2, aVar2, aVar3, cVar), cVar, aVar)) {
                throw new WriterException("Data too big for requested version");
            }
        }
        com.google.zxing.d.a aVar4 = new com.google.zxing.d.a();
        aVar4.d(aVar2);
        f(l2 == b.BYTE ? aVar3.p() : str.length(), cVar, l2, aVar4);
        aVar4.d(aVar3);
        c.b c = cVar.c(aVar);
        int d2 = cVar.d() - c.d();
        u(d2, aVar4);
        com.google.zxing.d.a r = r(aVar4, cVar.d(), d2, c.c());
        f fVar = new f();
        fVar.c(aVar);
        fVar.f(l2);
        fVar.g(cVar);
        int b = cVar.b();
        b bVar = new b(b, b);
        int k2 = k(r, aVar, cVar, bVar);
        fVar.d(k2);
        e.a(r, aVar, cVar, k2, bVar);
        fVar.e(bVar);
        return fVar;
    }

    static byte[] o(byte[] bArr, int i2) {
        int length = bArr.length;
        int[] iArr = new int[(length + i2)];
        for (int i3 = 0; i3 < length; i3++) {
            iArr[i3] = bArr[i3] & 255;
        }
        new com.google.zxing.common.reedsolomon.c(com.google.zxing.common.reedsolomon.a.f4375h).b(iArr, i2);
        byte[] bArr2 = new byte[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            bArr2[i4] = (byte) iArr[length + i4];
        }
        return bArr2;
    }

    static int p(int i2) {
        int[] iArr = a;
        if (i2 < iArr.length) {
            return iArr[i2];
        }
        return -1;
    }

    static void q(int i2, int i3, int i4, int i5, int[] iArr, int[] iArr2) {
        if (i5 < i4) {
            int i6 = i2 % i4;
            int i7 = i4 - i6;
            int i8 = i2 / i4;
            int i9 = i8 + 1;
            int i10 = i3 / i4;
            int i11 = i10 + 1;
            int i12 = i8 - i10;
            int i13 = i9 - i11;
            if (i12 != i13) {
                throw new WriterException("EC bytes mismatch");
            } else if (i4 != i7 + i6) {
                throw new WriterException("RS blocks mismatch");
            } else if (i2 != ((i10 + i12) * i7) + ((i11 + i13) * i6)) {
                throw new WriterException("Total bytes mismatch");
            } else if (i5 < i7) {
                iArr[0] = i10;
                iArr2[0] = i12;
            } else {
                iArr[0] = i11;
                iArr2[0] = i13;
            }
        } else {
            throw new WriterException("Block ID too large");
        }
    }

    static com.google.zxing.d.a r(com.google.zxing.d.a aVar, int i2, int i3, int i4) {
        int i5 = i2;
        int i6 = i3;
        int i7 = i4;
        if (aVar.p() == i6) {
            ArrayList<a> arrayList = new ArrayList<>(i7);
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            for (int i11 = 0; i11 < i7; i11++) {
                int[] iArr = new int[1];
                int[] iArr2 = new int[1];
                q(i2, i3, i4, i11, iArr, iArr2);
                int i12 = iArr[0];
                byte[] bArr = new byte[i12];
                aVar.s(i8 << 3, bArr, 0, i12);
                byte[] o = o(bArr, iArr2[0]);
                arrayList.add(new a(bArr, o));
                i9 = Math.max(i9, i12);
                i10 = Math.max(i10, o.length);
                i8 += iArr[0];
            }
            if (i6 == i8) {
                com.google.zxing.d.a aVar2 = new com.google.zxing.d.a();
                for (int i13 = 0; i13 < i9; i13++) {
                    for (a a2 : arrayList) {
                        byte[] a3 = a2.a();
                        if (i13 < a3.length) {
                            aVar2.e(a3[i13], 8);
                        }
                    }
                }
                for (int i14 = 0; i14 < i10; i14++) {
                    for (a b : arrayList) {
                        byte[] b2 = b.b();
                        if (i14 < b2.length) {
                            aVar2.e(b2[i14], 8);
                        }
                    }
                }
                if (i5 == aVar2.p()) {
                    return aVar2;
                }
                throw new WriterException("Interleaving error: " + i5 + " and " + aVar2.p() + " differ.");
            }
            throw new WriterException("Data bytes does not match offset");
        }
        throw new WriterException("Number of bits and data bytes does not match");
    }

    private static boolean s(String str) {
        try {
            byte[] bytes = str.getBytes("Shift_JIS");
            int length = bytes.length;
            if (length % 2 != 0) {
                return false;
            }
            for (int i2 = 0; i2 < length; i2 += 2) {
                byte b = bytes[i2] & 255;
                if ((b < 129 || b > 159) && (b < 224 || b > 235)) {
                    return false;
                }
            }
            return true;
        } catch (UnsupportedEncodingException unused) {
            return false;
        }
    }

    private static com.google.zxing.e.b.c t(com.google.zxing.e.b.a aVar, b bVar, com.google.zxing.d.a aVar2, com.google.zxing.d.a aVar3) {
        return m(i(bVar, aVar2, aVar3, m(i(bVar, aVar2, aVar3, com.google.zxing.e.b.c.e(1)), aVar)), aVar);
    }

    static void u(int i2, com.google.zxing.d.a aVar) {
        int i3 = i2 << 3;
        if (aVar.m() <= i3) {
            for (int i4 = 0; i4 < 4 && aVar.m() < i3; i4++) {
                aVar.c(false);
            }
            int m2 = aVar.m() & 7;
            if (m2 > 0) {
                while (m2 < 8) {
                    aVar.c(false);
                    m2++;
                }
            }
            int p = i2 - aVar.p();
            for (int i5 = 0; i5 < p; i5++) {
                aVar.e((i5 & 1) == 0 ? 236 : 17, 8);
            }
            if (aVar.m() != i3) {
                throw new WriterException("Bits size does not equal capacity");
            }
            return;
        }
        throw new WriterException("data bits cannot fit in the QR Code" + aVar.m() + " > " + i3);
    }

    private static boolean v(int i2, com.google.zxing.e.b.c cVar, com.google.zxing.e.b.a aVar) {
        return cVar.d() - cVar.c(aVar).d() >= (i2 + 7) / 8;
    }
}
