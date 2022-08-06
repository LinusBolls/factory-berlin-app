package kotlin.c0;

import kotlin.e0.c.p;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;

/* compiled from: CoroutineContext.kt */
public interface g {

    /* compiled from: CoroutineContext.kt */
    public static final class a {

        /* renamed from: kotlin.c0.g$a$a  reason: collision with other inner class name */
        /* compiled from: CoroutineContext.kt */
        static final class C0756a extends l implements p<g, b, g> {

            /* renamed from: h  reason: collision with root package name */
            public static final C0756a f10599h = new C0756a();

            C0756a() {
                super(2);
            }

            /* renamed from: a */
            public final g l(g gVar, b bVar) {
                k.e(gVar, "acc");
                k.e(bVar, "element");
                g minusKey = gVar.minusKey(bVar.getKey());
                if (minusKey == h.f10600g) {
                    return bVar;
                }
                e eVar = (e) minusKey.get(e.c);
                if (eVar == null) {
                    return new c(minusKey, bVar);
                }
                g minusKey2 = minusKey.minusKey(e.c);
                if (minusKey2 == h.f10600g) {
                    return new c(bVar, eVar);
                }
                return new c(new c(minusKey2, bVar), eVar);
            }
        }

        public static g a(g gVar, g gVar2) {
            k.e(gVar2, "context");
            return gVar2 == h.f10600g ? gVar : (g) gVar2.fold(gVar, C0756a.f10599h);
        }
    }

    /* compiled from: CoroutineContext.kt */
    public interface b extends g {

        /* compiled from: CoroutineContext.kt */
        public static final class a {
            public static <R> R a(b bVar, R r, p<? super R, ? super b, ? extends R> pVar) {
                k.e(pVar, "operation");
                return pVar.l(r, bVar);
            }

            public static <E extends b> E b(b bVar, c<E> cVar) {
                k.e(cVar, "key");
                if (!k.a(bVar.getKey(), cVar)) {
                    return null;
                }
                if (bVar != null) {
                    return bVar;
                }
                throw new NullPointerException("null cannot be cast to non-null type E");
            }

            public static g c(b bVar, c<?> cVar) {
                k.e(cVar, "key");
                return k.a(bVar.getKey(), cVar) ? h.f10600g : bVar;
            }

            public static g d(b bVar, g gVar) {
                k.e(gVar, "context");
                return a.a(bVar, gVar);
            }
        }

        <E extends b> E get(c<E> cVar);

        c<?> getKey();
    }

    /* compiled from: CoroutineContext.kt */
    public interface c<E extends b> {
    }

    <R> R fold(R r, p<? super R, ? super b, ? extends R> pVar);

    <E extends b> E get(c<E> cVar);

    g minusKey(c<?> cVar);

    g plus(g gVar);
}
