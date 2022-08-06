package com.sensorberg.notifications.sdk.internal.model;

import com.sensorberg.notifications.sdk.internal.model.Trigger;
import kotlin.jvm.internal.k;

/* compiled from: ActionHistory.kt */
public final class b {
    private String a;
    private long b;
    private String c;

    /* renamed from: d  reason: collision with root package name */
    private Trigger.b f5253d;

    /* renamed from: e  reason: collision with root package name */
    private Double f5254e;

    /* renamed from: f  reason: collision with root package name */
    private Double f5255f;

    /* renamed from: g  reason: collision with root package name */
    private Float f5256g;

    /* renamed from: h  reason: collision with root package name */
    private Long f5257h;

    /* renamed from: i  reason: collision with root package name */
    private String f5258i;

    /* renamed from: j  reason: collision with root package name */
    private String f5259j;

    public b(String str, long j2, String str2, Trigger.b bVar, Double d2, Double d3, Float f2, Long l2, String str3, String str4) {
        k.f(str, "actionId");
        k.f(str2, "instanceId");
        k.f(bVar, "trigger");
        this.a = str;
        this.b = j2;
        this.c = str2;
        this.f5253d = bVar;
        this.f5254e = d2;
        this.f5255f = d3;
        this.f5256g = f2;
        this.f5257h = l2;
        this.f5258i = str3;
        this.f5259j = str4;
    }

    public final String a() {
        return this.f5258i;
    }

    public final String b() {
        return this.a;
    }

    public final String c() {
        return this.c;
    }

    public final Double d() {
        return this.f5254e;
    }

    public final Long e() {
        return this.f5257h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return k.a(this.a, bVar.a) && this.b == bVar.b && k.a(this.c, bVar.c) && k.a(this.f5253d, bVar.f5253d) && k.a(this.f5254e, bVar.f5254e) && k.a(this.f5255f, bVar.f5255f) && k.a(this.f5256g, bVar.f5256g) && k.a(this.f5257h, bVar.f5257h) && k.a(this.f5258i, bVar.f5258i) && k.a(this.f5259j, bVar.f5259j);
    }

    public final Double f() {
        return this.f5255f;
    }

    public final Float g() {
        return this.f5256g;
    }

    public final long h() {
        return this.b;
    }

    public int hashCode() {
        String str = this.a;
        int i2 = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        long j2 = this.b;
        int i3 = ((hashCode * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        String str2 = this.c;
        int hashCode2 = (i3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Trigger.b bVar = this.f5253d;
        int hashCode3 = (hashCode2 + (bVar != null ? bVar.hashCode() : 0)) * 31;
        Double d2 = this.f5254e;
        int hashCode4 = (hashCode3 + (d2 != null ? d2.hashCode() : 0)) * 31;
        Double d3 = this.f5255f;
        int hashCode5 = (hashCode4 + (d3 != null ? d3.hashCode() : 0)) * 31;
        Float f2 = this.f5256g;
        int hashCode6 = (hashCode5 + (f2 != null ? f2.hashCode() : 0)) * 31;
        Long l2 = this.f5257h;
        int hashCode7 = (hashCode6 + (l2 != null ? l2.hashCode() : 0)) * 31;
        String str3 = this.f5258i;
        int hashCode8 = (hashCode7 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f5259j;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        return hashCode8 + i2;
    }

    public final Trigger.b i() {
        return this.f5253d;
    }

    public final String j() {
        return this.f5259j;
    }

    public String toString() {
        return "ActionHistory(actionId=" + this.a + ", timestamp=" + this.b + ", instanceId=" + this.c + ", trigger=" + this.f5253d + ", latitude=" + this.f5254e + ", longitude=" + this.f5255f + ", radius=" + this.f5256g + ", locationTimeStamp=" + this.f5257h + ", actionBackendMeta=" + this.f5258i + ", triggerBackendMeta=" + this.f5259j + ")";
    }
}
