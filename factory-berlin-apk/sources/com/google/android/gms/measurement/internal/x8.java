package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
final class x8 implements Runnable {

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ u3 f3215g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ w8 f3216h;

    x8(w8 w8Var, u3 u3Var) {
        this.f3216h = w8Var;
        this.f3215g = u3Var;
    }

    public final void run() {
        synchronized (this.f3216h) {
            boolean unused = this.f3216h.a = false;
            if (!this.f3216h.c.V()) {
                this.f3216h.c.i().L().a("Connected to remote service");
                this.f3216h.c.K(this.f3215g);
            }
        }
    }
}
