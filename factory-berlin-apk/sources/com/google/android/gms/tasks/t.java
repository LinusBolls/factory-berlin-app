package com.google.android.gms.tasks;

final class t implements Runnable {

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ g f3335g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ s f3336h;

    t(s sVar, g gVar) {
        this.f3336h = sVar;
        this.f3335g = gVar;
    }

    public final void run() {
        synchronized (this.f3336h.b) {
            if (this.f3336h.c != null) {
                this.f3336h.c.d(this.f3335g.h());
            }
        }
    }
}
