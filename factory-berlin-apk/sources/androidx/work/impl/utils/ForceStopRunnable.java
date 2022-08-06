package androidx.work.impl.utils;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.work.i;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.b;
import androidx.work.impl.e;
import androidx.work.impl.h;
import androidx.work.impl.l.j;
import androidx.work.impl.l.k;
import androidx.work.p;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ForceStopRunnable implements Runnable {

    /* renamed from: i  reason: collision with root package name */
    private static final String f1739i = i.f("ForceStopRunnable");

    /* renamed from: j  reason: collision with root package name */
    private static final long f1740j = TimeUnit.DAYS.toMillis(3650);

    /* renamed from: g  reason: collision with root package name */
    private final Context f1741g;

    /* renamed from: h  reason: collision with root package name */
    private final h f1742h;

    public static class BroadcastReceiver extends android.content.BroadcastReceiver {
        private static final String a = i.f("ForceStopRunnable$Rcvr");

        public void onReceive(Context context, Intent intent) {
            if (intent != null && "ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                i.c().g(a, "Rescheduling alarm that keeps track of force-stops.", new Throwable[0]);
                ForceStopRunnable.e(context);
            }
        }
    }

    public ForceStopRunnable(Context context, h hVar) {
        this.f1741g = context.getApplicationContext();
        this.f1742h = hVar;
    }

    static Intent b(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return intent;
    }

    private static PendingIntent c(Context context, int i2) {
        return PendingIntent.getBroadcast(context, -1, b(context), i2);
    }

    static void e(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent c = c(context, 134217728);
        long currentTimeMillis = System.currentTimeMillis() + f1740j;
        if (alarmManager == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            alarmManager.setExact(0, currentTimeMillis, c);
        } else {
            alarmManager.set(0, currentTimeMillis, c);
        }
    }

    public boolean a() {
        if (Build.VERSION.SDK_INT >= 23) {
            b.b(this.f1741g);
        }
        WorkDatabase u = this.f1742h.u();
        k F = u.F();
        u.c();
        try {
            List<j> c = F.c();
            boolean z = c != null && !c.isEmpty();
            if (z) {
                for (j next : c) {
                    F.b(p.ENQUEUED, next.a);
                    F.e(next.a, -1);
                }
            }
            u.x();
            return z;
        } finally {
            u.i();
        }
    }

    public boolean d() {
        if (c(this.f1741g, 536870912) != null) {
            return false;
        }
        e(this.f1741g);
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean f() {
        return this.f1742h.r().b();
    }

    public void run() {
        i.c().a(f1739i, "Performing cleanup operations.", new Throwable[0]);
        boolean a = a();
        if (f()) {
            i.c().a(f1739i, "Rescheduling Workers.", new Throwable[0]);
            this.f1742h.y();
            this.f1742h.r().c(false);
        } else if (d()) {
            i.c().a(f1739i, "Application was force-stopped, rescheduling.", new Throwable[0]);
            this.f1742h.y();
        } else if (a) {
            i.c().a(f1739i, "Found unfinished work, scheduling it.", new Throwable[0]);
            e.b(this.f1742h.o(), this.f1742h.u(), this.f1742h.t());
        }
        this.f1742h.x();
    }
}
