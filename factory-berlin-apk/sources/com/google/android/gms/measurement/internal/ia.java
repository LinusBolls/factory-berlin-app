package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.df;

/* compiled from: com.google.android.gms:play-services-measurement-sdk@@17.5.0 */
final class ia implements Runnable {

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ df f2903g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ String f2904h;

    /* renamed from: i  reason: collision with root package name */
    private final /* synthetic */ String f2905i;

    /* renamed from: j  reason: collision with root package name */
    private final /* synthetic */ AppMeasurementDynamiteService f2906j;

    ia(AppMeasurementDynamiteService appMeasurementDynamiteService, df dfVar, String str, String str2) {
        this.f2906j = appMeasurementDynamiteService;
        this.f2903g = dfVar;
        this.f2904h = str;
        this.f2905i = str2;
    }

    public final void run() {
        this.f2906j.a.P().H(this.f2903g, this.f2904h, this.f2905i);
    }
}
