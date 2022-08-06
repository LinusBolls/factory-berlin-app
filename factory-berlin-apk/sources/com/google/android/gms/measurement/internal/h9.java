package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.df;

/* compiled from: com.google.android.gms:play-services-measurement-sdk@@17.5.0 */
final class h9 implements Runnable {

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ df f2887g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ AppMeasurementDynamiteService f2888h;

    h9(AppMeasurementDynamiteService appMeasurementDynamiteService, df dfVar) {
        this.f2888h = appMeasurementDynamiteService;
        this.f2887g = dfVar;
    }

    public final void run() {
        this.f2888h.a.G().T(this.f2887g, this.f2888h.a.T());
    }
}
