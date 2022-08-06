package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.h;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.5.0 */
final class z extends h.a {

    /* renamed from: k  reason: collision with root package name */
    private final /* synthetic */ String f2639k;

    /* renamed from: l  reason: collision with root package name */
    private final /* synthetic */ af f2640l;

    /* renamed from: m  reason: collision with root package name */
    private final /* synthetic */ h f2641m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    z(h hVar, String str, af afVar) {
        super(hVar);
        this.f2641m = hVar;
        this.f2639k = str;
        this.f2640l = afVar;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.f2641m.f2311h.getMaxUserProperties(this.f2639k, this.f2640l);
    }

    /* access modifiers changed from: protected */
    public final void b() {
        this.f2640l.f((Bundle) null);
    }
}
