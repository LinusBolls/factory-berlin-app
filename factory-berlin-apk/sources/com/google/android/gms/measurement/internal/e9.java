package com.google.android.gms.measurement.internal;

import android.content.Intent;

/* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
final /* synthetic */ class e9 implements Runnable {

    /* renamed from: g  reason: collision with root package name */
    private final b9 f2818g;

    /* renamed from: h  reason: collision with root package name */
    private final int f2819h;

    /* renamed from: i  reason: collision with root package name */
    private final c4 f2820i;

    /* renamed from: j  reason: collision with root package name */
    private final Intent f2821j;

    e9(b9 b9Var, int i2, c4 c4Var, Intent intent) {
        this.f2818g = b9Var;
        this.f2819h = i2;
        this.f2820i = c4Var;
        this.f2821j = intent;
    }

    public final void run() {
        this.f2818g.d(this.f2819h, this.f2820i, this.f2821j);
    }
}
