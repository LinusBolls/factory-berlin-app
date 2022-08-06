package g.e.m.d;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.m0;
import g.e.m.a;
import kotlin.e0.c.l;
import kotlin.jvm.internal.k;

/* compiled from: ResponseExtensions.kt */
public final class a {

    /* renamed from: g.e.m.d.a$a  reason: collision with other inner class name */
    /* compiled from: ResponseExtensions.kt */
    static final class C0683a<I, O> implements e.b.a.c.a<g.e.m.a<I, P>, g.e.m.a<O, P>> {
        final /* synthetic */ l a;

        C0683a(l lVar) {
            this.a = lVar;
        }

        /* renamed from: b */
        public final g.e.m.a<O, P> a(g.e.m.a<I, P> aVar) {
            if (aVar == null) {
                return null;
            }
            return new g.e.m.a<>(aVar.f(), this.a.o(aVar.c()), aVar.e(), aVar.d());
        }
    }

    /* compiled from: ResponseExtensions.kt */
    static final class b<I, O> implements e.b.a.c.a<g.e.m.a<T, P>, Boolean> {
        public static final b a = new b();

        b() {
        }

        /* renamed from: b */
        public final Boolean a(g.e.m.a<T, P> aVar) {
            return Boolean.valueOf((aVar != null ? aVar.f() : null) == a.b.EXECUTING);
        }
    }

    /* compiled from: ResponseExtensions.kt */
    static final class c<I, O> implements e.b.a.c.a<g.e.m.a<T, P>, T> {
        public static final c a = new c();

        c() {
        }

        /* renamed from: b */
        public final T a(g.e.m.a<T, P> aVar) {
            if ((aVar != null ? aVar.f() : null) == a.b.SUCCESS) {
                return aVar.c();
            }
            return null;
        }
    }

    public static final <I, O, P> LiveData<g.e.m.a<O, P>> a(LiveData<g.e.m.a<I, P>> liveData, l<? super I, ? extends O> lVar) {
        k.e(liveData, "$this$map");
        k.e(lVar, "mapper");
        LiveData<g.e.m.a<O, P>> b2 = m0.b(liveData, new C0683a(lVar));
        k.d(b2, "Transformations.map(this…ess, it.exception)\n\t\t}\n\t}");
        return b2;
    }

    public static final <T, P> LiveData<Boolean> b(LiveData<g.e.m.a<T, P>> liveData) {
        k.e(liveData, "$this$onExecuting");
        LiveData<Boolean> b2 = m0.b(liveData, b.a);
        k.d(b2, "androidx.lifecycle.Trans…sponse.Status.EXECUTING }");
        return b2;
    }

    public static final <T, P> LiveData<T> c(LiveData<g.e.m.a<T, P>> liveData) {
        k.e(liveData, "$this$onSuccess");
        LiveData<T> b2 = m0.b(liveData, c.a);
        k.d(b2, "Transformations.map(this…\t\t} else {\n\t\t\tnull\n\t\t}\n\t}");
        return b2;
    }
}
