package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
final class f8 implements Runnable {

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ la f2842g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ c8 f2843h;

    f8(c8 c8Var, la laVar) {
        this.f2843h = c8Var;
        this.f2842g = laVar;
    }

    public final void run() {
        u3 l0 = this.f2843h.f2770d;
        if (l0 == null) {
            this.f2843h.i().E().a("Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            l0.y0(this.f2842g);
        } catch (RemoteException e2) {
            this.f2843h.i().E().b("Failed to reset data on the service: remote exception", e2);
        }
        this.f2843h.e0();
    }
}
