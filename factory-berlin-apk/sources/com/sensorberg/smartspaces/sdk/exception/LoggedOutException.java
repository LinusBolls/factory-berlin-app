package com.sensorberg.smartspaces.sdk.exception;

import kotlin.i;
import kotlin.jvm.internal.k;

@i(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/sensorberg/smartspaces/sdk/exception/LoggedOutException;", "Lcom/sensorberg/smartspaces/sdk/exception/SmartSpacesSdkException;", "", "interfaceName", "<init>", "(Ljava/lang/String;)V", "exception_release"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* compiled from: SmartSpacesSdkException.kt */
public final class LoggedOutException extends SmartSpacesSdkException {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoggedOutException(String str) {
        super("This " + str + " is inactive due to logout. " + "To execute any operation, you must acquire a new instance via methods on SmartSpacesSdk", (DefaultConstructorMarker) null);
        k.e(str, "interfaceName");
    }
}
