package androidx.work.impl.utils.j;

import de.baimos.blueid.sdk.metrics.AndroidSdkMetrics;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: AbstractFuture */
public abstract class a<V> implements g.b.b.a.a.a<V> {

    /* renamed from: j  reason: collision with root package name */
    static final boolean f1764j = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: k  reason: collision with root package name */
    private static final Logger f1765k = Logger.getLogger(a.class.getName());

    /* renamed from: l  reason: collision with root package name */
    static final b f1766l;

    /* renamed from: m  reason: collision with root package name */
    private static final Object f1767m = new Object();

    /* renamed from: g  reason: collision with root package name */
    volatile Object f1768g;

    /* renamed from: h  reason: collision with root package name */
    volatile e f1769h;

    /* renamed from: i  reason: collision with root package name */
    volatile i f1770i;

    /* compiled from: AbstractFuture */
    private static abstract class b {
        private b() {
        }

        /* access modifiers changed from: package-private */
        public abstract boolean a(a<?> aVar, e eVar, e eVar2);

        /* access modifiers changed from: package-private */
        public abstract boolean b(a<?> aVar, Object obj, Object obj2);

        /* access modifiers changed from: package-private */
        public abstract boolean c(a<?> aVar, i iVar, i iVar2);

        /* access modifiers changed from: package-private */
        public abstract void d(i iVar, i iVar2);

        /* access modifiers changed from: package-private */
        public abstract void e(i iVar, Thread thread);
    }

    /* compiled from: AbstractFuture */
    private static final class c {
        static final c c;

        /* renamed from: d  reason: collision with root package name */
        static final c f1771d;
        final boolean a;
        final Throwable b;

        static {
            if (a.f1764j) {
                f1771d = null;
                c = null;
                return;
            }
            f1771d = new c(false, (Throwable) null);
            c = new c(true, (Throwable) null);
        }

        c(boolean z, Throwable th) {
            this.a = z;
            this.b = th;
        }
    }

    /* compiled from: AbstractFuture */
    private static final class d {
        static final d b = new d(new C0047a("Failure occurred while trying to finish a future."));
        final Throwable a;

        /* renamed from: androidx.work.impl.utils.j.a$d$a  reason: collision with other inner class name */
        /* compiled from: AbstractFuture */
        static class C0047a extends Throwable {
            C0047a(String str) {
                super(str);
            }

            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        d(Throwable th) {
            a.e(th);
            this.a = th;
        }
    }

    /* compiled from: AbstractFuture */
    private static final class e {

        /* renamed from: d  reason: collision with root package name */
        static final e f1772d = new e((Runnable) null, (Executor) null);
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
        final AtomicReferenceFieldUpdater<i, Thread> a;
        final AtomicReferenceFieldUpdater<i, i> b;
        final AtomicReferenceFieldUpdater<a, i> c;

        /* renamed from: d  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, e> f1773d;

        /* renamed from: e  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, Object> f1774e;

        f(AtomicReferenceFieldUpdater<i, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<i, i> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<a, i> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<a, e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<a, Object> atomicReferenceFieldUpdater5) {
            super();
            this.a = atomicReferenceFieldUpdater;
            this.b = atomicReferenceFieldUpdater2;
            this.c = atomicReferenceFieldUpdater3;
            this.f1773d = atomicReferenceFieldUpdater4;
            this.f1774e = atomicReferenceFieldUpdater5;
        }

        /* access modifiers changed from: package-private */
        public boolean a(a<?> aVar, e eVar, e eVar2) {
            return this.f1773d.compareAndSet(aVar, eVar, eVar2);
        }

        /* access modifiers changed from: package-private */
        public boolean b(a<?> aVar, Object obj, Object obj2) {
            return this.f1774e.compareAndSet(aVar, obj, obj2);
        }

        /* access modifiers changed from: package-private */
        public boolean c(a<?> aVar, i iVar, i iVar2) {
            return this.c.compareAndSet(aVar, iVar, iVar2);
        }

        /* access modifiers changed from: package-private */
        public void d(i iVar, i iVar2) {
            this.b.lazySet(iVar, iVar2);
        }

        /* access modifiers changed from: package-private */
        public void e(i iVar, Thread thread) {
            this.a.lazySet(iVar, thread);
        }
    }

    /* compiled from: AbstractFuture */
    private static final class g<V> implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        final a<V> f1775g;

        /* renamed from: h  reason: collision with root package name */
        final g.b.b.a.a.a<? extends V> f1776h;

        g(a<V> aVar, g.b.b.a.a.a<? extends V> aVar2) {
            this.f1775g = aVar;
            this.f1776h = aVar2;
        }

        public void run() {
            if (this.f1775g.f1768g == this) {
                if (a.f1766l.b(this.f1775g, this, a.j(this.f1776h))) {
                    a.g(this.f1775g);
                }
            }
        }
    }

    /* compiled from: AbstractFuture */
    private static final class h extends b {
        h() {
            super();
        }

        /* access modifiers changed from: package-private */
        public boolean a(a<?> aVar, e eVar, e eVar2) {
            synchronized (aVar) {
                if (aVar.f1769h != eVar) {
                    return false;
                }
                aVar.f1769h = eVar2;
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        public boolean b(a<?> aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                if (aVar.f1768g != obj) {
                    return false;
                }
                aVar.f1768g = obj2;
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        public boolean c(a<?> aVar, i iVar, i iVar2) {
            synchronized (aVar) {
                if (aVar.f1770i != iVar) {
                    return false;
                }
                aVar.f1770i = iVar2;
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        public void d(i iVar, i iVar2) {
            iVar.b = iVar2;
        }

        /* access modifiers changed from: package-private */
        public void e(i iVar, Thread thread) {
            iVar.a = thread;
        }
    }

    /* compiled from: AbstractFuture */
    private static final class i {
        static final i c = new i(false);
        volatile Thread a;
        volatile i b;

        i(boolean z) {
        }

        /* access modifiers changed from: package-private */
        public void a(i iVar) {
            a.f1766l.d(this, iVar);
        }

        /* access modifiers changed from: package-private */
        public void b() {
            Thread thread = this.a;
            if (thread != null) {
                this.a = null;
                LockSupport.unpark(thread);
            }
        }

        i() {
            a.f1766l.e(this, Thread.currentThread());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: androidx.work.impl.utils.j.a$f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: androidx.work.impl.utils.j.a$h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: androidx.work.impl.utils.j.a$f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: androidx.work.impl.utils.j.a$f} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.Class<androidx.work.impl.utils.j.a$i> r0 = androidx.work.impl.utils.j.a.i.class
            java.lang.String r1 = "guava.concurrent.generate_cancellation_cause"
            java.lang.String r2 = "false"
            java.lang.String r1 = java.lang.System.getProperty(r1, r2)
            boolean r1 = java.lang.Boolean.parseBoolean(r1)
            f1764j = r1
            java.lang.Class<androidx.work.impl.utils.j.a> r1 = androidx.work.impl.utils.j.a.class
            java.lang.String r1 = r1.getName()
            java.util.logging.Logger r1 = java.util.logging.Logger.getLogger(r1)
            f1765k = r1
            androidx.work.impl.utils.j.a$f r1 = new androidx.work.impl.utils.j.a$f     // Catch:{ all -> 0x004e }
            java.lang.Class<java.lang.Thread> r2 = java.lang.Thread.class
            java.lang.String r3 = "a"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r3)     // Catch:{ all -> 0x004e }
            java.lang.String r2 = "b"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r0, r2)     // Catch:{ all -> 0x004e }
            java.lang.Class<androidx.work.impl.utils.j.a> r2 = androidx.work.impl.utils.j.a.class
            java.lang.String r5 = "i"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r5)     // Catch:{ all -> 0x004e }
            java.lang.Class<androidx.work.impl.utils.j.a> r0 = androidx.work.impl.utils.j.a.class
            java.lang.Class<androidx.work.impl.utils.j.a$e> r2 = androidx.work.impl.utils.j.a.e.class
            java.lang.String r6 = "h"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r6)     // Catch:{ all -> 0x004e }
            java.lang.Class<androidx.work.impl.utils.j.a> r0 = androidx.work.impl.utils.j.a.class
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            java.lang.String r7 = "g"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r7)     // Catch:{ all -> 0x004e }
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x004e }
            r0 = 0
            goto L_0x0054
        L_0x004e:
            r0 = move-exception
            androidx.work.impl.utils.j.a$h r1 = new androidx.work.impl.utils.j.a$h
            r1.<init>()
        L_0x0054:
            f1766l = r1
            java.lang.Class<java.util.concurrent.locks.LockSupport> r1 = java.util.concurrent.locks.LockSupport.class
            if (r0 == 0) goto L_0x0063
            java.util.logging.Logger r1 = f1765k
            java.util.logging.Level r2 = java.util.logging.Level.SEVERE
            java.lang.String r3 = "SafeAtomicHelper is broken!"
            r1.log(r2, r3, r0)
        L_0x0063:
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            f1767m = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.j.a.<clinit>():void");
    }

    protected a() {
    }

    private void b(StringBuilder sb) {
        try {
            Object k2 = k(this);
            sb.append("SUCCESS, result=[");
            sb.append(s(k2));
            sb.append("]");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e3) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e3.getClass());
            sb.append(" thrown from get()]");
        }
    }

    private static CancellationException d(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    static <T> T e(T t) {
        if (t != null) {
            return t;
        }
        throw null;
    }

    private e f(e eVar) {
        e eVar2;
        do {
            eVar2 = this.f1769h;
        } while (!f1766l.a(this, eVar2, e.f1772d));
        e eVar3 = eVar2;
        e eVar4 = eVar;
        e eVar5 = eVar3;
        while (eVar5 != null) {
            e eVar6 = eVar5.c;
            eVar5.c = eVar4;
            eVar4 = eVar5;
            eVar5 = eVar6;
        }
        return eVar4;
    }

    static void g(a<?> aVar) {
        e eVar = null;
        a<V> aVar2 = aVar;
        while (true) {
            aVar2.n();
            aVar2.c();
            e f2 = aVar2.f(eVar);
            while (true) {
                if (f2 != null) {
                    eVar = f2.c;
                    Runnable runnable = f2.a;
                    if (runnable instanceof g) {
                        g gVar = (g) runnable;
                        a<V> aVar3 = gVar.f1775g;
                        if (aVar3.f1768g == gVar) {
                            if (f1766l.b(aVar3, gVar, j(gVar.f1776h))) {
                                aVar2 = aVar3;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        h(runnable, f2.b);
                    }
                    f2 = eVar;
                } else {
                    return;
                }
            }
        }
    }

    private static void h(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            Logger logger = f1765k;
            Level level = Level.SEVERE;
            logger.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, e2);
        }
    }

    private V i(Object obj) {
        if (obj instanceof c) {
            throw d("Task was cancelled.", ((c) obj).b);
        } else if (obj instanceof d) {
            throw new ExecutionException(((d) obj).a);
        } else if (obj == f1767m) {
            return null;
        } else {
            return obj;
        }
    }

    static Object j(g.b.b.a.a.a<?> aVar) {
        if (aVar instanceof a) {
            Object obj = ((a) aVar).f1768g;
            if (!(obj instanceof c)) {
                return obj;
            }
            c cVar = (c) obj;
            if (cVar.a) {
                return cVar.b != null ? new c(false, cVar.b) : c.f1771d;
            }
            return obj;
        }
        boolean isCancelled = aVar.isCancelled();
        if ((!f1764j) && isCancelled) {
            return c.f1771d;
        }
        try {
            Object k2 = k(aVar);
            return k2 == null ? f1767m : k2;
        } catch (ExecutionException e2) {
            return new d(e2.getCause());
        } catch (CancellationException e3) {
            if (isCancelled) {
                return new c(false, e3);
            }
            return new d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + aVar, e3));
        } catch (Throwable th) {
            return new d(th);
        }
    }

    private static <V> V k(Future<V> future) {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v;
    }

    private void n() {
        i iVar;
        do {
            iVar = this.f1770i;
        } while (!f1766l.c(this, iVar, i.c));
        while (iVar != null) {
            iVar.b();
            iVar = iVar.b;
        }
    }

    private void o(i iVar) {
        iVar.a = null;
        while (true) {
            i iVar2 = this.f1770i;
            if (iVar2 != i.c) {
                i iVar3 = null;
                while (iVar2 != null) {
                    i iVar4 = iVar2.b;
                    if (iVar2.a != null) {
                        iVar3 = iVar2;
                    } else if (iVar3 != null) {
                        iVar3.b = iVar4;
                        if (iVar3.a == null) {
                        }
                    } else if (!f1766l.c(this, iVar2, iVar4)) {
                    }
                    iVar2 = iVar4;
                }
                return;
            }
            return;
        }
    }

    private String s(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    public final void a(Runnable runnable, Executor executor) {
        e(runnable);
        e(executor);
        e eVar = this.f1769h;
        if (eVar != e.f1772d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.c = eVar;
                if (!f1766l.a(this, eVar, eVar2)) {
                    eVar = this.f1769h;
                } else {
                    return;
                }
            } while (eVar != e.f1772d);
        }
        h(runnable, executor);
    }

    /* access modifiers changed from: protected */
    public void c() {
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [java.util.concurrent.Future, g.b.b.a.a.a<? extends V>] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f1768g
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0008
            r3 = 1
            goto L_0x0009
        L_0x0008:
            r3 = 0
        L_0x0009:
            boolean r4 = r0 instanceof androidx.work.impl.utils.j.a.g
            r3 = r3 | r4
            if (r3 == 0) goto L_0x0061
            boolean r3 = f1764j
            if (r3 == 0) goto L_0x001f
            androidx.work.impl.utils.j.a$c r3 = new androidx.work.impl.utils.j.a$c
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r3.<init>(r8, r4)
            goto L_0x0026
        L_0x001f:
            if (r8 == 0) goto L_0x0024
            androidx.work.impl.utils.j.a$c r3 = androidx.work.impl.utils.j.a.c.c
            goto L_0x0026
        L_0x0024:
            androidx.work.impl.utils.j.a$c r3 = androidx.work.impl.utils.j.a.c.f1771d
        L_0x0026:
            r5 = 0
            r4 = r7
        L_0x0028:
            androidx.work.impl.utils.j.a$b r6 = f1766l
            boolean r6 = r6.b(r4, r0, r3)
            if (r6 == 0) goto L_0x0059
            if (r8 == 0) goto L_0x0035
            r4.l()
        L_0x0035:
            g(r4)
            boolean r4 = r0 instanceof androidx.work.impl.utils.j.a.g
            if (r4 == 0) goto L_0x0062
            androidx.work.impl.utils.j.a$g r0 = (androidx.work.impl.utils.j.a.g) r0
            g.b.b.a.a.a<? extends V> r0 = r0.f1776h
            boolean r4 = r0 instanceof androidx.work.impl.utils.j.a
            if (r4 == 0) goto L_0x0055
            r4 = r0
            androidx.work.impl.utils.j.a r4 = (androidx.work.impl.utils.j.a) r4
            java.lang.Object r0 = r4.f1768g
            if (r0 != 0) goto L_0x004d
            r5 = 1
            goto L_0x004e
        L_0x004d:
            r5 = 0
        L_0x004e:
            boolean r6 = r0 instanceof androidx.work.impl.utils.j.a.g
            r5 = r5 | r6
            if (r5 == 0) goto L_0x0062
            r5 = 1
            goto L_0x0028
        L_0x0055:
            r0.cancel(r8)
            goto L_0x0062
        L_0x0059:
            java.lang.Object r0 = r4.f1768g
            boolean r6 = r0 instanceof androidx.work.impl.utils.j.a.g
            if (r6 != 0) goto L_0x0028
            r1 = r5
            goto L_0x0062
        L_0x0061:
            r1 = 0
        L_0x0062:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.j.a.cancel(boolean):boolean");
    }

    public final V get(long j2, TimeUnit timeUnit) {
        long j3 = j2;
        TimeUnit timeUnit2 = timeUnit;
        long nanos = timeUnit2.toNanos(j3);
        if (!Thread.interrupted()) {
            Object obj = this.f1768g;
            if ((obj != null) && (!(obj instanceof g))) {
                return i(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0;
            if (nanos >= 1000) {
                i iVar = this.f1770i;
                if (iVar != i.c) {
                    i iVar2 = new i();
                    do {
                        iVar2.a(iVar);
                        if (f1766l.c(this, iVar, iVar2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f1768g;
                                    if ((obj2 != null) && (!(obj2 instanceof g))) {
                                        return i(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    o(iVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            o(iVar2);
                        } else {
                            iVar = this.f1770i;
                        }
                    } while (iVar != i.c);
                }
                return i(this.f1768g);
            }
            while (nanos > 0) {
                Object obj3 = this.f1768g;
                if ((obj3 != null) && (!(obj3 instanceof g))) {
                    return i(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String aVar = toString();
            String lowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
            String str = "Waited " + j3 + " " + timeUnit.toString().toLowerCase(Locale.ROOT);
            if (nanos + 1000 < 0) {
                String str2 = str + " (plus ";
                long j4 = -nanos;
                long convert = timeUnit2.convert(j4, TimeUnit.NANOSECONDS);
                long nanos2 = j4 - timeUnit2.toNanos(convert);
                int i2 = (convert > 0 ? 1 : (convert == 0 ? 0 : -1));
                boolean z = i2 == 0 || nanos2 > 1000;
                if (i2 > 0) {
                    String str3 = str2 + convert + " " + lowerCase;
                    if (z) {
                        str3 = str3 + AndroidSdkMetrics.SEPARATOR;
                    }
                    str2 = str3 + " ";
                }
                if (z) {
                    str2 = str2 + nanos2 + " nanoseconds ";
                }
                str = str2 + "delay)";
            }
            if (isDone()) {
                throw new TimeoutException(str + " but future completed as timeout expired");
            }
            throw new TimeoutException(str + " for " + aVar);
        }
        throw new InterruptedException();
    }

    public final boolean isCancelled() {
        return this.f1768g instanceof c;
    }

    public final boolean isDone() {
        Object obj = this.f1768g;
        return (!(obj instanceof g)) & (obj != null);
    }

    /* access modifiers changed from: protected */
    public void l() {
    }

    /* access modifiers changed from: protected */
    public String m() {
        Object obj = this.f1768g;
        if (obj instanceof g) {
            return "setFuture=[" + s(((g) obj).f1776h) + "]";
        } else if (!(this instanceof ScheduledFuture)) {
            return null;
        } else {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        }
    }

    /* access modifiers changed from: protected */
    public boolean p(V v) {
        if (v == null) {
            v = f1767m;
        }
        if (!f1766l.b(this, (Object) null, v)) {
            return false;
        }
        g(this);
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean q(Throwable th) {
        e(th);
        if (!f1766l.b(this, (Object) null, new d(th))) {
            return false;
        }
        g(this);
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean r(g.b.b.a.a.a<? extends V> aVar) {
        g gVar;
        d dVar;
        e(aVar);
        Object obj = this.f1768g;
        if (obj == null) {
            if (aVar.isDone()) {
                if (!f1766l.b(this, (Object) null, j(aVar))) {
                    return false;
                }
                g(this);
                return true;
            }
            gVar = new g(this, aVar);
            if (f1766l.b(this, (Object) null, gVar)) {
                try {
                    aVar.a(gVar, b.INSTANCE);
                } catch (Throwable unused) {
                    dVar = d.b;
                }
                return true;
            }
            obj = this.f1768g;
        }
        if (obj instanceof c) {
            aVar.cancel(((c) obj).a);
        }
        return false;
        f1766l.b(this, gVar, dVar);
        return true;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            b(sb);
        } else {
            try {
                str = m();
            } catch (RuntimeException e2) {
                str = "Exception thrown from implementation: " + e2.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                b(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public final V get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f1768g;
            if ((obj2 != null) && (!(obj2 instanceof g))) {
                return i(obj2);
            }
            i iVar = this.f1770i;
            if (iVar != i.c) {
                i iVar2 = new i();
                do {
                    iVar2.a(iVar);
                    if (f1766l.c(this, iVar, iVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f1768g;
                            } else {
                                o(iVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof g))));
                        return i(obj);
                    }
                    iVar = this.f1770i;
                } while (iVar != i.c);
            }
            return i(this.f1768g);
        }
        throw new InterruptedException();
    }
}
