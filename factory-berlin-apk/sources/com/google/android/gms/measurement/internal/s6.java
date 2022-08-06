package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
final class s6 implements Runnable {

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ long f3089g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ l6 f3090h;

    s6(l6 l6Var, long j2) {
        this.f3090h = l6Var;
        this.f3089g = j2;
    }

    public final void run() {
        this.f3090h.k().p.b(this.f3089g);
        this.f3090h.i().L().b("Minimum session duration set", Long.valueOf(this.f3089g));
    }
}
