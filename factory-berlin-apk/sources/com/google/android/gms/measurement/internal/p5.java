package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
final class p5 implements Callable<List<ga>> {
    private final /* synthetic */ la a;
    private final /* synthetic */ String b;
    private final /* synthetic */ String c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ i5 f3035d;

    p5(i5 i5Var, la laVar, String str, String str2) {
        this.f3035d = i5Var;
        this.a = laVar;
        this.b = str;
        this.c = str2;
    }

    public final /* synthetic */ Object call() {
        this.f3035d.a.i0();
        return this.f3035d.a.Z().K(this.a.f2956g, this.b, this.c);
    }
}
