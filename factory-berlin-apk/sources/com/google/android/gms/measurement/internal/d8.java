package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
final class d8 implements Runnable {

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ boolean f2795g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ ea f2796h;

    /* renamed from: i  reason: collision with root package name */
    private final /* synthetic */ la f2797i;

    /* renamed from: j  reason: collision with root package name */
    private final /* synthetic */ c8 f2798j;

    d8(c8 c8Var, boolean z, ea eaVar, la laVar) {
        this.f2798j = c8Var;
        this.f2795g = z;
        this.f2796h = eaVar;
        this.f2797i = laVar;
    }

    public final void run() {
        u3 l0 = this.f2798j.f2770d;
        if (l0 == null) {
            this.f2798j.i().E().a("Discarding data. Failed to set user property");
            return;
        }
        this.f2798j.L(l0, this.f2795g ? null : this.f2796h, this.f2797i);
        this.f2798j.e0();
    }
}
