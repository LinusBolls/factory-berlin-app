package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
final class r6 implements Runnable {

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ long f3072g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ l6 f3073h;

    r6(l6 l6Var, long j2) {
        this.f3073h = l6Var;
        this.f3072g = j2;
    }

    public final void run() {
        this.f3073h.k().q.b(this.f3072g);
        this.f3073h.i().L().b("Session timeout duration set", Long.valueOf(this.f3072g));
    }
}
