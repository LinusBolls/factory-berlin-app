package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* compiled from: ActivityRecreator */
final class c {
    protected static final Class<?> a = a();
    protected static final Field b = b();
    protected static final Field c = f();

    /* renamed from: d  reason: collision with root package name */
    protected static final Method f652d = d(a);

    /* renamed from: e  reason: collision with root package name */
    protected static final Method f653e = c(a);

    /* renamed from: f  reason: collision with root package name */
    protected static final Method f654f = e(a);

    /* renamed from: g  reason: collision with root package name */
    private static final Handler f655g = new Handler(Looper.getMainLooper());

    /* compiled from: ActivityRecreator */
    class a implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ d f656g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Object f657h;

        a(d dVar, Object obj) {
            this.f656g = dVar;
            this.f657h = obj;
        }

        public void run() {
            this.f656g.f662g = this.f657h;
        }
    }

    /* compiled from: ActivityRecreator */
    class b implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ Application f658g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ d f659h;

        b(Application application, d dVar) {
            this.f658g = application;
            this.f659h = dVar;
        }

        public void run() {
            this.f658g.unregisterActivityLifecycleCallbacks(this.f659h);
        }
    }

    /* renamed from: androidx.core.app.c$c  reason: collision with other inner class name */
    /* compiled from: ActivityRecreator */
    class C0012c implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ Object f660g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Object f661h;

        C0012c(Object obj, Object obj2) {
            this.f660g = obj;
            this.f661h = obj2;
        }

        public void run() {
            try {
                if (c.f652d != null) {
                    c.f652d.invoke(this.f660g, new Object[]{this.f661h, Boolean.FALSE, "AppCompat recreation"});
                    return;
                }
                c.f653e.invoke(this.f660g, new Object[]{this.f661h, Boolean.FALSE});
            } catch (RuntimeException e2) {
                if (e2.getClass() == RuntimeException.class && e2.getMessage() != null && e2.getMessage().startsWith("Unable to stop")) {
                    throw e2;
                }
            } catch (Throwable th) {
                Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
            }
        }
    }

    /* compiled from: ActivityRecreator */
    private static final class d implements Application.ActivityLifecycleCallbacks {

        /* renamed from: g  reason: collision with root package name */
        Object f662g;

        /* renamed from: h  reason: collision with root package name */
        private Activity f663h;

        /* renamed from: i  reason: collision with root package name */
        private boolean f664i = false;

        /* renamed from: j  reason: collision with root package name */
        private boolean f665j = false;

        /* renamed from: k  reason: collision with root package name */
        private boolean f666k = false;

        d(Activity activity) {
            this.f663h = activity;
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
            if (this.f663h == activity) {
                this.f663h = null;
                this.f665j = true;
            }
        }

        public void onActivityPaused(Activity activity) {
            if (this.f665j && !this.f666k && !this.f664i && c.h(this.f662g, activity)) {
                this.f666k = true;
                this.f662g = null;
            }
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
            if (this.f663h == activity) {
                this.f664i = true;
            }
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    private static Class<?> a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Field b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method c(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", new Class[]{IBinder.class, Boolean.TYPE});
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method d(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", new Class[]{IBinder.class, Boolean.TYPE, String.class});
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method e(Class<?> cls) {
        if (g() && cls != null) {
            try {
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", new Class[]{IBinder.class, List.class, List.class, Integer.TYPE, Boolean.TYPE, Configuration.class, Configuration.class, Boolean.TYPE, Boolean.TYPE});
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    private static Field f() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean g() {
        int i2 = Build.VERSION.SDK_INT;
        return i2 == 26 || i2 == 27;
    }

    protected static boolean h(Object obj, Activity activity) {
        try {
            Object obj2 = c.get(activity);
            if (obj2 != obj) {
                return false;
            }
            f655g.postAtFrontOfQueue(new C0012c(b.get(activity), obj2));
            return true;
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
            return false;
        }
    }

    static boolean i(Activity activity) {
        Object obj;
        Application application;
        d dVar;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        } else if (g() && f654f == null) {
            return false;
        } else {
            if (f653e == null && f652d == null) {
                return false;
            }
            try {
                Object obj2 = c.get(activity);
                if (obj2 == null || (obj = b.get(activity)) == null) {
                    return false;
                }
                application = activity.getApplication();
                dVar = new d(activity);
                application.registerActivityLifecycleCallbacks(dVar);
                f655g.post(new a(dVar, obj2));
                if (g()) {
                    f654f.invoke(obj, new Object[]{obj2, null, null, 0, Boolean.FALSE, null, null, Boolean.FALSE, Boolean.FALSE});
                } else {
                    activity.recreate();
                }
                f655g.post(new b(application, dVar));
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
    }
}
