package k.h0.e;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import k.h0.b;
import kotlin.jvm.internal.k;
import kotlin.x;

/* compiled from: TaskQueue.kt */
public final class d {
    private boolean a;
    private a b;
    private final List<a> c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private boolean f10409d;

    /* renamed from: e  reason: collision with root package name */
    private final e f10410e;

    /* renamed from: f  reason: collision with root package name */
    private final String f10411f;

    public d(e eVar, String str) {
        k.f(eVar, "taskRunner");
        k.f(str, "name");
        this.f10410e = eVar;
        this.f10411f = str;
    }

    public static /* synthetic */ void j(d dVar, a aVar, long j2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j2 = 0;
        }
        dVar.i(aVar, j2);
    }

    public final void a() {
        if (!b.f10365g || !Thread.holdsLock(this)) {
            synchronized (this.f10410e) {
                if (b()) {
                    this.f10410e.h(this);
                }
                x xVar = x.a;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Thread ");
        Thread currentThread = Thread.currentThread();
        k.b(currentThread, "Thread.currentThread()");
        sb.append(currentThread.getName());
        sb.append(" MUST NOT hold lock on ");
        sb.append(this);
        throw new AssertionError(sb.toString());
    }

    public final boolean b() {
        a aVar = this.b;
        if (aVar != null) {
            if (aVar == null) {
                k.m();
                throw null;
            } else if (aVar.a()) {
                this.f10409d = true;
            }
        }
        boolean z = false;
        for (int size = this.c.size() - 1; size >= 0; size--) {
            if (this.c.get(size).a()) {
                a aVar2 = this.c.get(size);
                if (e.f10414j.a().isLoggable(Level.FINE)) {
                    b.c(aVar2, this, "canceled");
                }
                this.c.remove(size);
                z = true;
            }
        }
        return z;
    }

    public final a c() {
        return this.b;
    }

    public final boolean d() {
        return this.f10409d;
    }

    public final List<a> e() {
        return this.c;
    }

    public final String f() {
        return this.f10411f;
    }

    public final boolean g() {
        return this.a;
    }

    public final e h() {
        return this.f10410e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0026, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i(k.h0.e.a r3, long r4) {
        /*
            r2 = this;
            java.lang.String r0 = "task"
            kotlin.jvm.internal.k.f(r3, r0)
            k.h0.e.e r0 = r2.f10410e
            monitor-enter(r0)
            boolean r1 = r2.a     // Catch:{ all -> 0x0050 }
            if (r1 == 0) goto L_0x0040
            boolean r4 = r3.a()     // Catch:{ all -> 0x0050 }
            if (r4 == 0) goto L_0x0027
            k.h0.e.e$b r4 = k.h0.e.e.f10414j     // Catch:{ all -> 0x0050 }
            java.util.logging.Logger r4 = r4.a()     // Catch:{ all -> 0x0050 }
            java.util.logging.Level r5 = java.util.logging.Level.FINE     // Catch:{ all -> 0x0050 }
            boolean r4 = r4.isLoggable(r5)     // Catch:{ all -> 0x0050 }
            if (r4 == 0) goto L_0x0025
            java.lang.String r4 = "schedule canceled (queue is shutdown)"
            k.h0.e.b.c(r3, r2, r4)     // Catch:{ all -> 0x0050 }
        L_0x0025:
            monitor-exit(r0)
            return
        L_0x0027:
            k.h0.e.e$b r4 = k.h0.e.e.f10414j     // Catch:{ all -> 0x0050 }
            java.util.logging.Logger r4 = r4.a()     // Catch:{ all -> 0x0050 }
            java.util.logging.Level r5 = java.util.logging.Level.FINE     // Catch:{ all -> 0x0050 }
            boolean r4 = r4.isLoggable(r5)     // Catch:{ all -> 0x0050 }
            if (r4 == 0) goto L_0x003a
            java.lang.String r4 = "schedule failed (queue is shutdown)"
            k.h0.e.b.c(r3, r2, r4)     // Catch:{ all -> 0x0050 }
        L_0x003a:
            java.util.concurrent.RejectedExecutionException r3 = new java.util.concurrent.RejectedExecutionException     // Catch:{ all -> 0x0050 }
            r3.<init>()     // Catch:{ all -> 0x0050 }
            throw r3     // Catch:{ all -> 0x0050 }
        L_0x0040:
            r1 = 0
            boolean r3 = r2.k(r3, r4, r1)     // Catch:{ all -> 0x0050 }
            if (r3 == 0) goto L_0x004c
            k.h0.e.e r3 = r2.f10410e     // Catch:{ all -> 0x0050 }
            r3.h(r2)     // Catch:{ all -> 0x0050 }
        L_0x004c:
            kotlin.x r3 = kotlin.x.a     // Catch:{ all -> 0x0050 }
            monitor-exit(r0)
            return
        L_0x0050:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: k.h0.e.d.i(k.h0.e.a, long):void");
    }

    public final boolean k(a aVar, long j2, boolean z) {
        String str;
        k.f(aVar, "task");
        aVar.e(this);
        long a2 = this.f10410e.g().a();
        long j3 = a2 + j2;
        int indexOf = this.c.indexOf(aVar);
        if (indexOf != -1) {
            if (aVar.c() <= j3) {
                if (e.f10414j.a().isLoggable(Level.FINE)) {
                    b.c(aVar, this, "already scheduled");
                }
                return false;
            }
            this.c.remove(indexOf);
        }
        aVar.g(j3);
        if (e.f10414j.a().isLoggable(Level.FINE)) {
            if (z) {
                str = "run again after " + b.b(j3 - a2);
            } else {
                str = "scheduled after " + b.b(j3 - a2);
            }
            b.c(aVar, this, str);
        }
        Iterator<a> it = this.c.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            if (it.next().c() - a2 > j2) {
                break;
            }
            i2++;
        }
        if (i2 == -1) {
            i2 = this.c.size();
        }
        this.c.add(i2, aVar);
        if (i2 == 0) {
            return true;
        }
        return false;
    }

    public final void l(a aVar) {
        this.b = aVar;
    }

    public final void m(boolean z) {
        this.f10409d = z;
    }

    public final void n() {
        if (!b.f10365g || !Thread.holdsLock(this)) {
            synchronized (this.f10410e) {
                this.a = true;
                if (b()) {
                    this.f10410e.h(this);
                }
                x xVar = x.a;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Thread ");
        Thread currentThread = Thread.currentThread();
        k.b(currentThread, "Thread.currentThread()");
        sb.append(currentThread.getName());
        sb.append(" MUST NOT hold lock on ");
        sb.append(this);
        throw new AssertionError(sb.toString());
    }

    public String toString() {
        return this.f10411f;
    }
}
