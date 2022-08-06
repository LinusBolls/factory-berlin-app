package g.b.c.a.k0;

import com.google.errorprone.annotations.Immutable;
import g.b.c.a.g0.b;
import g.b.c.a.q;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

@Immutable
/* compiled from: PrfMac */
public class k0 implements q {
    private final b a;
    private final int b;

    public k0(b bVar, int i2) {
        this.a = bVar;
        this.b = i2;
        if (i2 >= 10) {
            bVar.a(new byte[0], i2);
            return;
        }
        throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
    }

    public void a(byte[] bArr, byte[] bArr2) {
        if (!j.b(b(bArr2), bArr)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }

    public byte[] b(byte[] bArr) {
        return this.a.a(bArr, this.b);
    }
}
