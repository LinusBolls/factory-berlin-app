package g.b.c.a.c0;

import g.b.c.a.h0.g1;
import java.security.GeneralSecurityException;

/* compiled from: DeterministicAeadConfig */
public final class b {
    @Deprecated
    public static final g1 a = g1.O();
    @Deprecated
    public static final g1 b = g1.O();

    static {
        new a().c();
        try {
            a();
        } catch (GeneralSecurityException e2) {
            throw new ExceptionInInitializerError(e2);
        }
    }

    @Deprecated
    public static void a() {
        b();
    }

    public static void b() {
        a.n(true);
        c.d();
    }
}
