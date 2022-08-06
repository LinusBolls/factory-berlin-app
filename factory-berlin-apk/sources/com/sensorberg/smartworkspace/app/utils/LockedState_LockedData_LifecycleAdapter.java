package com.sensorberg.smartworkspace.app.utils;

import androidx.lifecycle.d0;
import androidx.lifecycle.n;
import androidx.lifecycle.p;
import androidx.lifecycle.v;
import com.sensorberg.smartworkspace.app.utils.LockedState;

public class LockedState_LockedData_LifecycleAdapter implements n {
    final LockedState.LockedData a;

    LockedState_LockedData_LifecycleAdapter(LockedState.LockedData lockedData) {
        this.a = lockedData;
    }

    public void a(v vVar, p.a aVar, boolean z, d0 d0Var) {
        boolean z2 = d0Var != null;
        if (!z) {
            if (aVar == p.a.ON_START) {
                if (!z2 || d0Var.a("onStart$app_appCenterRelease", 1)) {
                    this.a.onStart$app_appCenterRelease();
                }
            } else if (aVar != p.a.ON_STOP) {
            } else {
                if (!z2 || d0Var.a("onStop$app_appCenterRelease", 1)) {
                    this.a.onStop$app_appCenterRelease();
                }
            }
        }
    }
}
