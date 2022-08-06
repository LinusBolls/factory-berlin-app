package g.e.m;

import kotlin.e0.c.l;
import kotlin.jvm.internal.k;

/* compiled from: Response.kt */
public final class b {
    public static final <I, O, P> a<O, P> a(a<I, P> aVar, l<? super I, ? extends O> lVar) {
        k.e(lVar, "mapper");
        if (aVar == null) {
            return null;
        }
        return new a<>(aVar.f(), lVar.o(aVar.c()), aVar.e(), aVar.d());
    }
}
