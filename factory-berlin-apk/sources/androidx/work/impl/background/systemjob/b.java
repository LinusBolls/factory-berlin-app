package androidx.work.impl.background.systemjob;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.i;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.d;
import androidx.work.impl.h;
import androidx.work.impl.l.j;
import androidx.work.impl.utils.c;
import androidx.work.p;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: SystemJobScheduler */
public class b implements d {

    /* renamed from: l  reason: collision with root package name */
    private static final String f1644l = i.f("SystemJobScheduler");

    /* renamed from: g  reason: collision with root package name */
    private final Context f1645g;

    /* renamed from: h  reason: collision with root package name */
    private final JobScheduler f1646h;

    /* renamed from: i  reason: collision with root package name */
    private final h f1647i;

    /* renamed from: j  reason: collision with root package name */
    private final c f1648j;

    /* renamed from: k  reason: collision with root package name */
    private final a f1649k;

    public b(Context context, h hVar) {
        this(context, hVar, (JobScheduler) context.getSystemService("jobscheduler"), new a(context));
    }

    public static void a(Context context) {
        List<JobInfo> e2;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null && (e2 = e(context, jobScheduler)) != null && !e2.isEmpty()) {
            for (JobInfo id : e2) {
                c(jobScheduler, id.getId());
            }
        }
    }

    public static void b(Context context) {
        List<JobInfo> e2;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null && (e2 = e(context, jobScheduler)) != null && !e2.isEmpty()) {
            for (JobInfo next : e2) {
                if (f(next) == null) {
                    c(jobScheduler, next.getId());
                }
            }
        }
    }

    private static void c(JobScheduler jobScheduler, int i2) {
        try {
            jobScheduler.cancel(i2);
        } catch (Throwable th) {
            i.c().b(f1644l, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", new Object[]{Integer.valueOf(i2)}), th);
        }
    }

    private static List<Integer> d(Context context, JobScheduler jobScheduler, String str) {
        List<JobInfo> e2 = e(context, jobScheduler);
        if (e2 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        for (JobInfo next : e2) {
            if (str.equals(f(next))) {
                arrayList.add(Integer.valueOf(next.getId()));
            }
        }
        return arrayList;
    }

    private static List<JobInfo> e(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            i.c().b(f1644l, "getAllPendingJobs() is not reliable on this device.", th);
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ComponentName componentName = new ComponentName(context, SystemJobService.class);
        for (JobInfo next : list) {
            if (componentName.equals(next.getService())) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    private static String f(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return extras.getString("EXTRA_WORK_SPEC_ID");
            }
            return null;
        } catch (NullPointerException unused) {
            return null;
        }
    }

    public void cancel(String str) {
        List<Integer> d2 = d(this.f1645g, this.f1646h, str);
        if (d2 != null && !d2.isEmpty()) {
            for (Integer intValue : d2) {
                c(this.f1646h, intValue.intValue());
            }
            this.f1647i.u().D().c(str);
        }
    }

    public void g(j jVar, int i2) {
        JobInfo a = this.f1649k.a(jVar, i2);
        i.c().a(f1644l, String.format("Scheduling work ID %s Job ID %s", new Object[]{jVar.a, Integer.valueOf(i2)}), new Throwable[0]);
        try {
            this.f1646h.schedule(a);
        } catch (IllegalStateException e2) {
            List<JobInfo> e3 = e(this.f1645g, this.f1646h);
            String format = String.format(Locale.getDefault(), "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", new Object[]{Integer.valueOf(e3 != null ? e3.size() : 0), Integer.valueOf(this.f1647i.u().F().q().size()), Integer.valueOf(this.f1647i.o().d())});
            i.c().b(f1644l, format, new Throwable[0]);
            throw new IllegalStateException(format, e2);
        } catch (Throwable th) {
            i.c().b(f1644l, String.format("Unable to schedule %s", new Object[]{jVar}), th);
        }
    }

    /* JADX INFO: finally extract failed */
    public void schedule(j... jVarArr) {
        int i2;
        List<Integer> d2;
        int i3;
        WorkDatabase u = this.f1647i.u();
        int length = jVarArr.length;
        int i4 = 0;
        while (i4 < length) {
            j jVar = jVarArr[i4];
            u.c();
            try {
                j j2 = u.F().j(jVar.a);
                if (j2 == null) {
                    i c = i.c();
                    String str = f1644l;
                    c.h(str, "Skipping scheduling " + jVar.a + " because it's no longer in the DB", new Throwable[0]);
                    u.x();
                } else if (j2.b != p.ENQUEUED) {
                    i c2 = i.c();
                    String str2 = f1644l;
                    c2.h(str2, "Skipping scheduling " + jVar.a + " because it is no longer enqueued", new Throwable[0]);
                    u.x();
                } else {
                    androidx.work.impl.l.d b = u.D().b(jVar.a);
                    if (b != null) {
                        i2 = b.b;
                    } else {
                        i2 = this.f1648j.d(this.f1647i.o().e(), this.f1647i.o().c());
                    }
                    if (b == null) {
                        this.f1647i.u().D().a(new androidx.work.impl.l.d(jVar.a, i2));
                    }
                    g(jVar, i2);
                    if (Build.VERSION.SDK_INT == 23 && (d2 = d(this.f1645g, this.f1646h, jVar.a)) != null) {
                        int indexOf = d2.indexOf(Integer.valueOf(i2));
                        if (indexOf >= 0) {
                            d2.remove(indexOf);
                        }
                        if (!d2.isEmpty()) {
                            i3 = d2.get(0).intValue();
                        } else {
                            i3 = this.f1648j.d(this.f1647i.o().e(), this.f1647i.o().c());
                        }
                        g(jVar, i3);
                    }
                    u.x();
                }
                u.i();
                i4++;
            } catch (Throwable th) {
                u.i();
                throw th;
            }
        }
    }

    public b(Context context, h hVar, JobScheduler jobScheduler, a aVar) {
        this.f1645g = context;
        this.f1647i = hVar;
        this.f1646h = jobScheduler;
        this.f1648j = new c(context);
        this.f1649k = aVar;
    }
}
