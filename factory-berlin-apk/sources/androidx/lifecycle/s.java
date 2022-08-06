package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: LifecycleDispatcher */
class s {
    private static AtomicBoolean a = new AtomicBoolean(false);

    /* compiled from: LifecycleDispatcher */
    static class a extends j {
        a() {
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            i0.g(activity);
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    static void a(Context context) {
        if (!a.getAndSet(true)) {
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new a());
        }
    }
}
