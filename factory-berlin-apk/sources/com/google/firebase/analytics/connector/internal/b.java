package com.google.firebase.analytics.connector.internal;

import com.google.firebase.analytics.a.a;
import java.util.HashSet;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-measurement-api@@17.5.0 */
public final class b {
    Set<String> a = new HashSet();
    /* access modifiers changed from: private */
    public a.b b;
    private com.google.android.gms.measurement.a.a c;

    /* renamed from: d  reason: collision with root package name */
    private e f3862d;

    public b(com.google.android.gms.measurement.a.a aVar, a.b bVar) {
        this.b = bVar;
        this.c = aVar;
        e eVar = new e(this);
        this.f3862d = eVar;
        this.c.b(eVar);
    }
}
