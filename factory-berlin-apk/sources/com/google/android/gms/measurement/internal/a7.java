package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
final class a7 implements Runnable {

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f2716g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ String f2717h;

    /* renamed from: i  reason: collision with root package name */
    private final /* synthetic */ String f2718i;

    /* renamed from: j  reason: collision with root package name */
    private final /* synthetic */ String f2719j;

    /* renamed from: k  reason: collision with root package name */
    private final /* synthetic */ boolean f2720k;

    /* renamed from: l  reason: collision with root package name */
    private final /* synthetic */ l6 f2721l;

    a7(l6 l6Var, AtomicReference atomicReference, String str, String str2, String str3, boolean z) {
        this.f2721l = l6Var;
        this.f2716g = atomicReference;
        this.f2717h = str;
        this.f2718i = str2;
        this.f2719j = str3;
        this.f2720k = z;
    }

    public final void run() {
        this.f2721l.a.P().T(this.f2716g, this.f2717h, this.f2718i, this.f2719j, this.f2720k);
    }
}
