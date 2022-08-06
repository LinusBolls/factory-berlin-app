package g.b.c.a.c0;

import g.b.c.a.d;
import g.b.c.a.k0.j;
import g.b.c.a.r;
import g.b.c.a.s;
import g.b.c.a.x;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Logger;

/* compiled from: DeterministicAeadWrapper */
public class c implements s<d> {
    /* access modifiers changed from: private */
    public static final Logger a = Logger.getLogger(c.class.getName());

    /* compiled from: DeterministicAeadWrapper */
    private static class a implements d {
        private r<d> a;

        public a(r<d> rVar) {
            this.a = rVar;
        }

        public byte[] a(byte[] bArr, byte[] bArr2) {
            return j.a(this.a.b().a(), this.a.b().d().a(bArr, bArr2));
        }

        public byte[] b(byte[] bArr, byte[] bArr2) {
            if (bArr.length > 5) {
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 5);
                byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 5, bArr.length);
                for (r.a d2 : this.a.c(copyOfRange)) {
                    try {
                        return ((d) d2.d()).b(copyOfRange2, bArr2);
                    } catch (GeneralSecurityException e2) {
                        Logger c = c.a;
                        c.info("ciphertext prefix matches a key, but cannot decrypt: " + e2.toString());
                    }
                }
            }
            for (r.a d3 : this.a.e()) {
                try {
                    return ((d) d3.d()).b(bArr, bArr2);
                } catch (GeneralSecurityException unused) {
                }
            }
            throw new GeneralSecurityException("decryption failed");
        }
    }

    c() {
    }

    public static void d() {
        x.s(new c());
    }

    public Class<d> b() {
        return d.class;
    }

    /* renamed from: e */
    public d a(r<d> rVar) {
        return new a(rVar);
    }
}
