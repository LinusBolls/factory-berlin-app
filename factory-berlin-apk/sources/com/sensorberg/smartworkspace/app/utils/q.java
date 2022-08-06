package com.sensorberg.smartworkspace.app.utils;

import com.apollographql.apollo.exception.ApolloException;
import java.net.SocketTimeoutException;
import kotlin.jvm.internal.k;
import n.a.a;

/* compiled from: ThrowExceptionTree.kt */
public final class q extends a.c {
    /* access modifiers changed from: protected */
    public void l(int i2, String str, String str2, Throwable th) {
        k.e(str2, "message");
        if (th != null && i2 >= 6 && !(th instanceof ApolloException) && !(th instanceof SocketTimeoutException)) {
            throw new RuntimeException("Early crash to catch errors. Only enabled if(buildConfig.isDebugBuildType()). See ThrowExceptionTree.kt", th);
        }
    }
}
