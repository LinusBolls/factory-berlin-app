package com.sensorberg.smartspaces.sdk.internal.p;

/* compiled from: BlueIdProgress.kt */
public enum h {
    Opening("open"),
    SettingTime("execute time sync"),
    OpeningAgain("open after time synced");
    

    /* renamed from: g  reason: collision with root package name */
    private final String f6495g;

    private h(String str) {
        this.f6495g = str;
    }

    public final String a() {
        return this.f6495g;
    }
}
