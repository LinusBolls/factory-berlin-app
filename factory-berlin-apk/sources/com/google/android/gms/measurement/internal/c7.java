package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
final class c7 implements Runnable {

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f2768g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ l6 f2769h;

    c7(l6 l6Var, AtomicReference atomicReference) {
        this.f2769h = l6Var;
        this.f2768g = atomicReference;
    }

    public final void run() {
        synchronized (this.f2768g) {
            try {
                this.f2768g.set(Integer.valueOf(this.f2769h.l().u(this.f2769h.q().C(), u.N)));
                this.f2768g.notify();
            } catch (Throwable th) {
                this.f2768g.notify();
                throw th;
            }
        }
    }
}
