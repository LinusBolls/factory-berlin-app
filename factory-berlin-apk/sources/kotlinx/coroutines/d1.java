package kotlinx.coroutines;

import kotlin.x;

/* compiled from: CancellableContinuation.kt */
final class d1 extends g {

    /* renamed from: g  reason: collision with root package name */
    private final c1 f10762g;

    public d1(c1 c1Var) {
        this.f10762g = c1Var;
    }

    public void a(Throwable th) {
        this.f10762g.a();
    }

    public /* bridge */ /* synthetic */ Object o(Object obj) {
        a((Throwable) obj);
        return x.a;
    }

    public String toString() {
        return "DisposeOnCancel[" + this.f10762g + ']';
    }
}
