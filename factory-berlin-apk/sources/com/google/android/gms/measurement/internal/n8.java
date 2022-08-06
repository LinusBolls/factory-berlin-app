package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
final class n8 implements Runnable {

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ la f2998g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ c8 f2999h;

    n8(c8 c8Var, la laVar) {
        this.f2999h = c8Var;
        this.f2998g = laVar;
    }

    public final void run() {
        u3 l0 = this.f2999h.f2770d;
        if (l0 == null) {
            this.f2999h.i().E().a("Failed to send measurementEnabled to service");
            return;
        }
        try {
            l0.N(this.f2998g);
            this.f2999h.e0();
        } catch (RemoteException e2) {
            this.f2999h.i().E().b("Failed to send measurementEnabled to the service", e2);
        }
    }
}
