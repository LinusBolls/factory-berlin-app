package com.sensorberg.notifications.sdk.internal.storage;

import com.google.android.gms.location.b;
import java.util.List;
import kotlin.jvm.internal.k;

/* compiled from: GeofenceQueryResult.kt */
public final class p {
    private final List<b> a;
    private final float b;
    private final List<String> c;

    public p(List<? extends b> list, float f2, List<String> list2) {
        k.f(list, "fencesToAdd");
        k.f(list2, "fencesToRemove");
        this.a = list;
        this.b = f2;
        this.c = list2;
    }

    public final List<b> a() {
        return this.a;
    }

    public final List<String> b() {
        return this.c;
    }

    public final float c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return k.a(this.a, pVar.a) && Float.compare(this.b, pVar.b) == 0 && k.a(this.c, pVar.c);
    }

    public int hashCode() {
        List<b> list = this.a;
        int i2 = 0;
        int hashCode = (((list != null ? list.hashCode() : 0) * 31) + Float.floatToIntBits(this.b)) * 31;
        List<String> list2 = this.c;
        if (list2 != null) {
            i2 = list2.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        return "GeofenceQueryResult(fencesToAdd=" + this.a + ", maxDistance=" + this.b + ", fencesToRemove=" + this.c + ")";
    }
}
