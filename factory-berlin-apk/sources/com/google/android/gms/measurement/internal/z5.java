package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
final class z5 implements Callable<List<ga>> {
    private final /* synthetic */ la a;
    private final /* synthetic */ i5 b;

    z5(i5 i5Var, la laVar) {
        this.b = i5Var;
        this.a = laVar;
    }

    public final /* synthetic */ Object call() {
        this.b.a.i0();
        return this.b.a.Z().I(this.a.f2956g);
    }
}
