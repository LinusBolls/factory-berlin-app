package kotlinx.coroutines;

import java.util.concurrent.Future;

/* compiled from: Executors.kt */
final class b1 implements c1 {

    /* renamed from: g  reason: collision with root package name */
    private final Future<?> f10726g;

    public b1(Future<?> future) {
        this.f10726g = future;
    }

    public void a() {
        this.f10726g.cancel(false);
    }

    public String toString() {
        return "DisposableFutureHandle[" + this.f10726g + ']';
    }
}
