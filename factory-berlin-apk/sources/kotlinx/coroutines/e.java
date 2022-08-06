package kotlinx.coroutines;

import kotlin.c0.d;
import kotlin.c0.g;
import kotlin.c0.h;
import kotlin.e0.c.p;
import kotlin.jvm.internal.k;
import kotlin.x;
import kotlinx.coroutines.f3.a;
import kotlinx.coroutines.f3.b;
import kotlinx.coroutines.internal.b0;
import kotlinx.coroutines.internal.v;

/* compiled from: Builders.common.kt */
final /* synthetic */ class e {
    public static final x1 a(i0 i0Var, g gVar, l0 l0Var, p<? super i0, ? super d<? super x>, ? extends Object> pVar) {
        a aVar;
        g c = c0.c(i0Var, gVar);
        if (l0Var.f()) {
            aVar = new g2(c, pVar);
        } else {
            aVar = new r2(c, true);
        }
        aVar.U0(l0Var, aVar, pVar);
        return aVar;
    }

    public static /* synthetic */ x1 b(i0 i0Var, g gVar, l0 l0Var, p pVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            gVar = h.f10600g;
        }
        if ((i2 & 2) != 0) {
            l0Var = l0.DEFAULT;
        }
        return d.a(i0Var, gVar, l0Var, pVar);
    }

    /* JADX INFO: finally extract failed */
    public static final <T> Object c(g gVar, p<? super i0, ? super d<? super T>, ? extends Object> pVar, d<? super T> dVar) {
        Object obj;
        g c = dVar.c();
        g plus = c.plus(gVar);
        d3.a(plus);
        if (plus == c) {
            v vVar = new v(plus, dVar);
            obj = b.c(vVar, vVar, pVar);
        } else if (k.a((kotlin.c0.e) plus.get(kotlin.c0.e.c), (kotlin.c0.e) c.get(kotlin.c0.e.c))) {
            b3 b3Var = new b3(plus, dVar);
            Object c2 = b0.c(plus, (Object) null);
            try {
                Object c3 = b.c(b3Var, b3Var, pVar);
                b0.a(plus, c2);
                obj = c3;
            } catch (Throwable th) {
                b0.a(plus, c2);
                throw th;
            }
        } else {
            w0 w0Var = new w0(plus, dVar);
            w0Var.Q0();
            a.b(pVar, w0Var, w0Var);
            obj = w0Var.W0();
        }
        if (obj == d.c()) {
            kotlin.c0.j.a.h.c(dVar);
        }
        return obj;
    }
}
