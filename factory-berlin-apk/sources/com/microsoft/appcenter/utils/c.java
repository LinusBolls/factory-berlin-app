package com.microsoft.appcenter.utils;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: ApplicationLifecycleListener */
public class c implements Application.ActivityLifecycleCallbacks {

    /* renamed from: g  reason: collision with root package name */
    private int f4595g = 0;

    /* renamed from: h  reason: collision with root package name */
    private int f4596h = 0;

    /* renamed from: i  reason: collision with root package name */
    private boolean f4597i = true;

    /* renamed from: j  reason: collision with root package name */
    private boolean f4598j = true;

    /* renamed from: k  reason: collision with root package name */
    private Handler f4599k;

    /* renamed from: l  reason: collision with root package name */
    private final Set<b> f4600l = new CopyOnWriteArraySet();

    /* renamed from: m  reason: collision with root package name */
    private Runnable f4601m = new a();

    /* compiled from: ApplicationLifecycleListener */
    class a implements Runnable {
        a() {
        }

        public void run() {
            c.this.k();
            c.this.l();
        }
    }

    /* compiled from: ApplicationLifecycleListener */
    public interface b {
        void g();

        void i();
    }

    public c(Handler handler) {
        this.f4599k = handler;
    }

    /* access modifiers changed from: private */
    public void k() {
        if (this.f4596h == 0) {
            this.f4597i = true;
        }
    }

    /* access modifiers changed from: private */
    public void l() {
        if (this.f4595g == 0 && this.f4597i) {
            for (b i2 : this.f4600l) {
                i2.i();
            }
            this.f4598j = true;
        }
    }

    public void m(b bVar) {
        this.f4600l.add(bVar);
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
        if (this.f4595g == 0) {
            this.f4598j = false;
        }
        if (this.f4596h == 0) {
            this.f4597i = false;
        }
        int max = Math.max(this.f4596h - 1, 0);
        this.f4596h = max;
        if (max == 0) {
            this.f4599k.postDelayed(this.f4601m, 700);
        }
    }

    public void onActivityResumed(Activity activity) {
        int i2 = this.f4596h + 1;
        this.f4596h = i2;
        if (i2 != 1) {
            return;
        }
        if (this.f4597i) {
            this.f4597i = false;
        } else {
            this.f4599k.removeCallbacks(this.f4601m);
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
        int i2 = this.f4595g + 1;
        this.f4595g = i2;
        if (i2 == 1 && this.f4598j) {
            for (b g2 : this.f4600l) {
                g2.g();
            }
            this.f4598j = false;
        }
    }

    public void onActivityStopped(Activity activity) {
        this.f4595g = Math.max(this.f4595g - 1, 0);
        l();
    }
}
