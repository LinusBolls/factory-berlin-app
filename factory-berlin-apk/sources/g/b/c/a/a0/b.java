package g.b.c.a.a0;

import g.b.c.a.k0.j;
import g.b.c.a.r;
import g.b.c.a.s;
import g.b.c.a.x;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Logger;

/* compiled from: AeadWrapper */
public class b implements s<g.b.c.a.a> {
    /* access modifiers changed from: private */
    public static final Logger a = Logger.getLogger(b.class.getName());

    /* renamed from: g.b.c.a.a0.b$b  reason: collision with other inner class name */
    /* compiled from: AeadWrapper */
    private static class C0640b implements g.b.c.a.a {
        private final r<g.b.c.a.a> a;

        public byte[] a(byte[] bArr, byte[] bArr2) {
            return j.a(this.a.b().a(), this.a.b().d().a(bArr, bArr2));
        }

        public byte[] b(byte[] bArr, byte[] bArr2) {
            if (bArr.length > 5) {
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 5);
                byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 5, bArr.length);
                for (r.a d2 : this.a.c(copyOfRange)) {
                    try {
                        return ((g.b.c.a.a) d2.d()).b(copyOfRange2, bArr2);
                    } catch (GeneralSecurityException e2) {
                        Logger c = b.a;
                        c.info("ciphertext prefix matches a key, but cannot decrypt: " + e2.toString());
                    }
                }
            }
            for (r.a d3 : this.a.e()) {
                try {
                    return ((g.b.c.a.a) d3.d()).b(bArr, bArr2);
                } catch (GeneralSecurityException unused) {
                }
            }
            throw new GeneralSecurityException("decryption failed");
        }

        private C0640b(r<g.b.c.a.a> rVar) {
            this.a = rVar;
        }
    }

    b() {
    }

    public static void d() {
        x.s(new b());
    }

    public Class<g.b.c.a.a> b() {
        return g.b.c.a.a.class;
    }

    /* renamed from: e */
    public g.b.c.a.a a(r<g.b.c.a.a> rVar) {
        return new C0640b(rVar);
    }
}
