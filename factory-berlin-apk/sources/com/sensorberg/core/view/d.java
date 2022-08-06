package com.sensorberg.core.view;

import com.sensorberg.smartspaces.sdk.model.IotUnit;

public final /* synthetic */ class d {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[IotUnit.HardwareType.values().length];
        a = iArr;
        iArr[IotUnit.HardwareType.SB_GATEWAY.ordinal()] = 1;
        a[IotUnit.HardwareType.BLUE_ID.ordinal()] = 2;
    }
}
