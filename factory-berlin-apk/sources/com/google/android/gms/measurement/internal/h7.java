package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
final class h7 implements Runnable {

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ e f2879g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ int f2880h;

    /* renamed from: i  reason: collision with root package name */
    private final /* synthetic */ long f2881i;

    /* renamed from: j  reason: collision with root package name */
    private final /* synthetic */ boolean f2882j;

    /* renamed from: k  reason: collision with root package name */
    private final /* synthetic */ l6 f2883k;

    h7(l6 l6Var, e eVar, int i2, long j2, boolean z) {
        this.f2883k = l6Var;
        this.f2879g = eVar;
        this.f2880h = i2;
        this.f2881i = j2;
        this.f2882j = z;
    }

    public final void run() {
        this.f2883k.I(this.f2879g);
        this.f2883k.K(this.f2879g, this.f2880h, this.f2881i, false, this.f2882j);
    }
}
