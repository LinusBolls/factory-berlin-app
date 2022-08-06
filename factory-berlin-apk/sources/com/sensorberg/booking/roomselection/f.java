package com.sensorberg.booking.roomselection;

import kotlin.jvm.internal.k;

/* compiled from: RoomSelectionViewModel.kt */
final class f {
    private final String a;
    private final int b;

    public f(String str, int i2) {
        k.e(str, "schedule");
        this.a = str;
        this.b = i2;
    }

    public final int a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return k.a(this.a, fVar.a) && this.b == fVar.b;
    }

    public int hashCode() {
        String str = this.a;
        return ((str != null ? str.hashCode() : 0) * 31) + this.b;
    }

    public String toString() {
        return "RoomSelectionIntermediateModel(schedule=" + this.a + ", badge=" + this.b + ")";
    }
}
