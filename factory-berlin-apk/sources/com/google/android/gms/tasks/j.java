package com.google.android.gms.tasks;

import com.google.android.gms.common.internal.r;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class j {

    interface b extends b, d, e<Object> {
    }

    private static final class c implements b {
        private final Object a = new Object();
        private final int b;
        private final b0<Void> c;

        /* renamed from: d  reason: collision with root package name */
        private int f3323d;

        /* renamed from: e  reason: collision with root package name */
        private int f3324e;

        /* renamed from: f  reason: collision with root package name */
        private int f3325f;

        /* renamed from: g  reason: collision with root package name */
        private Exception f3326g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f3327h;

        public c(int i2, b0<Void> b0Var) {
            this.b = i2;
            this.c = b0Var;
        }

        private final void a() {
            if (this.f3323d + this.f3324e + this.f3325f != this.b) {
                return;
            }
            if (this.f3326g != null) {
                b0<Void> b0Var = this.c;
                int i2 = this.f3324e;
                int i3 = this.b;
                StringBuilder sb = new StringBuilder(54);
                sb.append(i2);
                sb.append(" out of ");
                sb.append(i3);
                sb.append(" underlying tasks failed");
                b0Var.p(new ExecutionException(sb.toString(), this.f3326g));
            } else if (this.f3327h) {
                this.c.t();
            } else {
                this.c.q(null);
            }
        }

        public final void b() {
            synchronized (this.a) {
                this.f3325f++;
                this.f3327h = true;
                a();
            }
        }

        public final void c(Object obj) {
            synchronized (this.a) {
                this.f3323d++;
                a();
            }
        }

        public final void d(Exception exc) {
            synchronized (this.a) {
                this.f3324e++;
                this.f3326g = exc;
                a();
            }
        }
    }

    public static <TResult> TResult a(g<TResult> gVar, long j2, TimeUnit timeUnit) {
        r.i();
        r.l(gVar, "Task must not be null");
        r.l(timeUnit, "TimeUnit must not be null");
        if (gVar.k()) {
            return h(gVar);
        }
        a aVar = new a((c0) null);
        g(gVar, aVar);
        if (aVar.a(j2, timeUnit)) {
            return h(gVar);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    public static <TResult> g<TResult> b(Executor executor, Callable<TResult> callable) {
        r.l(executor, "Executor must not be null");
        r.l(callable, "Callback must not be null");
        b0 b0Var = new b0();
        executor.execute(new c0(b0Var, callable));
        return b0Var;
    }

    public static <TResult> g<TResult> c(Exception exc) {
        b0 b0Var = new b0();
        b0Var.p(exc);
        return b0Var;
    }

    public static <TResult> g<TResult> d(TResult tresult) {
        b0 b0Var = new b0();
        b0Var.q(tresult);
        return b0Var;
    }

    public static g<Void> e(Collection<? extends g<?>> collection) {
        if (collection.isEmpty()) {
            return d((Object) null);
        }
        for (g gVar : collection) {
            if (gVar == null) {
                throw new NullPointerException("null tasks are not accepted");
            }
        }
        b0 b0Var = new b0();
        c cVar = new c(collection.size(), b0Var);
        for (g g2 : collection) {
            g(g2, cVar);
        }
        return b0Var;
    }

    public static g<Void> f(g<?>... gVarArr) {
        if (gVarArr.length == 0) {
            return d((Object) null);
        }
        return e(Arrays.asList(gVarArr));
    }

    private static void g(g<?> gVar, b bVar) {
        gVar.d(i.b, bVar);
        gVar.c(i.b, bVar);
        gVar.a(i.b, bVar);
    }

    private static <TResult> TResult h(g<TResult> gVar) {
        if (gVar.l()) {
            return gVar.i();
        }
        if (gVar.j()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(gVar.h());
    }

    private static final class a implements b {
        private final CountDownLatch a;

        private a() {
            this.a = new CountDownLatch(1);
        }

        public final boolean a(long j2, TimeUnit timeUnit) {
            return this.a.await(j2, timeUnit);
        }

        public final void b() {
            this.a.countDown();
        }

        public final void c(Object obj) {
            this.a.countDown();
        }

        public final void d(Exception exc) {
            this.a.countDown();
        }

        /* synthetic */ a(c0 c0Var) {
            this();
        }
    }
}
