package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
final class r5 implements Callable<List<ua>> {
    private final /* synthetic */ la a;
    private final /* synthetic */ String b;
    private final /* synthetic */ String c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ i5 f3071d;

    r5(i5 i5Var, la laVar, String str, String str2) {
        this.f3071d = i5Var;
        this.a = laVar;
        this.b = str;
        this.c = str2;
    }

    public final /* synthetic */ Object call() {
        this.f3071d.a.i0();
        return this.f3071d.a.Z().k0(this.a.f2956g, this.b, this.c);
    }
}
