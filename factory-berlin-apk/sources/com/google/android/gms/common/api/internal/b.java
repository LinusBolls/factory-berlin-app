package com.google.android.gms.common.api.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import com.google.android.gms.common.util.l;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

public final class b implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: k  reason: collision with root package name */
    private static final b f2053k = new b();

    /* renamed from: g  reason: collision with root package name */
    private final AtomicBoolean f2054g = new AtomicBoolean();

    /* renamed from: h  reason: collision with root package name */
    private final AtomicBoolean f2055h = new AtomicBoolean();

    /* renamed from: i  reason: collision with root package name */
    private final ArrayList<a> f2056i = new ArrayList<>();

    /* renamed from: j  reason: collision with root package name */
    private boolean f2057j = false;

    public interface a {
        void a(boolean z);
    }

    private b() {
    }

    public static b i() {
        return f2053k;
    }

    public static void k(Application application) {
        synchronized (f2053k) {
            if (!f2053k.f2057j) {
                application.registerActivityLifecycleCallbacks(f2053k);
                application.registerComponentCallbacks(f2053k);
                f2053k.f2057j = true;
            }
        }
    }

    private final void m(boolean z) {
        synchronized (f2053k) {
            ArrayList<a> arrayList = this.f2056i;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                a aVar = arrayList.get(i2);
                i2++;
                aVar.a(z);
            }
        }
    }

    public final void g(a aVar) {
        synchronized (f2053k) {
            this.f2056i.add(aVar);
        }
    }

    public final boolean l() {
        return this.f2054g.get();
    }

    @TargetApi(16)
    public final boolean n(boolean z) {
        if (!this.f2055h.get()) {
            if (!l.c()) {
                return z;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!this.f2055h.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.f2054g.set(true);
            }
        }
        return l();
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean compareAndSet = this.f2054g.compareAndSet(true, false);
        this.f2055h.set(true);
        if (compareAndSet) {
            m(false);
        }
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
        boolean compareAndSet = this.f2054g.compareAndSet(true, false);
        this.f2055h.set(true);
        if (compareAndSet) {
            m(false);
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public final void onTrimMemory(int i2) {
        if (i2 == 20 && this.f2054g.compareAndSet(false, true)) {
            this.f2055h.set(true);
            m(true);
        }
    }
}
