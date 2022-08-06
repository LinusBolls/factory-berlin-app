package kotlinx.coroutines;

import kotlin.c0.g;
import kotlin.e0.c.p;

/* compiled from: ThreadContextElement.kt */
public interface u2<S> extends g.b {

    /* compiled from: ThreadContextElement.kt */
    public static final class a {
        public static <S, R> R a(u2<S> u2Var, R r, p<? super R, ? super g.b, ? extends R> pVar) {
            return g.b.a.a(u2Var, r, pVar);
        }

        public static <S, E extends g.b> E b(u2<S> u2Var, g.c<E> cVar) {
            return g.b.a.b(u2Var, cVar);
        }

        public static <S> g c(u2<S> u2Var, g.c<?> cVar) {
            return g.b.a.c(u2Var, cVar);
        }

        public static <S> g d(u2<S> u2Var, g gVar) {
            return g.b.a.d(u2Var, gVar);
        }
    }

    S Z(g gVar);

    void o(g gVar, S s);
}
