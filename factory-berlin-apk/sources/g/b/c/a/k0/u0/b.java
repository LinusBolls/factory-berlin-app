package g.b.c.a.k0.u0;

import com.google.errorprone.annotations.Immutable;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;

@Immutable
/* compiled from: PrfImpl */
public class b implements g.b.c.a.g0.b {
    private final c a;

    private b(c cVar) {
        this.a = cVar;
    }

    private static byte[] b(InputStream inputStream, int i2) {
        try {
            byte[] bArr = new byte[i2];
            int i3 = 0;
            while (i3 < i2) {
                int read = inputStream.read(bArr, i3, i2 - i3);
                if (read > 0) {
                    i3 += read;
                } else {
                    throw new GeneralSecurityException("Provided StreamingPrf terminated before providing requested number of bytes.");
                }
            }
            return bArr;
        } catch (IOException e2) {
            throw new GeneralSecurityException(e2);
        }
    }

    public static b c(c cVar) {
        return new b(cVar);
    }

    public byte[] a(byte[] bArr, int i2) {
        if (bArr == null) {
            throw new GeneralSecurityException("Invalid input provided.");
        } else if (i2 > 0) {
            return b(this.a.a(bArr), i2);
        } else {
            throw new GeneralSecurityException("Invalid outputLength specified.");
        }
    }
}
