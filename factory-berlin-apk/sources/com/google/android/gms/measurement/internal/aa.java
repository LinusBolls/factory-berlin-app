package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.fb;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
final class aa implements Callable<String> {
    private final /* synthetic */ la a;
    private final /* synthetic */ x9 b;

    aa(x9 x9Var, la laVar) {
        this.b = x9Var;
        this.a = laVar;
    }

    public final /* synthetic */ Object call() {
        if (!fb.a() || !this.b.L().s(u.Q0) || (this.b.c(this.a.f2956g).q() && e.b(this.a.C).q())) {
            f4 U = this.b.U(this.a);
            if (U != null) {
                return U.x();
            }
            this.b.i().H().a("App info was null when attempting to get app instance id");
            return null;
        }
        this.b.i().M().a("Analytics storage consent denied. Returning null app instance id");
        return null;
    }
}
