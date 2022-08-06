package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.h;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.5.0 */
final class p extends h.a {

    /* renamed from: k  reason: collision with root package name */
    private final /* synthetic */ String f2469k;

    /* renamed from: l  reason: collision with root package name */
    private final /* synthetic */ h f2470l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    p(h hVar, String str) {
        super(hVar);
        this.f2470l = hVar;
        this.f2469k = str;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.f2470l.f2311h.endAdUnitExposure(this.f2469k, this.f2313h);
    }
}
