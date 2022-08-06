package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
final class a8 implements Runnable {

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ u7 f2722g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ long f2723h;

    /* renamed from: i  reason: collision with root package name */
    private final /* synthetic */ t7 f2724i;

    a8(t7 t7Var, u7 u7Var, long j2) {
        this.f2724i = t7Var;
        this.f2722g = u7Var;
        this.f2723h = j2;
    }

    public final void run() {
        this.f2724i.Q(this.f2722g, false, this.f2723h);
        t7 t7Var = this.f2724i;
        t7Var.f3111e = null;
        t7Var.r().M((u7) null);
    }
}
