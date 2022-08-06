package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

final class o<TResult> implements y<TResult> {
    private final Executor a;
    /* access modifiers changed from: private */
    public final Object b = new Object();
    /* access modifiers changed from: private */
    public b c;

    public o(Executor executor, b bVar) {
        this.a = executor;
        this.c = bVar;
    }

    public final void a(g gVar) {
        if (gVar.j()) {
            synchronized (this.b) {
                if (this.c != null) {
                    this.a.execute(new p(this));
                }
            }
        }
    }
}
