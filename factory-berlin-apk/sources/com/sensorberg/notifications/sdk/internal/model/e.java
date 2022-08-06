package com.sensorberg.notifications.sdk.internal.model;

import kotlin.jvm.internal.k;

/* compiled from: ActionModel.kt */
public final class e {
    private String a;
    private String b;
    private String c;

    /* renamed from: d  reason: collision with root package name */
    private String f5269d;

    /* renamed from: e  reason: collision with root package name */
    private String f5270e;

    /* renamed from: f  reason: collision with root package name */
    private String f5271f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f5272g;

    /* renamed from: h  reason: collision with root package name */
    private long f5273h;

    /* renamed from: i  reason: collision with root package name */
    private long f5274i;

    /* renamed from: j  reason: collision with root package name */
    private long f5275j;

    /* renamed from: k  reason: collision with root package name */
    private int f5276k;

    /* renamed from: l  reason: collision with root package name */
    private String f5277l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f5278m;

    public e(String str, String str2, String str3, String str4, String str5, String str6, boolean z, long j2, long j3, long j4, int i2, String str7, boolean z2) {
        k.f(str, "id");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.f5269d = str4;
        this.f5270e = str5;
        this.f5271f = str6;
        this.f5272g = z;
        this.f5273h = j2;
        this.f5274i = j3;
        this.f5275j = j4;
        this.f5276k = i2;
        this.f5277l = str7;
        this.f5278m = z2;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.f5269d;
    }

    public final long c() {
        return this.f5273h;
    }

    public final long d() {
        return this.f5274i;
    }

    public final String e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return k.a(this.a, eVar.a) && k.a(this.b, eVar.b) && k.a(this.c, eVar.c) && k.a(this.f5269d, eVar.f5269d) && k.a(this.f5270e, eVar.f5270e) && k.a(this.f5271f, eVar.f5271f) && this.f5272g == eVar.f5272g && this.f5273h == eVar.f5273h && this.f5274i == eVar.f5274i && this.f5275j == eVar.f5275j && this.f5276k == eVar.f5276k && k.a(this.f5277l, eVar.f5277l) && this.f5278m == eVar.f5278m;
    }

    public final int f() {
        return this.f5276k;
    }

    public final String g() {
        return this.f5271f;
    }

    public final boolean h() {
        return this.f5272g;
    }

    public int hashCode() {
        String str = this.a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f5269d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f5270e;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f5271f;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        boolean z = this.f5272g;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        long j2 = this.f5273h;
        long j3 = this.f5274i;
        long j4 = this.f5275j;
        int i3 = (((((((((hashCode6 + (z ? 1 : 0)) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + this.f5276k) * 31;
        String str7 = this.f5277l;
        if (str7 != null) {
            i2 = str7.hashCode();
        }
        int i4 = (i3 + i2) * 31;
        boolean z3 = this.f5278m;
        if (!z3) {
            z2 = z3;
        }
        return i4 + (z2 ? 1 : 0);
    }

    public final boolean i() {
        return this.f5278m;
    }

    public final String j() {
        return this.c;
    }

    public final long k() {
        return this.f5275j;
    }

    public final String l() {
        return this.f5277l;
    }

    public final String m() {
        return this.f5270e;
    }

    public String toString() {
        return "ActionQueryModel(id=" + this.a + ", backendMeta=" + this.b + ", subject=" + this.c + ", body=" + this.f5269d + ", url=" + this.f5270e + ", payload=" + this.f5271f + ", reportImmediately=" + this.f5272g + ", delay=" + this.f5273h + ", deliverAt=" + this.f5274i + ", suppressionTime=" + this.f5275j + ", maxCount=" + this.f5276k + ", triggerBackendMeta=" + this.f5277l + ", silent=" + this.f5278m + ")";
    }
}
