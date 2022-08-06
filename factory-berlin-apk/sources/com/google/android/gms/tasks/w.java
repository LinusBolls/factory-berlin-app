package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

final class w<TResult, TContinuationResult> implements b, d, e<TContinuationResult>, y<TResult> {
    private final Executor a;
    /* access modifiers changed from: private */
    public final f<TResult, TContinuationResult> b;
    private final b0<TContinuationResult> c;

    public w(Executor executor, f<TResult, TContinuationResult> fVar, b0<TContinuationResult> b0Var) {
        this.a = executor;
        this.b = fVar;
        this.c = b0Var;
    }

    public final void a(g<TResult> gVar) {
        this.a.execute(new x(this, gVar));
    }

    public final void b() {
        this.c.t();
    }

    public final void c(TContinuationResult tcontinuationresult) {
        this.c.q(tcontinuationresult);
    }

    public final void d(Exception exc) {
        this.c.p(exc);
    }
}
