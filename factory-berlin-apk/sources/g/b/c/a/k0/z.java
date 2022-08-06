package g.b.c.a.k0;

import g.b.c.a.a;
import g.b.c.a.q;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: EncryptThenAuthenticate */
public final class z implements a {
    private final g0 a;
    private final q b;
    private final int c;

    public z(g0 g0Var, q qVar, int i2) {
        this.a = g0Var;
        this.b = qVar;
        this.c = i2;
    }

    public byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] a2 = this.a.a(bArr);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] copyOf = Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8);
        return j.a(a2, this.b.b(j.a(bArr2, a2, copyOf)));
    }

    public byte[] b(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i2 = this.c;
        if (length >= i2) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length - i2);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, bArr.length - this.c, bArr.length);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            byte[] copyOf = Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8);
            this.b.a(copyOfRange2, j.a(bArr2, copyOfRange, copyOf));
            return this.a.b(copyOfRange);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
