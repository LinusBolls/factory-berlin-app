package kotlinx.coroutines;

import kotlin.x;

/* compiled from: Delay.kt */
public interface s0 {

    /* compiled from: Delay.kt */
    public static final class a {
        public static c1 a(s0 s0Var, long j2, Runnable runnable) {
            return q0.a().U(j2, runnable);
        }
    }

    c1 U(long j2, Runnable runnable);

    void j(long j2, i<? super x> iVar);
}
