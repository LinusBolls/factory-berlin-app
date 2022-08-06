package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.df;
import com.google.android.gms.internal.measurement.fb;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
final class h8 implements Runnable {

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ la f2884g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ df f2885h;

    /* renamed from: i  reason: collision with root package name */
    private final /* synthetic */ c8 f2886i;

    h8(c8 c8Var, la laVar, df dfVar) {
        this.f2886i = c8Var;
        this.f2884g = laVar;
        this.f2885h = dfVar;
    }

    public final void run() {
        try {
            if (!fb.a() || !this.f2886i.l().s(u.P0) || this.f2886i.k().K().q()) {
                u3 l0 = this.f2886i.f2770d;
                if (l0 == null) {
                    this.f2886i.i().E().a("Failed to get app instance id");
                    this.f2886i.g().R(this.f2885h, (String) null);
                    return;
                }
                String k0 = l0.k0(this.f2884g);
                if (k0 != null) {
                    this.f2886i.p().T(k0);
                    this.f2886i.k().f3032l.b(k0);
                }
                this.f2886i.e0();
                this.f2886i.g().R(this.f2885h, k0);
                return;
            }
            this.f2886i.i().J().a("Analytics storage consent denied; will not get app instance id");
            this.f2886i.p().T((String) null);
            this.f2886i.k().f3032l.b((String) null);
        } catch (RemoteException e2) {
            this.f2886i.i().E().b("Failed to get app instance id", e2);
        } finally {
            this.f2886i.g().R(this.f2885h, (String) null);
        }
    }
}
