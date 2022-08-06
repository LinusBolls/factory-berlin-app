package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.work.i;
import androidx.work.impl.a;
import androidx.work.impl.h;
import java.util.HashMap;
import java.util.Map;

public class SystemJobService extends JobService implements a {

    /* renamed from: i  reason: collision with root package name */
    private static final String f1641i = i.f("SystemJobService");

    /* renamed from: g  reason: collision with root package name */
    private h f1642g;

    /* renamed from: h  reason: collision with root package name */
    private final Map<String, JobParameters> f1643h = new HashMap();

    private static String b(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return extras.getString("EXTRA_WORK_SPEC_ID");
        } catch (NullPointerException unused) {
            return null;
        }
    }

    public void a(String str, boolean z) {
        JobParameters remove;
        i.c().a(f1641i, String.format("%s executed on JobScheduler", new Object[]{str}), new Throwable[0]);
        synchronized (this.f1643h) {
            remove = this.f1643h.remove(str);
        }
        if (remove != null) {
            jobFinished(remove, z);
        }
    }

    public void onCreate() {
        super.onCreate();
        try {
            h q = h.q(getApplicationContext());
            this.f1642g = q;
            q.s().b(this);
        } catch (IllegalStateException unused) {
            if (Application.class.equals(getApplication().getClass())) {
                i.c().h(f1641i, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.", new Throwable[0]);
                return;
            }
            throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
        }
    }

    public void onDestroy() {
        super.onDestroy();
        h hVar = this.f1642g;
        if (hVar != null) {
            hVar.s().e(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006c, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0071, code lost:
        if (android.os.Build.VERSION.SDK_INT < 24) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0073, code lost:
        r2 = new androidx.work.WorkerParameters.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007c, code lost:
        if (r9.getTriggeredContentUris() == null) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007e, code lost:
        java.util.Arrays.asList(r9.getTriggeredContentUris());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0089, code lost:
        if (r9.getTriggeredContentAuthorities() == null) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008b, code lost:
        java.util.Arrays.asList(r9.getTriggeredContentAuthorities());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0096, code lost:
        if (android.os.Build.VERSION.SDK_INT < 28) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0098, code lost:
        r9.getNetwork();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x009b, code lost:
        r8.f1642g.B(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a0, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onStartJob(android.app.job.JobParameters r9) {
        /*
            r8 = this;
            androidx.work.impl.h r0 = r8.f1642g
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0017
            androidx.work.i r0 = androidx.work.i.c()
            java.lang.String r3 = f1641i
            java.lang.String r4 = "WorkManager is not initialized; requesting retry."
            java.lang.Throwable[] r5 = new java.lang.Throwable[r2]
            r0.a(r3, r4, r5)
            r8.jobFinished(r9, r1)
            return r2
        L_0x0017:
            java.lang.String r0 = b(r9)
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 == 0) goto L_0x002f
            androidx.work.i r9 = androidx.work.i.c()
            java.lang.String r0 = f1641i
            java.lang.String r1 = "WorkSpec id not found!"
            java.lang.Throwable[] r3 = new java.lang.Throwable[r2]
            r9.b(r0, r1, r3)
            return r2
        L_0x002f:
            java.util.Map<java.lang.String, android.app.job.JobParameters> r3 = r8.f1643h
            monitor-enter(r3)
            java.util.Map<java.lang.String, android.app.job.JobParameters> r4 = r8.f1643h     // Catch:{ all -> 0x00a1 }
            boolean r4 = r4.containsKey(r0)     // Catch:{ all -> 0x00a1 }
            if (r4 == 0) goto L_0x0051
            androidx.work.i r9 = androidx.work.i.c()     // Catch:{ all -> 0x00a1 }
            java.lang.String r4 = f1641i     // Catch:{ all -> 0x00a1 }
            java.lang.String r5 = "Job is already being executed by SystemJobService: %s"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x00a1 }
            r1[r2] = r0     // Catch:{ all -> 0x00a1 }
            java.lang.String r0 = java.lang.String.format(r5, r1)     // Catch:{ all -> 0x00a1 }
            java.lang.Throwable[] r1 = new java.lang.Throwable[r2]     // Catch:{ all -> 0x00a1 }
            r9.a(r4, r0, r1)     // Catch:{ all -> 0x00a1 }
            monitor-exit(r3)     // Catch:{ all -> 0x00a1 }
            return r2
        L_0x0051:
            androidx.work.i r4 = androidx.work.i.c()     // Catch:{ all -> 0x00a1 }
            java.lang.String r5 = f1641i     // Catch:{ all -> 0x00a1 }
            java.lang.String r6 = "onStartJob for %s"
            java.lang.Object[] r7 = new java.lang.Object[r1]     // Catch:{ all -> 0x00a1 }
            r7[r2] = r0     // Catch:{ all -> 0x00a1 }
            java.lang.String r6 = java.lang.String.format(r6, r7)     // Catch:{ all -> 0x00a1 }
            java.lang.Throwable[] r2 = new java.lang.Throwable[r2]     // Catch:{ all -> 0x00a1 }
            r4.a(r5, r6, r2)     // Catch:{ all -> 0x00a1 }
            java.util.Map<java.lang.String, android.app.job.JobParameters> r2 = r8.f1643h     // Catch:{ all -> 0x00a1 }
            r2.put(r0, r9)     // Catch:{ all -> 0x00a1 }
            monitor-exit(r3)     // Catch:{ all -> 0x00a1 }
            r2 = 0
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 24
            if (r3 < r4) goto L_0x009b
            androidx.work.WorkerParameters$a r2 = new androidx.work.WorkerParameters$a
            r2.<init>()
            android.net.Uri[] r3 = r9.getTriggeredContentUris()
            if (r3 == 0) goto L_0x0085
            android.net.Uri[] r3 = r9.getTriggeredContentUris()
            java.util.Arrays.asList(r3)
        L_0x0085:
            java.lang.String[] r3 = r9.getTriggeredContentAuthorities()
            if (r3 == 0) goto L_0x0092
            java.lang.String[] r3 = r9.getTriggeredContentAuthorities()
            java.util.Arrays.asList(r3)
        L_0x0092:
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 28
            if (r3 < r4) goto L_0x009b
            r9.getNetwork()
        L_0x009b:
            androidx.work.impl.h r9 = r8.f1642g
            r9.B(r0, r2)
            return r1
        L_0x00a1:
            r9 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00a1 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.systemjob.SystemJobService.onStartJob(android.app.job.JobParameters):boolean");
    }

    public boolean onStopJob(JobParameters jobParameters) {
        if (this.f1642g == null) {
            i.c().a(f1641i, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            return true;
        }
        String b = b(jobParameters);
        if (TextUtils.isEmpty(b)) {
            i.c().b(f1641i, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        i.c().a(f1641i, String.format("onStopJob for %s", new Object[]{b}), new Throwable[0]);
        synchronized (this.f1643h) {
            this.f1643h.remove(b);
        }
        this.f1642g.C(b);
        return !this.f1642g.s().c(b);
    }
}
