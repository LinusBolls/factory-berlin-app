package com.sensorberg.smartworkspace.app.screens.spaces.overview;

import kotlin.jvm.internal.k;

/* compiled from: Space.kt */
public final class b extends a {
    private final long a;
    private final String b;
    private final String c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(long j2, String str, String str2) {
        super((DefaultConstructorMarker) null);
        k.e(str, "name");
        k.e(str2, "spaceId");
        this.a = j2;
        this.b = str;
        this.c = str2;
    }

    public long a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return a() == bVar.a() && k.a(this.b, bVar.b) && k.a(this.c, bVar.c);
    }

    public int hashCode() {
        int a2 = c.a(a()) * 31;
        String str = this.b;
        int i2 = 0;
        int hashCode = (a2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        return "SpaceItem(id=" + a() + ", name=" + this.b + ", spaceId=" + this.c + ")";
    }
}
