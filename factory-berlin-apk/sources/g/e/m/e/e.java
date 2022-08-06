package g.e.m.e;

import g.e.m.a;
import kotlin.jvm.internal.k;

/* compiled from: RxObservableObserver.kt */
public final class e {
    public static final <T, P> d<T, P> a(g.e.k.e<a<T, P>> eVar, g.e.k.a aVar) {
        k.e(eVar, "$this$observeResult");
        d<T, P> dVar = new d<>(aVar, eVar);
        eVar.r(dVar);
        return dVar;
    }

    public static /* synthetic */ d b(g.e.k.e eVar, g.e.k.a aVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            aVar = null;
        }
        return a(eVar, aVar);
    }
}
