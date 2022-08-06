package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import com.google.android.datatransport.runtime.backends.e;
import g.b.a.a.i.v.j.c;
import h.a.b;
import i.a.a;
import java.util.concurrent.Executor;

/* compiled from: Uploader_Factory */
public final class n implements b<m> {
    private final a<Context> a;
    private final a<e> b;
    private final a<c> c;

    /* renamed from: d  reason: collision with root package name */
    private final a<s> f2004d;

    /* renamed from: e  reason: collision with root package name */
    private final a<Executor> f2005e;

    /* renamed from: f  reason: collision with root package name */
    private final a<com.google.android.datatransport.runtime.synchronization.a> f2006f;

    /* renamed from: g  reason: collision with root package name */
    private final a<g.b.a.a.i.w.a> f2007g;

    public n(a<Context> aVar, a<e> aVar2, a<c> aVar3, a<s> aVar4, a<Executor> aVar5, a<com.google.android.datatransport.runtime.synchronization.a> aVar6, a<g.b.a.a.i.w.a> aVar7) {
        this.a = aVar;
        this.b = aVar2;
        this.c = aVar3;
        this.f2004d = aVar4;
        this.f2005e = aVar5;
        this.f2006f = aVar6;
        this.f2007g = aVar7;
    }

    public static n a(a<Context> aVar, a<e> aVar2, a<c> aVar3, a<s> aVar4, a<Executor> aVar5, a<com.google.android.datatransport.runtime.synchronization.a> aVar6, a<g.b.a.a.i.w.a> aVar7) {
        return new n(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7);
    }

    /* renamed from: b */
    public m get() {
        return new m(this.a.get(), this.b.get(), this.c.get(), this.f2004d.get(), this.f2005e.get(), this.f2006f.get(), this.f2007g.get());
    }
}
