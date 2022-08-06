package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
final class a9 implements Runnable {

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ w8 f2725g;

    a9(w8 w8Var) {
        this.f2725g = w8Var;
    }

    public final void run() {
        this.f2725g.c.D(new ComponentName(this.f2725g.c.j(), "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
