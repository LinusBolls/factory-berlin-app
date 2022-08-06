package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.c0.d;
import kotlin.c0.g;
import kotlin.c0.j.a.h;
import kotlin.e0.c.p;
import kotlinx.coroutines.f3.b;
import kotlinx.coroutines.internal.f;
import kotlinx.coroutines.internal.v;

/* compiled from: CoroutineScope.kt */
public final class j0 {
    public static final i0 a(g gVar) {
        if (gVar.get(x1.f11076e) == null) {
            gVar = gVar.plus(c2.c((x1) null, 1, (Object) null));
        }
        return new f(gVar);
    }

    public static final i0 b() {
        return new f(t2.b((x1) null, 1, (Object) null).plus(a1.c()));
    }

    public static final void c(i0 i0Var, CancellationException cancellationException) {
        x1 x1Var = (x1) i0Var.k().get(x1.f11076e);
        if (x1Var != null) {
            x1Var.a(cancellationException);
            return;
        }
        throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + i0Var).toString());
    }

    public static /* synthetic */ void d(i0 i0Var, CancellationException cancellationException, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            cancellationException = null;
        }
        c(i0Var, cancellationException);
    }

    public static final <R> Object e(p<? super i0, ? super d<? super R>, ? extends Object> pVar, d<? super R> dVar) {
        v vVar = new v(dVar.c(), dVar);
        Object c = b.c(vVar, vVar, pVar);
        if (c == d.c()) {
            h.c(dVar);
        }
        return c;
    }
}
