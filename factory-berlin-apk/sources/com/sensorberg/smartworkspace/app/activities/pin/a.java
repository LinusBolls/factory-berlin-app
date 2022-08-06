package com.sensorberg.smartworkspace.app.activities.pin;

import com.sensorberg.smartworkspace.app.activities.pin.c;

public final /* synthetic */ class a {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[c.b.values().length];
        a = iArr;
        iArr[c.b.FINGERPRINT_NOT_RECOGNIZED.ordinal()] = 1;
        a[c.b.UNLOCK.ordinal()] = 2;
        a[c.b.REGISTER_1ST.ordinal()] = 3;
        a[c.b.REGISTER_2ND.ordinal()] = 4;
        a[c.b.CHANGE_1ST.ordinal()] = 5;
        a[c.b.CHANGE_2ND.ordinal()] = 6;
        a[c.b.PROCESSING.ordinal()] = 7;
        a[c.b.NO_MATCH.ordinal()] = 8;
        a[c.b.WRONG_PIN.ordinal()] = 9;
        a[c.b.SUCCESS.ordinal()] = 10;
        a[c.b.LOGOUT.ordinal()] = 11;
    }
}
