package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
final class v7 implements Runnable {

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ u7 f3187g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ u7 f3188h;

    /* renamed from: i  reason: collision with root package name */
    private final /* synthetic */ long f3189i;

    /* renamed from: j  reason: collision with root package name */
    private final /* synthetic */ boolean f3190j;

    /* renamed from: k  reason: collision with root package name */
    private final /* synthetic */ t7 f3191k;

    v7(t7 t7Var, u7 u7Var, u7 u7Var2, long j2, boolean z) {
        this.f3191k = t7Var;
        this.f3187g = u7Var;
        this.f3188h = u7Var2;
        this.f3189i = j2;
        this.f3190j = z;
    }

    public final void run() {
        this.f3191k.P(this.f3187g, this.f3188h, this.f3189i, this.f3190j, (Bundle) null);
    }
}
