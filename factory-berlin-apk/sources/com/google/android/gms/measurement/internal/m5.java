package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
final class m5 implements Runnable {

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ ua f2971g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ i5 f2972h;

    m5(i5 i5Var, ua uaVar) {
        this.f2972h = i5Var;
        this.f2971g = uaVar;
    }

    public final void run() {
        this.f2972h.a.i0();
        if (this.f2971g.f3165i.l() == null) {
            this.f2972h.a.S(this.f2971g);
        } else {
            this.f2972h.a.x(this.f2971g);
        }
    }
}
