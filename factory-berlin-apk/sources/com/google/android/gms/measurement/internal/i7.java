package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
final class i7 implements Runnable {

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ e f2892g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ long f2893h;

    /* renamed from: i  reason: collision with root package name */
    private final /* synthetic */ int f2894i;

    /* renamed from: j  reason: collision with root package name */
    private final /* synthetic */ long f2895j;

    /* renamed from: k  reason: collision with root package name */
    private final /* synthetic */ boolean f2896k;

    /* renamed from: l  reason: collision with root package name */
    private final /* synthetic */ l6 f2897l;

    i7(l6 l6Var, e eVar, long j2, int i2, long j3, boolean z) {
        this.f2897l = l6Var;
        this.f2892g = eVar;
        this.f2893h = j2;
        this.f2894i = i2;
        this.f2895j = j3;
        this.f2896k = z;
    }

    public final void run() {
        this.f2897l.I(this.f2892g);
        this.f2897l.F(this.f2893h, false);
        this.f2897l.K(this.f2892g, this.f2894i, this.f2895j, true, this.f2896k);
    }
}
