package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
final class b7 implements Runnable {

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f2748g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ String f2749h;

    /* renamed from: i  reason: collision with root package name */
    private final /* synthetic */ String f2750i;

    /* renamed from: j  reason: collision with root package name */
    private final /* synthetic */ String f2751j;

    /* renamed from: k  reason: collision with root package name */
    private final /* synthetic */ l6 f2752k;

    b7(l6 l6Var, AtomicReference atomicReference, String str, String str2, String str3) {
        this.f2752k = l6Var;
        this.f2748g = atomicReference;
        this.f2749h = str;
        this.f2750i = str2;
        this.f2751j = str3;
    }

    public final void run() {
        this.f2752k.a.P().S(this.f2748g, this.f2749h, this.f2750i, this.f2751j);
    }
}
