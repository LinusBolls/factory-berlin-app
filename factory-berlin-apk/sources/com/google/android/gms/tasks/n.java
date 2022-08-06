package com.google.android.gms.tasks;

final class n implements Runnable {

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ g f3330g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ m f3331h;

    n(m mVar, g gVar) {
        this.f3331h = mVar;
        this.f3330g = gVar;
    }

    public final void run() {
        try {
            g gVar = (g) this.f3331h.b.a(this.f3330g);
            if (gVar == null) {
                this.f3331h.d(new NullPointerException("Continuation returned null"));
                return;
            }
            gVar.d(i.b, this.f3331h);
            gVar.c(i.b, this.f3331h);
            gVar.a(i.b, this.f3331h);
        } catch (RuntimeExecutionException e2) {
            if (e2.getCause() instanceof Exception) {
                this.f3331h.c.p((Exception) e2.getCause());
            } else {
                this.f3331h.c.p(e2);
            }
        } catch (Exception e3) {
            this.f3331h.c.p(e3);
        }
    }
}
