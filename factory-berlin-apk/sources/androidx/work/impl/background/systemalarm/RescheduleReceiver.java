package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.work.i;
import androidx.work.impl.h;

public class RescheduleReceiver extends BroadcastReceiver {
    private static final String a = i.f("RescheduleReceiver");

    public void onReceive(Context context, Intent intent) {
        i.c().a(a, String.format("Received intent %s", new Object[]{intent}), new Throwable[0]);
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                h.q(context).z(goAsync());
            } catch (IllegalStateException unused) {
                i.c().b(a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", new Throwable[0]);
            }
        } else {
            context.startService(b.e(context));
        }
    }
}
