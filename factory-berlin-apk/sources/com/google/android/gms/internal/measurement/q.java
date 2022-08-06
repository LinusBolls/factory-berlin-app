package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.h;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.5.0 */
final class q extends h.a {

    /* renamed from: k  reason: collision with root package name */
    private final /* synthetic */ String f2485k;

    /* renamed from: l  reason: collision with root package name */
    private final /* synthetic */ h f2486l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    q(h hVar, String str) {
        super(hVar);
        this.f2486l = hVar;
        this.f2485k = str;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.f2486l.f2311h.beginAdUnitExposure(this.f2485k, this.f2313h);
    }
}
