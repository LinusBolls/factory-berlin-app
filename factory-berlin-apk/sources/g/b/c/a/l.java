package g.b.c.a;

import g.b.c.a.h0.f1;
import g.b.c.a.h0.v0;
import g.b.c.a.h0.w0;
import g.b.c.a.h0.x0;
import g.b.c.a.h0.z0;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;

/* compiled from: KeysetManager */
public final class l {
    private final z0.b a;

    private l(z0.b bVar) {
        this.a = bVar;
    }

    private synchronized boolean d(int i2) {
        for (z0.c S : this.a.G()) {
            if (S.S() == i2) {
                return true;
            }
        }
        return false;
    }

    private synchronized z0.c e(x0 x0Var) {
        z0.c.a W;
        v0 p = x.p(x0Var);
        int f2 = f();
        f1 R = x0Var.R();
        if (R == f1.UNKNOWN_PREFIX) {
            R = f1.TINK;
        }
        W = z0.c.W();
        W.D(p);
        W.E(f2);
        W.G(w0.ENABLED);
        W.F(R);
        return (z0.c) W.k();
    }

    private synchronized int f() {
        int g2;
        g2 = g();
        while (d(g2)) {
            g2 = g();
        }
        return g2;
    }

    private static int g() {
        SecureRandom secureRandom = new SecureRandom();
        byte[] bArr = new byte[4];
        byte b = 0;
        while (b == 0) {
            secureRandom.nextBytes(bArr);
            b = ((bArr[0] & Byte.MAX_VALUE) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        }
        return b;
    }

    public static l i() {
        return new l(z0.V());
    }

    public static l j(k kVar) {
        return new l((z0.b) kVar.f().e());
    }

    public synchronized l a(i iVar) {
        b(iVar.b(), false);
        return this;
    }

    @Deprecated
    public synchronized int b(x0 x0Var, boolean z) {
        z0.c e2;
        e2 = e(x0Var);
        this.a.D(e2);
        if (z) {
            this.a.H(e2.S());
        }
        return e2.S();
    }

    public synchronized k c() {
        return k.e((z0) this.a.k());
    }

    public synchronized l h(int i2) {
        int i3 = 0;
        while (i3 < this.a.F()) {
            z0.c E = this.a.E(i3);
            if (E.S() != i2) {
                i3++;
            } else if (E.U().equals(w0.ENABLED)) {
                this.a.H(i2);
            } else {
                throw new GeneralSecurityException("cannot set key as primary because it's not enabled: " + i2);
            }
        }
        throw new GeneralSecurityException("key not found: " + i2);
        return this;
    }
}
