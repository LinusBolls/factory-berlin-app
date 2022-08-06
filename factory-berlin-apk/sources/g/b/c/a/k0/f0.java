package g.b.c.a.k0;

/* compiled from: ImmutableByteArray */
public final class f0 {
    private final byte[] a;

    private f0(byte[] bArr, int i2, int i3) {
        byte[] bArr2 = new byte[i3];
        this.a = bArr2;
        System.arraycopy(bArr, i2, bArr2, 0, i3);
    }

    public static f0 a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return b(bArr, 0, bArr.length);
    }

    public static f0 b(byte[] bArr, int i2, int i3) {
        return new f0(bArr, i2, i3);
    }
}
