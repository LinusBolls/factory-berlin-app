package com.sensorberg.notifications.sdk.internal.model;

import kotlin.jvm.internal.k;

/* compiled from: RegisteredGeoFence.kt */
public final class j {
    private final String a;

    public j(String str) {
        k.f(str, "id");
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof j) && k.a(this.a, ((j) obj).a);
        }
        return true;
    }

    public int hashCode() {
        String str = this.a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "RegisteredGeoFence(id=" + this.a + ")";
    }
}
