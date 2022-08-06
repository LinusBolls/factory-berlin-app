package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.df;

/* compiled from: com.google.android.gms:play-services-measurement-sdk@@17.5.0 */
final class g7 implements Runnable {

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ df f2854g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ String f2855h;

    /* renamed from: i  reason: collision with root package name */
    private final /* synthetic */ String f2856i;

    /* renamed from: j  reason: collision with root package name */
    private final /* synthetic */ boolean f2857j;

    /* renamed from: k  reason: collision with root package name */
    private final /* synthetic */ AppMeasurementDynamiteService f2858k;

    g7(AppMeasurementDynamiteService appMeasurementDynamiteService, df dfVar, String str, String str2, boolean z) {
        this.f2858k = appMeasurementDynamiteService;
        this.f2854g = dfVar;
        this.f2855h = str;
        this.f2856i = str2;
        this.f2857j = z;
    }

    public final void run() {
        this.f2858k.a.P().I(this.f2854g, this.f2855h, this.f2856i, this.f2857j);
    }
}
