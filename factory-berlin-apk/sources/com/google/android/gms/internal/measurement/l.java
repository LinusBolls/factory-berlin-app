package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.h;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.5.0 */
final class l extends h.a {

    /* renamed from: k  reason: collision with root package name */
    private final /* synthetic */ String f2397k;

    /* renamed from: l  reason: collision with root package name */
    private final /* synthetic */ String f2398l;

    /* renamed from: m  reason: collision with root package name */
    private final /* synthetic */ af f2399m;

    /* renamed from: n  reason: collision with root package name */
    private final /* synthetic */ h f2400n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    l(h hVar, String str, String str2, af afVar) {
        super(hVar);
        this.f2400n = hVar;
        this.f2397k = str;
        this.f2398l = str2;
        this.f2399m = afVar;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.f2400n.f2311h.getConditionalUserProperties(this.f2397k, this.f2398l, this.f2399m);
    }

    /* access modifiers changed from: protected */
    public final void b() {
        this.f2399m.f((Bundle) null);
    }
}
