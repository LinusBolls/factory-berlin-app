package com.apollographql.apollo.exception;

public final class ApolloNetworkException extends ApolloException {
    public ApolloNetworkException(String str, Throwable th) {
        super(str, th);
    }
}
