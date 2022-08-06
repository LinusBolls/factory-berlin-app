package com.sensorberg.aliolihttp.storage.d;

import kotlin.jvm.internal.k;

/* compiled from: AlioliHttpHeader.kt */
public final class c {
    private final String a;
    private final String b;

    public c(String str, String str2) {
        k.f(str, "key");
        k.f(str2, "value");
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return k.a(this.a, cVar.a) && k.a(this.b, cVar.b);
    }

    public int hashCode() {
        String str = this.a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        return this.a + ": " + this.b;
    }
}
