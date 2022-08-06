package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
final class s8 implements Runnable {

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ boolean f3091g = true;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ boolean f3092h;

    /* renamed from: i  reason: collision with root package name */
    private final /* synthetic */ ua f3093i;

    /* renamed from: j  reason: collision with root package name */
    private final /* synthetic */ la f3094j;

    /* renamed from: k  reason: collision with root package name */
    private final /* synthetic */ ua f3095k;

    /* renamed from: l  reason: collision with root package name */
    private final /* synthetic */ c8 f3096l;

    s8(c8 c8Var, boolean z, boolean z2, ua uaVar, la laVar, ua uaVar2) {
        this.f3096l = c8Var;
        this.f3092h = z2;
        this.f3093i = uaVar;
        this.f3094j = laVar;
        this.f3095k = uaVar2;
    }

    public final void run() {
        u3 l0 = this.f3096l.f2770d;
        if (l0 == null) {
            this.f3096l.i().E().a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        if (this.f3091g) {
            this.f3096l.L(l0, this.f3092h ? null : this.f3093i, this.f3094j);
        } else {
            try {
                if (TextUtils.isEmpty(this.f3095k.f3163g)) {
                    l0.u(this.f3093i, this.f3094j);
                } else {
                    l0.E(this.f3093i);
                }
            } catch (RemoteException e2) {
                this.f3096l.i().E().b("Failed to send conditional user property to the service", e2);
            }
        }
        this.f3096l.e0();
    }
}
