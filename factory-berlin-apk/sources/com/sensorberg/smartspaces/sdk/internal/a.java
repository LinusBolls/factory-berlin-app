package com.sensorberg.smartspaces.sdk.internal;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import kotlin.jvm.internal.k;

/* compiled from: ActivityLifeCycleAdapter.kt */
public class a implements Application.ActivityLifecycleCallbacks {
    public void onActivityCreated(Activity activity, Bundle bundle) {
        k.e(activity, "activity");
    }

    public void onActivityDestroyed(Activity activity) {
        k.e(activity, "activity");
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        k.e(activity, "activity");
    }

    public void onActivityStarted(Activity activity) {
        k.e(activity, "activity");
    }

    public void onActivityStopped(Activity activity) {
        k.e(activity, "activity");
    }
}
