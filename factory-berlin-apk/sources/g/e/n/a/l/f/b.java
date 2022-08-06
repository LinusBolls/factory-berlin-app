package g.e.n.a.l.f;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import kotlin.jvm.internal.k;
import kotlinx.coroutines.e3.c;
import kotlinx.coroutines.e3.q;
import kotlinx.coroutines.e3.u;

/* compiled from: LocationPermissionDetectorImpl.kt */
public final class b implements a {
    /* access modifiers changed from: private */
    public final Application a;
    /* access modifiers changed from: private */
    public final q<Boolean> b;
    private final Application.ActivityLifecycleCallbacks c;

    /* compiled from: LocationPermissionDetectorImpl.kt */
    public static final class a implements Application.ActivityLifecycleCallbacks {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ b f9965g;

        a(b bVar) {
            this.f9965g = bVar;
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
        }

        public void onActivityPaused(Activity activity) {
        }

        public void onActivityResumed(Activity activity) {
            boolean e2 = this.f9965g.f();
            this.f9965g.b.setValue(Boolean.valueOf(e2));
            if (e2) {
                this.f9965g.a.unregisterActivityLifecycleCallbacks(this);
            }
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    public b(Context context) {
        k.e(context, "context");
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            this.a = (Application) applicationContext;
            this.b = u.a(Boolean.valueOf(f()));
            this.c = new a(this);
            if (!f()) {
                this.a.registerActivityLifecycleCallbacks(this.c);
                return;
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.app.Application");
    }

    /* access modifiers changed from: private */
    public final boolean f() {
        return this.a.checkCallingOrSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0;
    }

    public c<Boolean> a() {
        return this.b;
    }
}
