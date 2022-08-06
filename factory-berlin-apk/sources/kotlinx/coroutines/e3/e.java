package kotlinx.coroutines.e3;

import kotlin.c0.d;
import kotlin.c0.g;
import kotlin.e0.c.l;
import kotlin.e0.c.p;
import kotlin.e0.c.q;
import kotlin.x;
import kotlinx.coroutines.channels.r;
import kotlinx.coroutines.i0;
import kotlinx.coroutines.x1;

public final class e {
    public static final <T> c<T> a(c<? extends T> cVar, q<? super d<? super T>, ? super Throwable, ? super d<? super x>, ? extends Object> qVar) {
        return l.a(cVar, qVar);
    }

    public static final <T> Object b(c<? extends T> cVar, d<? super T> dVar, d<? super Throwable> dVar2) {
        return l.b(cVar, dVar, dVar2);
    }

    public static final Object c(c<?> cVar, d<? super x> dVar) {
        return h.a(cVar, dVar);
    }

    public static final <T> c<T> d(c<? extends T> cVar) {
        return j.a(cVar);
    }

    public static final <T, K> c<T> e(c<? extends T> cVar, l<? super T, ? extends K> lVar) {
        return j.b(cVar, lVar);
    }

    public static final <T> Object f(d<? super T> dVar, r<? extends T> rVar, d<? super x> dVar2) {
        return g.a(dVar, rVar, dVar2);
    }

    public static final <T> c<T> g() {
        return f.a();
    }

    public static final <T> Object h(c<? extends T> cVar, d<? super T> dVar) {
        return n.a(cVar, dVar);
    }

    public static final <T> c<T> i(p<? super d<? super T>, ? super d<? super x>, ? extends Object> pVar) {
        return f.b(pVar);
    }

    public static final <T1, T2, R> c<R> j(c<? extends T1> cVar, c<? extends T2> cVar2, q<? super T1, ? super T2, ? super d<? super R>, ? extends Object> qVar) {
        return p.a(cVar, cVar2, qVar);
    }

    public static final <T> c<T> k(T t) {
        return f.c(t);
    }

    public static final <T> c<T> l(c<? extends T> cVar, g gVar) {
        return i.b(cVar, gVar);
    }

    public static final <T> x1 m(c<? extends T> cVar, i0 i0Var) {
        return h.b(cVar, i0Var);
    }

    public static final <T> c<T> n(c<? extends T> cVar, q<? super d<? super T>, ? super Throwable, ? super d<? super x>, ? extends Object> qVar) {
        return k.b(cVar, qVar);
    }

    public static final <T> c<T> o(c<? extends T> cVar, p<? super T, ? super d<? super x>, ? extends Object> pVar) {
        return o.a(cVar, pVar);
    }

    public static final <T> c<T> p(c<? extends T> cVar, p<? super d<? super T>, ? super d<? super x>, ? extends Object> pVar) {
        return k.c(cVar, pVar);
    }

    public static final <T, R> c<R> q(c<? extends T> cVar, q<? super d<? super R>, ? super T, ? super d<? super x>, ? extends Object> qVar) {
        return m.a(cVar, qVar);
    }
}
