package g.b.c.a;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.i;
import com.google.crypto.tink.shaded.protobuf.p;
import g.b.c.a.h0.a1;
import g.b.c.a.h0.n0;
import g.b.c.a.h0.z0;
import java.security.GeneralSecurityException;

/* compiled from: KeysetHandle */
public final class k {
    private final z0 a;

    private k(z0 z0Var) {
        this.a = z0Var;
    }

    public static void a(n0 n0Var) {
        if (n0Var == null || n0Var.P().size() == 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    public static void b(z0 z0Var) {
        if (z0Var == null || z0Var.S() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    private static z0 c(n0 n0Var, a aVar) {
        try {
            z0 W = z0.W(aVar.b(n0Var.P().y(), new byte[0]), p.b());
            b(W);
            return W;
        } catch (InvalidProtocolBufferException unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    private static n0 d(z0 z0Var, a aVar) {
        byte[] a2 = aVar.a(z0Var.f(), new byte[0]);
        try {
            if (z0.W(aVar.b(a2, new byte[0]), p.b()).equals(z0Var)) {
                n0.b Q = n0.Q();
                Q.D(i.g(a2));
                Q.E(z.b(z0Var));
                return (n0) Q.k();
            }
            throw new GeneralSecurityException("cannot encrypt keyset");
        } catch (InvalidProtocolBufferException unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    static final k e(z0 z0Var) {
        b(z0Var);
        return new k(z0Var);
    }

    public static final k i(m mVar, a aVar) {
        n0 b = mVar.b();
        a(b);
        return new k(c(b, aVar));
    }

    /* access modifiers changed from: package-private */
    public z0 f() {
        return this.a;
    }

    public a1 g() {
        return z.b(this.a);
    }

    public <P> P h(Class<P> cls) {
        return x.u(x.l(this, cls));
    }

    public void j(n nVar, a aVar) {
        nVar.b(d(this.a, aVar));
    }

    public String toString() {
        return g().toString();
    }
}
