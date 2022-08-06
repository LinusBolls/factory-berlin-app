package com.sensorberg.smartworkspace.app.utils;

import androidx.lifecycle.d0;
import androidx.lifecycle.n;
import androidx.lifecycle.p;
import androidx.lifecycle.v;

public class LifecycleObserverHandler_LifecycleAdapter implements n {
    final LifecycleObserverHandler a;

    LifecycleObserverHandler_LifecycleAdapter(LifecycleObserverHandler lifecycleObserverHandler) {
        this.a = lifecycleObserverHandler;
    }

    public void a(v vVar, p.a aVar, boolean z, d0 d0Var) {
        boolean z2 = d0Var != null;
        if (z || aVar != p.a.ON_DESTROY) {
            return;
        }
        if (!z2 || d0Var.a("onDestroy$app_appCenterRelease", 1)) {
            this.a.onDestroy$app_appCenterRelease();
        }
    }
}
