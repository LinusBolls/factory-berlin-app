package com.sensorberg.notifications.sdk.internal.model;

import com.sensorberg.notifications.sdk.internal.model.Trigger;
import kotlin.jvm.internal.k;

/* compiled from: ActionModel.kt */
public final class m {
    private final long a;
    private String b;
    private Trigger.b c;

    /* renamed from: d  reason: collision with root package name */
    private String f5299d;

    /* renamed from: e  reason: collision with root package name */
    private String f5300e;

    public m(long j2, String str, Trigger.b bVar, String str2, String str3) {
        k.f(str, "triggerId");
        k.f(bVar, "type");
        k.f(str2, "actionId");
        this.a = j2;
        this.b = str;
        this.c = bVar;
        this.f5299d = str2;
        this.f5300e = str3;
    }

    public final String a() {
        return this.f5299d;
    }

    public final long b() {
        return this.a;
    }

    public final String c() {
        return this.f5300e;
    }

    public final String d() {
        return this.b;
    }

    public final Trigger.b e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.a == mVar.a && k.a(this.b, mVar.b) && k.a(this.c, mVar.c) && k.a(this.f5299d, mVar.f5299d) && k.a(this.f5300e, mVar.f5300e);
    }

    public int hashCode() {
        long j2 = this.a;
        int i2 = ((int) (j2 ^ (j2 >>> 32))) * 31;
        String str = this.b;
        int i3 = 0;
        int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        Trigger.b bVar = this.c;
        int hashCode2 = (hashCode + (bVar != null ? bVar.hashCode() : 0)) * 31;
        String str2 = this.f5299d;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f5300e;
        if (str3 != null) {
            i3 = str3.hashCode();
        }
        return hashCode3 + i3;
    }

    public String toString() {
        return "TriggerActionMap(id=" + this.a + ", triggerId=" + this.b + ", type=" + this.c + ", actionId=" + this.f5299d + ", triggerBackendMeta=" + this.f5300e + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(long j2, String str, Trigger.b bVar, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : j2, str, bVar, str2, str3);
    }
}
