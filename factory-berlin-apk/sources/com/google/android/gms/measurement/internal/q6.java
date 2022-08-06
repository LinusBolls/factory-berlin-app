package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
final class q6 implements Runnable {

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f3054g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ l6 f3055h;

    q6(l6 l6Var, AtomicReference atomicReference) {
        this.f3055h = l6Var;
        this.f3054g = atomicReference;
    }

    public final void run() {
        synchronized (this.f3054g) {
            try {
                this.f3054g.set(Boolean.valueOf(this.f3055h.l().M(this.f3055h.q().C())));
                this.f3054g.notify();
            } catch (Throwable th) {
                this.f3054g.notify();
                throw th;
            }
        }
    }
}
