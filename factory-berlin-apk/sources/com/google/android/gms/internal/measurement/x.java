package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.h;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.5.0 */
final class x extends h.a {

    /* renamed from: k  reason: collision with root package name */
    private final /* synthetic */ af f2614k;

    /* renamed from: l  reason: collision with root package name */
    private final /* synthetic */ h f2615l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    x(h hVar, af afVar) {
        super(hVar);
        this.f2615l = hVar;
        this.f2614k = afVar;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.f2615l.f2311h.getCurrentScreenClass(this.f2614k);
    }

    /* access modifiers changed from: protected */
    public final void b() {
        this.f2614k.f((Bundle) null);
    }
}
