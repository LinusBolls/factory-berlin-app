package com.sensorberg.notifications.sdk.internal.backend.backendsdkv2.model;

import com.sensorberg.notifications.sdk.internal.model.Trigger;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.k;

/* compiled from: ResolveAction.kt */
public final class c {
    public static final int a(Trigger.b bVar) {
        k.f(bVar, "$this$getType");
        int i2 = b.a[bVar.ordinal()];
        if (i2 == 1) {
            return 1;
        }
        if (i2 == 2) {
            return 2;
        }
        if (i2 == 3) {
            return 3;
        }
        throw new NoWhenBranchMatchedException();
    }
}
