package com.sensorberg.notifications.sdk.internal.backend.backendsdkv2.model;

import com.squareup.moshi.e;
import java.util.List;
import kotlin.i;
import kotlin.jvm.internal.k;

@e(generateAdapter = true)
@i(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\b\u0018\u0000B\u0019\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\"\u0010\u0006\u001a\u00020\u00002\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R!\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00018\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0004¨\u0006\u0017"}, d2 = {"Lcom/sensorberg/notifications/sdk/internal/backend/backendsdkv2/model/ResolveResponse;", "", "Lcom/sensorberg/notifications/sdk/internal/backend/backendsdkv2/model/ResolveAction;", "component1", "()Ljava/util/List;", "actions", "copy", "(Ljava/util/List;)Lcom/sensorberg/notifications/sdk/internal/backend/backendsdkv2/model/ResolveResponse;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getActions", "<init>", "(Ljava/util/List;)V", "notifications_release"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* compiled from: ResolveResponse.kt */
public final class ResolveResponse {
    private final List<ResolveAction> a;

    public ResolveResponse() {
        this((List) null, 1, (DefaultConstructorMarker) null);
    }

    public ResolveResponse(List<ResolveAction> list) {
        this.a = list;
    }

    public final List<ResolveAction> a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof ResolveResponse) && k.a(this.a, ((ResolveResponse) obj).a);
        }
        return true;
    }

    public int hashCode() {
        List<ResolveAction> list = this.a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "ResolveResponse(actions=" + this.a + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ResolveResponse(List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : list);
    }
}
