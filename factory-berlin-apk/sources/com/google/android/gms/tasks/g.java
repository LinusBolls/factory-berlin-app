package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

public abstract class g<TResult> {
    public g<TResult> a(Executor executor, b bVar) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    public g<TResult> b(c<TResult> cVar) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public abstract g<TResult> c(Executor executor, d dVar);

    public abstract g<TResult> d(Executor executor, e<? super TResult> eVar);

    public <TContinuationResult> g<TContinuationResult> e(a<TResult, TContinuationResult> aVar) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public <TContinuationResult> g<TContinuationResult> f(Executor executor, a<TResult, TContinuationResult> aVar) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public <TContinuationResult> g<TContinuationResult> g(Executor executor, a<TResult, g<TContinuationResult>> aVar) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    public abstract Exception h();

    public abstract TResult i();

    public abstract boolean j();

    public abstract boolean k();

    public abstract boolean l();

    public <TContinuationResult> g<TContinuationResult> m(f<TResult, TContinuationResult> fVar) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }

    public <TContinuationResult> g<TContinuationResult> n(Executor executor, f<TResult, TContinuationResult> fVar) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }
}
