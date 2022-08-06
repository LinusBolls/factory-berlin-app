package androidx.work.impl.background.systemjob;

import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.c;
import androidx.work.d;
import androidx.work.i;
import androidx.work.j;

/* compiled from: SystemJobInfoConverter */
class a {
    private static final String b = i.f("SystemJobInfoConverter");
    private final ComponentName a;

    /* renamed from: androidx.work.impl.background.systemjob.a$a  reason: collision with other inner class name */
    /* compiled from: SystemJobInfoConverter */
    static /* synthetic */ class C0044a {
        static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.work.j[] r0 = androidx.work.j.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                androidx.work.j r1 = androidx.work.j.NOT_REQUIRED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.work.j r1 = androidx.work.j.CONNECTED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.work.j r1 = androidx.work.j.UNMETERED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.work.j r1 = androidx.work.j.NOT_ROAMING     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.work.j r1 = androidx.work.j.METERED     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.systemjob.a.C0044a.<clinit>():void");
        }
    }

    a(Context context) {
        this.a = new ComponentName(context.getApplicationContext(), SystemJobService.class);
    }

    private static JobInfo.TriggerContentUri b(d.a aVar) {
        return new JobInfo.TriggerContentUri(aVar.a(), aVar.b() ? 1 : 0);
    }

    static int c(j jVar) {
        int i2 = C0044a.a[jVar.ordinal()];
        if (i2 == 1) {
            return 0;
        }
        if (i2 == 2) {
            return 1;
        }
        if (i2 == 3) {
            return 2;
        }
        if (i2 != 4) {
            if (i2 == 5 && Build.VERSION.SDK_INT >= 26) {
                return 4;
            }
        } else if (Build.VERSION.SDK_INT >= 24) {
            return 3;
        }
        i.c().a(b, String.format("API version too low. Cannot convert network type value %s", new Object[]{jVar}), new Throwable[0]);
        return 1;
    }

    /* access modifiers changed from: package-private */
    public JobInfo a(androidx.work.impl.l.j jVar, int i2) {
        c cVar = jVar.f1728j;
        int c = c(cVar.b());
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", jVar.a);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", jVar.d());
        JobInfo.Builder extras = new JobInfo.Builder(i2, this.a).setRequiredNetworkType(c).setRequiresCharging(cVar.g()).setRequiresDeviceIdle(cVar.h()).setExtras(persistableBundle);
        if (!cVar.h()) {
            extras.setBackoffCriteria(jVar.f1731m, jVar.f1730l == androidx.work.a.LINEAR ? 0 : 1);
        }
        extras.setMinimumLatency(Math.max(jVar.a() - System.currentTimeMillis(), 0));
        if (Build.VERSION.SDK_INT >= 24 && cVar.e()) {
            for (d.a b2 : cVar.a().b()) {
                extras.addTriggerContentUri(b(b2));
            }
            extras.setTriggerContentUpdateDelay(cVar.c());
            extras.setTriggerContentMaxDelay(cVar.d());
        }
        extras.setPersisted(false);
        if (Build.VERSION.SDK_INT >= 26) {
            extras.setRequiresBatteryNotLow(cVar.f());
            extras.setRequiresStorageNotLow(cVar.i());
        }
        return extras.build();
    }
}
