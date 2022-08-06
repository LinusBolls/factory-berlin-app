package com.sensorberg.smartspaces.sdk.exception;

import kotlin.i;
import kotlin.jvm.internal.k;

@i(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB!\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eR\u001b\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/sensorberg/smartspaces/sdk/exception/BlueIdAuthorizationException;", "Lcom/sensorberg/smartspaces/sdk/exception/SmartSpacesSdkException;", "", "errorCode", "Ljava/lang/Integer;", "getErrorCode", "()Ljava/lang/Integer;", "", "secureObjectId", "Ljava/lang/String;", "getSecureObjectId", "()Ljava/lang/String;", "message", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "Companion", "exception_release"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* compiled from: SmartSpacesSdkException.kt */
public final class BlueIdAuthorizationException extends SmartSpacesSdkException {

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
    public BlueIdAuthorizationException(String str, String str2, Integer num) {
        super(str, (DefaultConstructorMarker) null);
        k.e(str, "message");
        k.e(str2, "secureObjectId");
    }
}
