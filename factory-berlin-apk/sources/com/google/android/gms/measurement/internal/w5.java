package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
final class w5 implements Runnable {

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ ea f3197g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ la f3198h;

    /* renamed from: i  reason: collision with root package name */
    private final /* synthetic */ i5 f3199i;

    w5(i5 i5Var, ea eaVar, la laVar) {
        this.f3199i = i5Var;
        this.f3197g = eaVar;
        this.f3198h = laVar;
    }

    public final void run() {
        this.f3199i.a.i0();
        if (this.f3197g.l() == null) {
            this.f3199i.a.Q(this.f3197g, this.f3198h);
        } else {
            this.f3199i.a.v(this.f3197g, this.f3198h);
        }
    }
}
