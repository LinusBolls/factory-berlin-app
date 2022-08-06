package com.sensorberg.smartworkspace.app.screens.spaces.detail;

import com.sensorberg.smartworkspace.app.screens.spaces.IotDeviceIdentifier;

public final /* synthetic */ class n {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[IotDeviceIdentifier.values().length];
        a = iArr;
        iArr[IotDeviceIdentifier.DOOR.ordinal()] = 1;
        a[IotDeviceIdentifier.JALOUSIE.ordinal()] = 2;
        a[IotDeviceIdentifier.PLUG.ordinal()] = 3;
        a[IotDeviceIdentifier.SMOKE_DETECTOR.ordinal()] = 4;
        a[IotDeviceIdentifier.WINDOW.ordinal()] = 5;
        a[IotDeviceIdentifier.AIR_CONDITION.ordinal()] = 6;
        a[IotDeviceIdentifier.HEATER.ordinal()] = 7;
        a[IotDeviceIdentifier.TEMPERATURE.ordinal()] = 8;
        a[IotDeviceIdentifier.LAMP.ordinal()] = 9;
        a[IotDeviceIdentifier.MISC.ordinal()] = 10;
        a[IotDeviceIdentifier.MYRENZ_LETTER_BOX.ordinal()] = 11;
        a[IotDeviceIdentifier.MYRENZ_PARCEL_BOX.ordinal()] = 12;
    }
}
