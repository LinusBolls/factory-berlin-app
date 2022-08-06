package com.google.firebase.crashlytics.d.h;

/* compiled from: DeliveryMechanism */
public enum u {
    DEVELOPER(1),
    USER_SIDELOAD(2),
    TEST_DISTRIBUTION(3),
    APP_STORE(4);
    

    /* renamed from: g  reason: collision with root package name */
    private final int f3979g;

    private u(int i2) {
        this.f3979g = i2;
    }

    public static u a(String str) {
        return str != null ? APP_STORE : DEVELOPER;
    }

    public int f() {
        return this.f3979g;
    }

    public String toString() {
        return Integer.toString(this.f3979g);
    }
}
