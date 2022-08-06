package g.b.c.a.k0;

import g.b.c.a.w;

/* compiled from: Ed25519Verify */
public final class x implements w {
    public x(byte[] bArr) {
        if (bArr.length == 32) {
            f0.a(bArr);
        } else {
            throw new IllegalArgumentException(String.format("Given public key's length is not %s.", new Object[]{32}));
        }
    }
}
