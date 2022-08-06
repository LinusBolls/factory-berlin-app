package com.sensorberg.smartspaces.backend.n;

import kotlin.jvm.internal.k;

/* compiled from: PageInfo.kt */
public final class a {
    private final String a;
    private final boolean b;

    public a(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final String a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return k.a(this.a, aVar.a) && this.b == aVar.b;
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.b;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        return "PageInfo(endCursor=" + this.a + ", hasNextPage=" + this.b + ")";
    }
}
