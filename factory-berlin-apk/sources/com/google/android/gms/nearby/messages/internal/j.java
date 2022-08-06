package com.google.android.gms.nearby.messages.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.internal.d;
import com.google.android.gms.common.api.internal.i;
import com.google.android.gms.common.internal.e;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.nearby.messages.f;
import com.google.android.gms.nearby.messages.g;
import com.google.android.gms.tasks.h;
import g.b.a.b.c.f.i1;

public final class j extends f {

    /* renamed from: k  reason: collision with root package name */
    private static final a.g<g> f3301k = new a.g<>();

    /* renamed from: l  reason: collision with root package name */
    private static final a.C0060a<g, g> f3302l;

    /* renamed from: m  reason: collision with root package name */
    private static final a<g> f3303m;

    /* renamed from: j  reason: collision with root package name */
    private final int f3304j;

    static {
        m mVar = new m();
        f3302l = mVar;
        f3303m = new a<>("Nearby.MESSAGES_API", mVar, f3301k);
    }

    public j(Context context, g gVar) {
        super(context, f3303m, gVar, c.a.c);
        this.f3304j = g.m0(context);
    }

    /* access modifiers changed from: private */
    public final <T> i<d<Status>> s(h<T> hVar) {
        return i(new n(this, hVar), Status.class.getName());
    }

    private final com.google.android.gms.tasks.g<Void> t(q qVar) {
        return e(new p(this, qVar));
    }

    private final <T> i<T> w(T t) {
        if (t == null) {
            return null;
        }
        return i(t, t.getClass().getName());
    }

    /* access modifiers changed from: protected */
    public final e.a b() {
        e.a b = super.b();
        if (f() != null) {
            f();
        }
        return b;
    }

    public final void o(Intent intent, com.google.android.gms.nearby.messages.e eVar) {
        i1.l(intent, eVar);
    }

    public final com.google.android.gms.tasks.g<Void> p(PendingIntent pendingIntent, com.google.android.gms.nearby.messages.j jVar) {
        r.k(pendingIntent);
        r.k(jVar);
        i w = w(jVar.a());
        return t(new k(this, pendingIntent, w == null ? null : new r(w), jVar));
    }

    public final com.google.android.gms.tasks.g<Void> q(PendingIntent pendingIntent) {
        r.k(pendingIntent);
        return t(new l(pendingIntent));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void v(PendingIntent pendingIntent, r rVar, com.google.android.gms.nearby.messages.j jVar, g gVar, i iVar) {
        gVar.l0(iVar, pendingIntent, rVar, jVar, this.f3304j);
    }
}
