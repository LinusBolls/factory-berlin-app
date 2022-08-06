package g.e.n.c.e.d;

import g.e.m.c;
import g.e.n.c.a;
import g.e.n.c.b;
import g.e.n.c.e.c;
import kotlin.c0.d;
import kotlin.jvm.internal.k;

/* compiled from: GetBookingsUseCaseImpl.kt */
public final class e implements d {
    private final a a;

    public e(a aVar) {
        k.e(aVar, "bookingRepository");
        this.a = aVar;
    }

    public Object a(String str, String str2, a aVar, d<? super c<b<g.e.n.c.e.b>>> dVar) {
        g.e.n.c.i.c cVar;
        g.e.n.c.i.c b = g.e.n.c.i.c.f10076d.b(str);
        if (b != null) {
            if (str2 != null) {
                cVar = g.e.n.c.i.c.f10076d.b(str2);
                if (cVar == null) {
                    return new c.a((Throwable) new Exception("could not parse " + str2));
                }
            } else {
                cVar = null;
            }
            return this.a.d(b, cVar, n.i(c.a.C0701c.b, c.a.b.b), aVar, dVar);
        }
        return new c.a((Throwable) new Exception("could not parse " + str));
    }
}
