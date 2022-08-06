package g.b.c.a.k0;

import g.b.c.a.k0.u;
import java.lang.reflect.Array;
import java.math.BigInteger;

/* compiled from: Ed25519Constants */
final class v {
    static final long[] a = d0.c(d(f9668e));
    static final u.a[][] b = ((u.a[][]) Array.newInstance(u.a.class, new int[]{32, 8}));
    static final u.a[] c = new u.a[8];

    /* renamed from: d  reason: collision with root package name */
    private static final BigInteger f9667d = BigInteger.valueOf(2).pow(255).subtract(BigInteger.valueOf(19));

    /* renamed from: e  reason: collision with root package name */
    private static final BigInteger f9668e = BigInteger.valueOf(-121665).multiply(BigInteger.valueOf(121666).modInverse(f9667d)).mod(f9667d);

    /* renamed from: f  reason: collision with root package name */
    private static final BigInteger f9669f = BigInteger.valueOf(2).multiply(f9668e).mod(f9667d);

    /* renamed from: g  reason: collision with root package name */
    private static final BigInteger f9670g = BigInteger.valueOf(2).modPow(f9667d.subtract(BigInteger.ONE).divide(BigInteger.valueOf(4)), f9667d);

    /* compiled from: Ed25519Constants */
    private static class b {
        /* access modifiers changed from: private */
        public BigInteger a;
        /* access modifiers changed from: private */
        public BigInteger b;

        private b() {
        }
    }

    static {
        b bVar = new b();
        BigInteger unused = bVar.b = BigInteger.valueOf(4).multiply(BigInteger.valueOf(5).modInverse(f9667d)).mod(f9667d);
        BigInteger unused2 = bVar.a = c(bVar.b);
        d0.c(d(f9669f));
        d0.c(d(f9670g));
        b bVar2 = bVar;
        for (int i2 = 0; i2 < 32; i2++) {
            b bVar3 = bVar2;
            for (int i3 = 0; i3 < 8; i3++) {
                b[i2][i3] = b(bVar3);
                bVar3 = a(bVar3, bVar2);
            }
            for (int i4 = 0; i4 < 8; i4++) {
                bVar2 = a(bVar2, bVar2);
            }
        }
        b a2 = a(bVar, bVar);
        for (int i5 = 0; i5 < 8; i5++) {
            c[i5] = b(bVar);
            bVar = a(bVar, a2);
        }
    }

    private static b a(b bVar, b bVar2) {
        b bVar3 = new b();
        BigInteger mod = f9668e.multiply(bVar.a.multiply(bVar2.a).multiply(bVar.b).multiply(bVar2.b)).mod(f9667d);
        BigInteger unused = bVar3.a = bVar.a.multiply(bVar2.b).add(bVar2.a.multiply(bVar.b)).multiply(BigInteger.ONE.add(mod).modInverse(f9667d)).mod(f9667d);
        BigInteger unused2 = bVar3.b = bVar.b.multiply(bVar2.b).add(bVar.a.multiply(bVar2.a)).multiply(BigInteger.ONE.subtract(mod).modInverse(f9667d)).mod(f9667d);
        return bVar3;
    }

    private static u.a b(b bVar) {
        return new u.a(d0.c(d(bVar.b.add(bVar.a).mod(f9667d))), d0.c(d(bVar.b.subtract(bVar.a).mod(f9667d))), d0.c(d(f9669f.multiply(bVar.a).multiply(bVar.b).mod(f9667d))));
    }

    private static BigInteger c(BigInteger bigInteger) {
        BigInteger multiply = bigInteger.pow(2).subtract(BigInteger.ONE).multiply(f9668e.multiply(bigInteger.pow(2)).add(BigInteger.ONE).modInverse(f9667d));
        BigInteger modPow = multiply.modPow(f9667d.add(BigInteger.valueOf(3)).divide(BigInteger.valueOf(8)), f9667d);
        if (!modPow.pow(2).subtract(multiply).mod(f9667d).equals(BigInteger.ZERO)) {
            modPow = modPow.multiply(f9670g).mod(f9667d);
        }
        return modPow.testBit(0) ? f9667d.subtract(modPow) : modPow;
    }

    private static byte[] d(BigInteger bigInteger) {
        byte[] bArr = new byte[32];
        byte[] byteArray = bigInteger.toByteArray();
        System.arraycopy(byteArray, 0, bArr, 32 - byteArray.length, byteArray.length);
        for (int i2 = 0; i2 < 16; i2++) {
            byte b2 = bArr[i2];
            int i3 = (32 - i2) - 1;
            bArr[i2] = bArr[i3];
            bArr[i3] = b2;
        }
        return bArr;
    }
}
