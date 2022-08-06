package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
final class j implements Runnable {

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ c6 f2907g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ k f2908h;

    j(k kVar, c6 c6Var) {
        this.f2908h = kVar;
        this.f2907g = c6Var;
    }

    public final void run() {
        this.f2907g.n();
        if (va.a()) {
            this.f2907g.a().y(this);
            return;
        }
        boolean d2 = this.f2908h.d();
        long unused = this.f2908h.c = 0;
        if (d2) {
            this.f2908h.b();
        }
    }
}
