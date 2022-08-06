package g.b.c.a.a0;

import g.b.c.a.a;
import g.b.c.a.h0.x0;
import g.b.c.a.x;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* compiled from: KmsEnvelopeAead */
public final class i implements a {
    private static final byte[] c = new byte[0];
    private final x0 a;
    private final a b;

    public i(x0 x0Var, a aVar) {
        this.a = x0Var;
        this.b = aVar;
    }

    private byte[] c(byte[] bArr, byte[] bArr2) {
        return ByteBuffer.allocate(bArr.length + 4 + bArr2.length).putInt(bArr.length).put(bArr).put(bArr2).array();
    }

    public byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] f2 = x.o(this.a).f();
        return c(this.b.a(f2, c), ((a) x.i(this.a.S(), f2, a.class)).a(bArr, bArr2));
    }

    public byte[] b(byte[] bArr, byte[] bArr2) {
        try {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            int i2 = wrap.getInt();
            if (i2 <= 0 || i2 > bArr.length - 4) {
                throw new GeneralSecurityException("invalid ciphertext");
            }
            byte[] bArr3 = new byte[i2];
            wrap.get(bArr3, 0, i2);
            byte[] bArr4 = new byte[wrap.remaining()];
            wrap.get(bArr4, 0, wrap.remaining());
            return ((a) x.i(this.a.S(), this.b.b(bArr3, c), a.class)).b(bArr4, bArr2);
        } catch (IndexOutOfBoundsException | NegativeArraySizeException | BufferUnderflowException e2) {
            throw new GeneralSecurityException("invalid ciphertext", e2);
        }
    }
}
