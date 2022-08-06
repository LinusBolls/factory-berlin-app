package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.h;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.5.0 */
final class w extends h.a {

    /* renamed from: k  reason: collision with root package name */
    private final /* synthetic */ String f2597k;

    /* renamed from: l  reason: collision with root package name */
    private final /* synthetic */ String f2598l;

    /* renamed from: m  reason: collision with root package name */
    private final /* synthetic */ boolean f2599m;

    /* renamed from: n  reason: collision with root package name */
    private final /* synthetic */ af f2600n;
    private final /* synthetic */ h o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    w(h hVar, String str, String str2, boolean z, af afVar) {
        super(hVar);
        this.o = hVar;
        this.f2597k = str;
        this.f2598l = str2;
        this.f2599m = z;
        this.f2600n = afVar;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.o.f2311h.getUserProperties(this.f2597k, this.f2598l, this.f2599m, this.f2600n);
    }

    /* access modifiers changed from: protected */
    public final void b() {
        this.f2600n.f((Bundle) null);
    }
}
