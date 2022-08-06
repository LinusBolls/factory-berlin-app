package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
final class b0 implements Runnable {

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ String f2726g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ long f2727h;

    /* renamed from: i  reason: collision with root package name */
    private final /* synthetic */ a f2728i;

    b0(a aVar, String str, long j2) {
        this.f2728i = aVar;
        this.f2726g = str;
        this.f2727h = j2;
    }

    public final void run() {
        this.f2728i.F(this.f2726g, this.f2727h);
    }
}
