package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.df;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
final class u8 implements Runnable {

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ String f3158g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ String f3159h;

    /* renamed from: i  reason: collision with root package name */
    private final /* synthetic */ la f3160i;

    /* renamed from: j  reason: collision with root package name */
    private final /* synthetic */ df f3161j;

    /* renamed from: k  reason: collision with root package name */
    private final /* synthetic */ c8 f3162k;

    u8(c8 c8Var, String str, String str2, la laVar, df dfVar) {
        this.f3162k = c8Var;
        this.f3158g = str;
        this.f3159h = str2;
        this.f3160i = laVar;
        this.f3161j = dfVar;
    }

    public final void run() {
        ArrayList<Bundle> arrayList = new ArrayList<>();
        try {
            u3 l0 = this.f3162k.f2770d;
            if (l0 == null) {
                this.f3162k.i().E().c("Failed to get conditional properties; not connected to service", this.f3158g, this.f3159h);
                return;
            }
            arrayList = fa.s0(l0.B0(this.f3158g, this.f3159h, this.f3160i));
            this.f3162k.e0();
            this.f3162k.g().S(this.f3161j, arrayList);
        } catch (RemoteException e2) {
            this.f3162k.i().E().d("Failed to get conditional properties; remote exception", this.f3158g, this.f3159h, e2);
        } finally {
            this.f3162k.g().S(this.f3161j, arrayList);
        }
    }
}
