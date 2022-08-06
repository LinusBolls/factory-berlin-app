package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.r;
import com.google.android.gms.internal.measurement.fb;

/* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
final class s5 implements Runnable {

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ la f3087g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ i5 f3088h;

    s5(i5 i5Var, la laVar) {
        this.f3088h = i5Var;
        this.f3087g = laVar;
    }

    public final void run() {
        this.f3088h.a.i0();
        x9 l2 = this.f3088h.a;
        la laVar = this.f3087g;
        if (fb.a() && l2.L().s(u.Q0)) {
            l2.a().c();
            l2.g0();
            r.g(laVar.f2956g);
            e b = e.b(laVar.C);
            e c = l2.c(laVar.f2956g);
            l2.B(laVar.f2956g, b);
            if (b.h(c)) {
                l2.w(laVar);
            }
        }
    }
}
