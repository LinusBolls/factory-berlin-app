package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.internal.measurement.f;
import com.google.android.gms.measurement.internal.f9;

/* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
public final class b9<T extends Context & f9> {
    private final T a;

    public b9(T t) {
        r.k(t);
        this.a = t;
    }

    private final void f(Runnable runnable) {
        x9 e2 = x9.e(this.a);
        e2.a().y(new g9(this, e2, runnable));
    }

    private final c4 j() {
        return h5.b(this.a, (f) null, (Long) null).i();
    }

    public final int a(Intent intent, int i2, int i3) {
        c4 i4 = h5.b(this.a, (f) null, (Long) null).i();
        if (intent == null) {
            i4.H().a("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        i4.M().c("Local AppMeasurementService called. startId, action", Integer.valueOf(i3), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            f(new e9(this, i3, i4, intent));
        }
        return 2;
    }

    public final IBinder b(Intent intent) {
        if (intent == null) {
            j().E().a("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new i5(x9.e(this.a));
        }
        j().H().b("onBind received unknown action", action);
        return null;
    }

    public final void c() {
        h5.b(this.a, (f) null, (Long) null).i().M().a("Local AppMeasurementService is starting up");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void d(int i2, c4 c4Var, Intent intent) {
        if (((f9) this.a).f(i2)) {
            c4Var.M().b("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i2));
            j().M().a("Completed wakeful intent.");
            ((f9) this.a).a(intent);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void e(c4 c4Var, JobParameters jobParameters) {
        c4Var.M().a("AppMeasurementJobService processed last upload request.");
        ((f9) this.a).b(jobParameters, false);
    }

    @TargetApi(24)
    public final boolean g(JobParameters jobParameters) {
        c4 i2 = h5.b(this.a, (f) null, (Long) null).i();
        String string = jobParameters.getExtras().getString("action");
        i2.M().b("Local AppMeasurementJobService called. action", string);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(string)) {
            return true;
        }
        f(new d9(this, i2, jobParameters));
        return true;
    }

    public final void h() {
        h5.b(this.a, (f) null, (Long) null).i().M().a("Local AppMeasurementService is shutting down");
    }

    public final boolean i(Intent intent) {
        if (intent == null) {
            j().E().a("onUnbind called with null intent");
            return true;
        }
        j().M().b("onUnbind called for intent. action", intent.getAction());
        return true;
    }

    public final void k(Intent intent) {
        if (intent == null) {
            j().E().a("onRebind called with null intent");
            return;
        }
        j().M().b("onRebind called. action", intent.getAction());
    }
}
