package com.google.android.gms.tasks;

final class p implements Runnable {

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ o f3332g;

    p(o oVar) {
        this.f3332g = oVar;
    }

    public final void run() {
        synchronized (this.f3332g.b) {
            if (this.f3332g.c != null) {
                this.f3332g.c.b();
            }
        }
    }
}
