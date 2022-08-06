package com.apollographql.apollo.exception;

import k.d0;

public final class ApolloHttpException extends ApolloException {

    /* renamed from: g  reason: collision with root package name */
    private final transient d0 f1837g;

    public ApolloHttpException(d0 d0Var) {
        super(a(d0Var));
        if (d0Var != null) {
            d0Var.j();
        }
        if (d0Var != null) {
            d0Var.D();
        }
        this.f1837g = d0Var;
    }

    private static String a(d0 d0Var) {
        if (d0Var == null) {
            return "Empty HTTP response";
        }
        return "HTTP " + d0Var.j() + " " + d0Var.D();
    }

    public d0 b() {
        return this.f1837g;
    }
}
