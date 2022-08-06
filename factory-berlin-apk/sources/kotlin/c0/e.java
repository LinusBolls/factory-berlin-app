package kotlin.c0;

import kotlin.c0.g;
import kotlin.jvm.internal.k;

/* compiled from: ContinuationInterceptor.kt */
public interface e extends g.b {
    public static final b c = b.a;

    /* compiled from: ContinuationInterceptor.kt */
    public static final class a {
        public static <E extends g.b> E a(e eVar, g.c<E> cVar) {
            k.e(cVar, "key");
            if (cVar instanceof b) {
                b bVar = (b) cVar;
                if (!bVar.a(eVar.getKey())) {
                    return null;
                }
                E b = bVar.b(eVar);
                if (!(b instanceof g.b)) {
                    return null;
                }
                return b;
            } else if (e.c != cVar) {
                return null;
            } else {
                if (eVar != null) {
                    return eVar;
                }
                throw new NullPointerException("null cannot be cast to non-null type E");
            }
        }

        public static g b(e eVar, g.c<?> cVar) {
            k.e(cVar, "key");
            if (!(cVar instanceof b)) {
                return e.c == cVar ? h.f10600g : eVar;
            }
            b bVar = (b) cVar;
            return (!bVar.a(eVar.getKey()) || bVar.b(eVar) == null) ? eVar : h.f10600g;
        }
    }

    /* compiled from: ContinuationInterceptor.kt */
    public static final class b implements g.c<e> {
        static final /* synthetic */ b a = new b();

        private b() {
        }
    }

    void h(d<?> dVar);

    <T> d<T> i(d<? super T> dVar);
}
