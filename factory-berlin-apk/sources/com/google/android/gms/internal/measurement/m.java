package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.h;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.5.0 */
final class m extends h.a {

    /* renamed from: k  reason: collision with root package name */
    private final /* synthetic */ String f2409k;

    /* renamed from: l  reason: collision with root package name */
    private final /* synthetic */ String f2410l;

    /* renamed from: m  reason: collision with root package name */
    private final /* synthetic */ Bundle f2411m;

    /* renamed from: n  reason: collision with root package name */
    private final /* synthetic */ h f2412n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    m(h hVar, String str, String str2, Bundle bundle) {
        super(hVar);
        this.f2412n = hVar;
        this.f2409k = str;
        this.f2410l = str2;
        this.f2411m = bundle;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.f2412n.f2311h.clearConditionalUserProperty(this.f2409k, this.f2410l, this.f2411m);
    }
}
