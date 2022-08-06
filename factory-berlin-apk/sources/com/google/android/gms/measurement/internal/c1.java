package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
final class c1 implements Runnable {

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ String f2754g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ long f2755h;

    /* renamed from: i  reason: collision with root package name */
    private final /* synthetic */ a f2756i;

    c1(a aVar, String str, long j2) {
        this.f2756i = aVar;
        this.f2754g = str;
        this.f2755h = j2;
    }

    public final void run() {
        this.f2756i.E(this.f2754g, this.f2755h);
    }
}
