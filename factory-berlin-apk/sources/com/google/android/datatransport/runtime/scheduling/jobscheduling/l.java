package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.synchronization.a;
import g.b.a.a.i.m;

/* compiled from: Uploader */
final /* synthetic */ class l implements a.C0059a {
    private final m a;
    private final m b;
    private final int c;

    private l(m mVar, m mVar2, int i2) {
        this.a = mVar;
        this.b = mVar2;
        this.c = i2;
    }

    public static a.C0059a b(m mVar, m mVar2, int i2) {
        return new l(mVar, mVar2, i2);
    }

    public Object a() {
        return this.a.f2000d.a(this.b, this.c + 1);
    }
}
