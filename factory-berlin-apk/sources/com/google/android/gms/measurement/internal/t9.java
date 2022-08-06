package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PersistableBundle;
import com.google.android.gms.internal.measurement.g6;

/* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
public final class t9 extends u9 {

    /* renamed from: d  reason: collision with root package name */
    private final AlarmManager f3127d = ((AlarmManager) j().getSystemService("alarm"));

    /* renamed from: e  reason: collision with root package name */
    private final k f3128e;

    /* renamed from: f  reason: collision with root package name */
    private Integer f3129f;

    protected t9(x9 x9Var) {
        super(x9Var);
        this.f3128e = new s9(this, x9Var.k0(), x9Var);
    }

    @TargetApi(24)
    private final void w() {
        ((JobScheduler) j().getSystemService("jobscheduler")).cancel(x());
    }

    private final int x() {
        if (this.f3129f == null) {
            String valueOf = String.valueOf(j().getPackageName());
            this.f3129f = Integer.valueOf((valueOf.length() != 0 ? "measurement".concat(valueOf) : new String("measurement")).hashCode());
        }
        return this.f3129f.intValue();
    }

    private final PendingIntent y() {
        Context j2 = j();
        return PendingIntent.getBroadcast(j2, 0, new Intent().setClassName(j2, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), 0);
    }

    /* access modifiers changed from: protected */
    public final boolean t() {
        this.f3127d.cancel(y());
        if (Build.VERSION.SDK_INT < 24) {
            return false;
        }
        w();
        return false;
    }

    public final void u(long j2) {
        r();
        Context j3 = j();
        if (!z4.b(j3)) {
            i().L().a("Receiver not registered/enabled");
        }
        if (!fa.Y(j3, false)) {
            i().L().a("Service not registered/enabled");
        }
        v();
        i().M().b("Scheduling upload, millis", Long.valueOf(j2));
        long c = f().c() + j2;
        if (j2 < Math.max(0, u.x.a(null).longValue()) && !this.f3128e.d()) {
            this.f3128e.c(j2);
        }
        if (Build.VERSION.SDK_INT >= 24) {
            Context j4 = j();
            ComponentName componentName = new ComponentName(j4, "com.google.android.gms.measurement.AppMeasurementJobService");
            int x = x();
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
            g6.b(j4, new JobInfo.Builder(x, componentName).setMinimumLatency(j2).setOverrideDeadline(j2 << 1).setExtras(persistableBundle).build(), "com.google.android.gms", "UploadAlarm");
            return;
        }
        this.f3127d.setInexactRepeating(2, c, Math.max(u.s.a(null).longValue(), j2), y());
    }

    public final void v() {
        r();
        i().M().a("Unscheduling upload");
        this.f3127d.cancel(y());
        this.f3128e.e();
        if (Build.VERSION.SDK_INT >= 24) {
            w();
        }
    }
}
