package kotlinx.coroutines.h3;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* compiled from: Select.kt */
public final class f {
    private static final AtomicLongFieldUpdater a = AtomicLongFieldUpdater.newUpdater(f.class, "number");
    private volatile long number = 1;

    public final long a() {
        return a.incrementAndGet(this);
    }
}
