package kotlinx.coroutines.e3;

import kotlin.c0.d;
import kotlin.e0.c.p;
import kotlin.x;

/* compiled from: Builders.kt */
final class r<T> extends a<T> {
    private final p<d<? super T>, d<? super x>, Object> a;

    public r(p<? super d<? super T>, ? super d<? super x>, ? extends Object> pVar) {
        this.a = pVar;
    }

    public Object c(d<? super T> dVar, d<? super x> dVar2) {
        Object l2 = this.a.l(dVar, dVar2);
        if (l2 == d.c()) {
            return l2;
        }
        return x.a;
    }
}
