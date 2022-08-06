package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.safeparcel.a;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
final class k8 implements Runnable {

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ la f2928g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ c8 f2929h;

    k8(c8 c8Var, la laVar) {
        this.f2929h = c8Var;
        this.f2928g = laVar;
    }

    public final void run() {
        u3 l0 = this.f2929h.f2770d;
        if (l0 == null) {
            this.f2929h.i().E().a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            l0.w(this.f2928g);
            this.f2929h.t().J();
            this.f2929h.L(l0, (a) null, this.f2928g);
            this.f2929h.e0();
        } catch (RemoteException e2) {
            this.f2929h.i().E().b("Failed to send app launch to the service", e2);
        }
    }
}
