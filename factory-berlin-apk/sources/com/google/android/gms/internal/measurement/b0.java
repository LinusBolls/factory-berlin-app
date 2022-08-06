package com.google.android.gms.internal.measurement;

import android.util.Log;
import android.util.Pair;
import com.google.android.gms.internal.measurement.h;
import com.google.android.gms.measurement.internal.j6;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.5.0 */
final class b0 extends h.a {

    /* renamed from: k  reason: collision with root package name */
    private final /* synthetic */ j6 f2239k;

    /* renamed from: l  reason: collision with root package name */
    private final /* synthetic */ h f2240l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    b0(h hVar, j6 j6Var) {
        super(hVar);
        this.f2240l = hVar;
        this.f2239k = j6Var;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        for (int i2 = 0; i2 < this.f2240l.f2308e.size(); i2++) {
            if (this.f2239k.equals(((Pair) this.f2240l.f2308e.get(i2)).first)) {
                Log.w(this.f2240l.a, "OnEventListener already registered.");
                return;
            }
        }
        h.c cVar = new h.c(this.f2239k);
        this.f2240l.f2308e.add(new Pair(this.f2239k, cVar));
        this.f2240l.f2311h.registerOnMeasurementEventListener(cVar);
    }
}
