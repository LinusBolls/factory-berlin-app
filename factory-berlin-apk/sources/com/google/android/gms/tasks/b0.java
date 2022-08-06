package com.google.android.gms.tasks;

import com.google.android.gms.common.internal.r;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

final class b0<TResult> extends g<TResult> {
    private final Object a = new Object();
    private final z<TResult> b = new z<>();
    private boolean c;

    /* renamed from: d  reason: collision with root package name */
    private volatile boolean f3317d;

    /* renamed from: e  reason: collision with root package name */
    private TResult f3318e;

    /* renamed from: f  reason: collision with root package name */
    private Exception f3319f;

    b0() {
    }

    private final void u() {
        r.o(this.c, "Task is not yet complete");
    }

    private final void v() {
        r.o(!this.c, "Task is already complete");
    }

    private final void w() {
        if (this.f3317d) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    private final void x() {
        synchronized (this.a) {
            if (this.c) {
                this.b.a(this);
            }
        }
    }

    public final g<TResult> a(Executor executor, b bVar) {
        this.b.b(new o(executor, bVar));
        x();
        return this;
    }

    public final g<TResult> b(c<TResult> cVar) {
        o(i.a, cVar);
        return this;
    }

    public final g<TResult> c(Executor executor, d dVar) {
        this.b.b(new s(executor, dVar));
        x();
        return this;
    }

    public final g<TResult> d(Executor executor, e<? super TResult> eVar) {
        this.b.b(new u(executor, eVar));
        x();
        return this;
    }

    public final <TContinuationResult> g<TContinuationResult> e(a<TResult, TContinuationResult> aVar) {
        return f(i.a, aVar);
    }

    public final <TContinuationResult> g<TContinuationResult> f(Executor executor, a<TResult, TContinuationResult> aVar) {
        b0 b0Var = new b0();
        this.b.b(new k(executor, aVar, b0Var));
        x();
        return b0Var;
    }

    public final <TContinuationResult> g<TContinuationResult> g(Executor executor, a<TResult, g<TContinuationResult>> aVar) {
        b0 b0Var = new b0();
        this.b.b(new m(executor, aVar, b0Var));
        x();
        return b0Var;
    }

    public final Exception h() {
        Exception exc;
        synchronized (this.a) {
            exc = this.f3319f;
        }
        return exc;
    }

    public final TResult i() {
        TResult tresult;
        synchronized (this.a) {
            u();
            w();
            if (this.f3319f == null) {
                tresult = this.f3318e;
            } else {
                throw new RuntimeExecutionException(this.f3319f);
            }
        }
        return tresult;
    }

    public final boolean j() {
        return this.f3317d;
    }

    public final boolean k() {
        boolean z;
        synchronized (this.a) {
            z = this.c;
        }
        return z;
    }

    public final boolean l() {
        boolean z;
        synchronized (this.a) {
            z = this.c && !this.f3317d && this.f3319f == null;
        }
        return z;
    }

    public final <TContinuationResult> g<TContinuationResult> m(f<TResult, TContinuationResult> fVar) {
        return n(i.a, fVar);
    }

    public final <TContinuationResult> g<TContinuationResult> n(Executor executor, f<TResult, TContinuationResult> fVar) {
        b0 b0Var = new b0();
        this.b.b(new w(executor, fVar, b0Var));
        x();
        return b0Var;
    }

    public final g<TResult> o(Executor executor, c<TResult> cVar) {
        this.b.b(new q(executor, cVar));
        x();
        return this;
    }

    public final void p(Exception exc) {
        r.l(exc, "Exception must not be null");
        synchronized (this.a) {
            v();
            this.c = true;
            this.f3319f = exc;
        }
        this.b.a(this);
    }

    public final void q(TResult tresult) {
        synchronized (this.a) {
            v();
            this.c = true;
            this.f3318e = tresult;
        }
        this.b.a(this);
    }

    public final boolean r(Exception exc) {
        r.l(exc, "Exception must not be null");
        synchronized (this.a) {
            if (this.c) {
                return false;
            }
            this.c = true;
            this.f3319f = exc;
            this.b.a(this);
            return true;
        }
    }

    public final boolean s(TResult tresult) {
        synchronized (this.a) {
            if (this.c) {
                return false;
            }
            this.c = true;
            this.f3318e = tresult;
            this.b.a(this);
            return true;
        }
    }

    public final boolean t() {
        synchronized (this.a) {
            if (this.c) {
                return false;
            }
            this.c = true;
            this.f3317d = true;
            this.b.a(this);
            return true;
        }
    }
}
