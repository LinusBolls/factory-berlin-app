package g.b.c.a.f0;

import g.b.c.a.h0.g1;
import java.security.GeneralSecurityException;

/* compiled from: MacConfig */
public final class c {
    @Deprecated
    public static final g1 a = g1.O();

    static {
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
        b.m(true);
        a.n(true);
        d.d();
    }
}
