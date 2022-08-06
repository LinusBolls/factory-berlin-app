package g.b.c.a.j0;

import g.b.c.a.h0.g1;
import java.security.GeneralSecurityException;

/* compiled from: StreamingAeadConfig */
public final class c {
    @Deprecated
    public static final g1 a = g1.O();
    public static final g1 b = g1.O();

    static {
        new a().c();
        new b().c();
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
        a.m(true);
        b.m(true);
        f.c();
    }
}
