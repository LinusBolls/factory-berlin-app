package com.sensorberg.aliolihttp;

import androidx.work.q;
import kotlin.jvm.internal.k;

/* compiled from: AlioliHttpWorkManagerProvider.kt */
public final class d {
    public static final d a = new d();

    private d() {
    }

    public final q a() {
        q j2 = q.j();
        k.b(j2, "WorkManager.getInstance()");
        return j2;
    }
}
