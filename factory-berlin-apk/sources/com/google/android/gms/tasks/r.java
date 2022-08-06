package com.google.android.gms.tasks;

final class r implements Runnable {

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ g f3333g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ q f3334h;

    r(q qVar, g gVar) {
        this.f3334h = qVar;
        this.f3333g = gVar;
    }

    public final void run() {
        synchronized (this.f3334h.b) {
            if (this.f3334h.c != null) {
                this.f3334h.c.a(this.f3333g);
            }
        }
    }
}
