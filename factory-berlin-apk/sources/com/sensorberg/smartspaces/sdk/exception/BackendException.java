package com.sensorberg.smartspaces.sdk.exception;

import kotlin.i;
import kotlin.jvm.internal.k;

@i(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\n\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/sensorberg/smartspaces/sdk/exception/BackendException;", "Lcom/sensorberg/smartspaces/sdk/exception/SmartSpacesSdkException;", "", "detail", "Ljava/lang/String;", "getDetail", "()Ljava/lang/String;", "", "httpStatusCode", "I", "getHttpStatusCode", "()I", "title", "getTitle", "message", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "exception_release"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* compiled from: SmartSpacesSdkException.kt */
public final class BackendException extends SmartSpacesSdkException {

    /* renamed from: g  reason: collision with root package name */
    private final String f6380g;

    /* renamed from: h  reason: collision with root package name */
    private final int f6381h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackendException(String str, String str2, String str3, int i2) {
        super(str, (DefaultConstructorMarker) null);
        k.e(str, "message");
        k.e(str2, "title");
        k.e(str3, "detail");
        this.f6380g = str3;
        this.f6381h = i2;
    }

    public final String a() {
        return this.f6380g;
    }

    public final int b() {
        return this.f6381h;
    }
}
