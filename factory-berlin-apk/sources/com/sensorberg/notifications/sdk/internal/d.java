package com.sensorberg.notifications.sdk.internal;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.location.Location;
import android.location.LocationManager;
import android.os.Parcelable;
import android.os.Process;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import com.google.android.gms.common.e;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.TypeCastException;
import kotlin.jvm.internal.k;
import kotlin.x;

/* compiled from: Extensions.kt */
public final class d {

    /* compiled from: Extensions.kt */
    static final class a implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f5168g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ BroadcastReceiver.PendingResult f5169h;

        a(kotlin.e0.c.a aVar, BroadcastReceiver.PendingResult pendingResult) {
            this.f5168g = aVar;
            this.f5169h = pendingResult;
        }

        public final void run() {
            try {
                this.f5168g.d();
            } finally {
                this.f5169h.finish();
            }
        }
    }

    /* compiled from: Comparisons.kt */
    public static final class b<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return b.c(Float.valueOf(((Location) t).getAccuracy()), Float.valueOf(((Location) t2).getAccuracy()));
        }
    }

    public static final void a(BroadcastReceiver broadcastReceiver, Executor executor, kotlin.e0.c.a<x> aVar) {
        k.f(broadcastReceiver, "$this$async");
        k.f(executor, "executor");
        k.f(aVar, "run");
        executor.execute(new a(aVar, broadcastReceiver.goAsync()));
    }

    @SuppressLint({"MissingPermission"})
    public static final Location b(Application application) {
        k.f(application, "$this$getLastLocation");
        if (!c(application)) {
            return null;
        }
        Object systemService = application.getSystemService("location");
        if (systemService != null) {
            LocationManager locationManager = (LocationManager) systemService;
            List<String> providers = locationManager.getProviders(true);
            k.b(providers, "providers");
            ArrayList arrayList = new ArrayList();
            for (String lastKnownLocation : providers) {
                Location lastKnownLocation2 = locationManager.getLastKnownLocation(lastKnownLocation);
                if (lastKnownLocation2 != null) {
                    arrayList.add(lastKnownLocation2);
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return (Location) v.N(arrayList, new b()).get(0);
        }
        throw new TypeCastException("null cannot be cast to non-null type android.location.LocationManager");
    }

    public static final boolean c(Application application) {
        k.f(application, "$this$haveLocationPermission");
        return application.checkPermission("android.permission.ACCESS_FINE_LOCATION", Process.myPid(), Process.myUid()) == 0;
    }

    public static final boolean d(Application application) {
        k.f(application, "$this$haveLocationProvider");
        if (!c(application)) {
            return false;
        }
        Object systemService = application.getSystemService("location");
        if (systemService != null) {
            LocationManager locationManager = (LocationManager) systemService;
            if (locationManager.isProviderEnabled("gps") || locationManager.isProviderEnabled("network")) {
                return true;
            }
            return false;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.location.LocationManager");
    }

    public static final boolean e(Application application) {
        k.f(application, "$this$isGooglePlayServicesAvailable");
        return e.n().g(application) == 0;
    }

    public static final ListenableWorker.a f(Worker worker, ListenableWorker.a aVar) {
        k.f(worker, "$this$logResult");
        k.f(aVar, "result");
        n.a.a.f(worker.getClass().getSimpleName() + " workerResult " + aVar, new Object[0]);
        return aVar;
    }

    public static final void g(Worker worker) {
        k.f(worker, "$this$logStart");
        n.a.a.f("Starting " + worker.getClass().getSimpleName(), new Object[0]);
    }

    public static final g.e.j.a.b h(Intent intent) {
        k.f(intent, "$this$toAction");
        if (intent.hasExtra("com.sensorberg.notifications.sdk.Action.key")) {
            Parcelable parcelableExtra = intent.getParcelableExtra("com.sensorberg.notifications.sdk.Action.key");
            k.b(parcelableExtra, "getParcelableExtra(KEY_ACTION)");
            return (g.e.j.a.b) parcelableExtra;
        }
        throw new IllegalArgumentException("Intent does contain action " + intent);
    }

    public static final void i(g.e.j.a.b bVar, Intent intent) {
        k.f(bVar, "$this$writeToIntent");
        k.f(intent, "intent");
        intent.putExtra("com.sensorberg.notifications.sdk.Action.key", bVar);
    }
}
