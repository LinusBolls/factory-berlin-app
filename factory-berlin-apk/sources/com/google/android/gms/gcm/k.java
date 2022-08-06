package com.google.android.gms.gcm;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.h;

final class k implements l {
    private final Context a;
    private final PendingIntent b;

    k(Context context) {
        this.a = context;
        this.b = PendingIntent.getBroadcast(context, 0, new Intent().setPackage("com.google.example.invalidpackage"), 0);
    }

    private final Intent c(String str) {
        Intent intent = new Intent("com.google.android.gms.gcm.ACTION_SCHEDULE");
        intent.setPackage("com.google.android.gms");
        intent.putExtra("app", this.b);
        intent.putExtra("source", 4);
        intent.putExtra("source_version", h.a);
        intent.putExtra("scheduler_action", str);
        return intent;
    }

    public final boolean a(ComponentName componentName, String str) {
        Intent c = c("CANCEL_TASK");
        c.putExtra("component", componentName);
        c.putExtra("tag", str);
        this.a.sendBroadcast(c);
        return true;
    }

    public final boolean b(Task task) {
        Intent c = c("SCHEDULE_TASK");
        Bundle bundle = new Bundle();
        task.c(bundle);
        c.putExtras(bundle);
        this.a.sendBroadcast(c);
        return true;
    }
}
