package g.b.c.a.k0;

import java.security.MessageDigest;
import java.util.Arrays;

/* compiled from: Ed25519 */
final class u {
    private static final a a = new a(new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
    private static final b b = new b(new c(new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}), new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0});

    /* compiled from: Ed25519 */
    static class a {
        final long[] a;
        final long[] b;
        final long[] c;

        a() {
            this(new long[10], new long[10], new long[10]);
        }

        /* access modifiers changed from: package-private */
        public void a(a aVar, int i2) {
            o.a(this.a, aVar.a, i2);
            o.a(this.b, aVar.b, i2);
            o.a(this.c, aVar.c, i2);
        }

        /* access modifiers changed from: package-private */
        public void b(long[] jArr, long[] jArr2) {
            System.arraycopy(jArr2, 0, jArr, 0, 10);
        }

        a(long[] jArr, long[] jArr2, long[] jArr3) {
            this.a = jArr;
            this.b = jArr2;
            this.c = jArr3;
        }

        a(a aVar) {
            this.a = Arrays.copyOf(aVar.a, 10);
            this.b = Arrays.copyOf(aVar.b, 10);
            this.c = Arrays.copyOf(aVar.c, 10);
        }
    }

    /* compiled from: Ed25519 */
    private static class c {
        final long[] a;
        final long[] b;
        final long[] c;

        c() {
            this(new long[10], new long[10], new long[10]);
        }

        static c a(c cVar, b bVar) {
            d0.f(cVar.a, bVar.a.a, bVar.b);
            long[] jArr = cVar.b;
            c cVar2 = bVar.a;
            d0.f(jArr, cVar2.b, cVar2.c);
            d0.f(cVar.c, bVar.a.c, bVar.b);
            return cVar;
        }

        /* access modifiers changed from: package-private */
        public boolean b() {
            long[] jArr = new long[10];
            d0.k(jArr, this.a);
            long[] jArr2 = new long[10];
            d0.k(jArr2, this.b);
            long[] jArr3 = new long[10];
            d0.k(jArr3, this.c);
            long[] jArr4 = new long[10];
            d0.k(jArr4, jArr3);
            long[] jArr5 = new long[10];
            d0.m(jArr5, jArr2, jArr);
            d0.f(jArr5, jArr5, jArr3);
            long[] jArr6 = new long[10];
            d0.f(jArr6, jArr, jArr2);
            d0.f(jArr6, jArr6, v.a);
            d0.n(jArr6, jArr4);
            d0.h(jArr6, jArr6);
            return j.b(d0.a(jArr5), d0.a(jArr6));
        }

        /* access modifiers changed from: package-private */
        public byte[] c() {
            long[] jArr = new long[10];
            long[] jArr2 = new long[10];
            long[] jArr3 = new long[10];
            d0.e(jArr, this.c);
            d0.f(jArr2, this.a, jArr);
            d0.f(jArr3, this.b, jArr);
            byte[] a2 = d0.a(jArr3);
            a2[31] = (byte) ((u.f(jArr2) << 7) ^ a2[31]);
            return a2;
        }

        c(long[] jArr, long[] jArr2, long[] jArr3) {
            this.a = jArr;
            this.b = jArr2;
            this.c = jArr3;
        }

        c(c cVar) {
            this.a = Arrays.copyOf(cVar.a, 10);
            this.b = Arrays.copyOf(cVar.b, 10);
            this.c = Arrays.copyOf(cVar.c, 10);
        }

        c(b bVar) {
            this();
            a(this, bVar);
        }
    }

    /* compiled from: Ed25519 */
    private static class d {
        final c a;
        final long[] b;

        d() {
            this(new c(), new long[10]);
        }

        /* access modifiers changed from: private */
        public static d b(d dVar, b bVar) {
            d0.f(dVar.a.a, bVar.a.a, bVar.b);
            long[] jArr = dVar.a.b;
            c cVar = bVar.a;
            d0.f(jArr, cVar.b, cVar.c);
            d0.f(dVar.a.c, bVar.a.c, bVar.b);
            long[] jArr2 = dVar.b;
            c cVar2 = bVar.a;
            d0.f(jArr2, cVar2.a, cVar2.b);
            return dVar;
        }

        d(c cVar, long[] jArr) {
            this.a = cVar;
            this.b = jArr;
        }
    }

    private static void b(b bVar, d dVar, a aVar) {
        long[] jArr = new long[10];
        long[] jArr2 = bVar.a.a;
        c cVar = dVar.a;
        d0.o(jArr2, cVar.b, cVar.a);
        long[] jArr3 = bVar.a.b;
        c cVar2 = dVar.a;
        d0.m(jArr3, cVar2.b, cVar2.a);
        long[] jArr4 = bVar.a.b;
        d0.f(jArr4, jArr4, aVar.b);
        c cVar3 = bVar.a;
        d0.f(cVar3.c, cVar3.a, aVar.a);
        d0.f(bVar.b, dVar.b, aVar.c);
        aVar.b(bVar.a.a, dVar.a.c);
        long[] jArr5 = bVar.a.a;
        d0.o(jArr, jArr5, jArr5);
        c cVar4 = bVar.a;
        d0.m(cVar4.a, cVar4.c, cVar4.b);
        c cVar5 = bVar.a;
        long[] jArr6 = cVar5.b;
        d0.o(jArr6, cVar5.c, jArr6);
        d0.o(bVar.a.c, jArr, bVar.b);
        long[] jArr7 = bVar.b;
        d0.m(jArr7, jArr, jArr7);
    }

    private static void c(b bVar, c cVar) {
        long[] jArr = new long[10];
        d0.k(bVar.a.a, cVar.a);
        d0.k(bVar.a.c, cVar.b);
        d0.k(bVar.b, cVar.c);
        long[] jArr2 = bVar.b;
        d0.o(jArr2, jArr2, jArr2);
        d0.o(bVar.a.b, cVar.a, cVar.b);
        d0.k(jArr, bVar.a.b);
        c cVar2 = bVar.a;
        d0.o(cVar2.b, cVar2.c, cVar2.a);
        c cVar3 = bVar.a;
        long[] jArr3 = cVar3.c;
        d0.m(jArr3, jArr3, cVar3.a);
        c cVar4 = bVar.a;
        d0.m(cVar4.a, jArr, cVar4.b);
        long[] jArr4 = bVar.b;
        d0.m(jArr4, jArr4, bVar.a.c);
    }

    private static int d(int i2, int i3) {
        int i4 = (~(i2 ^ i3)) & 255;
        int i5 = i4 & (i4 << 4);
        int i6 = i5 & (i5 << 2);
        return ((i6 & (i6 << 1)) >> 7) & 1;
    }

    static byte[] e(byte[] bArr) {
        MessageDigest a2 = a0.f9630i.a("SHA-512");
        a2.update(bArr, 0, 32);
        byte[] digest = a2.digest();
        digest[0] = (byte) (digest[0] & 248);
        digest[31] = (byte) (digest[31] & Byte.MAX_VALUE);
        digest[31] = (byte) (digest[31] | 64);
        return digest;
    }

    /* access modifiers changed from: private */
    public static int f(long[] jArr) {
        return d0.a(jArr)[0] & 1;
    }

    private static void g(long[] jArr, long[] jArr2) {
        for (int i2 = 0; i2 < jArr2.length; i2++) {
            jArr[i2] = -jArr2[i2];
        }
    }

    private static c h(byte[] bArr) {
        int i2;
        byte[] bArr2 = new byte[64];
        int i3 = 0;
        while (true) {
            if (i3 >= 32) {
                break;
            }
            int i4 = i3 * 2;
            bArr2[i4 + 0] = (byte) (((bArr[i3] & 255) >> 0) & 15);
            bArr2[i4 + 1] = (byte) (((bArr[i3] & 255) >> 4) & 15);
            i3++;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < 63; i6++) {
            bArr2[i6] = (byte) (bArr2[i6] + i5);
            i5 = (bArr2[i6] + 8) >> 4;
            bArr2[i6] = (byte) (bArr2[i6] - (i5 << 4));
        }
        bArr2[63] = (byte) (bArr2[63] + i5);
        b bVar = new b(b);
        d dVar = new d();
        for (i2 = 1; i2 < 64; i2 += 2) {
            a aVar = new a(a);
            j(aVar, i2 / 2, bArr2[i2]);
            d unused = d.b(dVar, bVar);
            b(bVar, dVar, aVar);
        }
        c cVar = new c();
        c.a(cVar, bVar);
        c(bVar, cVar);
        c.a(cVar, bVar);
        c(bVar, cVar);
        c.a(cVar, bVar);
        c(bVar, cVar);
        c.a(cVar, bVar);
        c(bVar, cVar);
        for (int i7 = 0; i7 < 64; i7 += 2) {
            a aVar2 = new a(a);
            j(aVar2, i7 / 2, bArr2[i7]);
            d unused2 = d.b(dVar, bVar);
            b(bVar, dVar, aVar2);
        }
        c cVar2 = new c(bVar);
        if (cVar2.b()) {
            return cVar2;
        }
        throw new IllegalStateException("arithmetic error in scalar multiplication");
    }

    static byte[] i(byte[] bArr) {
        return h(bArr).c();
    }

    private static void j(a aVar, int i2, byte b2) {
        int i3 = (b2 & 255) >> 7;
        int i4 = b2 - (((-i3) & b2) << 1);
        aVar.a(v.b[i2][0], d(i4, 1));
        aVar.a(v.b[i2][1], d(i4, 2));
        aVar.a(v.b[i2][2], d(i4, 3));
        aVar.a(v.b[i2][3], d(i4, 4));
        aVar.a(v.b[i2][4], d(i4, 5));
        aVar.a(v.b[i2][5], d(i4, 6));
        aVar.a(v.b[i2][6], d(i4, 7));
        aVar.a(v.b[i2][7], d(i4, 8));
        long[] copyOf = Arrays.copyOf(aVar.b, 10);
        long[] copyOf2 = Arrays.copyOf(aVar.a, 10);
        long[] copyOf3 = Arrays.copyOf(aVar.c, 10);
        g(copyOf3, copyOf3);
        aVar.a(new a(copyOf, copyOf2, copyOf3), i3);
    }

    /* compiled from: Ed25519 */
    private static class b {
        final c a;
        final long[] b;

        b(c cVar, long[] jArr) {
            this.a = cVar;
            this.b = jArr;
        }

        b(b bVar) {
            this.a = new c(bVar.a);
            this.b = Arrays.copyOf(bVar.b, 10);
        }
    }
}
