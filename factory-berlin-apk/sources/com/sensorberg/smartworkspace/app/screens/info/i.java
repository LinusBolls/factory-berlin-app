package com.sensorberg.smartworkspace.app.screens.info;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import g.e.d.f;
import g.e.j.a.b;
import g.e.j.a.d;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlin.x;
import m.a.c.c;

/* compiled from: NotificationSdkHelper.kt */
public final class i implements c, d {

    /* renamed from: g  reason: collision with root package name */
    private final Context f7523g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final c f7524h;

    /* renamed from: i  reason: collision with root package name */
    private final d f7525i;

    /* renamed from: j  reason: collision with root package name */
    private final com.sensorberg.smartworkspace.app.utils.c f7526j;

    /* compiled from: NotificationSdkHelper.kt */
    static final class a extends l implements kotlin.e0.c.a<x> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ i f7527h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ String f7528i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(i iVar, String str) {
            super(0);
            this.f7527h = iVar;
            this.f7528i = str;
        }

        public final void a() {
            this.f7527h.f7524h.b(this.f7528i);
        }

        public /* bridge */ /* synthetic */ Object d() {
            a();
            return x.a;
        }
    }

    public i(Context context, c cVar, d dVar, com.sensorberg.smartworkspace.app.utils.c cVar2) {
        k.e(context, "context");
        k.e(cVar, "infoDao");
        k.e(dVar, "notificationSdk");
        k.e(cVar2, "buildConfig");
        this.f7523g = context;
        this.f7524h = cVar;
        this.f7525i = dVar;
        this.f7526j = cVar2;
    }

    private final void d(String str) {
        g.e.e.a aVar = g.e.e.a.f9778f;
        aVar.j(aVar.d(), new a(this, str));
    }

    private final void e(String str) {
        try {
            Intent intent = new Intent();
            Context context = this.f7523g;
            Uri parse = Uri.parse(str);
            k.d(parse, "Uri.parse(uri)");
            f.e(intent, context, parse);
        } catch (ActivityNotFoundException unused) {
        }
    }

    public void a(b bVar, g.e.j.a.c cVar) {
        k.e(bVar, "action");
        k.e(cVar, "conversion");
        this.f7525i.a(bVar, cVar);
    }

    public final boolean c(Intent intent) {
        b bVar;
        k.e(intent, "intent");
        if (!this.f7526j.I() || (!k.a(intent.getAction(), "com.sensorberg.smartworkspace.info.ACTION_NOTIFICATION_CLICKED")) || (bVar = (b) intent.getParcelableExtra("com.sensorberg.smartworkspace.info.EXTRA_ACTION")) == null) {
            return false;
        }
        n.a.a.a("NotificationHandler " + intent, new Object[0]);
        String h2 = bVar.h();
        if (h2 != null) {
            e(h2);
        }
        this.f7525i.a(bVar, g.e.j.a.c.Success);
        d(bVar.a());
        return true;
    }

    public m.a.c.a n() {
        return c.a.a(this);
    }

    public void setEnabled(boolean z) {
        this.f7525i.setEnabled(this.f7526j.I() && z);
    }
}
