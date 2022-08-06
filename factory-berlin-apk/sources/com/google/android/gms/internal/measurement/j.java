package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.h;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.5.0 */
final class j extends h.a {

    /* renamed from: k  reason: collision with root package name */
    private final /* synthetic */ Bundle f2357k;

    /* renamed from: l  reason: collision with root package name */
    private final /* synthetic */ h f2358l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    j(h hVar, Bundle bundle) {
        super(hVar);
        this.f2358l = hVar;
        this.f2357k = bundle;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.f2358l.f2311h.setConditionalUserProperty(this.f2357k, this.f2312g);
    }
}
