package g.b.c.a.k0;

/* compiled from: ChaCha20 */
class k extends l {
    k(byte[] bArr, int i2) {
        super(bArr, i2);
    }

    /* access modifiers changed from: package-private */
    public int[] d(int[] iArr, int i2) {
        if (iArr.length == g() / 4) {
            int[] iArr2 = new int[16];
            l.k(iArr2, this.a);
            iArr2[12] = i2;
            System.arraycopy(iArr, 0, iArr2, 13, iArr.length);
            return iArr2;
        }
        throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", new Object[]{Integer.valueOf(iArr.length * 32)}));
    }

    /* access modifiers changed from: package-private */
    public int g() {
        return 12;
    }
}
