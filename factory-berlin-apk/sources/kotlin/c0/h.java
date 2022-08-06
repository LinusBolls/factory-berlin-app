package kotlin.c0;

import java.io.Serializable;
import kotlin.c0.g;
import kotlin.e0.c.p;
import kotlin.jvm.internal.k;

/* compiled from: CoroutineContextImpl.kt */
public final class h implements g, Serializable {

    /* renamed from: g  reason: collision with root package name */
    public static final h f10600g = new h();

    private h() {
    }

    public <R> R fold(R r, p<? super R, ? super g.b, ? extends R> pVar) {
        k.e(pVar, "operation");
        return r;
    }

    public <E extends g.b> E get(g.c<E> cVar) {
        k.e(cVar, "key");
        return null;
    }

    public int hashCode() {
        return 0;
    }

    public g minusKey(g.c<?> cVar) {
        k.e(cVar, "key");
        return this;
    }

    public g plus(g gVar) {
        k.e(gVar, "context");
        return gVar;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }
}
