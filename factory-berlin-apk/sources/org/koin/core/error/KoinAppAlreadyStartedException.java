package org.koin.core.error;

import kotlin.i;
import kotlin.jvm.internal.k;

@i(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lorg/koin/core/error/KoinAppAlreadyStartedException;", "Ljava/lang/Exception;", "", "msg", "<init>", "(Ljava/lang/String;)V", "koin-core"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* compiled from: KoinAppAlreadyStartedException.kt */
public final class KoinAppAlreadyStartedException extends Exception {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KoinAppAlreadyStartedException(String str) {
        super(str);
        k.f(str, "msg");
    }
}
