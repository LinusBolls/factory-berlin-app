package kotlin.c0;

import kotlin.c0.g;
import kotlin.e0.c.p;
import kotlin.jvm.internal.k;

/* compiled from: CoroutineContextImpl.kt */
public abstract class a implements g.b {
    private final g.c<?> key;

    public a(g.c<?> cVar) {
        k.e(cVar, "key");
        this.key = cVar;
    }

    public <R> R fold(R r, p<? super R, ? super g.b, ? extends R> pVar) {
        k.e(pVar, "operation");
        return g.b.a.a(this, r, pVar);
    }

    public <E extends g.b> E get(g.c<E> cVar) {
        k.e(cVar, "key");
        return g.b.a.b(this, cVar);
    }

    public g.c<?> getKey() {
        return this.key;
    }

    public g minusKey(g.c<?> cVar) {
        k.e(cVar, "key");
        return g.b.a.c(this, cVar);
    }

    public g plus(g gVar) {
        k.e(gVar, "context");
        return g.b.a.d(this, gVar);
    }
}
