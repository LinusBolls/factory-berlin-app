package g.b.c.a;

import g.b.c.a.h0.a1;
import g.b.c.a.h0.f1;
import g.b.c.a.h0.v0;
import g.b.c.a.h0.w0;
import g.b.c.a.h0.z0;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* compiled from: Util */
class z {
    static {
        Charset.forName("UTF-8");
    }

    public static a1.c a(z0.c cVar) {
        a1.c.a S = a1.c.S();
        S.G(cVar.R().S());
        S.F(cVar.U());
        S.E(cVar.T());
        S.D(cVar.S());
        return (a1.c) S.k();
    }

    public static a1 b(z0 z0Var) {
        a1.b S = a1.S();
        S.E(z0Var.U());
        for (z0.c a : z0Var.T()) {
            S.D(a(a));
        }
        return (a1) S.k();
    }

    public static void c(z0.c cVar) {
        if (!cVar.V()) {
            throw new GeneralSecurityException(String.format("key %d has no key data", new Object[]{Integer.valueOf(cVar.S())}));
        } else if (cVar.T() == f1.UNKNOWN_PREFIX) {
            throw new GeneralSecurityException(String.format("key %d has unknown prefix", new Object[]{Integer.valueOf(cVar.S())}));
        } else if (cVar.U() == w0.UNKNOWN_STATUS) {
            throw new GeneralSecurityException(String.format("key %d has unknown status", new Object[]{Integer.valueOf(cVar.S())}));
        }
    }

    public static void d(z0 z0Var) {
        int U = z0Var.U();
        int i2 = 0;
        boolean z = false;
        boolean z2 = true;
        for (z0.c next : z0Var.T()) {
            if (next.U() == w0.ENABLED) {
                c(next);
                if (next.S() == U) {
                    if (!z) {
                        z = true;
                    } else {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                }
                if (next.R().R() != v0.c.ASYMMETRIC_PUBLIC) {
                    z2 = false;
                }
                i2++;
            }
        }
        if (i2 == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        } else if (!z && !z2) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
    }
}
