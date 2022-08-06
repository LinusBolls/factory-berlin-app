package com.sensorberg.smartspaces.sdk.internal.unit.opener;

import kotlin.i;
import kotlin.jvm.internal.k;

@i(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u00020\u00028\u0016@\u0016X\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/sensorberg/smartspaces/sdk/internal/unit/opener/DeniedException;", "Ljava/lang/Exception;", "", "message", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "sdk_release"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* compiled from: DeniedException.kt */
public class DeniedException extends Exception {

    /* renamed from: g  reason: collision with root package name */
    private final String f6738g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeniedException(String str) {
        super(str);
        k.e(str, "message");
        this.f6738g = str;
    }

    public String getMessage() {
        return this.f6738g;
    }
}
