package kotlinx.coroutines;

import kotlin.c0.d;
import kotlin.c0.g;
import kotlin.c0.j.a.h;
import kotlin.x;

/* compiled from: Yield.kt */
public final class d3 {
    public static final void a(g gVar) {
        x1 x1Var = (x1) gVar.get(x1.f11076e);
        if (x1Var != null && !x1Var.b()) {
            throw x1Var.K();
        }
    }

    public static final Object b(d<? super x> dVar) {
        Object obj;
        g c = dVar.c();
        a(c);
        d<? super x> b = c.b(dVar);
        if (!(b instanceof u0)) {
            b = null;
        }
        u0 u0Var = (u0) b;
        if (u0Var != null) {
            if (u0Var.f11068m.n0(c)) {
                u0Var.n(c, x.a);
            } else {
                c3 c3Var = new c3();
                u0Var.n(c.plus(c3Var), x.a);
                if (c3Var.f10729g) {
                    obj = v0.c(u0Var) ? d.c() : x.a;
                }
            }
            obj = d.c();
        } else {
            obj = x.a;
        }
        if (obj == d.c()) {
            h.c(dVar);
        }
        return obj == d.c() ? obj : x.a;
    }
}
