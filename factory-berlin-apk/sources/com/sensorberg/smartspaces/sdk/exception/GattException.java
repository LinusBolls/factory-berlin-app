package com.sensorberg.smartspaces.sdk.exception;

import kotlin.i;
import kotlin.jvm.internal.k;

@i(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/sensorberg/smartspaces/sdk/exception/GattException;", "Lcom/sensorberg/smartspaces/sdk/exception/SmartSpacesSdkException;", "", "errorCode", "I", "getErrorCode", "()I", "", "message", "<init>", "(Ljava/lang/String;I)V", "Companion", "exception_release"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* compiled from: SmartSpacesSdkException.kt */
public final class GattException extends SmartSpacesSdkException {

    /* compiled from: SmartSpacesSdkException.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new a((DefaultConstructorMarker) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GattException(String str, int i2) {
        super(str, (DefaultConstructorMarker) null);
        k.e(str, "message");
    }
}
