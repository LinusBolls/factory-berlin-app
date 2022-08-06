package com.sensorberg.notifications.sdk.internal.storage;

import com.sensorberg.notifications.sdk.internal.model.Trigger;
import g.e.j.a.c;

public final /* synthetic */ class g {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[Trigger.b.values().length];
        a = iArr;
        iArr[Trigger.b.Enter.ordinal()] = 1;
        a[Trigger.b.Exit.ordinal()] = 2;
        a[Trigger.b.EnterOrExit.ordinal()] = 3;
        int[] iArr2 = new int[c.values().length];
        b = iArr2;
        iArr2[c.NotificationDisabled.ordinal()] = 1;
        b[c.Suppressed.ordinal()] = 2;
        b[c.Ignored.ordinal()] = 3;
        b[c.Success.ordinal()] = 4;
    }
}
