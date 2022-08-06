package com.firebase.jobdispatcher;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/* compiled from: GooglePlayDriver */
public final class g implements d {
    private final u a;
    private final Context b;
    private final PendingIntent c;

    /* renamed from: d  reason: collision with root package name */
    private final i f1851d = new i();

    public g(Context context) {
        this.b = context;
        this.c = PendingIntent.getBroadcast(context, 0, new Intent(), 0);
        this.a = new c(context);
    }

    private Intent c(r rVar) {
        Intent d2 = d("SCHEDULE_TASK");
        i iVar = this.f1851d;
        Bundle extras = d2.getExtras();
        iVar.h(rVar, extras);
        d2.putExtras(extras);
        return d2;
    }

    private Intent d(String str) {
        Intent intent = new Intent("com.google.android.gms.gcm.ACTION_SCHEDULE");
        intent.setPackage("com.google.android.gms");
        intent.putExtra("scheduler_action", str);
        intent.putExtra("app", this.c);
        intent.putExtra("source", 8);
        intent.putExtra("source_version", 1);
        return intent;
    }

    public u a() {
        return this.a;
    }

    public int b(n nVar) {
        GooglePlayReceiver.h(nVar);
        this.b.sendBroadcast(c(nVar));
        return 0;
    }
}
