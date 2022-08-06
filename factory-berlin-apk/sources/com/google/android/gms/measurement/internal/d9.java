package com.google.android.gms.measurement.internal;

import android.app.job.JobParameters;

/* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
final /* synthetic */ class d9 implements Runnable {

    /* renamed from: g  reason: collision with root package name */
    private final b9 f2799g;

    /* renamed from: h  reason: collision with root package name */
    private final c4 f2800h;

    /* renamed from: i  reason: collision with root package name */
    private final JobParameters f2801i;

    d9(b9 b9Var, c4 c4Var, JobParameters jobParameters) {
        this.f2799g = b9Var;
        this.f2800h = c4Var;
        this.f2801i = jobParameters;
    }

    public final void run() {
        this.f2799g.e(this.f2800h, this.f2801i);
    }
}
