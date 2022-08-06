package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import h.a.b;
import i.a.a;

/* compiled from: CreationContextFactory_Factory */
public final class j implements b<i> {
    private final a<Context> a;
    private final a<g.b.a.a.i.w.a> b;
    private final a<g.b.a.a.i.w.a> c;

    public j(a<Context> aVar, a<g.b.a.a.i.w.a> aVar2, a<g.b.a.a.i.w.a> aVar3) {
        this.a = aVar;
        this.b = aVar2;
        this.c = aVar3;
    }

    public static j a(a<Context> aVar, a<g.b.a.a.i.w.a> aVar2, a<g.b.a.a.i.w.a> aVar3) {
        return new j(aVar, aVar2, aVar3);
    }

    /* renamed from: b */
    public i get() {
        return new i(this.a.get(), this.b.get(), this.c.get());
    }
}
