package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
final class o5 implements Callable<List<ga>> {
    private final /* synthetic */ String a;
    private final /* synthetic */ String b;
    private final /* synthetic */ String c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ i5 f3011d;

    o5(i5 i5Var, String str, String str2, String str3) {
        this.f3011d = i5Var;
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final /* synthetic */ Object call() {
        this.f3011d.a.i0();
        return this.f3011d.a.Z().K(this.a, this.b, this.c);
    }
}
