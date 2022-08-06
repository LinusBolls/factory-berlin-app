package com.apollographql.apollo.exception;

import kotlin.i;
import kotlin.jvm.internal.k;

@i(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\t"}, d2 = {"Lcom/apollographql/apollo/exception/ApolloException;", "Ljava/lang/RuntimeException;", "", "message", "<init>", "(Ljava/lang/String;)V", "", "cause", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "apollo-api"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* compiled from: ApolloException.kt */
public class ApolloException extends RuntimeException {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ApolloException(String str) {
        super(str);
        k.f(str, "message");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ApolloException(String str, Throwable th) {
        super(str, th);
        k.f(str, "message");
        k.f(th, "cause");
    }
}
