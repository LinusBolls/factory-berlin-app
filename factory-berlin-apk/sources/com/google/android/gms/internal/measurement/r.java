package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.h;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.5.0 */
final class r extends h.a {

    /* renamed from: k  reason: collision with root package name */
    private final /* synthetic */ af f2505k;

    /* renamed from: l  reason: collision with root package name */
    private final /* synthetic */ h f2506l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    r(h hVar, af afVar) {
        super(hVar);
        this.f2506l = hVar;
        this.f2505k = afVar;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.f2506l.f2311h.getCachedAppInstanceId(this.f2505k);
    }

    /* access modifiers changed from: protected */
    public final void b() {
        this.f2505k.f((Bundle) null);
    }
}
