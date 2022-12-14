package g.b.c.a.k0;

import java.util.Arrays;

/* compiled from: XChaCha20 */
class s0 extends l {
    s0(byte[] bArr, int i2) {
        super(bArr, i2);
    }

    static int[] n(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[16];
        l.k(iArr3, iArr);
        iArr3[12] = iArr2[0];
        iArr3[13] = iArr2[1];
        iArr3[14] = iArr2[2];
        iArr3[15] = iArr2[3];
        l.l(iArr3);
        iArr3[4] = iArr3[12];
        iArr3[5] = iArr3[13];
        iArr3[6] = iArr3[14];
        iArr3[7] = iArr3[15];
        return Arrays.copyOf(iArr3, 8);
    }

    /* access modifiers changed from: package-private */
    public int[] d(int[] iArr, int i2) {
        if (iArr.length == g() / 4) {
            int[] iArr2 = new int[16];
            l.k(iArr2, n(this.a, iArr));
            iArr2[12] = i2;
            iArr2[13] = 0;
            iArr2[14] = iArr[4];
            iArr2[15] = iArr[5];
            return iArr2;
        }
        throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", new Object[]{Integer.valueOf(iArr.length * 32)}));
    }

    /* access modifiers changed from: package-private */
    public int g() {
        return 24;
    }
}
