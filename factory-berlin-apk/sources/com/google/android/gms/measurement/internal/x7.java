package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
final class x7 implements Runnable {

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ long f3213g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ t7 f3214h;

    x7(t7 t7Var, long j2) {
        this.f3214h = t7Var;
        this.f3213g = j2;
    }

    public final void run() {
        this.f3214h.o().v(this.f3213g);
        this.f3214h.f3111e = null;
    }
}
