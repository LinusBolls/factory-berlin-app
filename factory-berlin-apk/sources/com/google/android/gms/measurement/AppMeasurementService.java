package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.measurement.internal.b9;
import com.google.android.gms.measurement.internal.f9;
import e.n.a.a;

/* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
public final class AppMeasurementService extends Service implements f9 {

    /* renamed from: g  reason: collision with root package name */
    private b9<AppMeasurementService> f2703g;

    private final b9<AppMeasurementService> c() {
        if (this.f2703g == null) {
            this.f2703g = new b9<>(this);
        }
        return this.f2703g;
    }

    public final void a(Intent intent) {
        a.b(intent);
    }

    public final void b(JobParameters jobParameters, boolean z) {
        throw new UnsupportedOperationException();
    }

    public final boolean f(int i2) {
        return stopSelfResult(i2);
    }

    public final IBinder onBind(Intent intent) {
        return c().b(intent);
    }

    public final void onCreate() {
        super.onCreate();
        c().c();
    }

    public final void onDestroy() {
        c().h();
        super.onDestroy();
    }

    public final void onRebind(Intent intent) {
        c().k(intent);
    }

    public final int onStartCommand(Intent intent, int i2, int i3) {
        return c().a(intent, i2, i3);
    }

    public final boolean onUnbind(Intent intent) {
        return c().i(intent);
    }
}
