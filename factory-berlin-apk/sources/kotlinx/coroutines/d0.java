package kotlinx.coroutines;

import kotlin.TypeCastException;
import kotlin.c0.b;
import kotlin.c0.d;
import kotlin.c0.e;
import kotlin.c0.g;
import kotlin.jvm.internal.l;

/* compiled from: CoroutineDispatcher.kt */
public abstract class d0 extends kotlin.c0.a implements e {

    /* renamed from: g  reason: collision with root package name */
    public static final a f10760g = new a((DefaultConstructorMarker) null);

    /* compiled from: CoroutineDispatcher.kt */
    public static final class a extends b<e, d0> {

        /* renamed from: kotlinx.coroutines.d0$a$a  reason: collision with other inner class name */
        /* compiled from: CoroutineDispatcher.kt */
        static final class C0764a extends l implements kotlin.e0.c.l<g.b, d0> {

            /* renamed from: h  reason: collision with root package name */
            public static final C0764a f10761h = new C0764a();

            C0764a() {
                super(1);
            }

            /* renamed from: a */
            public final d0 o(g.b bVar) {
                if (!(bVar instanceof d0)) {
                    bVar = null;
                }
                return (d0) bVar;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
            super(e.c, C0764a.f10761h);
        }
    }

    public d0() {
        super(e.c);
    }

    public <E extends g.b> E get(g.c<E> cVar) {
        return e.a.a(this, cVar);
    }

    public void h(d<?> dVar) {
        if (dVar != null) {
            j<?> o = ((u0) dVar).o();
            if (o != null) {
                o.o();
                return;
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.DispatchedContinuation<*>");
    }

    public final <T> d<T> i(d<? super T> dVar) {
        return new u0(this, dVar);
    }

    public abstract void i0(g gVar, Runnable runnable);

    public void l0(g gVar, Runnable runnable) {
        i0(gVar, runnable);
    }

    public g minusKey(g.c<?> cVar) {
        return e.a.b(this, cVar);
    }

    public boolean n0(g gVar) {
        return true;
    }

    public String toString() {
        return o0.a(this) + '@' + o0.b(this);
    }
}
