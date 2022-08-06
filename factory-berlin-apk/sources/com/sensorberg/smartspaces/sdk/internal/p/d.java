package com.sensorberg.smartspaces.sdk.internal.p;

/* compiled from: BlueIdCommands.kt */
public enum d {
    SyncTime("time"),
    Open("tokn"),
    GetBatteryState("batt"),
    GetHardwareRevision("hrev"),
    GetVersion("vers");
    

    /* renamed from: g  reason: collision with root package name */
    private final String f6490g;

    private d(String str) {
        this.f6490g = str;
    }

    public final String a() {
        return this.f6490g;
    }
}
