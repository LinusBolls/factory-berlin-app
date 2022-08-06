package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
final class z6 implements Runnable {

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f3237g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ l6 f3238h;

    z6(l6 l6Var, AtomicReference atomicReference) {
        this.f3238h = l6Var;
        this.f3237g = atomicReference;
    }

    public final void run() {
        synchronized (this.f3237g) {
            try {
                this.f3237g.set(this.f3238h.l().N(this.f3238h.q().C()));
                this.f3237g.notify();
            } catch (Throwable th) {
                this.f3237g.notify();
                throw th;
            }
        }
    }
}
