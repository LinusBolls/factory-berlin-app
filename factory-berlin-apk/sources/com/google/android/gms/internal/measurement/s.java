package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.h;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.5.0 */
final class s extends h.a {

    /* renamed from: k  reason: collision with root package name */
    private final /* synthetic */ af f2517k;

    /* renamed from: l  reason: collision with root package name */
    private final /* synthetic */ h f2518l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    s(h hVar, af afVar) {
        super(hVar);
        this.f2518l = hVar;
        this.f2517k = afVar;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.f2518l.f2311h.getGmpAppId(this.f2517k);
    }

    /* access modifiers changed from: protected */
    public final void b() {
        this.f2517k.f((Bundle) null);
    }
}
