package com.google.android.gms.tasks;

final class l implements Runnable {

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ g f3328g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ k f3329h;

    l(k kVar, g gVar) {
        this.f3329h = kVar;
        this.f3328g = gVar;
    }

    public final void run() {
        if (this.f3328g.j()) {
            this.f3329h.c.t();
            return;
        }
        try {
            this.f3329h.c.q(this.f3329h.b.a(this.f3328g));
        } catch (RuntimeExecutionException e2) {
            if (e2.getCause() instanceof Exception) {
                this.f3329h.c.p((Exception) e2.getCause());
            } else {
                this.f3329h.c.p(e2);
            }
        } catch (Exception e3) {
            this.f3329h.c.p(e3);
        }
    }
}
