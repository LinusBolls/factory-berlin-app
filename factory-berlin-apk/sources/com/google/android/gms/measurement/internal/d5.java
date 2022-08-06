package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.r;
import java.util.concurrent.BlockingQueue;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
final class d5 extends Thread {

    /* renamed from: g  reason: collision with root package name */
    private final Object f2789g;

    /* renamed from: h  reason: collision with root package name */
    private final BlockingQueue<e5<?>> f2790h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f2791i = false;

    /* renamed from: j  reason: collision with root package name */
    private final /* synthetic */ a5 f2792j;

    public d5(a5 a5Var, String str, BlockingQueue<e5<?>> blockingQueue) {
        this.f2792j = a5Var;
        r.k(str);
        r.k(blockingQueue);
        this.f2789g = new Object();
        this.f2790h = blockingQueue;
        setName(str);
    }

    private final void b(InterruptedException interruptedException) {
        this.f2792j.i().H().b(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }

    private final void c() {
        synchronized (this.f2792j.f2713i) {
            if (!this.f2791i) {
                this.f2792j.f2714j.release();
                this.f2792j.f2713i.notifyAll();
                if (this == this.f2792j.c) {
                    d5 unused = this.f2792j.c = null;
                } else if (this == this.f2792j.f2708d) {
                    d5 unused2 = this.f2792j.f2708d = null;
                } else {
                    this.f2792j.i().E().a("Current scheduler thread is neither worker nor network");
                }
                this.f2791i = true;
            }
        }
    }

    public final void a() {
        synchronized (this.f2789g) {
            this.f2789g.notifyAll();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0075, code lost:
        c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0078, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r5 = this;
            r0 = 0
        L_0x0001:
            if (r0 != 0) goto L_0x0013
            com.google.android.gms.measurement.internal.a5 r1 = r5.f2792j     // Catch:{ InterruptedException -> 0x000e }
            java.util.concurrent.Semaphore r1 = r1.f2714j     // Catch:{ InterruptedException -> 0x000e }
            r1.acquire()     // Catch:{ InterruptedException -> 0x000e }
            r0 = 1
            goto L_0x0001
        L_0x000e:
            r1 = move-exception
            r5.b(r1)
            goto L_0x0001
        L_0x0013:
            int r0 = android.os.Process.myTid()     // Catch:{ all -> 0x0081 }
            int r0 = android.os.Process.getThreadPriority(r0)     // Catch:{ all -> 0x0081 }
        L_0x001b:
            java.util.concurrent.BlockingQueue<com.google.android.gms.measurement.internal.e5<?>> r1 = r5.f2790h     // Catch:{ all -> 0x0081 }
            java.lang.Object r1 = r1.poll()     // Catch:{ all -> 0x0081 }
            com.google.android.gms.measurement.internal.e5 r1 = (com.google.android.gms.measurement.internal.e5) r1     // Catch:{ all -> 0x0081 }
            if (r1 == 0) goto L_0x0034
            boolean r2 = r1.f2806h     // Catch:{ all -> 0x0081 }
            if (r2 == 0) goto L_0x002b
            r2 = r0
            goto L_0x002d
        L_0x002b:
            r2 = 10
        L_0x002d:
            android.os.Process.setThreadPriority(r2)     // Catch:{ all -> 0x0081 }
            r1.run()     // Catch:{ all -> 0x0081 }
            goto L_0x001b
        L_0x0034:
            java.lang.Object r1 = r5.f2789g     // Catch:{ all -> 0x0081 }
            monitor-enter(r1)     // Catch:{ all -> 0x0081 }
            java.util.concurrent.BlockingQueue<com.google.android.gms.measurement.internal.e5<?>> r2 = r5.f2790h     // Catch:{ all -> 0x007e }
            java.lang.Object r2 = r2.peek()     // Catch:{ all -> 0x007e }
            if (r2 != 0) goto L_0x0053
            com.google.android.gms.measurement.internal.a5 r2 = r5.f2792j     // Catch:{ all -> 0x007e }
            boolean r2 = r2.f2715k     // Catch:{ all -> 0x007e }
            if (r2 != 0) goto L_0x0053
            java.lang.Object r2 = r5.f2789g     // Catch:{ InterruptedException -> 0x004f }
            r3 = 30000(0x7530, double:1.4822E-319)
            r2.wait(r3)     // Catch:{ InterruptedException -> 0x004f }
            goto L_0x0053
        L_0x004f:
            r2 = move-exception
            r5.b(r2)     // Catch:{ all -> 0x007e }
        L_0x0053:
            monitor-exit(r1)     // Catch:{ all -> 0x007e }
            com.google.android.gms.measurement.internal.a5 r1 = r5.f2792j     // Catch:{ all -> 0x0081 }
            java.lang.Object r1 = r1.f2713i     // Catch:{ all -> 0x0081 }
            monitor-enter(r1)     // Catch:{ all -> 0x0081 }
            java.util.concurrent.BlockingQueue<com.google.android.gms.measurement.internal.e5<?>> r2 = r5.f2790h     // Catch:{ all -> 0x007b }
            java.lang.Object r2 = r2.peek()     // Catch:{ all -> 0x007b }
            if (r2 != 0) goto L_0x0079
            com.google.android.gms.measurement.internal.a5 r0 = r5.f2792j     // Catch:{ all -> 0x007b }
            com.google.android.gms.measurement.internal.wa r0 = r0.l()     // Catch:{ all -> 0x007b }
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.u.t0     // Catch:{ all -> 0x007b }
            boolean r0 = r0.s(r2)     // Catch:{ all -> 0x007b }
            if (r0 == 0) goto L_0x0074
            r5.c()     // Catch:{ all -> 0x007b }
        L_0x0074:
            monitor-exit(r1)     // Catch:{ all -> 0x007b }
            r5.c()
            return
        L_0x0079:
            monitor-exit(r1)     // Catch:{ all -> 0x007b }
            goto L_0x001b
        L_0x007b:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x007b }
            throw r0     // Catch:{ all -> 0x0081 }
        L_0x007e:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x007e }
            throw r0     // Catch:{ all -> 0x0081 }
        L_0x0081:
            r0 = move-exception
            r5.c()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.d5.run():void");
    }
}
