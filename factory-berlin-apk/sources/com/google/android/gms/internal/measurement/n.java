package com.google.android.gms.internal.measurement;

import android.app.Activity;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.internal.measurement.h;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.5.0 */
final class n extends h.a {

    /* renamed from: k  reason: collision with root package name */
    private final /* synthetic */ Activity f2418k;

    /* renamed from: l  reason: collision with root package name */
    private final /* synthetic */ String f2419l;

    /* renamed from: m  reason: collision with root package name */
    private final /* synthetic */ String f2420m;

    /* renamed from: n  reason: collision with root package name */
    private final /* synthetic */ h f2421n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    n(h hVar, Activity activity, String str, String str2) {
        super(hVar);
        this.f2421n = hVar;
        this.f2418k = activity;
        this.f2419l = str;
        this.f2420m = str2;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.f2421n.f2311h.setCurrentScreen(b.S0(this.f2418k), this.f2419l, this.f2420m, this.f2312g);
    }
}
