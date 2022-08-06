package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
final /* synthetic */ class l5 implements Runnable {

    /* renamed from: g  reason: collision with root package name */
    private final i5 f2939g;

    /* renamed from: h  reason: collision with root package name */
    private final la f2940h;

    /* renamed from: i  reason: collision with root package name */
    private final Bundle f2941i;

    l5(i5 i5Var, la laVar, Bundle bundle) {
        this.f2939g = i5Var;
        this.f2940h = laVar;
        this.f2941i = bundle;
    }

    public final void run() {
        this.f2939g.o(this.f2940h, this.f2941i);
    }
}
