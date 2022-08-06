package kotlinx.coroutines;

import kotlin.c0.d;
import kotlin.c0.e;
import kotlin.c0.g;
import kotlin.c0.j.a.h;
import kotlin.x;

/* compiled from: Delay.kt */
public final class t0 {
    public static final Object a(long j2, d<? super x> dVar) {
        if (j2 <= 0) {
            return x.a;
        }
        j jVar = new j(c.b(dVar), 1);
        jVar.w();
        b(jVar.c()).j(j2, jVar);
        Object u = jVar.u();
        if (u == d.c()) {
            h.c(dVar);
        }
        return u;
    }

    public static final s0 b(g gVar) {
        g.b bVar = gVar.get(e.c);
        if (!(bVar instanceof s0)) {
            bVar = null;
        }
        s0 s0Var = (s0) bVar;
        return s0Var != null ? s0Var : q0.a();
    }
}
