package com.google.android.gms.tasks;

final class v implements Runnable {

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ g f3337g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ u f3338h;

    v(u uVar, g gVar) {
        this.f3338h = uVar;
        this.f3337g = gVar;
    }

    public final void run() {
        synchronized (this.f3338h.b) {
            if (this.f3338h.c != null) {
                this.f3338h.c.c(this.f3337g.i());
            }
        }
    }
}
