package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
final class u6 implements Runnable {

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ String f3147g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ String f3148h;

    /* renamed from: i  reason: collision with root package name */
    private final /* synthetic */ long f3149i;

    /* renamed from: j  reason: collision with root package name */
    private final /* synthetic */ Bundle f3150j;

    /* renamed from: k  reason: collision with root package name */
    private final /* synthetic */ boolean f3151k;

    /* renamed from: l  reason: collision with root package name */
    private final /* synthetic */ boolean f3152l;

    /* renamed from: m  reason: collision with root package name */
    private final /* synthetic */ boolean f3153m;

    /* renamed from: n  reason: collision with root package name */
    private final /* synthetic */ String f3154n;
    private final /* synthetic */ l6 o;

    u6(l6 l6Var, String str, String str2, long j2, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        this.o = l6Var;
        this.f3147g = str;
        this.f3148h = str2;
        this.f3149i = j2;
        this.f3150j = bundle;
        this.f3151k = z;
        this.f3152l = z2;
        this.f3153m = z3;
        this.f3154n = str3;
    }

    public final void run() {
        this.o.V(this.f3147g, this.f3148h, this.f3149i, this.f3150j, this.f3151k, this.f3152l, this.f3153m, this.f3154n);
    }
}
