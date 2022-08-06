package kotlinx.coroutines;

import kotlin.x;
import kotlinx.coroutines.internal.m;

/* compiled from: CancellableContinuation.kt */
final class m2 extends g {

    /* renamed from: g  reason: collision with root package name */
    private final m f11041g;

    public m2(m mVar) {
        this.f11041g = mVar;
    }

    public void a(Throwable th) {
        this.f11041g.V();
    }

    public /* bridge */ /* synthetic */ Object o(Object obj) {
        a((Throwable) obj);
        return x.a;
    }

    public String toString() {
        return "RemoveOnCancel[" + this.f11041g + ']';
    }
}
