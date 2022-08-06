package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.h;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.5.0 */
final class a0 extends h.a {

    /* renamed from: k  reason: collision with root package name */
    private final /* synthetic */ boolean f2223k;

    /* renamed from: l  reason: collision with root package name */
    private final /* synthetic */ h f2224l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    a0(h hVar, boolean z) {
        super(hVar);
        this.f2224l = hVar;
        this.f2223k = z;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.f2224l.f2311h.setDataCollectionEnabled(this.f2223k);
    }
}
