package com.sensorberg.smartworkspace.app.screens.door;

import com.sensorberg.factory.R;

/* compiled from: DoorTabs.kt */
public enum a {
    Nearby(0, R.string.tab_label_nearby),
    Favorites(1, R.string.tab_label_favorites);
    

    /* renamed from: g  reason: collision with root package name */
    private final int f7353g;

    /* renamed from: h  reason: collision with root package name */
    private final int f7354h;

    private a(int i2, int i3) {
        this.f7353g = i2;
        this.f7354h = i3;
    }

    public final int a() {
        return this.f7353g;
    }

    public final int f() {
        return this.f7354h;
    }
}
