package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

final class k<TResult, TContinuationResult> implements y<TResult> {
    private final Executor a;
    /* access modifiers changed from: private */
    public final a<TResult, TContinuationResult> b;
    /* access modifiers changed from: private */
    public final b0<TContinuationResult> c;

    public k(Executor executor, a<TResult, TContinuationResult> aVar, b0<TContinuationResult> b0Var) {
        this.a = executor;
        this.b = aVar;
        this.c = b0Var;
    }

    public final void a(g<TResult> gVar) {
        this.a.execute(new l(this, gVar));
    }
}
