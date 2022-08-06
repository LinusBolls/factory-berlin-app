package com.sensorberg.notifications.sdk.internal.model;

/* compiled from: ActionModel.kt */
public final class k {
    private String a;
    private int b;
    private long c;

    public k(String str, int i2, long j2) {
        kotlin.jvm.internal.k.f(str, "actionId");
        this.a = str;
        this.b = i2;
        this.c = j2;
    }

    public final String a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final long c() {
        return this.c;
    }

    public final void d(int i2) {
        this.b = i2;
    }

    public final void e(long j2) {
        this.c = j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return kotlin.jvm.internal.k.a(this.a, kVar.a) && this.b == kVar.b && this.c == kVar.c;
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = str != null ? str.hashCode() : 0;
        long j2 = this.c;
        return (((hashCode * 31) + this.b) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return "Statistics(actionId=" + this.a + ", count=" + this.b + ", lastExecuted=" + this.c + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(String str, int i2, long j2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i3 & 2) != 0 ? 0 : i2, j2);
    }
}
