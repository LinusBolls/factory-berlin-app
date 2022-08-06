package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
final class d7 implements Runnable {

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f2793g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ l6 f2794h;

    d7(l6 l6Var, AtomicReference atomicReference) {
        this.f2794h = l6Var;
        this.f2793g = atomicReference;
    }

    public final void run() {
        synchronized (this.f2793g) {
            try {
                this.f2793g.set(Long.valueOf(this.f2794h.l().p(this.f2794h.q().C(), u.M)));
                this.f2793g.notify();
            } catch (Throwable th) {
                this.f2793g.notify();
                throw th;
            }
        }
    }
}
