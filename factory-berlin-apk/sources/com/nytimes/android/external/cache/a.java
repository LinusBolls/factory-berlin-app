package com.nytimes.android.external.cache;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: AbstractFuture */
public abstract class a<V> implements j<V> {

    /* renamed from: j  reason: collision with root package name */
    private static final boolean f4623j = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: k  reason: collision with root package name */
    private static final Logger f4624k = Logger.getLogger(a.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public static final b f4625l;

    /* renamed from: m  reason: collision with root package name */
    private static final Object f4626m = new Object();
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public volatile Object f4627g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public volatile e f4628h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public volatile j f4629i;

    /* compiled from: AbstractFuture */
    private static abstract class b {
        private b() {
        }

        /* access modifiers changed from: package-private */
        public abstract boolean a(a<?> aVar, e eVar, e eVar2);

        /* access modifiers changed from: package-private */
        public abstract boolean b(a<?> aVar, Object obj, Object obj2);

        /* access modifiers changed from: package-private */
        public abstract boolean c(a<?> aVar, j jVar, j jVar2);

        /* access modifiers changed from: package-private */
        public abstract void d(j jVar, j jVar2);

        /* access modifiers changed from: package-private */
        public abstract void e(j jVar, Thread thread);
    }

    /* compiled from: AbstractFuture */
    private static final class c {
        final boolean a;
        final Throwable b;

        c(boolean z, Throwable th) {
            this.a = z;
            this.b = th;
        }
    }

    /* compiled from: AbstractFuture */
    private static final class d {
        final Throwable a;

        /* renamed from: com.nytimes.android.external.cache.a$d$a  reason: collision with other inner class name */
        /* compiled from: AbstractFuture */
        class C0135a extends Throwable {
            C0135a(String str) {
                super(str);
            }

            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        static {
            new d(new C0135a("Failure occurred while trying to finish a future."));
        }

        d(Throwable th) {
            o.a(th);
            this.a = th;
        }
    }

    /* compiled from: AbstractFuture */
    private static final class e {

        /* renamed from: d  reason: collision with root package name */
        static final e f4630d = new e((Runnable) null, (Executor) null);
        final Runnable a;
        final Executor b;
        e c;

        e(Runnable runnable, Executor executor) {
            this.a = runnable;
            this.b = executor;
        }
    }

    /* compiled from: AbstractFuture */
    private static final class f extends b {
        final AtomicReferenceFieldUpdater<j, Thread> a;
        final AtomicReferenceFieldUpdater<j, j> b;
        final AtomicReferenceFieldUpdater<a, j> c;

        /* renamed from: d  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, e> f4631d;

        /* renamed from: e  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, Object> f4632e;

        f(AtomicReferenceFieldUpdater<j, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<j, j> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<a, j> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<a, e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<a, Object> atomicReferenceFieldUpdater5) {
            super();
            this.a = atomicReferenceFieldUpdater;
            this.b = atomicReferenceFieldUpdater2;
            this.c = atomicReferenceFieldUpdater3;
            this.f4631d = atomicReferenceFieldUpdater4;
            this.f4632e = atomicReferenceFieldUpdater5;
        }

        /* access modifiers changed from: package-private */
        public boolean a(a<?> aVar, e eVar, e eVar2) {
            return this.f4631d.compareAndSet(aVar, eVar, eVar2);
        }

        /* access modifiers changed from: package-private */
        public boolean b(a<?> aVar, Object obj, Object obj2) {
            return this.f4632e.compareAndSet(aVar, obj, obj2);
        }

        /* access modifiers changed from: package-private */
        public boolean c(a<?> aVar, j jVar, j jVar2) {
            return this.c.compareAndSet(aVar, jVar, jVar2);
        }

        /* access modifiers changed from: package-private */
        public void d(j jVar, j jVar2) {
            this.b.lazySet(jVar, jVar2);
        }

        /* access modifiers changed from: package-private */
        public void e(j jVar, Thread thread) {
            this.a.lazySet(jVar, thread);
        }
    }

    /* compiled from: AbstractFuture */
    private final class g implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        final j<? extends V> f4633g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ a f4634h;

        public void run() {
            if (this.f4634h.f4627g == this) {
                boolean unused = this.f4634h.n(this.f4633g, this);
            }
        }
    }

    /* compiled from: AbstractFuture */
    private static final class h extends b {
        private h() {
            super();
        }

        /* access modifiers changed from: package-private */
        public boolean a(a<?> aVar, e eVar, e eVar2) {
            synchronized (aVar) {
                if (aVar.f4628h != eVar) {
                    return false;
                }
                e unused = aVar.f4628h = eVar2;
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        public boolean b(a<?> aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                if (aVar.f4627g != obj) {
                    return false;
                }
                Object unused = aVar.f4627g = obj2;
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        public boolean c(a<?> aVar, j jVar, j jVar2) {
            synchronized (aVar) {
                if (aVar.f4629i != jVar) {
                    return false;
                }
                j unused = aVar.f4629i = jVar2;
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        public void d(j jVar, j jVar2) {
            jVar.b = jVar2;
        }

        /* access modifiers changed from: package-private */
        public void e(j jVar, Thread thread) {
            jVar.a = thread;
        }
    }

    /* compiled from: AbstractFuture */
    public static abstract class i<V> extends a<V> {
        public final void a(Runnable runnable, Executor executor) {
            a.super.a(runnable, executor);
        }

        public final V get() {
            return a.super.get();
        }

        public final boolean isCancelled() {
            return a.super.isCancelled();
        }

        public final boolean isDone() {
            return a.super.isDone();
        }

        public final V get(long j2, TimeUnit timeUnit) {
            return a.super.get(j2, timeUnit);
        }
    }

    /* compiled from: AbstractFuture */
    private static final class j {
        static final j c = new j(false);
        volatile Thread a;
        volatile j b;

        j(boolean z) {
        }

        /* access modifiers changed from: package-private */
        public void a(j jVar) {
            a.f4625l.d(this, jVar);
        }

        /* access modifiers changed from: package-private */
        public void b() {
            Thread thread = this.a;
            if (thread != null) {
                this.a = null;
                LockSupport.unpark(thread);
            }
        }

        j() {
            a.f4625l.e(this, Thread.currentThread());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: com.nytimes.android.external.cache.a$f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: com.nytimes.android.external.cache.a$h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: com.nytimes.android.external.cache.a$f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: com.nytimes.android.external.cache.a$f} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.Class<com.nytimes.android.external.cache.a$j> r0 = com.nytimes.android.external.cache.a.j.class
            java.lang.String r1 = "guava.concurrent.generate_cancellation_cause"
            java.lang.String r2 = "false"
            java.lang.String r1 = java.lang.System.getProperty(r1, r2)
            boolean r1 = java.lang.Boolean.parseBoolean(r1)
            f4623j = r1
            java.lang.Class<com.nytimes.android.external.cache.a> r1 = com.nytimes.android.external.cache.a.class
            java.lang.String r1 = r1.getName()
            java.util.logging.Logger r1 = java.util.logging.Logger.getLogger(r1)
            f4624k = r1
            com.nytimes.android.external.cache.a$f r1 = new com.nytimes.android.external.cache.a$f     // Catch:{ all -> 0x004d }
            java.lang.Class<java.lang.Thread> r2 = java.lang.Thread.class
            java.lang.String r3 = "a"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r3)     // Catch:{ all -> 0x004d }
            java.lang.String r2 = "b"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r0, r2)     // Catch:{ all -> 0x004d }
            java.lang.Class<com.nytimes.android.external.cache.a> r2 = com.nytimes.android.external.cache.a.class
            java.lang.String r5 = "i"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r5)     // Catch:{ all -> 0x004d }
            java.lang.Class<com.nytimes.android.external.cache.a> r0 = com.nytimes.android.external.cache.a.class
            java.lang.Class<com.nytimes.android.external.cache.a$e> r2 = com.nytimes.android.external.cache.a.e.class
            java.lang.String r6 = "h"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r6)     // Catch:{ all -> 0x004d }
            java.lang.Class<com.nytimes.android.external.cache.a> r0 = com.nytimes.android.external.cache.a.class
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            java.lang.String r7 = "g"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r7)     // Catch:{ all -> 0x004d }
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x004d }
            goto L_0x0066
        L_0x004d:
            r0 = move-exception
            java.util.logging.Logger r1 = f4624k
            java.util.logging.Level r2 = java.util.logging.Level.SEVERE
            java.lang.String r3 = "UnsafeAtomicHelper is broken!"
            r1.log(r2, r3)
            java.util.logging.Logger r1 = f4624k
            java.util.logging.Level r2 = java.util.logging.Level.SEVERE
            java.lang.String r3 = "SafeAtomicHelper is broken!"
            r1.log(r2, r3, r0)
            com.nytimes.android.external.cache.a$h r1 = new com.nytimes.android.external.cache.a$h
            r0 = 0
            r1.<init>()
        L_0x0066:
            f4625l = r1
            java.lang.Class<java.util.concurrent.locks.LockSupport> r0 = java.util.concurrent.locks.LockSupport.class
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            f4626m = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.external.cache.a.<clinit>():void");
    }

    protected a() {
    }

    static final CancellationException j(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    private e k() {
        e eVar;
        do {
            eVar = this.f4628h;
        } while (!f4625l.a(this, eVar, e.f4630d));
        return eVar;
    }

    private j l() {
        j jVar;
        do {
            jVar = this.f4629i;
        } while (!f4625l.c(this, jVar, j.c));
        return jVar;
    }

    private void m() {
        for (j l2 = l(); l2 != null; l2 = l2.b) {
            l2.b();
        }
        e k2 = k();
        e eVar = null;
        while (k2 != null) {
            e eVar2 = k2.c;
            k2.c = eVar;
            eVar = k2;
            k2 = eVar2;
        }
        while (eVar != null) {
            p(eVar.a, eVar.b);
            eVar = eVar.c;
        }
        o();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0039 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean n(com.nytimes.android.external.cache.j<? extends V> r3, java.lang.Object r4) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof com.nytimes.android.external.cache.a.i
            r1 = 0
            if (r0 == 0) goto L_0x000a
            com.nytimes.android.external.cache.a r3 = (com.nytimes.android.external.cache.a) r3
            java.lang.Object r3 = r3.f4627g
            goto L_0x002c
        L_0x000a:
            java.lang.Object r3 = com.nytimes.android.external.cache.v.a(r3)     // Catch:{ ExecutionException -> 0x0021, CancellationException -> 0x001a, all -> 0x0013 }
            if (r3 != 0) goto L_0x002c
            java.lang.Object r3 = f4626m     // Catch:{ ExecutionException -> 0x0021, CancellationException -> 0x001a, all -> 0x0013 }
            goto L_0x002c
        L_0x0013:
            r3 = move-exception
            com.nytimes.android.external.cache.a$d r0 = new com.nytimes.android.external.cache.a$d
            r0.<init>(r3)
            goto L_0x002b
        L_0x001a:
            r3 = move-exception
            com.nytimes.android.external.cache.a$c r0 = new com.nytimes.android.external.cache.a$c
            r0.<init>(r1, r3)
            goto L_0x002b
        L_0x0021:
            r3 = move-exception
            com.nytimes.android.external.cache.a$d r0 = new com.nytimes.android.external.cache.a$d
            java.lang.Throwable r3 = r3.getCause()
            r0.<init>(r3)
        L_0x002b:
            r3 = r0
        L_0x002c:
            com.nytimes.android.external.cache.a$b r0 = f4625l
            boolean r3 = r0.b(r2, r4, r3)
            if (r3 == 0) goto L_0x0039
            r2.m()
            r3 = 1
            return r3
        L_0x0039:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.external.cache.a.n(com.nytimes.android.external.cache.j, java.lang.Object):boolean");
    }

    private static void p(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            Logger logger = f4624k;
            Level level = Level.SEVERE;
            logger.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, e2);
        }
    }

    private V q(Object obj) {
        if (obj instanceof c) {
            throw j("Task was cancelled.", ((c) obj).b);
        } else if (obj instanceof d) {
            throw new ExecutionException(((d) obj).a);
        } else if (obj == f4626m) {
            return null;
        } else {
            return obj;
        }
    }

    private Throwable t() {
        return new CancellationException("Future.cancel() was called.");
    }

    private void u(j jVar) {
        jVar.a = null;
        while (true) {
            j jVar2 = this.f4629i;
            if (jVar2 != j.c) {
                j jVar3 = null;
                while (jVar2 != null) {
                    j jVar4 = jVar2.b;
                    if (jVar2.a != null) {
                        jVar3 = jVar2;
                    } else if (jVar3 != null) {
                        jVar3.b = jVar4;
                        if (jVar3.a == null) {
                        }
                    } else if (!f4625l.c(this, jVar2, jVar4)) {
                    }
                    jVar2 = jVar4;
                }
                return;
            }
            return;
        }
    }

    public void a(Runnable runnable, Executor executor) {
        o.b(runnable, "Runnable was null.");
        o.b(executor, "Executor was null.");
        e eVar = this.f4628h;
        if (eVar != e.f4630d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.c = eVar;
                if (!f4625l.a(this, eVar, eVar2)) {
                    eVar = this.f4628h;
                } else {
                    return;
                }
            } while (eVar != e.f4630d);
        }
        p(runnable, executor);
    }

    public boolean cancel(boolean z) {
        Object obj = this.f4627g;
        if (!(obj == null) && !(obj instanceof g)) {
            return false;
        }
        c cVar = new c(z, f4623j ? t() : null);
        while (!f4625l.b(this, obj, cVar)) {
            obj = this.f4627g;
            if (!(obj instanceof g)) {
            }
        }
        if (z) {
            r();
        }
        m();
        if (obj instanceof g) {
            ((g) obj).f4633g.cancel(z);
        }
        return true;
        return false;
    }

    public V get(long j2, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j2);
        if (!Thread.interrupted()) {
            Object obj = this.f4627g;
            if ((obj != null) && (!(obj instanceof g))) {
                return q(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0;
            if (nanos >= 1000) {
                j jVar = this.f4629i;
                if (jVar != j.c) {
                    j jVar2 = new j();
                    do {
                        jVar2.a(jVar);
                        if (f4625l.c(this, jVar, jVar2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f4627g;
                                    if ((obj2 != null) && (!(obj2 instanceof g))) {
                                        return q(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    u(jVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            u(jVar2);
                        } else {
                            jVar = this.f4629i;
                        }
                    } while (jVar != j.c);
                }
                return q(this.f4627g);
            }
            while (nanos > 0) {
                Object obj3 = this.f4627g;
                if ((obj3 != null) && (!(obj3 instanceof g))) {
                    return q(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            throw new TimeoutException();
        }
        throw new InterruptedException();
    }

    public boolean isCancelled() {
        return this.f4627g instanceof c;
    }

    public boolean isDone() {
        Object obj = this.f4627g;
        return (!(obj instanceof g)) & (obj != null);
    }

    /* access modifiers changed from: package-private */
    public void o() {
    }

    /* access modifiers changed from: protected */
    public void r() {
    }

    /* access modifiers changed from: package-private */
    public final void s(Future<?> future) {
        if ((future != null) && isCancelled()) {
            future.cancel(x());
        }
    }

    /* access modifiers changed from: protected */
    public boolean v(V v) {
        if (v == null) {
            v = f4626m;
        }
        if (!f4625l.b(this, (Object) null, v)) {
            return false;
        }
        m();
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean w(Throwable th) {
        o.a(th);
        if (!f4625l.b(this, (Object) null, new d(th))) {
            return false;
        }
        m();
        return true;
    }

    /* access modifiers changed from: protected */
    public final boolean x() {
        Object obj = this.f4627g;
        return (obj instanceof c) && ((c) obj).a;
    }

    public V get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f4627g;
            if ((obj2 != null) && (!(obj2 instanceof g))) {
                return q(obj2);
            }
            j jVar = this.f4629i;
            if (jVar != j.c) {
                j jVar2 = new j();
                do {
                    jVar2.a(jVar);
                    if (f4625l.c(this, jVar, jVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f4627g;
                            } else {
                                u(jVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof g))));
                        return q(obj);
                    }
                    jVar = this.f4629i;
                } while (jVar != j.c);
            }
            return q(this.f4627g);
        }
        throw new InterruptedException();
    }
}
