package com.sensorberg.notifications.sdk.internal.backend.backendsdkv2.model;

import com.squareup.moshi.e;
import kotlin.i;
import kotlin.jvm.internal.k;

@e(generateAdapter = true)
@i(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\b\u0018\u0000B\u001f\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0004\u0010\u0003J(\u0010\u0007\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0001HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0003R$\u0010\u0006\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0003\"\u0004\b\u0014\u0010\u0015R$\u0010\u0005\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0016\u0010\u0003\"\u0004\b\u0017\u0010\u0015¨\u0006\u001a"}, d2 = {"Lcom/sensorberg/notifications/sdk/internal/backend/backendsdkv2/model/Timeframe;", "", "component1", "()Ljava/lang/String;", "component2", "start", "end", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/sensorberg/notifications/sdk/internal/backend/backendsdkv2/model/Timeframe;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getEnd", "setEnd", "(Ljava/lang/String;)V", "getStart", "setStart", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "notifications_release"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* compiled from: Timeframe.kt */
public final class Timeframe {
    private String a;
    private String b;

    public Timeframe() {
        this((String) null, (String) null, 3, (DefaultConstructorMarker) null);
    }

    public Timeframe(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Timeframe)) {
            return false;
        }
        Timeframe timeframe = (Timeframe) obj;
        return k.a(this.a, timeframe.a) && k.a(this.b, timeframe.b);
    }

    public int hashCode() {
        String str = this.a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        return "Timeframe(start=" + this.a + ", end=" + this.b + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Timeframe(String str, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2);
    }
}
