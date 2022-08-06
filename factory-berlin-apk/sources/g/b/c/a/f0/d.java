package g.b.c.a.f0;

import g.b.c.a.h0.f1;
import g.b.c.a.k0.j;
import g.b.c.a.q;
import g.b.c.a.r;
import g.b.c.a.s;
import g.b.c.a.x;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Logger;

/* compiled from: MacWrapper */
class d implements s<q> {
    /* access modifiers changed from: private */
    public static final Logger a = Logger.getLogger(d.class.getName());

    /* compiled from: MacWrapper */
    private static class b implements q {
        private final r<q> a;
        private final byte[] b;

        public void a(byte[] bArr, byte[] bArr2) {
            if (bArr.length > 5) {
                byte[] copyOf = Arrays.copyOf(bArr, 5);
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
                for (r.a next : this.a.c(copyOf)) {
                    try {
                        if (next.c().equals(f1.LEGACY)) {
                            ((q) next.d()).a(copyOfRange, j.a(bArr2, this.b));
                            return;
                        }
                        ((q) next.d()).a(copyOfRange, bArr2);
                        return;
                    } catch (GeneralSecurityException e2) {
                        Logger c = d.a;
                        c.info("tag prefix matches a key, but cannot verify: " + e2);
                    }
                }
                for (r.a d2 : this.a.e()) {
                    try {
                        ((q) d2.d()).a(bArr, bArr2);
                        return;
                    } catch (GeneralSecurityException unused) {
                    }
                }
                throw new GeneralSecurityException("invalid MAC");
            }
            throw new GeneralSecurityException("tag too short");
        }

        public byte[] b(byte[] bArr) {
            if (this.a.b().c().equals(f1.LEGACY)) {
                return j.a(this.a.b().a(), this.a.b().d().b(j.a(bArr, this.b)));
            }
            return j.a(this.a.b().a(), this.a.b().d().b(bArr));
        }

        private b(r<q> rVar) {
            this.b = new byte[]{0};
            this.a = rVar;
        }
    }

    d() {
    }

    public static void d() {
        x.s(new d());
    }

    public Class<q> b() {
        return q.class;
    }

    /* renamed from: e */
    public q a(r<q> rVar) {
        return new b(rVar);
    }
}
