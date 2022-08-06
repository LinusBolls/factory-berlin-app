package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
final class f7 implements Runnable {

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f2840g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ l6 f2841h;

    f7(l6 l6Var, AtomicReference atomicReference) {
        this.f2841h = l6Var;
        this.f2840g = atomicReference;
    }

    public final void run() {
        synchronized (this.f2840g) {
            try {
                this.f2840g.set(Double.valueOf(this.f2841h.l().v(this.f2841h.q().C(), u.O)));
                this.f2840g.notify();
            } catch (Throwable th) {
                this.f2840g.notify();
                throw th;
            }
        }
    }
}
