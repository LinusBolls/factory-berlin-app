package com.sensorberg.notifications.sdk.internal.model;

import kotlin.jvm.internal.k;

/* compiled from: ActionModel.kt */
public final class d {
    private String a;
    private String b;
    private String c;

    /* renamed from: d  reason: collision with root package name */
    private String f5260d;

    /* renamed from: e  reason: collision with root package name */
    private String f5261e;

    /* renamed from: f  reason: collision with root package name */
    private String f5262f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f5263g;

    /* renamed from: h  reason: collision with root package name */
    private long f5264h;

    /* renamed from: i  reason: collision with root package name */
    private long f5265i;

    /* renamed from: j  reason: collision with root package name */
    private long f5266j;

    /* renamed from: k  reason: collision with root package name */
    private int f5267k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f5268l;

    public d(String str, String str2, String str3, String str4, String str5, String str6, boolean z, long j2, long j3, long j4, int i2, boolean z2) {
        k.f(str, "id");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.f5260d = str4;
        this.f5261e = str5;
        this.f5262f = str6;
        this.f5263g = z;
        this.f5264h = j2;
        this.f5265i = j3;
        this.f5266j = j4;
        this.f5267k = i2;
        this.f5268l = z2;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.f5260d;
    }

    public final long c() {
        return this.f5264h;
    }

    public final long d() {
        return this.f5265i;
    }

    public final String e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return k.a(this.a, dVar.a) && k.a(this.b, dVar.b) && k.a(this.c, dVar.c) && k.a(this.f5260d, dVar.f5260d) && k.a(this.f5261e, dVar.f5261e) && k.a(this.f5262f, dVar.f5262f) && this.f5263g == dVar.f5263g && this.f5264h == dVar.f5264h && this.f5265i == dVar.f5265i && this.f5266j == dVar.f5266j && this.f5267k == dVar.f5267k && this.f5268l == dVar.f5268l;
    }

    public final int f() {
        return this.f5267k;
    }

    public final String g() {
        return this.f5262f;
    }

    public final boolean h() {
        return this.f5263g;
    }

    public int hashCode() {
        String str = this.a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f5260d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f5261e;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f5262f;
        if (str6 != null) {
            i2 = str6.hashCode();
        }
        int i3 = (hashCode5 + i2) * 31;
        boolean z = this.f5263g;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        long j2 = this.f5264h;
        long j3 = this.f5265i;
        long j4 = this.f5266j;
        int i4 = (((((((((i3 + (z ? 1 : 0)) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + this.f5267k) * 31;
        boolean z3 = this.f5268l;
        if (!z3) {
            z2 = z3;
        }
        return i4 + (z2 ? 1 : 0);
    }

    public final boolean i() {
        return this.f5268l;
    }

    public final String j() {
        return this.c;
    }

    public final long k() {
        return this.f5266j;
    }

    public final String l() {
        return this.f5261e;
    }

    public String toString() {
        return "ActionModel(id=" + this.a + ", backendMeta=" + this.b + ", subject=" + this.c + ", body=" + this.f5260d + ", url=" + this.f5261e + ", payload=" + this.f5262f + ", reportImmediately=" + this.f5263g + ", delay=" + this.f5264h + ", deliverAt=" + this.f5265i + ", suppressionTime=" + this.f5266j + ", maxCount=" + this.f5267k + ", silent=" + this.f5268l + ")";
    }
}
