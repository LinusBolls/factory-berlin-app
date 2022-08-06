package com.sensorberg.smartworkspace.app.l;

import com.sensorberg.smartworkspace.app.screens.spaces.IotDeviceIdentifier;

public final /* synthetic */ class a {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[IotDeviceIdentifier.values().length];
        a = iArr;
        iArr[IotDeviceIdentifier.LAMP.ordinal()] = 1;
        a[IotDeviceIdentifier.JALOUSIE.ordinal()] = 2;
        a[IotDeviceIdentifier.AIR_CONDITION.ordinal()] = 3;
    }
}
