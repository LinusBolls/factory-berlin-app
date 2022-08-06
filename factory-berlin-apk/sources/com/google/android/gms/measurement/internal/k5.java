package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.r;

/* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
final class k5 implements Runnable {

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ la f2924g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ i5 f2925h;

    k5(i5 i5Var, la laVar) {
        this.f2925h = i5Var;
        this.f2924g = laVar;
    }

    public final void run() {
        this.f2925h.a.i0();
        x9 l2 = this.f2925h.a;
        la laVar = this.f2924g;
        l2.a().c();
        l2.g0();
        r.g(laVar.f2956g);
        l2.U(laVar);
    }
}
