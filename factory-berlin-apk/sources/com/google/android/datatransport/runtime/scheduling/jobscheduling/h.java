package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import g.b.a.a.i.m;

/* compiled from: Uploader */
final /* synthetic */ class h implements Runnable {

    /* renamed from: g  reason: collision with root package name */
    private final m f1994g;

    /* renamed from: h  reason: collision with root package name */
    private final m f1995h;

    /* renamed from: i  reason: collision with root package name */
    private final int f1996i;

    /* renamed from: j  reason: collision with root package name */
    private final Runnable f1997j;

    private h(m mVar, m mVar2, int i2, Runnable runnable) {
        this.f1994g = mVar;
        this.f1995h = mVar2;
        this.f1996i = i2;
        this.f1997j = runnable;
    }

    public static Runnable a(m mVar, m mVar2, int i2, Runnable runnable) {
        return new h(mVar, mVar2, i2, runnable);
    }

    public void run() {
        m.e(this.f1994g, this.f1995h, this.f1996i, this.f1997j);
    }
}
