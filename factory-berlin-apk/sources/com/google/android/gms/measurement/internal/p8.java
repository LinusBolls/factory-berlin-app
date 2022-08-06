package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
final class p8 implements Runnable {

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ boolean f3042g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ boolean f3043h;

    /* renamed from: i  reason: collision with root package name */
    private final /* synthetic */ s f3044i;

    /* renamed from: j  reason: collision with root package name */
    private final /* synthetic */ la f3045j;

    /* renamed from: k  reason: collision with root package name */
    private final /* synthetic */ String f3046k;

    /* renamed from: l  reason: collision with root package name */
    private final /* synthetic */ c8 f3047l;

    p8(c8 c8Var, boolean z, boolean z2, s sVar, la laVar, String str) {
        this.f3047l = c8Var;
        this.f3042g = z;
        this.f3043h = z2;
        this.f3044i = sVar;
        this.f3045j = laVar;
        this.f3046k = str;
    }

    public final void run() {
        u3 l0 = this.f3047l.f2770d;
        if (l0 == null) {
            this.f3047l.i().E().a("Discarding data. Failed to send event to service");
            return;
        }
        if (this.f3042g) {
            this.f3047l.L(l0, this.f3043h ? null : this.f3044i, this.f3045j);
        } else {
            try {
                if (TextUtils.isEmpty(this.f3046k)) {
                    l0.U(this.f3044i, this.f3045j);
                } else {
                    l0.A0(this.f3044i, this.f3046k, this.f3047l.i().N());
                }
            } catch (RemoteException e2) {
                this.f3047l.i().E().b("Failed to send event to the service", e2);
            }
        }
        this.f3047l.e0();
    }
}
