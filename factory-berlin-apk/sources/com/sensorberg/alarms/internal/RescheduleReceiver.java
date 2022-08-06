package com.sensorberg.alarms.internal;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.Set;
import kotlin.i;
import kotlin.jvm.internal.k;

@i(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/sensorberg/alarms/internal/RescheduleReceiver;", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "<init>", "()V", "Companion", "alarms_release"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* compiled from: RescheduleReceiver.kt */
public final class RescheduleReceiver extends BroadcastReceiver {
    private static final Set<String> a = i0.d("android.intent.action.BOOT_COMPLETED", "android.intent.action.TIME_SET", "android.intent.action.TIMEZONE_CHANGED", "android.intent.action.REBOOT", "android.intent.action.QUICKBOOT_POWERON", "com.htc.intent.action.QUICKBOOT_POWERON");
    public static final a b = new a((DefaultConstructorMarker) null);

    /* compiled from: RescheduleReceiver.kt */
    public static final class a {
        private a() {
        }

        public final void a(Context context, boolean z) {
            k.e(context, "context");
            ComponentName componentName = new ComponentName(context, RescheduleReceiver.class);
            if ((context.getPackageManager().getComponentEnabledSetting(componentName) == 1) != z) {
                if (z) {
                    n.a.a.f("Enabling RescheduleReceiver", new Object[0]);
                } else {
                    n.a.a.f("Disabling RescheduleReceiver", new Object[0]);
                }
                context.getPackageManager().setComponentEnabledSetting(componentName, z ? 1 : 2, 1);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public void onReceive(Context context, Intent intent) {
        k.e(context, "context");
        k.e(intent, "intent");
        n.a.a.a("RescheduleReceiver.onReceive(" + intent + ')', new Object[0]);
        String action = intent.getAction();
        if (action != null && a.contains(action)) {
            b a2 = b.f4815i.a();
            if (a2 == null) {
                n.a.a.c("AlarmSchedulerImpl should not be null!", new Object[0]);
            } else {
                a2.n();
            }
        }
    }
}
