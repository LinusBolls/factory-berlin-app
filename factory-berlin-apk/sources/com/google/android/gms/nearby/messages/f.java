package com.google.android.gms.nearby.messages;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.c;
import com.google.android.gms.tasks.g;

public abstract class f extends c<g> {
    protected f(Context context, a<g> aVar, g gVar, c.a aVar2) {
        super(context, aVar, gVar, aVar2);
    }

    public abstract void o(Intent intent, e eVar);

    public abstract g<Void> p(PendingIntent pendingIntent, j jVar);

    public abstract g<Void> q(PendingIntent pendingIntent);
}
