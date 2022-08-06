package g.b.c.a.k0;

import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;

/* compiled from: AesCtrHmacStreaming */
public final class b extends h0 {
    public b(byte[] bArr, String str, int i2, String str2, int i3, int i4, int i5) {
        a(bArr.length, i2, str2, i3, i4, i5);
        Arrays.copyOf(bArr, bArr.length);
    }

    private static void a(int i2, int i3, String str, int i4, int i5, int i6) {
        if (i2 < 16 || i2 < i3) {
            throw new InvalidAlgorithmParameterException("ikm too short, must be >= " + Math.max(16, i3));
        }
        r0.a(i3);
        if (i4 < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small " + i4);
        } else if ((str.equals("HmacSha1") && i4 > 20) || ((str.equals("HmacSha256") && i4 > 32) || (str.equals("HmacSha512") && i4 > 64))) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        } else if (((((i5 - i6) - i4) - i3) - 7) - 1 <= 0) {
            throw new InvalidAlgorithmParameterException("ciphertextSegmentSize too small");
        }
    }
}
