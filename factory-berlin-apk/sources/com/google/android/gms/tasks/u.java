package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

final class u<TResult> implements y<TResult> {
    private final Executor a;
    /* access modifiers changed from: private */
    public final Object b = new Object();
    /* access modifiers changed from: private */
    public e<? super TResult> c;

    public u(Executor executor, e<? super TResult> eVar) {
        this.a = executor;
        this.c = eVar;
    }

    public final void a(g<TResult> gVar) {
        if (gVar.l()) {
            synchronized (this.b) {
                if (this.c != null) {
                    this.a.execute(new v(this, gVar));
                }
            }
        }
    }
}
