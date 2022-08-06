package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.df;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
final class o8 implements Runnable {

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ s f3014g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ String f3015h;

    /* renamed from: i  reason: collision with root package name */
    private final /* synthetic */ df f3016i;

    /* renamed from: j  reason: collision with root package name */
    private final /* synthetic */ c8 f3017j;

    o8(c8 c8Var, s sVar, String str, df dfVar) {
        this.f3017j = c8Var;
        this.f3014g = sVar;
        this.f3015h = str;
        this.f3016i = dfVar;
    }

    public final void run() {
        byte[] bArr = null;
        try {
            u3 l0 = this.f3017j.f2770d;
            if (l0 == null) {
                this.f3017j.i().E().a("Discarding data. Failed to send event to service to bundle");
                return;
            }
            bArr = l0.T(this.f3014g, this.f3015h);
            this.f3017j.e0();
            this.f3017j.g().U(this.f3016i, bArr);
        } catch (RemoteException e2) {
            this.f3017j.i().E().b("Failed to send event to the service to bundle", e2);
        } finally {
            this.f3017j.g().U(this.f3016i, bArr);
        }
    }
}
