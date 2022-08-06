package com.sensorberg.notifications.sdk.internal;

import com.sensorberg.notifications.sdk.internal.model.Trigger;

public final /* synthetic */ class e {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Trigger.b.values().length];
        a = iArr;
        iArr[Trigger.b.Enter.ordinal()] = 1;
        a[Trigger.b.Exit.ordinal()] = 2;
        a[Trigger.b.EnterOrExit.ordinal()] = 3;
    }
}
