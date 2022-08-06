package com.sensorberg.smartspaces.sdk.exception;

import kotlin.i;

@i(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sensorberg/smartspaces/sdk/exception/CanceledException;", "Lcom/sensorberg/smartspaces/sdk/exception/SmartSpacesSdkException;", "<init>", "()V", "exception_release"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* compiled from: SmartSpacesSdkException.kt */
public final class CanceledException extends SmartSpacesSdkException {
    public CanceledException() {
        super("Operation was canceled", (DefaultConstructorMarker) null);
    }
}
