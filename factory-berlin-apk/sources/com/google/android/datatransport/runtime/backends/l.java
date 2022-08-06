package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import h.a.b;
import i.a.a;

/* compiled from: MetadataBackendRegistry_Factory */
public final class l implements b<k> {
    private final a<Context> a;
    private final a<i> b;

    public l(a<Context> aVar, a<i> aVar2) {
        this.a = aVar;
        this.b = aVar2;
    }

    public static l a(a<Context> aVar, a<i> aVar2) {
        return new l(aVar, aVar2);
    }

    /* renamed from: b */
    public k get() {
        return new k(this.a.get(), this.b.get());
    }
}
