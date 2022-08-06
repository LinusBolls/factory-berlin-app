package k.h0.e;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.k;
import kotlin.x;

/* compiled from: TaskRunner.kt */
public final class e {

    /* renamed from: h  reason: collision with root package name */
    public static final e f10412h = new e(new c(k.h0.b.J(k.h0.b.f10366h + " TaskRunner", true)));
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public static final Logger f10413i;

    /* renamed from: j  reason: collision with root package name */
    public static final b f10414j = new b((DefaultConstructorMarker) null);
    private int a = 10000;
    private boolean b;
    private long c;

    /* renamed from: d  reason: collision with root package name */
    private final List<d> f10415d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private final List<d> f10416e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private final Runnable f10417f = new d(this);

    /* renamed from: g  reason: collision with root package name */
    private final a f10418g;

    /* compiled from: TaskRunner.kt */
    public interface a {
        long a();

        void b(e eVar);

        void c(e eVar, long j2);

        void execute(Runnable runnable);
    }

    /* compiled from: TaskRunner.kt */
    public static final class b {
        private b() {
        }

        public final Logger a() {
            return e.f10413i;
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: TaskRunner.kt */
    public static final class c implements a {
        private final ThreadPoolExecutor a;

        public c(ThreadFactory threadFactory) {
            k.f(threadFactory, "threadFactory");
            this.a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
        }

        public long a() {
            return System.nanoTime();
        }

        public void b(e eVar) {
            k.f(eVar, "taskRunner");
            eVar.notify();
        }

        public void c(e eVar, long j2) {
            k.f(eVar, "taskRunner");
            long j3 = j2 / 1000000;
            long j4 = j2 - (1000000 * j3);
            if (j3 > 0 || j2 > 0) {
                eVar.wait(j3, (int) j4);
            }
        }

        public void execute(Runnable runnable) {
            k.f(runnable, "runnable");
            this.a.execute(runnable);
        }
    }

    /* compiled from: TaskRunner.kt */
    public static final class d implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ e f10419g;

        d(e eVar) {
            this.f10419g = eVar;
        }

        public void run() {
            a d2;
            while (true) {
                synchronized (this.f10419g) {
                    d2 = this.f10419g.d();
                }
                if (d2 != null) {
                    d d3 = d2.d();
                    if (d3 != null) {
                        long j2 = -1;
                        boolean isLoggable = e.f10414j.a().isLoggable(Level.FINE);
                        if (isLoggable) {
                            j2 = d3.h().g().a();
                            b.c(d2, d3, "starting");
                        }
                        try {
                            this.f10419g.j(d2);
                            x xVar = x.a;
                            if (isLoggable) {
                                long a = d3.h().g().a() - j2;
                                b.c(d2, d3, "finished run in " + b.b(a));
                            }
                        } catch (Throwable th) {
                            if (isLoggable) {
                                long a2 = d3.h().g().a() - j2;
                                b.c(d2, d3, "failed a run in " + b.b(a2));
                            }
                            throw th;
                        }
                    } else {
                        k.m();
                        throw null;
                    }
                } else {
                    return;
                }
            }
        }
    }

    static {
        Logger logger = Logger.getLogger(e.class.getName());
        k.b(logger, "Logger.getLogger(TaskRunner::class.java.name)");
        f10413i = logger;
    }

    public e(a aVar) {
        k.f(aVar, "backend");
        this.f10418g = aVar;
    }

    private final void c(a aVar, long j2) {
        if (!k.h0.b.f10365g || Thread.holdsLock(this)) {
            d d2 = aVar.d();
            if (d2 != null) {
                if (d2.c() == aVar) {
                    boolean d3 = d2.d();
                    d2.m(false);
                    d2.l((a) null);
                    this.f10415d.remove(d2);
                    if (j2 != -1 && !d3 && !d2.g()) {
                        d2.k(aVar, j2, true);
                    }
                    if (!d2.e().isEmpty()) {
                        this.f10416e.add(d2);
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("Check failed.".toString());
            }
            k.m();
            throw null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Thread ");
        Thread currentThread = Thread.currentThread();
        k.b(currentThread, "Thread.currentThread()");
        sb.append(currentThread.getName());
        sb.append(" MUST hold lock on ");
        sb.append(this);
        throw new AssertionError(sb.toString());
    }

    private final void e(a aVar) {
        if (!k.h0.b.f10365g || Thread.holdsLock(this)) {
            aVar.g(-1);
            d d2 = aVar.d();
            if (d2 != null) {
                d2.e().remove(aVar);
                this.f10416e.remove(d2);
                d2.l(aVar);
                this.f10415d.add(d2);
                return;
            }
            k.m();
            throw null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Thread ");
        Thread currentThread = Thread.currentThread();
        k.b(currentThread, "Thread.currentThread()");
        sb.append(currentThread.getName());
        sb.append(" MUST hold lock on ");
        sb.append(this);
        throw new AssertionError(sb.toString());
    }

    /* access modifiers changed from: private */
    public final void j(a aVar) {
        if (!k.h0.b.f10365g || !Thread.holdsLock(this)) {
            Thread currentThread = Thread.currentThread();
            k.b(currentThread, "currentThread");
            String name = currentThread.getName();
            currentThread.setName(aVar.b());
            try {
                long f2 = aVar.f();
                synchronized (this) {
                    c(aVar, f2);
                    x xVar = x.a;
                }
                currentThread.setName(name);
            } catch (Throwable th) {
                synchronized (this) {
                    c(aVar, -1);
                    x xVar2 = x.a;
                    currentThread.setName(name);
                    throw th;
                }
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread currentThread2 = Thread.currentThread();
            k.b(currentThread2, "Thread.currentThread()");
            sb.append(currentThread2.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:34|35|36|39|40|47|37) */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c1, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c7, code lost:
        r15.b = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c9, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00c3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final k.h0.e.a d() {
        /*
            r15 = this;
            boolean r0 = k.h0.b.f10365g
            if (r0 == 0) goto L_0x0037
            boolean r0 = java.lang.Thread.holdsLock(r15)
            if (r0 == 0) goto L_0x000b
            goto L_0x0037
        L_0x000b:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Thread "
            r1.append(r2)
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            java.lang.String r3 = "Thread.currentThread()"
            kotlin.jvm.internal.k.b(r2, r3)
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            java.lang.String r2 = " MUST hold lock on "
            r1.append(r2)
            r1.append(r15)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0037:
            java.util.List<k.h0.e.d> r0 = r15.f10416e
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 == 0) goto L_0x0041
            return r1
        L_0x0041:
            k.h0.e.e$a r0 = r15.f10418g
            long r2 = r0.a()
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.util.List<k.h0.e.d> r0 = r15.f10416e
            java.util.Iterator r0 = r0.iterator()
            r6 = r1
        L_0x0053:
            boolean r7 = r0.hasNext()
            r8 = 1
            r9 = 0
            if (r7 == 0) goto L_0x0085
            java.lang.Object r7 = r0.next()
            k.h0.e.d r7 = (k.h0.e.d) r7
            java.util.List r7 = r7.e()
            java.lang.Object r7 = r7.get(r9)
            k.h0.e.a r7 = (k.h0.e.a) r7
            long r10 = r7.c()
            long r10 = r10 - r2
            r12 = 0
            long r10 = java.lang.Math.max(r12, r10)
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 <= 0) goto L_0x007f
            long r4 = java.lang.Math.min(r10, r4)
            goto L_0x0053
        L_0x007f:
            if (r6 == 0) goto L_0x0083
            r0 = 1
            goto L_0x0086
        L_0x0083:
            r6 = r7
            goto L_0x0053
        L_0x0085:
            r0 = 0
        L_0x0086:
            if (r6 == 0) goto L_0x00a2
            r15.e(r6)
            if (r0 != 0) goto L_0x009a
            boolean r0 = r15.b
            if (r0 != 0) goto L_0x00a1
            java.util.List<k.h0.e.d> r0 = r15.f10416e
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r8
            if (r0 == 0) goto L_0x00a1
        L_0x009a:
            k.h0.e.e$a r0 = r15.f10418g
            java.lang.Runnable r1 = r15.f10417f
            r0.execute(r1)
        L_0x00a1:
            return r6
        L_0x00a2:
            boolean r0 = r15.b
            if (r0 == 0) goto L_0x00b3
            long r6 = r15.c
            long r6 = r6 - r2
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x00b2
            k.h0.e.e$a r0 = r15.f10418g
            r0.b(r15)
        L_0x00b2:
            return r1
        L_0x00b3:
            r15.b = r8
            long r2 = r2 + r4
            r15.c = r2
            k.h0.e.e$a r0 = r15.f10418g     // Catch:{ InterruptedException -> 0x00c3 }
            r0.c(r15, r4)     // Catch:{ InterruptedException -> 0x00c3 }
        L_0x00bd:
            r15.b = r9
            goto L_0x0037
        L_0x00c1:
            r0 = move-exception
            goto L_0x00c7
        L_0x00c3:
            r15.f()     // Catch:{ all -> 0x00c1 }
            goto L_0x00bd
        L_0x00c7:
            r15.b = r9
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k.h0.e.e.d():k.h0.e.a");
    }

    public final void f() {
        for (int size = this.f10415d.size() - 1; size >= 0; size--) {
            this.f10415d.get(size).b();
        }
        for (int size2 = this.f10416e.size() - 1; size2 >= 0; size2--) {
            d dVar = this.f10416e.get(size2);
            dVar.b();
            if (dVar.e().isEmpty()) {
                this.f10416e.remove(size2);
            }
        }
    }

    public final a g() {
        return this.f10418g;
    }

    public final void h(d dVar) {
        k.f(dVar, "taskQueue");
        if (!k.h0.b.f10365g || Thread.holdsLock(this)) {
            if (dVar.c() == null) {
                if (!dVar.e().isEmpty()) {
                    k.h0.b.a(this.f10416e, dVar);
                } else {
                    this.f10416e.remove(dVar);
                }
            }
            if (this.b) {
                this.f10418g.b(this);
            } else {
                this.f10418g.execute(this.f10417f);
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread currentThread = Thread.currentThread();
            k.b(currentThread, "Thread.currentThread()");
            sb.append(currentThread.getName());
            sb.append(" MUST hold lock on ");
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
    }

    public final d i() {
        int i2;
        synchronized (this) {
            i2 = this.a;
            this.a = i2 + 1;
        }
        StringBuilder sb = new StringBuilder();
        sb.append('Q');
        sb.append(i2);
        return new d(this, sb.toString());
    }
}
