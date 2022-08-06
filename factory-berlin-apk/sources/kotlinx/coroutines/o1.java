package kotlinx.coroutines;

import java.util.concurrent.Executor;

/* compiled from: Executors.kt */
final class o1 extends n1 {

    /* renamed from: i  reason: collision with root package name */
    private final Executor f11046i;

    public o1(Executor executor) {
        this.f11046i = executor;
        t0();
    }

    public Executor r0() {
        return this.f11046i;
    }
}
