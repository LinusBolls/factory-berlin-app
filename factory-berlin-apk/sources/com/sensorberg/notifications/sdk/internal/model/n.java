package com.sensorberg.notifications.sdk.internal.model;

import kotlin.jvm.internal.k;

/* compiled from: BeaconProcessingModel.kt */
public final class n {
    private final String a;
    private final long b;

    public n(String str, long j2) {
        k.f(str, "id");
        this.a = str;
        this.b = j2;
    }

    public final String a() {
        return this.a;
    }

    public final long b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return k.a(this.a, nVar.a) && this.b == nVar.b;
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = str != null ? str.hashCode() : 0;
        long j2 = this.b;
        return (hashCode * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return "VisibleBeacons(id=" + this.a + ", timestamp=" + this.b + ")";
    }
}
