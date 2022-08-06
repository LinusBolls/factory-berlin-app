package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

final class m<TResult, TContinuationResult> implements b, d, e<TContinuationResult>, y<TResult> {
    private final Executor a;
    /* access modifiers changed from: private */
    public final a<TResult, g<TContinuationResult>> b;
    /* access modifiers changed from: private */
    public final b0<TContinuationResult> c;

    public m(Executor executor, a<TResult, g<TContinuationResult>> aVar, b0<TContinuationResult> b0Var) {
        this.a = executor;
        this.b = aVar;
        this.c = b0Var;
    }

    public final void a(g<TResult> gVar) {
        this.a.execute(new n(this, gVar));
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
