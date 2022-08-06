package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;

/* compiled from: JobInfoSchedulerService */
final /* synthetic */ class f implements Runnable {

    /* renamed from: g  reason: collision with root package name */
    private final JobInfoSchedulerService f1988g;

    /* renamed from: h  reason: collision with root package name */
    private final JobParameters f1989h;

    private f(JobInfoSchedulerService jobInfoSchedulerService, JobParameters jobParameters) {
        this.f1988g = jobInfoSchedulerService;
        this.f1989h = jobParameters;
    }

    public static Runnable a(JobInfoSchedulerService jobInfoSchedulerService, JobParameters jobParameters) {
        return new f(jobInfoSchedulerService, jobParameters);
    }

    public void run() {
        this.f1988g.jobFinished(this.f1989h, false);
    }
}
