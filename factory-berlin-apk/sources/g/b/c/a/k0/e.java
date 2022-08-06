package g.b.c.a.k0;

import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;

/* compiled from: AesGcmHkdfStreaming */
public final class e extends h0 {
    private final int a;

    public e(byte[] bArr, String str, int i2, int i3, int i4) {
        if (bArr.length < 16 || bArr.length < i2) {
            throw new InvalidAlgorithmParameterException("ikm too short, must be >= " + Math.max(16, i2));
        }
        r0.a(i2);
        if (i3 > i4 + a() + 16) {
            Arrays.copyOf(bArr, bArr.length);
            this.a = i2;
            return;
        }
        throw new InvalidAlgorithmParameterException("ciphertextSegmentSize too small");
    }

    public int a() {
        return this.a + 1 + 7;
    }
}
