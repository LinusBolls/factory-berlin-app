package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
final class t6 implements Runnable {

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ String f3105g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ String f3106h;

    /* renamed from: i  reason: collision with root package name */
    private final /* synthetic */ Object f3107i;

    /* renamed from: j  reason: collision with root package name */
    private final /* synthetic */ long f3108j;

    /* renamed from: k  reason: collision with root package name */
    private final /* synthetic */ l6 f3109k;

    t6(l6 l6Var, String str, String str2, Object obj, long j2) {
        this.f3109k = l6Var;
        this.f3105g = str;
        this.f3106h = str2;
        this.f3107i = obj;
        this.f3108j = j2;
    }

    public final void run() {
        this.f3109k.Z(this.f3105g, this.f3106h, this.f3107i, this.f3108j);
    }
}
