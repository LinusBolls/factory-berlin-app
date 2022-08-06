package org.koin.core.error;

import kotlin.i;
import kotlin.jvm.internal.k;

@i(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0005\u001a\u00060\u0001j\u0002`\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lorg/koin/core/error/InstanceCreationException;", "Ljava/lang/Exception;", "", "msg", "Lkotlin/Exception;", "parent", "<init>", "(Ljava/lang/String;Ljava/lang/Exception;)V", "koin-core"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* compiled from: InstanceCreationException.kt */
public final class InstanceCreationException extends Exception {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InstanceCreationException(String str, Exception exc) {
        super(str, exc);
        k.f(str, "msg");
        k.f(exc, "parent");
    }
}
