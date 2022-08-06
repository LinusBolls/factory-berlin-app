package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import g.b.a.a.i.m;
import g.b.a.a.i.t.a;
import g.b.a.a.i.v.j.c;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Adler32;

/* compiled from: JobInfoScheduler */
public class e implements s {
    private final Context a;
    private final c b;
    private final g c;

    public e(Context context, c cVar, g gVar) {
        this.a = context;
        this.b = cVar;
        this.c = gVar;
    }

    private boolean c(JobScheduler jobScheduler, int i2, int i3) {
        for (JobInfo next : jobScheduler.getAllPendingJobs()) {
            int i4 = next.getExtras().getInt("attemptNumber");
            if (next.getId() == i2) {
                if (i4 >= i3) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public void a(m mVar, int i2) {
        ComponentName componentName = new ComponentName(this.a, JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.a.getSystemService("jobscheduler");
        int b2 = b(mVar);
        if (c(jobScheduler, b2, i2)) {
            a.a("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", mVar);
            return;
        }
        long f0 = this.b.f0(mVar);
        g gVar = this.c;
        JobInfo.Builder builder = new JobInfo.Builder(b2, componentName);
        gVar.c(builder, mVar.d(), f0, i2);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i2);
        persistableBundle.putString("backendName", mVar.b());
        persistableBundle.putInt("priority", g.b.a.a.i.x.a.a(mVar.d()));
        if (mVar.c() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(mVar.c(), 0));
        }
        builder.setExtras(persistableBundle);
        a.b("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", mVar, Integer.valueOf(b2), Long.valueOf(this.c.g(mVar.d(), f0, i2)), Long.valueOf(f0), Integer.valueOf(i2));
        jobScheduler.schedule(builder.build());
    }

    /* access modifiers changed from: package-private */
    public int b(m mVar) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.a.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(mVar.b().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(g.b.a.a.i.x.a.a(mVar.d())).array());
        if (mVar.c() != null) {
            adler32.update(mVar.c());
        }
        return (int) adler32.getValue();
    }
}
