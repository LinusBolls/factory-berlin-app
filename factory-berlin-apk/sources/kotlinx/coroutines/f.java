package kotlinx.coroutines;

import java.util.concurrent.Future;
import kotlin.x;

/* compiled from: Future.kt */
final class f extends g {

    /* renamed from: g  reason: collision with root package name */
    private final Future<?> f10853g;

    public f(Future<?> future) {
        this.f10853g = future;
    }

    public void a(Throwable th) {
        this.f10853g.cancel(false);
    }

    public /* bridge */ /* synthetic */ Object o(Object obj) {
        a((Throwable) obj);
        return x.a;
    }

    public String toString() {
        return "CancelFutureOnCancel[" + this.f10853g + ']';
    }
}
