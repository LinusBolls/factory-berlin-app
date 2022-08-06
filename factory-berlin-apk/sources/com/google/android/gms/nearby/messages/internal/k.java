package com.google.android.gms.nearby.messages.internal;

import android.app.PendingIntent;
import com.google.android.gms.common.api.internal.i;
import com.google.android.gms.nearby.messages.j;

final /* synthetic */ class k implements q {
    private final j a;
    private final PendingIntent b;
    private final r c;

    /* renamed from: d  reason: collision with root package name */
    private final j f3305d;

    k(j jVar, PendingIntent pendingIntent, r rVar, j jVar2) {
        this.a = jVar;
        this.b = pendingIntent;
        this.c = rVar;
        this.f3305d = jVar2;
    }

    public final void a(g gVar, i iVar) {
        this.a.v(this.b, this.c, this.f3305d, gVar, iVar);
    }
}
