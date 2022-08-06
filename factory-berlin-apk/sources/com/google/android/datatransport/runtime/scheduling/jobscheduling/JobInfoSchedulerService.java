package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import g.b.a.a.i.m;
import g.b.a.a.i.q;
import g.b.a.a.i.x.a;

public class JobInfoSchedulerService extends JobService {
    public boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i2 = jobParameters.getExtras().getInt("priority");
        int i3 = jobParameters.getExtras().getInt("attemptNumber");
        q.f(getApplicationContext());
        m.a a = m.a();
        a.b(string);
        a.d(a.b(i2));
        if (string2 != null) {
            a.c(Base64.decode(string2, 0));
        }
        q.c().e().g(a.a(), i3, f.a(this, jobParameters));
        return true;
    }

    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
