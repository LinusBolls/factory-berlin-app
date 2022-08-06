package kotlinx.coroutines.flow.internal;

import kotlin.c0.d;
import kotlin.c0.g;
import kotlinx.coroutines.internal.v;

/* compiled from: FlowCoroutine.kt */
final class h<T> extends v<T> {
    public h(g gVar, d<? super T> dVar) {
        super(gVar, dVar);
    }

    public boolean R(Throwable th) {
        if (th instanceof ChildCancelledException) {
            return true;
        }
        return J(th);
    }
}
