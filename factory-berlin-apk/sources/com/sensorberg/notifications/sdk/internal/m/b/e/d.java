package com.sensorberg.notifications.sdk.internal.m.b.e;

import java.util.List;
import k.b0;
import k.d0;
import k.w;
import kotlin.jvm.internal.k;

/* compiled from: HeadersInterceptor.kt */
public final class d implements w {
    private final List<a> b;

    public d(List<? extends a> list) {
        k.f(list, "addHeaders");
        this.b = list;
    }

    public d0 a(w.a aVar) {
        k.f(aVar, "chain");
        b0.a i2 = aVar.j().i();
        for (a a : this.b) {
            a.a(i2);
        }
        return aVar.a(i2.b());
    }
}
