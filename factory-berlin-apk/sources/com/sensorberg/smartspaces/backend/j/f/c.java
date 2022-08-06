package com.sensorberg.smartspaces.backend.j.f;

/* compiled from: UnitBookingStateEnum.kt */
public enum c {
    PLANNED("PLANNED"),
    ONGOING("ONGOING"),
    CANCELLED("CANCELLED"),
    FINISHED("FINISHED"),
    ENDED("ENDED");
    

    /* renamed from: g  reason: collision with root package name */
    private final String f5946g;

    /* compiled from: UnitBookingStateEnum.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new a((DefaultConstructorMarker) null);
    }

    private c(String str) {
        this.f5946g = str;
    }

    public final String a() {
        return this.f5946g;
    }
}
