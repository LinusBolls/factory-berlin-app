package com.sensorberg.notifications.sdk.internal.backend.backendsdkv2.model;

import com.squareup.moshi.d;
import com.squareup.moshi.e;
import g.e.j.a.c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.i;
import kotlin.jvm.internal.k;

@e(generateAdapter = true)
@i(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\b\u0018\u0000 %:\u0001%B+\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b#\u0010$J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ4\u0010\r\u001a\u00020\u00002\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0001HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0003R$\u0010\n\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0003\"\u0004\b\u0019\u0010\u001aR$\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\u001eR$\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u001f\u001a\u0004\b \u0010\t\"\u0004\b!\u0010\"¨\u0006&"}, d2 = {"Lcom/sensorberg/notifications/sdk/internal/backend/backendsdkv2/model/ActionConversion;", "", "component1", "()Ljava/lang/String;", "", "component2", "()Ljava/lang/Long;", "", "component3", "()Ljava/lang/Integer;", "actionInstanceUuid", "date", "type", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;)Lcom/sensorberg/notifications/sdk/internal/backend/backendsdkv2/model/ActionConversion;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "Ljava/lang/String;", "getActionInstanceUuid", "setActionInstanceUuid", "(Ljava/lang/String;)V", "Ljava/lang/Long;", "getDate", "setDate", "(Ljava/lang/Long;)V", "Ljava/lang/Integer;", "getType", "setType", "(Ljava/lang/Integer;)V", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;)V", "Companion", "notifications_release"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* compiled from: ActionConversion.kt */
public final class ActionConversion {

    /* renamed from: d  reason: collision with root package name */
    public static final a f5153d = new a((DefaultConstructorMarker) null);
    private String a;
    private Long b;
    private Integer c;

    /* compiled from: ActionConversion.kt */
    public static final class a {
        private a() {
        }

        public final int a(c cVar) {
            k.f(cVar, "type");
            int i2 = a.a[cVar.ordinal()];
            if (i2 == 1) {
                return -2;
            }
            if (i2 == 2) {
                return -1;
            }
            if (i2 == 3) {
                return 0;
            }
            if (i2 == 4) {
                return 1;
            }
            throw new NoWhenBranchMatchedException();
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ActionConversion() {
        this((String) null, (Long) null, (Integer) null, 7, (DefaultConstructorMarker) null);
    }

    public ActionConversion(@d(name = "action") String str, @d(name = "dt") Long l2, @d(name = "type") Integer num) {
        this.a = str;
        this.b = l2;
        this.c = num;
    }

    public final String a() {
        return this.a;
    }

    public final Long b() {
        return this.b;
    }

    public final Integer c() {
        return this.c;
    }

    public final ActionConversion copy(@d(name = "action") String str, @d(name = "dt") Long l2, @d(name = "type") Integer num) {
        return new ActionConversion(str, l2, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActionConversion)) {
            return false;
        }
        ActionConversion actionConversion = (ActionConversion) obj;
        return k.a(this.a, actionConversion.a) && k.a(this.b, actionConversion.b) && k.a(this.c, actionConversion.c);
    }

    public int hashCode() {
        String str = this.a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Long l2 = this.b;
        int hashCode2 = (hashCode + (l2 != null ? l2.hashCode() : 0)) * 31;
        Integer num = this.c;
        if (num != null) {
            i2 = num.hashCode();
        }
        return hashCode2 + i2;
    }

    public String toString() {
        return "ActionConversion(actionInstanceUuid=" + this.a + ", date=" + this.b + ", type=" + this.c + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ActionConversion(String str, Long l2, Integer num, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : l2, (i2 & 4) != 0 ? null : num);
    }
}
