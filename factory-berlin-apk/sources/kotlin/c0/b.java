package kotlin.c0;

import kotlin.c0.g;
import kotlin.c0.g.b;
import kotlin.e0.c.l;
import kotlin.jvm.internal.k;

/* compiled from: CoroutineContextImpl.kt */
public abstract class b<B extends g.b, E extends B> implements g.c<E> {
    private final g.c<?> a;
    private final l<g.b, E> b;

    public b(g.c<B> cVar, l<? super g.b, ? extends E> lVar) {
        k.e(cVar, "baseKey");
        k.e(lVar, "safeCast");
        this.b = lVar;
        this.a = cVar instanceof b ? ((b) cVar).a : cVar;
    }

    public final boolean a(g.c<?> cVar) {
        k.e(cVar, "key");
        return cVar == this || this.a == cVar;
    }

    public final E b(g.b bVar) {
        k.e(bVar, "element");
        return (g.b) this.b.o(bVar);
    }
}
