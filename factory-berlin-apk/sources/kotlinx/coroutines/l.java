package kotlinx.coroutines;

import kotlin.c0.d;
import kotlinx.coroutines.internal.m;

/* compiled from: CancellableContinuation.kt */
public final class l {
    public static final void a(i<?> iVar, c1 c1Var) {
        iVar.B(new d1(c1Var));
    }

    public static final <T> j<T> b(d<? super T> dVar) {
        if (!(dVar instanceof u0)) {
            return new j<>(dVar, 0);
        }
        j<T> l2 = ((u0) dVar).l();
        if (l2 != null) {
            if (!l2.H()) {
                l2 = null;
            }
            if (l2 != null) {
                return l2;
            }
        }
        return new j<>(dVar, 0);
    }

    public static final void c(i<?> iVar, m mVar) {
        iVar.B(new m2(mVar));
    }
}
