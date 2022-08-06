package kotlinx.coroutines;

import kotlinx.coroutines.internal.x;

/* compiled from: EventLoop.common.kt */
public final class k1 {
    /* access modifiers changed from: private */
    public static final x a = new x("REMOVED_TASK");
    /* access modifiers changed from: private */
    public static final x b = new x("CLOSED_EMPTY");

    public static final long c(long j2) {
        if (j2 <= 0) {
            return 0;
        }
        if (j2 >= 9223372036854L) {
            return Long.MAX_VALUE;
        }
        return 1000000 * j2;
    }
}
