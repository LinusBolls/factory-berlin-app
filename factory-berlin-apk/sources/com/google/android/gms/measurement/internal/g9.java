package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
final class g9 implements Runnable {

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ x9 f2863g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ Runnable f2864h;

    g9(b9 b9Var, x9 x9Var, Runnable runnable) {
        this.f2863g = x9Var;
        this.f2864h = runnable;
    }

    public final void run() {
        this.f2863g.i0();
        this.f2863g.z(this.f2864h);
        this.f2863g.h0();
    }
}
