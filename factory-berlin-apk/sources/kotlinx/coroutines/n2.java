package kotlinx.coroutines;

import kotlin.k;
import kotlin.l;
import kotlin.x;

/* compiled from: JobSupport.kt */
final class n2<T> extends d2<e2> {

    /* renamed from: k  reason: collision with root package name */
    private final j<T> f11045k;

    public n2(e2 e2Var, j<? super T> jVar) {
        super(e2Var);
        this.f11045k = jVar;
    }

    public void Z(Throwable th) {
        Object g0 = ((e2) this.f10763j).g0();
        if (n0.a() && !(!(g0 instanceof s1))) {
            throw new AssertionError();
        } else if (g0 instanceof w) {
            j<T> jVar = this.f11045k;
            Throwable th2 = ((w) g0).a;
            k.a aVar = k.f10687h;
            Object a = l.a(th2);
            k.a(a);
            jVar.m(a);
        } else {
            j<T> jVar2 = this.f11045k;
            Object h2 = f2.h(g0);
            k.a aVar2 = k.f10687h;
            k.a(h2);
            jVar2.m(h2);
        }
    }

    public /* bridge */ /* synthetic */ Object o(Object obj) {
        Z((Throwable) obj);
        return x.a;
    }

    public String toString() {
        return "ResumeAwaitOnCompletion[" + this.f11045k + ']';
    }
}
