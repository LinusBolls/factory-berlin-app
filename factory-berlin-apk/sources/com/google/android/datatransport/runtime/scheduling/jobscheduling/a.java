package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Base64;
import g.b.a.a.i.m;
import g.b.a.a.i.v.j.c;

/* compiled from: AlarmManagerScheduler */
public class a implements s {
    private final Context a;
    private final c b;
    private AlarmManager c;

    /* renamed from: d  reason: collision with root package name */
    private final g f1985d;

    /* renamed from: e  reason: collision with root package name */
    private final g.b.a.a.i.w.a f1986e;

    public a(Context context, c cVar, g.b.a.a.i.w.a aVar, g gVar) {
        this(context, cVar, (AlarmManager) context.getSystemService("alarm"), aVar, gVar);
    }

    public void a(m mVar, int i2) {
        Uri.Builder builder = new Uri.Builder();
        builder.appendQueryParameter("backendName", mVar.b());
        builder.appendQueryParameter("priority", String.valueOf(g.b.a.a.i.x.a.a(mVar.d())));
        if (mVar.c() != null) {
            builder.appendQueryParameter("extras", Base64.encodeToString(mVar.c(), 0));
        }
        Intent intent = new Intent(this.a, AlarmManagerSchedulerBroadcastReceiver.class);
        intent.setData(builder.build());
        intent.putExtra("attemptNumber", i2);
        if (b(intent)) {
            g.b.a.a.i.t.a.a("AlarmManagerScheduler", "Upload for context %s is already scheduled. Returning...", mVar);
            return;
        }
        long f0 = this.b.f0(mVar);
        long g2 = this.f1985d.g(mVar.d(), f0, i2);
        g.b.a.a.i.t.a.b("AlarmManagerScheduler", "Scheduling upload for context %s in %dms(Backend next call timestamp %d). Attempt %d", mVar, Long.valueOf(g2), Long.valueOf(f0), Integer.valueOf(i2));
        this.c.set(3, this.f1986e.a() + g2, PendingIntent.getBroadcast(this.a, 0, intent, 0));
    }

    /* access modifiers changed from: package-private */
    public boolean b(Intent intent) {
        return PendingIntent.getBroadcast(this.a, 0, intent, 536870912) != null;
    }

    a(Context context, c cVar, AlarmManager alarmManager, g.b.a.a.i.w.a aVar, g gVar) {
        this.a = context;
        this.b = cVar;
        this.c = alarmManager;
        this.f1986e = aVar;
        this.f1985d = gVar;
    }
}
