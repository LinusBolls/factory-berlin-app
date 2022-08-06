package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import g.b.a.a.i.v.j.c;
import h.a.b;
import i.a.a;
import java.util.concurrent.Executor;

/* compiled from: WorkInitializer_Factory */
public final class r implements b<q> {
    private final a<Executor> a;
    private final a<c> b;
    private final a<s> c;

    /* renamed from: d  reason: collision with root package name */
    private final a<com.google.android.datatransport.runtime.synchronization.a> f2010d;

    public r(a<Executor> aVar, a<c> aVar2, a<s> aVar3, a<com.google.android.datatransport.runtime.synchronization.a> aVar4) {
        this.a = aVar;
        this.b = aVar2;
        this.c = aVar3;
        this.f2010d = aVar4;
    }

    public static r a(a<Executor> aVar, a<c> aVar2, a<s> aVar3, a<com.google.android.datatransport.runtime.synchronization.a> aVar4) {
        return new r(aVar, aVar2, aVar3, aVar4);
    }

    /* renamed from: b */
    public q get() {
        return new q(this.a.get(), this.b.get(), this.c.get(), this.f2010d.get());
    }
}
