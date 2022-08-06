package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
final class v5 implements Runnable {

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ s f3182g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ la f3183h;

    /* renamed from: i  reason: collision with root package name */
    private final /* synthetic */ i5 f3184i;

    v5(i5 i5Var, s sVar, la laVar) {
        this.f3184i = i5Var;
        this.f3182g = sVar;
        this.f3183h = laVar;
    }

    public final void run() {
        s U0 = this.f3184i.U0(this.f3182g, this.f3183h);
        this.f3184i.a.i0();
        this.f3184i.a.p(U0, this.f3183h);
    }
}
