package kotlinx.coroutines;

import java.util.concurrent.Executor;
import kotlin.c0.h;

/* compiled from: Executors.kt */
final class z0 implements Executor {

    /* renamed from: g  reason: collision with root package name */
    public final d0 f11078g;

    public void execute(Runnable runnable) {
        this.f11078g.i0(h.f10600g, runnable);
    }

    public String toString() {
        return this.f11078g.toString();
    }
}
