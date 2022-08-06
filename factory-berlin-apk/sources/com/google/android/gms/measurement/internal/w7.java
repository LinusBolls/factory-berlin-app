package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
final class w7 implements Runnable {

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ Bundle f3202g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ u7 f3203h;

    /* renamed from: i  reason: collision with root package name */
    private final /* synthetic */ u7 f3204i;

    /* renamed from: j  reason: collision with root package name */
    private final /* synthetic */ long f3205j;

    /* renamed from: k  reason: collision with root package name */
    private final /* synthetic */ t7 f3206k;

    w7(t7 t7Var, Bundle bundle, u7 u7Var, u7 u7Var2, long j2) {
        this.f3206k = t7Var;
        this.f3202g = bundle;
        this.f3203h = u7Var;
        this.f3204i = u7Var2;
        this.f3205j = j2;
    }

    public final void run() {
        this.f3206k.K(this.f3202g, this.f3203h, this.f3204i, this.f3205j);
    }
}
