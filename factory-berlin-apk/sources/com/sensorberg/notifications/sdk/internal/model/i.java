package com.sensorberg.notifications.sdk.internal.model;

import com.sensorberg.notifications.sdk.internal.model.Trigger;
import kotlin.jvm.internal.k;

/* compiled from: GeofenceQuery.kt */
public final class i {
    private final String a;
    private final double b;
    private final double c;

    /* renamed from: d  reason: collision with root package name */
    private final float f5292d;

    /* renamed from: e  reason: collision with root package name */
    private final Trigger.b f5293e;

    /* renamed from: f  reason: collision with root package name */
    private final double f5294f;

    /* renamed from: g  reason: collision with root package name */
    private final double f5295g;

    /* renamed from: h  reason: collision with root package name */
    private final double f5296h;

    /* renamed from: i  reason: collision with root package name */
    private final double f5297i;

    public i(String str, double d2, double d3, float f2, Trigger.b bVar, double d4, double d5, double d6, double d7) {
        k.f(str, "id");
        k.f(bVar, "type");
        this.a = str;
        this.b = d2;
        this.c = d3;
        this.f5292d = f2;
        this.f5293e = bVar;
        this.f5294f = d4;
        this.f5295g = d5;
        this.f5296h = d6;
        this.f5297i = d7;
    }

    public final double a() {
        return this.f5296h;
    }

    public final double b() {
        return this.f5297i;
    }

    public final String c() {
        return this.a;
    }

    public final double d() {
        return this.b;
    }

    public final double e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return k.a(this.a, iVar.a) && Double.compare(this.b, iVar.b) == 0 && Double.compare(this.c, iVar.c) == 0 && Float.compare(this.f5292d, iVar.f5292d) == 0 && k.a(this.f5293e, iVar.f5293e) && Double.compare(this.f5294f, iVar.f5294f) == 0 && Double.compare(this.f5295g, iVar.f5295g) == 0 && Double.compare(this.f5296h, iVar.f5296h) == 0 && Double.compare(this.f5297i, iVar.f5297i) == 0;
    }

    public final float f() {
        return this.f5292d;
    }

    public final double g() {
        return this.f5294f;
    }

    public final double h() {
        return this.f5295g;
    }

    public int hashCode() {
        String str = this.a;
        int i2 = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        long doubleToLongBits = Double.doubleToLongBits(this.b);
        long doubleToLongBits2 = Double.doubleToLongBits(this.c);
        int floatToIntBits = ((((((hashCode * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + Float.floatToIntBits(this.f5292d)) * 31;
        Trigger.b bVar = this.f5293e;
        if (bVar != null) {
            i2 = bVar.hashCode();
        }
        long doubleToLongBits3 = Double.doubleToLongBits(this.f5294f);
        long doubleToLongBits4 = Double.doubleToLongBits(this.f5295g);
        long doubleToLongBits5 = Double.doubleToLongBits(this.f5296h);
        long doubleToLongBits6 = Double.doubleToLongBits(this.f5297i);
        return ((((((((floatToIntBits + i2) * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)))) * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)))) * 31) + ((int) (doubleToLongBits5 ^ (doubleToLongBits5 >>> 32)))) * 31) + ((int) (doubleToLongBits6 ^ (doubleToLongBits6 >>> 32)));
    }

    public final Trigger.b i() {
        return this.f5293e;
    }

    public String toString() {
        return "GeofenceQuery(id=" + this.a + ", latitude=" + this.b + ", longitude=" + this.c + ", radius=" + this.f5292d + ", type=" + this.f5293e + ", sin_lat_rad=" + this.f5294f + ", sin_lon_rad=" + this.f5295g + ", cos_lat_rad=" + this.f5296h + ", cos_lon_rad=" + this.f5297i + ")";
    }
}
