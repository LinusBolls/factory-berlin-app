package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
final class v8 implements Runnable {

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ u3 f3192g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ w8 f3193h;

    v8(w8 w8Var, u3 u3Var) {
        this.f3193h = w8Var;
        this.f3192g = u3Var;
    }

    public final void run() {
        synchronized (this.f3193h) {
            boolean unused = this.f3193h.a = false;
            if (!this.f3193h.c.V()) {
                this.f3193h.c.i().M().a("Connected to service");
                this.f3193h.c.K(this.f3192g);
            }
        }
    }
}
