package g.b.c.a.i0;

import g.b.c.a.h0.g1;
import java.security.GeneralSecurityException;

/* compiled from: SignatureConfig */
public final class l {
    @Deprecated
    public static final g1 a = g1.O();
    @Deprecated
    public static final g1 b = g1.O();
    public static final g1 c = g1.O();

    static {
        new b().c();
        new a().c();
        new d().c();
        new c().c();
        new g().c();
        new h().c();
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
        a.l(true);
        c.l(true);
        g.m(true);
        i.m(true);
        e.c();
        f.c();
    }
}
