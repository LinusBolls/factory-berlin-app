package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
final class j8 implements Runnable {

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ u7 f2912g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ c8 f2913h;

    j8(c8 c8Var, u7 u7Var) {
        this.f2913h = c8Var;
        this.f2912g = u7Var;
    }

    public final void run() {
        u3 l0 = this.f2913h.f2770d;
        if (l0 == null) {
            this.f2913h.i().E().a("Failed to send current screen to service");
            return;
        }
        try {
            if (this.f2912g == null) {
                l0.u0(0, (String) null, (String) null, this.f2913h.j().getPackageName());
            } else {
                l0.u0(this.f2912g.c, this.f2912g.a, this.f2912g.b, this.f2913h.j().getPackageName());
            }
            this.f2913h.e0();
        } catch (RemoteException e2) {
            this.f2913h.i().E().b("Failed to send current screen to the service", e2);
        }
    }
}
