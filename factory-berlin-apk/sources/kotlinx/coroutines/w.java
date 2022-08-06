package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: CompletedExceptionally.kt */
public class w {
    private static final AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(w.class, "_handled");
    private volatile int _handled;
    public final Throwable a;

    public w(Throwable th, boolean z) {
        this.a = th;
        this._handled = z ? 1 : 0;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [int, boolean] */
    public final boolean a() {
        return this._handled;
    }

    public final boolean b() {
        return b.compareAndSet(this, 0, 1);
    }

    public String toString() {
        return o0.a(this) + '[' + this.a + ']';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(Throwable th, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(th, (i2 & 2) != 0 ? false : z);
    }
}
