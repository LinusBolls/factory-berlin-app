package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

final class s<TResult> implements y<TResult> {
    private final Executor a;
    /* access modifiers changed from: private */
    public final Object b = new Object();
    /* access modifiers changed from: private */
    public d c;

    public s(Executor executor, d dVar) {
        this.a = executor;
        this.c = dVar;
    }

    public final void a(g<TResult> gVar) {
        if (!gVar.l() && !gVar.j()) {
            synchronized (this.b) {
                if (this.c != null) {
                    this.a.execute(new t(this, gVar));
                }
            }
        }
    }
}
