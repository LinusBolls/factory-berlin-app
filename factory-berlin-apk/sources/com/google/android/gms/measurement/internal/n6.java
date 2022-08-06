package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
final /* synthetic */ class n6 implements Runnable {

    /* renamed from: g  reason: collision with root package name */
    private final l6 f2997g;

    n6(l6 l6Var) {
        this.f2997g = l6Var;
    }

    public final void run() {
        l6 l6Var = this.f2997g;
        l6Var.c();
        if (l6Var.k().x.b()) {
            l6Var.i().L().a("Deferred Deep Link already retrieved. Not fetching again.");
            return;
        }
        long a = l6Var.k().y.a();
        l6Var.k().y.b(1 + a);
        if (a >= 5) {
            l6Var.i().H().a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
            l6Var.k().x.a(true);
            return;
        }
        l6Var.a.v();
    }
}
