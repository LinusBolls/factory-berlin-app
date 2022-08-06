package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

final class q<TResult> implements y<TResult> {
    private final Executor a;
    /* access modifiers changed from: private */
    public final Object b = new Object();
    /* access modifiers changed from: private */
    public c<TResult> c;

    public q(Executor executor, c<TResult> cVar) {
        this.a = executor;
        this.c = cVar;
    }

    public final void a(g<TResult> gVar) {
        synchronized (this.b) {
            if (this.c != null) {
                this.a.execute(new r(this, gVar));
            }
        }
    }
}
