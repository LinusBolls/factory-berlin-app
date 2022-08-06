package com.sensorberg.aliolihttp.storage.d;

import java.util.ArrayList;
import kotlin.jvm.internal.k;

/* compiled from: AlioliHttpEntity.kt */
public final class b {
    private final String a;
    private final String b;
    private final a c;

    /* renamed from: d  reason: collision with root package name */
    private final ArrayList<c> f4835d;

    /* renamed from: e  reason: collision with root package name */
    private final long f4836e;

    /* renamed from: f  reason: collision with root package name */
    private final long f4837f;

    public b(String str, String str2, a aVar, ArrayList<c> arrayList, long j2, long j3) {
        k.f(str, "method");
        k.f(str2, "url");
        k.f(arrayList, "alioliHttpHeaderList");
        this.a = str;
        this.b = str2;
        this.c = aVar;
        this.f4835d = arrayList;
        this.f4836e = j2;
        this.f4837f = j3;
    }

    public final a a() {
        return this.c;
    }

    public final ArrayList<c> b() {
        return this.f4835d;
    }

    public final long c() {
        return this.f4837f;
    }

    public final String d() {
        return this.a;
    }

    public final String e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return k.a(this.a, bVar.a) && k.a(this.b, bVar.b) && k.a(this.c, bVar.c) && k.a(this.f4835d, bVar.f4835d) && this.f4836e == bVar.f4836e && this.f4837f == bVar.f4837f;
    }

    public final long f() {
        return this.f4836e;
    }

    public final boolean g() {
        return System.currentTimeMillis() < this.f4836e;
    }

    public int hashCode() {
        String str = this.a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        a aVar = this.c;
        int hashCode3 = (hashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        ArrayList<c> arrayList = this.f4835d;
        if (arrayList != null) {
            i2 = arrayList.hashCode();
        }
        return ((((hashCode3 + i2) * 31) + c.a(this.f4836e)) * 31) + c.a(this.f4837f);
    }

    public String toString() {
        return "AlioliHttpEntity(method=" + this.a + ", url=" + this.b + ", alioliHttpBody=" + this.c + ", alioliHttpHeaderList=" + this.f4835d + ", validUntilMs=" + this.f4836e + ", id=" + this.f4837f + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(String str, String str2, a aVar, ArrayList arrayList, long j2, long j3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, aVar, arrayList, j2, (i2 & 32) != 0 ? 0 : j3);
    }
}
