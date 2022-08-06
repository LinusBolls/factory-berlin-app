package com.google.zxing.e.c;

import com.google.zxing.WriterException;
import com.google.zxing.d.a;
import com.google.zxing.e.b.c;

/* compiled from: MatrixUtil */
final class e {
    private static final int[][] a = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};
    private static final int[][] b = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};
    private static final int[][] c = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, 102, 126, -1}, new int[]{6, 26, 52, 78, 104, 130, -1}, new int[]{6, 30, 56, 82, 108, 134, -1}, new int[]{6, 34, 60, 86, 112, 138, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, 118, 146, -1}, new int[]{6, 30, 54, 78, 102, 126, 150}, new int[]{6, 24, 50, 76, 102, 128, 154}, new int[]{6, 28, 54, 80, 106, 132, 158}, new int[]{6, 32, 58, 84, 110, 136, 162}, new int[]{6, 26, 54, 82, 110, 138, 166}, new int[]{6, 30, 58, 86, 114, 142, 170}};

    /* renamed from: d  reason: collision with root package name */
    private static final int[][] f4408d = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    static void a(a aVar, com.google.zxing.e.b.a aVar2, c cVar, int i2, b bVar) {
        c(bVar);
        d(cVar, bVar);
        l(aVar2, i2, bVar);
        s(cVar, bVar);
        f(aVar, i2, bVar);
    }

    static int b(int i2, int i3) {
        if (i3 != 0) {
            int n2 = n(i3);
            int i4 = i2 << (n2 - 1);
            while (n(i4) >= n2) {
                i4 ^= i3 << (n(i4) - n2);
            }
            return i4;
        }
        throw new IllegalArgumentException("0 polynomial");
    }

    static void c(b bVar) {
        bVar.a((byte) -1);
    }

    static void d(c cVar, b bVar) {
        j(bVar);
        e(bVar);
        r(cVar, bVar);
        k(bVar);
    }

    private static void e(b bVar) {
        if (bVar.b(8, bVar.d() - 8) != 0) {
            bVar.f(8, bVar.d() - 8, 1);
            return;
        }
        throw new WriterException();
    }

    static void f(a aVar, int i2, b bVar) {
        boolean z;
        int e2 = bVar.e() - 1;
        int d2 = bVar.d() - 1;
        int i3 = 0;
        int i4 = -1;
        while (e2 > 0) {
            if (e2 == 6) {
                e2--;
            }
            while (d2 >= 0 && d2 < bVar.d()) {
                for (int i5 = 0; i5 < 2; i5++) {
                    int i6 = e2 - i5;
                    if (o(bVar.b(i6, d2))) {
                        if (i3 < aVar.m()) {
                            z = aVar.h(i3);
                            i3++;
                        } else {
                            z = false;
                        }
                        if (i2 != -1 && d.f(i2, i6, d2)) {
                            z = !z;
                        }
                        bVar.g(i6, d2, z);
                    }
                }
                d2 += i4;
            }
            i4 = -i4;
            d2 += i4;
            e2 -= 2;
        }
        if (i3 != aVar.m()) {
            throw new WriterException("Not all bits consumed: " + i3 + '/' + aVar.m());
        }
    }

    private static void g(int i2, int i3, b bVar) {
        int i4 = 0;
        while (i4 < 8) {
            int i5 = i2 + i4;
            if (o(bVar.b(i5, i3))) {
                bVar.f(i5, i3, 0);
                i4++;
            } else {
                throw new WriterException();
            }
        }
    }

    private static void h(int i2, int i3, b bVar) {
        for (int i4 = 0; i4 < 5; i4++) {
            for (int i5 = 0; i5 < 5; i5++) {
                bVar.f(i2 + i5, i3 + i4, b[i4][i5]);
            }
        }
    }

    private static void i(int i2, int i3, b bVar) {
        for (int i4 = 0; i4 < 7; i4++) {
            for (int i5 = 0; i5 < 7; i5++) {
                bVar.f(i2 + i5, i3 + i4, a[i4][i5]);
            }
        }
    }

    private static void j(b bVar) {
        int length = a[0].length;
        i(0, 0, bVar);
        i(bVar.e() - length, 0, bVar);
        i(0, bVar.e() - length, bVar);
        g(0, 7, bVar);
        g(bVar.e() - 8, 7, bVar);
        g(0, bVar.e() - 8, bVar);
        m(7, 0, bVar);
        m((bVar.d() - 7) - 1, 0, bVar);
        m(7, bVar.d() - 7, bVar);
    }

    private static void k(b bVar) {
        int i2 = 8;
        while (i2 < bVar.e() - 8) {
            int i3 = i2 + 1;
            int i4 = i3 % 2;
            if (o(bVar.b(i2, 6))) {
                bVar.f(i2, 6, i4);
            }
            if (o(bVar.b(6, i2))) {
                bVar.f(6, i2, i4);
            }
            i2 = i3;
        }
    }

    static void l(com.google.zxing.e.b.a aVar, int i2, b bVar) {
        a aVar2 = new a();
        p(aVar, i2, aVar2);
        for (int i3 = 0; i3 < aVar2.m(); i3++) {
            boolean h2 = aVar2.h((aVar2.m() - 1) - i3);
            int[][] iArr = f4408d;
            bVar.g(iArr[i3][0], iArr[i3][1], h2);
            if (i3 < 8) {
                bVar.g((bVar.e() - i3) - 1, 8, h2);
            } else {
                bVar.g(8, (bVar.d() - 7) + (i3 - 8), h2);
            }
        }
    }

    private static void m(int i2, int i3, b bVar) {
        int i4 = 0;
        while (i4 < 7) {
            int i5 = i3 + i4;
            if (o(bVar.b(i2, i5))) {
                bVar.f(i2, i5, 0);
                i4++;
            } else {
                throw new WriterException();
            }
        }
    }

    static int n(int i2) {
        return 32 - Integer.numberOfLeadingZeros(i2);
    }

    private static boolean o(int i2) {
        return i2 == -1;
    }

    static void p(com.google.zxing.e.b.a aVar, int i2, a aVar2) {
        if (f.b(i2)) {
            int a2 = (aVar.a() << 3) | i2;
            aVar2.e(a2, 5);
            aVar2.e(b(a2, 1335), 10);
            a aVar3 = new a();
            aVar3.e(21522, 15);
            aVar2.t(aVar3);
            if (aVar2.m() != 15) {
                throw new WriterException("should not happen but we got: " + aVar2.m());
            }
            return;
        }
        throw new WriterException("Invalid mask pattern");
    }

    static void q(c cVar, a aVar) {
        aVar.e(cVar.f(), 6);
        aVar.e(b(cVar.f(), 7973), 12);
        if (aVar.m() != 18) {
            throw new WriterException("should not happen but we got: " + aVar.m());
        }
    }

    private static void r(c cVar, b bVar) {
        if (cVar.f() >= 2) {
            int f2 = cVar.f() - 1;
            int[][] iArr = c;
            int[] iArr2 = iArr[f2];
            int length = iArr[f2].length;
            for (int i2 = 0; i2 < length; i2++) {
                for (int i3 = 0; i3 < length; i3++) {
                    int i4 = iArr2[i2];
                    int i5 = iArr2[i3];
                    if (!(i5 == -1 || i4 == -1 || !o(bVar.b(i5, i4)))) {
                        h(i5 - 2, i4 - 2, bVar);
                    }
                }
            }
        }
    }

    static void s(c cVar, b bVar) {
        if (cVar.f() >= 7) {
            a aVar = new a();
            q(cVar, aVar);
            int i2 = 17;
            for (int i3 = 0; i3 < 6; i3++) {
                for (int i4 = 0; i4 < 3; i4++) {
                    boolean h2 = aVar.h(i2);
                    i2--;
                    bVar.g(i3, (bVar.d() - 11) + i4, h2);
                    bVar.g((bVar.d() - 11) + i4, i3, h2);
                }
            }
        }
    }
}
