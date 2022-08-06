package kotlinx.coroutines;

import kotlin.e0.c.l;
import kotlin.x;

/* compiled from: CancellableContinuationImpl.kt */
final class u1 extends g {

    /* renamed from: g  reason: collision with root package name */
    private final l<Throwable, x> f11070g;

    public u1(l<? super Throwable, x> lVar) {
        this.f11070g = lVar;
    }

    public void a(Throwable th) {
        this.f11070g.o(th);
    }

    public /* bridge */ /* synthetic */ Object o(Object obj) {
        a((Throwable) obj);
        return x.a;
    }

    public String toString() {
        return "InvokeOnCancel[" + o0.a(this.f11070g) + '@' + o0.b(this) + ']';
    }
}
