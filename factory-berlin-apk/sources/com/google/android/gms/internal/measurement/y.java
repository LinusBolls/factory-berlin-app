package com.google.android.gms.internal.measurement;

import com.google.android.gms.dynamic.b;
import com.google.android.gms.internal.measurement.h;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.5.0 */
final class y extends h.a {

    /* renamed from: k  reason: collision with root package name */
    private final /* synthetic */ int f2629k = 5;

    /* renamed from: l  reason: collision with root package name */
    private final /* synthetic */ String f2630l;

    /* renamed from: m  reason: collision with root package name */
    private final /* synthetic */ Object f2631m;

    /* renamed from: n  reason: collision with root package name */
    private final /* synthetic */ h f2632n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    y(h hVar, boolean z, int i2, String str, Object obj, Object obj2, Object obj3) {
        super(false);
        this.f2632n = hVar;
        this.f2630l = str;
        this.f2631m = obj;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.f2632n.f2311h.logHealthData(this.f2629k, this.f2630l, b.S0(this.f2631m), b.S0(null), b.S0(null));
    }
}
