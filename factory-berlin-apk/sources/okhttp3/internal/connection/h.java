package okhttp3.internal.connection;

import java.lang.ref.Reference;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import k.f0;
import k.h0.e.d;
import k.h0.e.e;
import kotlin.TypeCastException;
import kotlin.jvm.internal.k;
import kotlin.x;
import okhttp3.internal.connection.e;

/* compiled from: RealConnectionPool.kt */
public final class h {
    private final long a;
    private final d b;
    private final b c = new b(this, k.h0.b.f10366h + " ConnectionPool");

    /* renamed from: d  reason: collision with root package name */
    private final ConcurrentLinkedQueue<f> f11315d = new ConcurrentLinkedQueue<>();

    /* renamed from: e  reason: collision with root package name */
    private final int f11316e;

    /* compiled from: RealConnectionPool.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: RealConnectionPool.kt */
    public static final class b extends k.h0.e.a {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ h f11317e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(h hVar, String str) {
            super(str, false, 2, (DefaultConstructorMarker) null);
            this.f11317e = hVar;
        }

        public long f() {
            return this.f11317e.b(System.nanoTime());
        }
    }

    static {
        new a((DefaultConstructorMarker) null);
    }

    public h(e eVar, int i2, long j2, TimeUnit timeUnit) {
        k.f(eVar, "taskRunner");
        k.f(timeUnit, "timeUnit");
        this.f11316e = i2;
        this.a = timeUnit.toNanos(j2);
        this.b = eVar.i();
        if (!(j2 > 0)) {
            throw new IllegalArgumentException(("keepAliveDuration <= 0: " + j2).toString());
        }
    }

    private final int d(f fVar, long j2) {
        if (!k.h0.b.f10365g || Thread.holdsLock(fVar)) {
            List<Reference<e>> o = fVar.o();
            int i2 = 0;
            while (i2 < o.size()) {
                Reference reference = o.get(i2);
                if (reference.get() != null) {
                    i2++;
                } else if (reference != null) {
                    k.h0.i.h.c.g().m("A connection to " + fVar.A().a().l() + " was leaked. " + "Did you forget to close a response body?", ((e.b) reference).a());
                    o.remove(i2);
                    fVar.D(true);
                    if (o.isEmpty()) {
                        fVar.C(j2 - this.a);
                        return 0;
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type okhttp3.internal.connection.RealCall.CallReference");
                }
            }
            return o.size();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Thread ");
        Thread currentThread = Thread.currentThread();
        k.b(currentThread, "Thread.currentThread()");
        sb.append(currentThread.getName());
        sb.append(" MUST hold lock on ");
        sb.append(fVar);
        throw new AssertionError(sb.toString());
    }

    public final boolean a(k.a aVar, e eVar, List<f0> list, boolean z) {
        k.f(aVar, "address");
        k.f(eVar, "call");
        Iterator<f> it = this.f11315d.iterator();
        while (it.hasNext()) {
            f next = it.next();
            k.b(next, "connection");
            synchronized (next) {
                if (z) {
                    if (!next.w()) {
                        x xVar = x.a;
                    }
                }
                if (next.u(aVar, list)) {
                    eVar.e(next);
                    return true;
                }
                x xVar2 = x.a;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x007c, code lost:
        k.h0.b.k(r6.E());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0089, code lost:
        if (r11.f11315d.isEmpty() == false) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x008b, code lost:
        r11.b.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0090, code lost:
        return 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long b(long r12) {
        /*
            r11 = this;
            java.util.concurrent.ConcurrentLinkedQueue<okhttp3.internal.connection.f> r0 = r11.f11315d
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = 0
            r3 = -9223372036854775808
            r6 = r1
            r4 = r3
            r3 = 0
        L_0x000d:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L_0x0040
            java.lang.Object r7 = r0.next()
            okhttp3.internal.connection.f r7 = (okhttp3.internal.connection.f) r7
            java.lang.String r8 = "connection"
            kotlin.jvm.internal.k.b(r7, r8)
            monitor-enter(r7)
            int r8 = r11.d(r7, r12)     // Catch:{ all -> 0x003d }
            if (r8 <= 0) goto L_0x0028
            int r3 = r3 + 1
            goto L_0x003b
        L_0x0028:
            int r2 = r2 + 1
            long r8 = r7.p()     // Catch:{ all -> 0x003d }
            long r8 = r12 - r8
            int r10 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r10 <= 0) goto L_0x0039
            kotlin.x r4 = kotlin.x.a     // Catch:{ all -> 0x003d }
            r6 = r7
            r4 = r8
            goto L_0x003b
        L_0x0039:
            kotlin.x r8 = kotlin.x.a     // Catch:{ all -> 0x003d }
        L_0x003b:
            monitor-exit(r7)
            goto L_0x000d
        L_0x003d:
            r12 = move-exception
            monitor-exit(r7)
            throw r12
        L_0x0040:
            long r7 = r11.a
            int r0 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x0055
            int r0 = r11.f11316e
            if (r2 <= r0) goto L_0x004b
            goto L_0x0055
        L_0x004b:
            if (r2 <= 0) goto L_0x004f
            long r7 = r7 - r4
            return r7
        L_0x004f:
            if (r3 <= 0) goto L_0x0052
            return r7
        L_0x0052:
            r12 = -1
            return r12
        L_0x0055:
            if (r6 == 0) goto L_0x0094
            monitor-enter(r6)
            java.util.List r0 = r6.o()     // Catch:{ all -> 0x0091 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0091 }
            r1 = 1
            r0 = r0 ^ r1
            r2 = 0
            if (r0 == 0) goto L_0x0068
            monitor-exit(r6)
            return r2
        L_0x0068:
            long r7 = r6.p()     // Catch:{ all -> 0x0091 }
            long r7 = r7 + r4
            int r0 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r0 == 0) goto L_0x0073
            monitor-exit(r6)
            return r2
        L_0x0073:
            r6.D(r1)     // Catch:{ all -> 0x0091 }
            java.util.concurrent.ConcurrentLinkedQueue<okhttp3.internal.connection.f> r12 = r11.f11315d     // Catch:{ all -> 0x0091 }
            r12.remove(r6)     // Catch:{ all -> 0x0091 }
            monitor-exit(r6)
            java.net.Socket r12 = r6.E()
            k.h0.b.k(r12)
            java.util.concurrent.ConcurrentLinkedQueue<okhttp3.internal.connection.f> r12 = r11.f11315d
            boolean r12 = r12.isEmpty()
            if (r12 == 0) goto L_0x0090
            k.h0.e.d r12 = r11.b
            r12.a()
        L_0x0090:
            return r2
        L_0x0091:
            r12 = move-exception
            monitor-exit(r6)
            throw r12
        L_0x0094:
            kotlin.jvm.internal.k.m()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.h.b(long):long");
    }

    public final boolean c(f fVar) {
        k.f(fVar, "connection");
        if (k.h0.b.f10365g && !Thread.holdsLock(fVar)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread currentThread = Thread.currentThread();
            k.b(currentThread, "Thread.currentThread()");
            sb.append(currentThread.getName());
            sb.append(" MUST hold lock on ");
            sb.append(fVar);
            throw new AssertionError(sb.toString());
        } else if (fVar.q() || this.f11316e == 0) {
            fVar.D(true);
            this.f11315d.remove(fVar);
            if (!this.f11315d.isEmpty()) {
                return true;
            }
            this.b.a();
            return true;
        } else {
            d.j(this.b, this.c, 0, 2, (Object) null);
            return false;
        }
    }

    public final void e(f fVar) {
        k.f(fVar, "connection");
        if (!k.h0.b.f10365g || Thread.holdsLock(fVar)) {
            this.f11315d.add(fVar);
            d.j(this.b, this.c, 0, 2, (Object) null);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Thread ");
        Thread currentThread = Thread.currentThread();
        k.b(currentThread, "Thread.currentThread()");
        sb.append(currentThread.getName());
        sb.append(" MUST hold lock on ");
        sb.append(fVar);
        throw new AssertionError(sb.toString());
    }
}
