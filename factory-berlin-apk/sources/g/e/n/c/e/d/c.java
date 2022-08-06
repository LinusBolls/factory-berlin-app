package g.e.n.c.e.d;

import g.e.m.c;
import g.e.n.c.e.b;
import kotlin.c0.d;
import kotlin.jvm.internal.k;

/* compiled from: CreateBookingUseCaseImpl.kt */
public final class c implements b {
    private final a a;

    public c(a aVar) {
        k.e(aVar, "bookingRepository");
        this.a = aVar;
    }

    public Object a(String str, String str2, String str3, String str4, d<? super g.e.m.c<b>> dVar) {
        g.e.n.c.i.c b = g.e.n.c.i.c.f10076d.b(str2);
        if (b != null) {
            g.e.n.c.i.c b2 = g.e.n.c.i.c.f10076d.b(str3);
            if (b2 != null) {
                return this.a.c(str, str4, b, b2, dVar);
            }
            return new c.a((Throwable) new Exception("could not parse " + str3));
        }
        return new c.a((Throwable) new Exception("could not parse " + str2));
    }
}
