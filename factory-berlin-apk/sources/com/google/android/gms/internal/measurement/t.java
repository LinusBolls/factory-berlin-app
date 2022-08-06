package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.h;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.5.0 */
final class t extends h.a {

    /* renamed from: k  reason: collision with root package name */
    private final /* synthetic */ af f2536k;

    /* renamed from: l  reason: collision with root package name */
    private final /* synthetic */ h f2537l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    t(h hVar, af afVar) {
        super(hVar);
        this.f2537l = hVar;
        this.f2536k = afVar;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.f2537l.f2311h.getCurrentScreenName(this.f2536k);
    }

    /* access modifiers changed from: protected */
    public final void b() {
        this.f2536k.f((Bundle) null);
    }
}
