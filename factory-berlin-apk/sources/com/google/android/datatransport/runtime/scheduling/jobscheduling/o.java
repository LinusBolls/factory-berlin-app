package com.google.android.datatransport.runtime.scheduling.jobscheduling;

/* compiled from: WorkInitializer */
final /* synthetic */ class o implements Runnable {

    /* renamed from: g  reason: collision with root package name */
    private final q f2008g;

    private o(q qVar) {
        this.f2008g = qVar;
    }

    public static Runnable a(q qVar) {
        return new o(qVar);
    }

    public void run() {
        this.f2008g.f2009d.a(p.b(this.f2008g));
    }
}
