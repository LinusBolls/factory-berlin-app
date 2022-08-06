package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.df;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
final class e8 implements Runnable {

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ String f2812g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ String f2813h;

    /* renamed from: i  reason: collision with root package name */
    private final /* synthetic */ boolean f2814i;

    /* renamed from: j  reason: collision with root package name */
    private final /* synthetic */ la f2815j;

    /* renamed from: k  reason: collision with root package name */
    private final /* synthetic */ df f2816k;

    /* renamed from: l  reason: collision with root package name */
    private final /* synthetic */ c8 f2817l;

    e8(c8 c8Var, String str, String str2, boolean z, la laVar, df dfVar) {
        this.f2817l = c8Var;
        this.f2812g = str;
        this.f2813h = str2;
        this.f2814i = z;
        this.f2815j = laVar;
        this.f2816k = dfVar;
    }

    public final void run() {
        Bundle bundle = new Bundle();
        try {
            u3 l0 = this.f2817l.f2770d;
            if (l0 == null) {
                this.f2817l.i().E().c("Failed to get user properties; not connected to service", this.f2812g, this.f2813h);
                return;
            }
            bundle = fa.D(l0.s(this.f2812g, this.f2813h, this.f2814i, this.f2815j));
            this.f2817l.e0();
            this.f2817l.g().Q(this.f2816k, bundle);
        } catch (RemoteException e2) {
            this.f2817l.i().E().c("Failed to get user properties; remote exception", this.f2812g, e2);
        } finally {
            this.f2817l.g().Q(this.f2816k, bundle);
        }
    }
}
