package androidx.work.impl.background.systemalarm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import androidx.work.i;
import androidx.work.impl.h;
import androidx.work.impl.l.d;
import androidx.work.impl.l.e;
import androidx.work.impl.utils.c;

/* compiled from: Alarms */
class a {
    private static final String a = i.f("Alarms");

    public static void a(Context context, h hVar, String str) {
        e D = hVar.u().D();
        d b = D.b(str);
        if (b != null) {
            b(context, str, b.b);
            i.c().a(a, String.format("Removing SystemIdInfo for workSpecId (%s)", new Object[]{str}), new Throwable[0]);
            D.c(str);
        }
    }

    private static void b(Context context, String str, int i2) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i2, b.c(context, str), 536870912);
        if (service != null && alarmManager != null) {
            i.c().a(a, String.format("Cancelling existing alarm with (workSpecId, systemId) (%s, %s)", new Object[]{str, Integer.valueOf(i2)}), new Throwable[0]);
            alarmManager.cancel(service);
        }
    }

    public static void c(Context context, h hVar, String str, long j2) {
        e D = hVar.u().D();
        d b = D.b(str);
        if (b != null) {
            b(context, str, b.b);
            d(context, str, b.b, j2);
            return;
        }
        int b2 = new c(context).b();
        D.a(new d(str, b2));
        d(context, str, b2, j2);
    }

    private static void d(Context context, String str, int i2, long j2) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i2, b.c(context, str), 1073741824);
        if (alarmManager == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            alarmManager.setExact(0, j2, service);
        } else {
            alarmManager.set(0, j2, service);
        }
    }
}
