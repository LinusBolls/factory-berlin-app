package com.google.android.gms.internal.measurement;

import android.app.Activity;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.internal.measurement.h;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.5.0 */
final class h0 extends h.a {

    /* renamed from: k  reason: collision with root package name */
    private final /* synthetic */ Activity f2317k;

    /* renamed from: l  reason: collision with root package name */
    private final /* synthetic */ af f2318l;

    /* renamed from: m  reason: collision with root package name */
    private final /* synthetic */ h.b f2319m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    h0(h.b bVar, Activity activity, af afVar) {
        super(h.this);
        this.f2319m = bVar;
        this.f2317k = activity;
        this.f2318l = afVar;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        h.this.f2311h.onActivitySaveInstanceState(b.S0(this.f2317k), this.f2318l, this.f2313h);
    }
}
