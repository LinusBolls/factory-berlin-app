package androidx.work.impl;

import android.content.Context;
import android.os.Build;
import androidx.work.i;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.impl.background.systemalarm.f;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.impl.background.systemjob.b;
import androidx.work.impl.l.j;
import androidx.work.impl.l.k;
import androidx.work.impl.utils.d;
import java.util.List;

/* compiled from: Schedulers */
public class e {
    private static final String a = i.f("Schedulers");

    static d a(Context context, h hVar) {
        if (Build.VERSION.SDK_INT >= 23) {
            b bVar = new b(context, hVar);
            d.a(context, SystemJobService.class, true);
            i.c().a(a, "Created SystemJobScheduler and enabled SystemJobService", new Throwable[0]);
            return bVar;
        }
        d c = c(context);
        if (c != null) {
            return c;
        }
        f fVar = new f(context);
        d.a(context, SystemAlarmService.class, true);
        i.c().a(a, "Created SystemAlarmScheduler", new Throwable[0]);
        return fVar;
    }

    public static void b(androidx.work.b bVar, WorkDatabase workDatabase, List<d> list) {
        if (list != null && list.size() != 0) {
            k F = workDatabase.F();
            workDatabase.c();
            try {
                List<j> i2 = F.i(bVar.d());
                if (i2 != null && i2.size() > 0) {
                    long currentTimeMillis = System.currentTimeMillis();
                    for (j jVar : i2) {
                        F.e(jVar.a, currentTimeMillis);
                    }
                }
                workDatabase.x();
                if (i2 != null && i2.size() > 0) {
                    j[] jVarArr = (j[]) i2.toArray(new j[0]);
                    for (d schedule : list) {
                        schedule.schedule(jVarArr);
                    }
                }
            } finally {
                workDatabase.i();
            }
        }
    }

    private static d c(Context context) {
        try {
            d dVar = (d) Class.forName("androidx.work.impl.background.gcm.GcmScheduler").getConstructor(new Class[]{Context.class}).newInstance(new Object[]{context});
            i.c().a(a, String.format("Created %s", new Object[]{"androidx.work.impl.background.gcm.GcmScheduler"}), new Throwable[0]);
            return dVar;
        } catch (Throwable th) {
            i.c().a(a, "Unable to create GCM Scheduler", th);
            return null;
        }
    }
}
