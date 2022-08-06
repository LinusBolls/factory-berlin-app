package com.google.android.gms.nearby.messages.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;

@TargetApi(14)
final class i implements Application.ActivityLifecycleCallbacks {

    /* renamed from: g  reason: collision with root package name */
    private final Activity f3299g;

    /* renamed from: h  reason: collision with root package name */
    private final g f3300h;

    private i(Activity activity, g gVar) {
        this.f3299g = activity;
        this.f3300h = gVar;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
        if (activity == this.f3299g) {
            if (Log.isLoggable("NearbyMessagesClient", 2)) {
                Log.v("NearbyMessagesClient", String.format("Unregistering ClientLifecycleSafetyNet's ActivityLifecycleCallbacks for %s", new Object[]{activity.getPackageName()}));
            }
            activity.getApplication().unregisterActivityLifecycleCallbacks(this);
        }
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
        if (activity == this.f3299g) {
            try {
                this.f3300h.n0(1);
            } catch (RemoteException e2) {
                if (Log.isLoggable("NearbyMessagesClient", 2)) {
                    Log.v("NearbyMessagesClient", String.format("Failed to emit ACTIVITY_STOPPED from ClientLifecycleSafetyNet for Activity %s: %s", new Object[]{activity.getPackageName(), e2}));
                }
            }
        }
    }
}
