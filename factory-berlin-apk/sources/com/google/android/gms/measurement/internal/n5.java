package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
final class n5 implements Runnable {

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ ua f2994g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ la f2995h;

    /* renamed from: i  reason: collision with root package name */
    private final /* synthetic */ i5 f2996i;

    n5(i5 i5Var, ua uaVar, la laVar) {
        this.f2996i = i5Var;
        this.f2994g = uaVar;
        this.f2995h = laVar;
    }

    public final void run() {
        this.f2996i.a.i0();
        if (this.f2994g.f3165i.l() == null) {
            this.f2996i.a.T(this.f2994g, this.f2995h);
        } else {
            this.f2996i.a.y(this.f2994g, this.f2995h);
        }
    }
}
