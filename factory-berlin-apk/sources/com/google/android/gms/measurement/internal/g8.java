package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.df;

/* compiled from: com.google.android.gms:play-services-measurement-sdk@@17.5.0 */
final class g8 implements Runnable {

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ df f2859g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ s f2860h;

    /* renamed from: i  reason: collision with root package name */
    private final /* synthetic */ String f2861i;

    /* renamed from: j  reason: collision with root package name */
    private final /* synthetic */ AppMeasurementDynamiteService f2862j;

    g8(AppMeasurementDynamiteService appMeasurementDynamiteService, df dfVar, s sVar, String str) {
        this.f2862j = appMeasurementDynamiteService;
        this.f2859g = dfVar;
        this.f2860h = sVar;
        this.f2861i = str;
    }

    public final void run() {
        this.f2862j.a.P().G(this.f2859g, this.f2860h, this.f2861i);
    }
}
