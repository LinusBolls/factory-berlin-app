package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
final class y8 implements Runnable {

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ ComponentName f3235g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ w8 f3236h;

    y8(w8 w8Var, ComponentName componentName) {
        this.f3236h = w8Var;
        this.f3235g = componentName;
    }

    public final void run() {
        this.f3236h.c.D(this.f3235g);
    }
}
