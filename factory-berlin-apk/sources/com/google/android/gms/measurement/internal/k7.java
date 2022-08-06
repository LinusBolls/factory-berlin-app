package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
final class k7 implements Runnable {

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ boolean f2926g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ l6 f2927h;

    k7(l6 l6Var, boolean z) {
        this.f2927h = l6Var;
        this.f2926g = z;
    }

    public final void run() {
        boolean p = this.f2927h.a.p();
        boolean T = this.f2927h.a.T();
        this.f2927h.a.o(this.f2926g);
        if (T == this.f2926g) {
            this.f2927h.a.i().M().b("Default data collection state already set to", Boolean.valueOf(this.f2926g));
        }
        if (this.f2927h.a.p() == p || this.f2927h.a.p() != this.f2927h.a.T()) {
            this.f2927h.a.i().J().c("Default data collection is different than actual status", Boolean.valueOf(this.f2926g), Boolean.valueOf(p));
        }
        this.f2927h.o0();
    }
}
