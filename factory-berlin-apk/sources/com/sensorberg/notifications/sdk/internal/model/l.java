package com.sensorberg.notifications.sdk.internal.model;

import kotlin.jvm.internal.k;

/* compiled from: ActionModel.kt */
public final class l {
    private long a;
    private String b;
    private long c;

    /* renamed from: d  reason: collision with root package name */
    private long f5298d;

    public l(long j2, String str, long j3, long j4) {
        k.f(str, "actionId");
        this.a = j2;
        this.b = str;
        this.c = j3;
        this.f5298d = j4;
    }

    public final String a() {
        return this.b;
    }

    public final long b() {
        return this.f5298d;
    }

    public final long c() {
        return this.a;
    }

    public final long d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.a == lVar.a && k.a(this.b, lVar.b) && this.c == lVar.c && this.f5298d == lVar.f5298d;
    }

    public int hashCode() {
        long j2 = this.a;
        int i2 = ((int) (j2 ^ (j2 >>> 32))) * 31;
        String str = this.b;
        int hashCode = str != null ? str.hashCode() : 0;
        long j3 = this.c;
        long j4 = this.f5298d;
        return ((((i2 + hashCode) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j4 ^ (j4 >>> 32)));
    }

    public String toString() {
        return "TimePeriod(id=" + this.a + ", actionId=" + this.b + ", startsAt=" + this.c + ", endsAt=" + this.f5298d + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(long j2, String str, long j3, long j4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : j2, str, j3, j4);
    }
}
