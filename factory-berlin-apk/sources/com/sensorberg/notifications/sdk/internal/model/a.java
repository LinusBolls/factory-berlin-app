package com.sensorberg.notifications.sdk.internal.model;

import android.location.Location;
import g.e.j.a.c;
import kotlin.jvm.internal.k;

/* compiled from: ActionConversion.kt */
public final class a {

    /* renamed from: h  reason: collision with root package name */
    public static final C0172a f5248h = new C0172a((DefaultConstructorMarker) null);
    private String a;
    private long b;
    private c c;

    /* renamed from: d  reason: collision with root package name */
    private Double f5249d;

    /* renamed from: e  reason: collision with root package name */
    private Double f5250e;

    /* renamed from: f  reason: collision with root package name */
    private Float f5251f;

    /* renamed from: g  reason: collision with root package name */
    private Long f5252g;

    /* renamed from: com.sensorberg.notifications.sdk.internal.model.a$a  reason: collision with other inner class name */
    /* compiled from: ActionConversion.kt */
    public static final class C0172a {
        private C0172a() {
        }

        public final a a(String str, c cVar, Location location) {
            k.f(str, "instanceId");
            k.f(cVar, "conversion");
            return new a(str, System.currentTimeMillis(), cVar, location != null ? Double.valueOf(location.getLatitude()) : null, location != null ? Double.valueOf(location.getLongitude()) : null, location != null ? Float.valueOf(location.getAccuracy()) : null, location != null ? Long.valueOf(location.getTime()) : null);
        }

        public /* synthetic */ C0172a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public a(String str, long j2, c cVar, Double d2, Double d3, Float f2, Long l2) {
        k.f(str, "instanceId");
        k.f(cVar, "value");
        this.a = str;
        this.b = j2;
        this.c = cVar;
        this.f5249d = d2;
        this.f5250e = d3;
        this.f5251f = f2;
        this.f5252g = l2;
    }

    public final String a() {
        return this.a;
    }

    public final Double b() {
        return this.f5249d;
    }

    public final Long c() {
        return this.f5252g;
    }

    public final Double d() {
        return this.f5250e;
    }

    public final Float e() {
        return this.f5251f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return k.a(this.a, aVar.a) && this.b == aVar.b && k.a(this.c, aVar.c) && k.a(this.f5249d, aVar.f5249d) && k.a(this.f5250e, aVar.f5250e) && k.a(this.f5251f, aVar.f5251f) && k.a(this.f5252g, aVar.f5252g);
    }

    public final long f() {
        return this.b;
    }

    public final c g() {
        return this.c;
    }

    public int hashCode() {
        String str = this.a;
        int i2 = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        long j2 = this.b;
        int i3 = ((hashCode * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        c cVar = this.c;
        int hashCode2 = (i3 + (cVar != null ? cVar.hashCode() : 0)) * 31;
        Double d2 = this.f5249d;
        int hashCode3 = (hashCode2 + (d2 != null ? d2.hashCode() : 0)) * 31;
        Double d3 = this.f5250e;
        int hashCode4 = (hashCode3 + (d3 != null ? d3.hashCode() : 0)) * 31;
        Float f2 = this.f5251f;
        int hashCode5 = (hashCode4 + (f2 != null ? f2.hashCode() : 0)) * 31;
        Long l2 = this.f5252g;
        if (l2 != null) {
            i2 = l2.hashCode();
        }
        return hashCode5 + i2;
    }

    public String toString() {
        return "ActionConversion(instanceId=" + this.a + ", timestamp=" + this.b + ", value=" + this.c + ", latitude=" + this.f5249d + ", longitude=" + this.f5250e + ", radius=" + this.f5251f + ", locationTimeStamp=" + this.f5252g + ")";
    }
}
