package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.backends.g;
import com.google.android.datatransport.runtime.synchronization.a;
import g.b.a.a.i.m;

/* compiled from: Uploader */
final /* synthetic */ class j implements a.C0059a {
    private final m a;
    private final g b;
    private final Iterable c;

    /* renamed from: d  reason: collision with root package name */
    private final m f1998d;

    /* renamed from: e  reason: collision with root package name */
    private final int f1999e;

    private j(m mVar, g gVar, Iterable iterable, m mVar2, int i2) {
        this.a = mVar;
        this.b = gVar;
        this.c = iterable;
        this.f1998d = mVar2;
        this.f1999e = i2;
    }

    public static a.C0059a b(m mVar, g gVar, Iterable iterable, m mVar2, int i2) {
        return new j(mVar, gVar, iterable, mVar2, i2);
    }

    public Object a() {
        return m.c(this.a, this.b, this.c, this.f1998d, this.f1999e);
    }
}
