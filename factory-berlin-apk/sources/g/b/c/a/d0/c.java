package g.b.c.a.d0;

import g.b.c.a.a0.a;
import g.b.c.a.h0.g1;
import java.security.GeneralSecurityException;

/* compiled from: HybridConfig */
public final class c {
    @Deprecated
    public static final g1 a = g1.O();
    @Deprecated
    public static final g1 b = g1.O();
    @Deprecated
    public static final g1 c = g1.O();

    static {
        new b().c();
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
        a.b();
        a.l(true);
        d.c();
        e.c();
    }
}
