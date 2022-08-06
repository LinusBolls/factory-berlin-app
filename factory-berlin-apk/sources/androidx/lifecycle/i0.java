package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.p;

/* compiled from: ReportFragment */
public class i0 extends Fragment {

    /* renamed from: g  reason: collision with root package name */
    private a f993g;

    /* compiled from: ReportFragment */
    interface a {
        void a();

        void b();

        void c();
    }

    /* compiled from: ReportFragment */
    static class b implements Application.ActivityLifecycleCallbacks {
        b() {
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
        }

        public void onActivityPaused(Activity activity) {
        }

        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            i0.a(activity, p.a.ON_CREATE);
        }

        public void onActivityPostResumed(Activity activity) {
            i0.a(activity, p.a.ON_RESUME);
        }

        public void onActivityPostStarted(Activity activity) {
            i0.a(activity, p.a.ON_START);
        }

        public void onActivityPreDestroyed(Activity activity) {
            i0.a(activity, p.a.ON_DESTROY);
        }

        public void onActivityPrePaused(Activity activity) {
            i0.a(activity, p.a.ON_PAUSE);
        }

        public void onActivityPreStopped(Activity activity) {
            i0.a(activity, p.a.ON_STOP);
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    static void a(Activity activity, p.a aVar) {
        if (activity instanceof x) {
            ((x) activity).a().i(aVar);
        } else if (activity instanceof v) {
            p a2 = ((v) activity).a();
            if (a2 instanceof w) {
                ((w) a2).i(aVar);
            }
        }
    }

    private void b(p.a aVar) {
        if (Build.VERSION.SDK_INT < 29) {
            a(getActivity(), aVar);
        }
    }

    private void c(a aVar) {
        if (aVar != null) {
            aVar.a();
        }
    }

    private void d(a aVar) {
        if (aVar != null) {
            aVar.b();
        }
    }

    private void e(a aVar) {
        if (aVar != null) {
            aVar.c();
        }
    }

    static i0 f(Activity activity) {
        return (i0) activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
    }

    public static void g(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            activity.registerActivityLifecycleCallbacks(new b());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new i0(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    /* access modifiers changed from: package-private */
    public void h(a aVar) {
        this.f993g = aVar;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        c(this.f993g);
        b(p.a.ON_CREATE);
    }

    public void onDestroy() {
        super.onDestroy();
        b(p.a.ON_DESTROY);
        this.f993g = null;
    }

    public void onPause() {
        super.onPause();
        b(p.a.ON_PAUSE);
    }

    public void onResume() {
        super.onResume();
        d(this.f993g);
        b(p.a.ON_RESUME);
    }

    public void onStart() {
        super.onStart();
        e(this.f993g);
        b(p.a.ON_START);
    }

    public void onStop() {
        super.onStop();
        b(p.a.ON_STOP);
    }
}
