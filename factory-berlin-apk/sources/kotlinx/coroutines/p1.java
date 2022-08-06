package kotlinx.coroutines;

import java.util.concurrent.Executor;

/* compiled from: Executors.kt */
public final class p1 {
    public static final d0 a(Executor executor) {
        d0 d0Var;
        z0 z0Var = (z0) (!(executor instanceof z0) ? null : executor);
        return (z0Var == null || (d0Var = z0Var.f11078g) == null) ? new o1(executor) : d0Var;
    }
}
