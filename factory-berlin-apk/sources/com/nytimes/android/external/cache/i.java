package com.nytimes.android.external.cache;

import com.nytimes.android.external.cache.a;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: Futures */
public final class i {

    /* compiled from: Futures */
    private static abstract class b<I, O, F> extends a.i<O> implements Runnable {

        /* renamed from: n  reason: collision with root package name */
        j<? extends I> f4655n;
        F o;

        b(j<? extends I> jVar, F f2) {
            o.a(jVar);
            this.f4655n = jVar;
            o.a(f2);
            this.o = f2;
        }

        /* access modifiers changed from: package-private */
        public final void o() {
            s(this.f4655n);
            this.f4655n = null;
        }

        public final void run() {
            try {
                j<? extends I> jVar = this.f4655n;
                F f2 = this.o;
                boolean z = true;
                boolean isCancelled = isCancelled() | (jVar == null);
                if (f2 != null) {
                    z = false;
                }
                if (!isCancelled && !z) {
                    this.f4655n = null;
                    this.o = null;
                    try {
                        y(f2, v.a(jVar));
                    } catch (CancellationException unused) {
                        cancel(false);
                    } catch (ExecutionException e2) {
                        w(e2.getCause());
                    }
                }
            } catch (UndeclaredThrowableException e3) {
                w(e3.getCause());
            } catch (Throwable th) {
                w(th);
            }
        }

        /* access modifiers changed from: package-private */
        public abstract void y(F f2, I i2);
    }

    /* compiled from: Futures */
    private static final class c<I, O> extends b<I, O, h<? super I, ? extends O>> {
        c(j<? extends I> jVar, h<? super I, ? extends O> hVar) {
            super(jVar, hVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: z */
        public void y(h<? super I, ? extends O> hVar, I i2) {
            v(hVar.a(i2));
        }
    }

    /* compiled from: Futures */
    private static class d<V> extends e<V> {

        /* renamed from: h  reason: collision with root package name */
        private final Throwable f4656h;

        d(Throwable th) {
            super();
            this.f4656h = th;
        }

        public V get() {
            throw new ExecutionException(this.f4656h);
        }
    }

    /* compiled from: Futures */
    private static abstract class e<V> implements j<V> {

        /* renamed from: g  reason: collision with root package name */
        private static final Logger f4657g = Logger.getLogger(e.class.getName());

        public void a(Runnable runnable, Executor executor) {
            o.b(runnable, "Runnable was null.");
            o.b(executor, "Executor was null.");
            try {
                executor.execute(runnable);
            } catch (RuntimeException e2) {
                Logger logger = f4657g;
                Level level = Level.SEVERE;
                logger.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, e2);
            }
        }

        public boolean cancel(boolean z) {
            return false;
        }

        public abstract V get();

        public V get(long j2, TimeUnit timeUnit) {
            o.a(timeUnit);
            return get();
        }

        public boolean isCancelled() {
            return false;
        }

        public boolean isDone() {
            return true;
        }

        private e() {
        }
    }

    /* compiled from: Futures */
    private static class f<V> extends e<V> {

        /* renamed from: i  reason: collision with root package name */
        static final f<Object> f4658i = new f<>((Object) null);

        /* renamed from: h  reason: collision with root package name */
        private final V f4659h;

        f(V v) {
            super();
            this.f4659h = v;
        }

        public V get() {
            return this.f4659h;
        }
    }

    public static <V> j<V> a(Throwable th) {
        o.a(th);
        return new d(th);
    }

    public static <V> j<V> b(V v) {
        if (v == null) {
            return f.f4658i;
        }
        return new f(v);
    }

    public static <I, O> j<O> c(j<I> jVar, h<? super I, ? extends O> hVar) {
        o.a(hVar);
        c cVar = new c(jVar, hVar);
        jVar.a(cVar, f.INSTANCE);
        return cVar;
    }
}
