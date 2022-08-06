package com.google.android.gms.tasks;

import java.util.concurrent.CancellationException;

final class x implements Runnable {

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ g f3339g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ w f3340h;

    x(w wVar, g gVar) {
        this.f3340h = wVar;
        this.f3339g = gVar;
    }

    public final void run() {
        try {
            g a = this.f3340h.b.a(this.f3339g.i());
            if (a == null) {
                this.f3340h.d(new NullPointerException("Continuation returned null"));
                return;
            }
            a.d(i.b, this.f3340h);
            a.c(i.b, this.f3340h);
            a.a(i.b, this.f3340h);
        } catch (RuntimeExecutionException e2) {
            if (e2.getCause() instanceof Exception) {
                this.f3340h.d((Exception) e2.getCause());
            } else {
                this.f3340h.d(e2);
            }
        } catch (CancellationException unused) {
            this.f3340h.b();
        } catch (Exception e3) {
            this.f3340h.d(e3);
        }
    }
}
