package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.h;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.5.0 */
final class c0 extends h.a {

    /* renamed from: k  reason: collision with root package name */
    private final /* synthetic */ Long f2246k;

    /* renamed from: l  reason: collision with root package name */
    private final /* synthetic */ String f2247l;

    /* renamed from: m  reason: collision with root package name */
    private final /* synthetic */ String f2248m;

    /* renamed from: n  reason: collision with root package name */
    private final /* synthetic */ Bundle f2249n;
    private final /* synthetic */ boolean o;
    private final /* synthetic */ boolean p;
    private final /* synthetic */ h q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    c0(h hVar, Long l2, String str, String str2, Bundle bundle, boolean z, boolean z2) {
        super(hVar);
        this.q = hVar;
        this.f2246k = l2;
        this.f2247l = str;
        this.f2248m = str2;
        this.f2249n = bundle;
        this.o = z;
        this.p = z2;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        Long l2 = this.f2246k;
        this.q.f2311h.logEvent(this.f2247l, this.f2248m, this.f2249n, this.o, this.p, l2 == null ? this.f2312g : l2.longValue());
    }
}
