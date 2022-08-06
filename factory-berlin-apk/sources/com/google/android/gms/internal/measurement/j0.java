package com.google.android.gms.internal.measurement;

import android.app.Activity;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.internal.measurement.h;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.5.0 */
final class j0 extends h.a {

    /* renamed from: k  reason: collision with root package name */
    private final /* synthetic */ Activity f2359k;

    /* renamed from: l  reason: collision with root package name */
    private final /* synthetic */ h.b f2360l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    j0(h.b bVar, Activity activity) {
        super(h.this);
        this.f2360l = bVar;
        this.f2359k = activity;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        h.this.f2311h.onActivityDestroyed(b.S0(this.f2359k), this.f2313h);
    }
}
