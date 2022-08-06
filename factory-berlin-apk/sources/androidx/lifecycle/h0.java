package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.i0;
import androidx.lifecycle.p;

/* compiled from: ProcessLifecycleOwner */
public class h0 implements v {
    private static final h0 o = new h0();

    /* renamed from: g  reason: collision with root package name */
    private int f984g = 0;

    /* renamed from: h  reason: collision with root package name */
    private int f985h = 0;

    /* renamed from: i  reason: collision with root package name */
    private boolean f986i = true;

    /* renamed from: j  reason: collision with root package name */
    private boolean f987j = true;

    /* renamed from: k  reason: collision with root package name */
    private Handler f988k;

    /* renamed from: l  reason: collision with root package name */
    private final w f989l = new w(this);

    /* renamed from: m  reason: collision with root package name */
    private Runnable f990m = new a();

    /* renamed from: n  reason: collision with root package name */
    i0.a f991n = new b();

    /* compiled from: ProcessLifecycleOwner */
    class a implements Runnable {
        a() {
        }

        public void run() {
            h0.this.i();
            h0.this.j();
        }
    }

    /* compiled from: ProcessLifecycleOwner */
    class b implements i0.a {
        b() {
        }

        public void a() {
        }

        public void b() {
            h0.this.e();
        }

        public void c() {
            h0.this.f();
        }
    }

    /* compiled from: ProcessLifecycleOwner */
    class c extends j {

        /* compiled from: ProcessLifecycleOwner */
        class a extends j {
            a() {
            }

            public void onActivityPostResumed(Activity activity) {
                h0.this.e();
            }

            public void onActivityPostStarted(Activity activity) {
                h0.this.f();
            }
        }

        c() {
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (Build.VERSION.SDK_INT < 29) {
                i0.f(activity).h(h0.this.f991n);
            }
        }

        public void onActivityPaused(Activity activity) {
            h0.this.b();
        }

        public void onActivityPreCreated(Activity activity, Bundle bundle) {
            activity.registerActivityLifecycleCallbacks(new a());
        }

        public void onActivityStopped(Activity activity) {
            h0.this.g();
        }
    }

    private h0() {
    }

    public static v k() {
        return o;
    }

    static void l(Context context) {
        o.h(context);
    }

    public p a() {
        return this.f989l;
    }

    /* access modifiers changed from: package-private */
    public void b() {
        int i2 = this.f985h - 1;
        this.f985h = i2;
        if (i2 == 0) {
            this.f988k.postDelayed(this.f990m, 700);
        }
    }

    /* access modifiers changed from: package-private */
    public void e() {
        int i2 = this.f985h + 1;
        this.f985h = i2;
        if (i2 != 1) {
            return;
        }
        if (this.f986i) {
            this.f989l.i(p.a.ON_RESUME);
            this.f986i = false;
            return;
        }
        this.f988k.removeCallbacks(this.f990m);
    }

    /* access modifiers changed from: package-private */
    public void f() {
        int i2 = this.f984g + 1;
        this.f984g = i2;
        if (i2 == 1 && this.f987j) {
            this.f989l.i(p.a.ON_START);
            this.f987j = false;
        }
    }

    /* access modifiers changed from: package-private */
    public void g() {
        this.f984g--;
        j();
    }

    /* access modifiers changed from: package-private */
    public void h(Context context) {
        this.f988k = new Handler();
        this.f989l.i(p.a.ON_CREATE);
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new c());
    }

    /* access modifiers changed from: package-private */
    public void i() {
        if (this.f985h == 0) {
            this.f986i = true;
            this.f989l.i(p.a.ON_PAUSE);
        }
    }

    /* access modifiers changed from: package-private */
    public void j() {
        if (this.f984g == 0 && this.f986i) {
            this.f989l.i(p.a.ON_STOP);
            this.f987j = true;
        }
    }
}
