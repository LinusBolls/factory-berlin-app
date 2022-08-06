package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.df;

/* compiled from: com.google.android.gms:play-services-measurement-sdk@@17.5.0 */
final class g6 implements Runnable {

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ df f2852g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ AppMeasurementDynamiteService f2853h;

    g6(AppMeasurementDynamiteService appMeasurementDynamiteService, df dfVar) {
        this.f2853h = appMeasurementDynamiteService;
        this.f2852g = dfVar;
    }

    public final void run() {
        this.f2853h.a.P().F(this.f2852g);
    }
}
