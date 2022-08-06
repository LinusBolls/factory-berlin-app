package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
final class m8 implements Runnable {

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ Bundle f2984g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ la f2985h;

    /* renamed from: i  reason: collision with root package name */
    private final /* synthetic */ c8 f2986i;

    m8(c8 c8Var, Bundle bundle, la laVar) {
        this.f2986i = c8Var;
        this.f2984g = bundle;
        this.f2985h = laVar;
    }

    public final void run() {
        u3 l0 = this.f2986i.f2770d;
        if (l0 == null) {
            this.f2986i.i().E().a("Failed to send default event parameters to service");
            return;
        }
        try {
            l0.l0(this.f2984g, this.f2985h);
        } catch (RemoteException e2) {
            this.f2986i.i().E().b("Failed to send default event parameters to service", e2);
        }
    }
}
