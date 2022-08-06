package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
final /* synthetic */ class m9 implements Runnable {

    /* renamed from: g  reason: collision with root package name */
    private final n9 f2987g;

    m9(n9 n9Var) {
        this.f2987g = n9Var;
    }

    public final void run() {
        n9 n9Var = this.f2987g;
        k9 k9Var = n9Var.f3002i;
        long j2 = n9Var.f3000g;
        long j3 = n9Var.f3001h;
        k9Var.b.c();
        k9Var.b.i().L().a("Application going to the background");
        boolean z = true;
        if (k9Var.b.l().s(u.x0)) {
            k9Var.b.k().w.a(true);
        }
        Bundle bundle = new Bundle();
        if (!k9Var.b.l().H().booleanValue()) {
            k9Var.b.f2915e.f(j3);
            if (k9Var.b.l().s(u.o0)) {
                bundle.putLong("_et", k9Var.b.B(j3));
                t7.O(k9Var.b.s().D(true), bundle, true);
            } else {
                z = false;
            }
            k9Var.b.E(false, z, j3);
        }
        k9Var.b.p().U("auto", "_ab", j2, bundle);
    }
}
