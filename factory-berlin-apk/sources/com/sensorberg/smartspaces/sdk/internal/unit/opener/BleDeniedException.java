package com.sensorberg.smartspaces.sdk.internal.unit.opener;

import kotlin.i;
import kotlin.jvm.internal.k;

@i(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/sensorberg/smartspaces/sdk/internal/unit/opener/BleDeniedException;", "Lcom/sensorberg/smartspaces/sdk/internal/unit/opener/DeniedException;", "", "originalGatewayErrorMessage", "Ljava/lang/String;", "getOriginalGatewayErrorMessage", "()Ljava/lang/String;", "displayableMessage", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "sdk_release"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* compiled from: DeniedException.kt */
public final class BleDeniedException extends DeniedException {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BleDeniedException(String str, String str2) {
        super(str);
        k.e(str, "displayableMessage");
        k.e(str2, "originalGatewayErrorMessage");
    }
}
