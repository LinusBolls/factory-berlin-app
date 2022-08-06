package com.sensorberg.alarms.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import kotlin.i;
import kotlin.jvm.internal.k;
import n.a.a;

@i(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/sensorberg/alarms/internal/AlarmBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "<init>", "()V", "alarms_release"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* compiled from: AlarmBroadcastReceiver.kt */
public final class AlarmBroadcastReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        k.e(context, "context");
        k.e(intent, "intent");
        a.a("AlarmBroadcastReceiver.onReceive(" + intent + ')', new Object[0]);
        b a = b.f4815i.a();
        if (a == null) {
            a.c("AlarmSchedulerImpl should not be null!", new Object[0]);
        } else {
            a.j(intent);
        }
    }
}
