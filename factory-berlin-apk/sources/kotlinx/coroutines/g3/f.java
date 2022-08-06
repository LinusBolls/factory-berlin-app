package kotlinx.coroutines.g3;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.c0.g;
import kotlinx.coroutines.m1;

/* compiled from: Dispatcher.kt */
final class f extends m1 implements j, Executor {

    /* renamed from: l  reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f10973l = AtomicIntegerFieldUpdater.newUpdater(f.class, "inFlightTasks");

    /* renamed from: h  reason: collision with root package name */
    private final ConcurrentLinkedQueue<Runnable> f10974h = new ConcurrentLinkedQueue<>();

    /* renamed from: i  reason: collision with root package name */
    private final d f10975i;
    private volatile int inFlightTasks = 0;

    /* renamed from: j  reason: collision with root package name */
    private final int f10976j;

    /* renamed from: k  reason: collision with root package name */
    private final int f10977k;

    public f(d dVar, int i2, int i3) {
        this.f10975i = dVar;
        this.f10976j = i2;
        this.f10977k = i3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:4:0x0010  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void t0(java.lang.Runnable r3, boolean r4) {
        /*
            r2 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = f10973l
            int r0 = r0.incrementAndGet(r2)
            int r1 = r2.f10976j
            if (r0 > r1) goto L_0x0010
            kotlinx.coroutines.g3.d r0 = r2.f10975i
            r0.F0(r3, r2, r4)
            return
        L_0x0010:
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.Runnable> r0 = r2.f10974h
            r0.add(r3)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = f10973l
            int r3 = r3.decrementAndGet(r2)
            int r0 = r2.f10976j
            if (r3 < r0) goto L_0x0020
            return
        L_0x0020:
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.Runnable> r3 = r2.f10974h
            java.lang.Object r3 = r3.poll()
            java.lang.Runnable r3 = (java.lang.Runnable) r3
            if (r3 == 0) goto L_0x002b
            goto L_0x0000
        L_0x002b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.g3.f.t0(java.lang.Runnable, boolean):void");
    }

    public void close() {
        throw new IllegalStateException("Close cannot be invoked on LimitingBlockingDispatcher".toString());
    }

    public void execute(Runnable runnable) {
        t0(runnable, false);
    }

    public void i0(g gVar, Runnable runnable) {
        t0(runnable, false);
    }

    public void k() {
        Runnable poll = this.f10974h.poll();
        if (poll != null) {
            this.f10975i.F0(poll, this, true);
            return;
        }
        f10973l.decrementAndGet(this);
        Runnable poll2 = this.f10974h.poll();
        if (poll2 != null) {
            t0(poll2, true);
        }
    }

    public int l() {
        return this.f10977k;
    }

    public void l0(g gVar, Runnable runnable) {
        t0(runnable, true);
    }

    public Executor r0() {
        return this;
    }

    public String toString() {
        return super.toString() + "[dispatcher = " + this.f10975i + ']';
    }
}
