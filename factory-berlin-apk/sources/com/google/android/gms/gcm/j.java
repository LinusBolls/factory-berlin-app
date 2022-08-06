package com.google.android.gms.gcm;

import android.os.Bundle;

public final class j {

    /* renamed from: d  reason: collision with root package name */
    public static final j f2220d = new j(0, 30, 3600);
    private final int a;
    private final int b = 30;
    private final int c = 3600;

    private j(int i2, int i3, int i4) {
        this.a = i2;
    }

    public final Bundle a(Bundle bundle) {
        bundle.putInt("retry_policy", this.a);
        bundle.putInt("initial_backoff_seconds", this.b);
        bundle.putInt("maximum_backoff_seconds", this.c);
        return bundle;
    }

    public final int b() {
        return this.a;
    }

    public final int c() {
        return this.b;
    }

    public final int d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return jVar.a == this.a && jVar.b == this.b && jVar.c == this.c;
    }

    public final int hashCode() {
        return (((((this.a + 1) ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c;
    }

    public final String toString() {
        int i2 = this.a;
        int i3 = this.b;
        int i4 = this.c;
        StringBuilder sb = new StringBuilder(74);
        sb.append("policy=");
        sb.append(i2);
        sb.append(" initial_backoff=");
        sb.append(i3);
        sb.append(" maximum_backoff=");
        sb.append(i4);
        return sb.toString();
    }
}
