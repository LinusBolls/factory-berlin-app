package com.sensorberg.smartworkspace.app.utils;

import androidx.lifecycle.e0;
import kotlin.jvm.internal.k;

/* compiled from: ShowNotificationFlag.kt */
public final class n extends e0<Boolean> {
    private boolean q;

    /* access modifiers changed from: protected */
    public void q() {
        super.q();
        this.q = true;
    }

    /* access modifiers changed from: protected */
    public void r() {
        this.q = false;
        super.r();
    }

    public final boolean v() {
        boolean z = l() == null || k.a(l(), Boolean.TRUE);
        if (!this.q || z) {
            return true;
        }
        return false;
    }
}
