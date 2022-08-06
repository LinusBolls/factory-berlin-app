package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
final class q8 implements Runnable {

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ la f3060g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ c8 f3061h;

    q8(c8 c8Var, la laVar) {
        this.f3061h = c8Var;
        this.f3060g = laVar;
    }

    public final void run() {
        u3 l0 = this.f3061h.f2770d;
        if (l0 == null) {
            this.f3061h.i().E().a("Failed to send consent settings to service");
            return;
        }
        try {
            l0.A(this.f3060g);
            this.f3061h.e0();
        } catch (RemoteException e2) {
            this.f3061h.i().E().b("Failed to send consent settings to the service", e2);
        }
    }
}
