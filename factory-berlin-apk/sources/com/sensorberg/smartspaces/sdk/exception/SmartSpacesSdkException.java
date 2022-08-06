package com.sensorberg.smartspaces.sdk.exception;

import kotlin.i;

@i(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u0013\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0001\u0005\u0006\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/sensorberg/smartspaces/sdk/exception/SmartSpacesSdkException;", "Ljava/lang/Exception;", "", "message", "<init>", "(Ljava/lang/String;)V", "Lcom/sensorberg/smartspaces/sdk/exception/CanceledException;", "Lcom/sensorberg/smartspaces/sdk/exception/BackendException;", "Lcom/sensorberg/smartspaces/sdk/exception/BlueIdAuthorizationException;", "Lcom/sensorberg/smartspaces/sdk/exception/GattException;", "Lcom/sensorberg/smartspaces/sdk/exception/LoggedOutException;", "exception_release"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* compiled from: SmartSpacesSdkException.kt */
public abstract class SmartSpacesSdkException extends Exception {
    private SmartSpacesSdkException(String str) {
        super(str);
    }

    public /* synthetic */ SmartSpacesSdkException(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
