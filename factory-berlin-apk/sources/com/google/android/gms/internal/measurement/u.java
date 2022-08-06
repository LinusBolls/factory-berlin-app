package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.h;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.5.0 */
final class u extends h.a {

    /* renamed from: k  reason: collision with root package name */
    private final /* synthetic */ af f2561k;

    /* renamed from: l  reason: collision with root package name */
    private final /* synthetic */ h f2562l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    u(h hVar, af afVar) {
        super(hVar);
        this.f2562l = hVar;
        this.f2561k = afVar;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.f2562l.f2311h.generateEventId(this.f2561k);
    }

    /* access modifiers changed from: protected */
    public final void b() {
        this.f2561k.f((Bundle) null);
    }
}
