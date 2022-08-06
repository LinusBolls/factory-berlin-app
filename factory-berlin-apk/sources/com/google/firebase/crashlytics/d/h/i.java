package com.google.firebase.crashlytics.d.h;

import com.google.android.gms.tasks.g;
import com.google.android.gms.tasks.j;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: CrashlyticsBackgroundWorker */
class i {
    private final ExecutorService a;
    private g<Void> b = j.d(null);
    private final Object c = new Object();
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public ThreadLocal<Boolean> f3918d = new ThreadLocal<>();

    /* compiled from: CrashlyticsBackgroundWorker */
    class a implements Runnable {
        a() {
        }

        public void run() {
            i.this.f3918d.set(Boolean.TRUE);
        }
    }

    /* compiled from: CrashlyticsBackgroundWorker */
    class b implements Callable<Void> {
        final /* synthetic */ Runnable a;

        b(i iVar, Runnable runnable) {
            this.a = runnable;
        }

        /* renamed from: a */
        public Void call() {
            this.a.run();
            return null;
        }
    }

    /* compiled from: CrashlyticsBackgroundWorker */
    class c implements com.google.android.gms.tasks.a<Void, T> {
        final /* synthetic */ Callable a;

        c(i iVar, Callable callable) {
            this.a = callable;
        }

        public T a(g<Void> gVar) {
            return this.a.call();
        }
    }

    /* compiled from: CrashlyticsBackgroundWorker */
    class d implements com.google.android.gms.tasks.a<T, Void> {
        d(i iVar) {
        }

        /* renamed from: b */
        public Void a(g<T> gVar) {
            return null;
        }
    }

    public i(ExecutorService executorService) {
        this.a = executorService;
        executorService.submit(new a());
    }

    private <T> g<Void> d(g<T> gVar) {
        return gVar.f(this.a, new d(this));
    }

    private boolean e() {
        return Boolean.TRUE.equals(this.f3918d.get());
    }

    private <T> com.google.android.gms.tasks.a<Void, T> f(Callable<T> callable) {
        return new c(this, callable);
    }

    public void b() {
        if (!e()) {
            throw new IllegalStateException("Not running on background worker thread as intended.");
        }
    }

    public Executor c() {
        return this.a;
    }

    /* access modifiers changed from: package-private */
    public g<Void> g(Runnable runnable) {
        return h(new b(this, runnable));
    }

    public <T> g<T> h(Callable<T> callable) {
        g<TContinuationResult> f2;
        synchronized (this.c) {
            f2 = this.b.f(this.a, f(callable));
            this.b = d(f2);
        }
        return f2;
    }

    public <T> g<T> i(Callable<g<T>> callable) {
        g<TContinuationResult> g2;
        synchronized (this.c) {
            g2 = this.b.g(this.a, f(callable));
            this.b = d(g2);
        }
        return g2;
    }
}
