package com.sensorberg.smartworkspace.app.activities.pin;

import com.sensorberg.smartworkspace.app.activities.pin.c;
import g.e.g.a;

public final /* synthetic */ class d {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[c.a.values().length];
        a = iArr;
        iArr[c.a.UNLOCK.ordinal()] = 1;
        a[c.a.CHANGE.ordinal()] = 2;
        a[c.a.REGISTER.ordinal()] = 3;
        int[] iArr2 = new int[c.a.values().length];
        b = iArr2;
        iArr2[c.a.UNLOCK.ordinal()] = 1;
        b[c.a.CHANGE.ordinal()] = 2;
        b[c.a.REGISTER.ordinal()] = 3;
        int[] iArr3 = new int[a.b.values().length];
        c = iArr3;
        iArr3[a.b.FINGERPRINT_NOT_RECOGNIZED.ordinal()] = 1;
        c[a.b.FINGERPRINT_SUCCESS.ordinal()] = 2;
    }
}
