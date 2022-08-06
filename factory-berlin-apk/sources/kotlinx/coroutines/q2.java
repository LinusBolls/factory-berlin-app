package kotlinx.coroutines;

import kotlin.e0.c.p;
import kotlin.x;
import kotlinx.coroutines.h3.d;

/* compiled from: JobSupport.kt */
final class q2<T, R> extends d2<e2> {

    /* renamed from: k  reason: collision with root package name */
    private final d<R> f11054k;

    /* renamed from: l  reason: collision with root package name */
    private final p<T, kotlin.c0.d<? super R>, Object> f11055l;

    public q2(e2 e2Var, d<? super R> dVar, p<? super T, ? super kotlin.c0.d<? super R>, ? extends Object> pVar) {
        super(e2Var);
        this.f11054k = dVar;
        this.f11055l = pVar;
    }

    public void Z(Throwable th) {
        if (this.f11054k.u()) {
            ((e2) this.f10763j).D0(this.f11054k, this.f11055l);
        }
    }

    public /* bridge */ /* synthetic */ Object o(Object obj) {
        Z((Throwable) obj);
        return x.a;
    }

    public String toString() {
        return "SelectAwaitOnCompletion[" + this.f11054k + ']';
    }
}
