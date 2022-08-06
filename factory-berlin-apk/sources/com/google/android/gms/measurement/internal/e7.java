package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
final class e7 implements Runnable {

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ Boolean f2810g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ l6 f2811h;

    e7(l6 l6Var, Boolean bool) {
        this.f2811h = l6Var;
        this.f2810g = bool;
    }

    public final void run() {
        this.f2811h.S(this.f2810g, true);
    }
}
