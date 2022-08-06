package com.sensorberg.notifications.sdk.internal;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import kotlin.jvm.internal.k;

/* compiled from: ActivityLifecycleCallbacksAdapter.kt */
public class b implements Application.ActivityLifecycleCallbacks {
    public void onActivityCreated(Activity activity, Bundle bundle) {
        k.f(activity, "activity");
    }

    public void onActivityDestroyed(Activity activity) {
        k.f(activity, "activity");
    }

    public void onActivityPaused(Activity activity) {
        k.f(activity, "activity");
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        k.f(activity, "activity");
    }

    public void onActivityStarted(Activity activity) {
        k.f(activity, "activity");
    }

    public void onActivityStopped(Activity activity) {
        k.f(activity, "activity");
    }
}
