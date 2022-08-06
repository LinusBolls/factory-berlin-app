package okhttp3.internal.http2;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import k.u;
import kotlin.TypeCastException;
import kotlin.jvm.internal.k;
import kotlin.x;
import l.b0;
import l.c0;
import l.f;
import l.z;

/* compiled from: Http2Stream.kt */
public final class h {
    private long a;
    private long b;
    private long c;

    /* renamed from: d  reason: collision with root package name */
    private long f11424d;

    /* renamed from: e  reason: collision with root package name */
    private final ArrayDeque<u> f11425e = new ArrayDeque<>();

    /* renamed from: f  reason: collision with root package name */
    private boolean f11426f;

    /* renamed from: g  reason: collision with root package name */
    private final c f11427g;

    /* renamed from: h  reason: collision with root package name */
    private final b f11428h;

    /* renamed from: i  reason: collision with root package name */
    private final d f11429i;

    /* renamed from: j  reason: collision with root package name */
    private final d f11430j;

    /* renamed from: k  reason: collision with root package name */
    private a f11431k;

    /* renamed from: l  reason: collision with root package name */
    private IOException f11432l;

    /* renamed from: m  reason: collision with root package name */
    private final int f11433m;

    /* renamed from: n  reason: collision with root package name */
    private final e f11434n;

    /* compiled from: Http2Stream.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: Http2Stream.kt */
    public final class c implements b0 {

        /* renamed from: g  reason: collision with root package name */
        private final f f11440g = new f();

        /* renamed from: h  reason: collision with root package name */
        private final f f11441h = new f();

        /* renamed from: i  reason: collision with root package name */
        private boolean f11442i;

        /* renamed from: j  reason: collision with root package name */
        private final long f11443j;

        /* renamed from: k  reason: collision with root package name */
        private boolean f11444k;

        public c(long j2, boolean z) {
            this.f11443j = j2;
            this.f11444k = z;
        }

        private final void k(long j2) {
            h hVar = h.this;
            if (!k.h0.b.f10365g || !Thread.holdsLock(hVar)) {
                h.this.g().Z0(j2);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread currentThread = Thread.currentThread();
            k.b(currentThread, "Thread.currentThread()");
            sb.append(currentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(hVar);
            throw new AssertionError(sb.toString());
        }

        public final boolean a() {
            return this.f11442i;
        }

        public final boolean b() {
            return this.f11444k;
        }

        public void close() {
            long T0;
            synchronized (h.this) {
                this.f11442i = true;
                T0 = this.f11441h.T0();
                this.f11441h.h();
                h hVar = h.this;
                if (hVar != null) {
                    hVar.notifyAll();
                    x xVar = x.a;
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.Object");
                }
            }
            if (T0 > 0) {
                k(T0);
            }
            h.this.b();
        }

        public c0 e() {
            return h.this.m();
        }

        /* JADX INFO: finally extract failed */
        public long g0(f fVar, long j2) {
            Throwable th;
            boolean z;
            long j3;
            f fVar2 = fVar;
            long j4 = j2;
            k.f(fVar2, "sink");
            long j5 = 0;
            if (j4 >= 0) {
                while (true) {
                    synchronized (h.this) {
                        h.this.m().r();
                        try {
                            if (h.this.h() != null) {
                                th = h.this.i();
                                if (th == null) {
                                    a h2 = h.this.h();
                                    if (h2 != null) {
                                        th = new StreamResetException(h2);
                                    } else {
                                        k.m();
                                        throw null;
                                    }
                                }
                            } else {
                                th = null;
                            }
                            if (!this.f11442i) {
                                if (this.f11441h.T0() > j5) {
                                    j3 = this.f11441h.g0(fVar2, Math.min(j4, this.f11441h.T0()));
                                    h hVar = h.this;
                                    hVar.A(hVar.l() + j3);
                                    long l2 = h.this.l() - h.this.k();
                                    if (th == null && l2 >= ((long) (h.this.g().w0().c() / 2))) {
                                        h.this.g().f1(h.this.j(), l2);
                                        h.this.z(h.this.l());
                                    }
                                } else if (this.f11444k || th != null) {
                                    j3 = -1;
                                } else {
                                    h.this.D();
                                    j3 = -1;
                                    z = true;
                                    h.this.m().y();
                                    x xVar = x.a;
                                }
                                z = false;
                                h.this.m().y();
                                x xVar2 = x.a;
                            } else {
                                throw new IOException("stream closed");
                            }
                        } catch (Throwable th2) {
                            h.this.m().y();
                            throw th2;
                        }
                    }
                    if (z) {
                        j5 = 0;
                    } else if (j3 != -1) {
                        k(j3);
                        return j3;
                    } else if (th == null) {
                        return -1;
                    } else {
                        if (th == null) {
                            k.m();
                            throw null;
                        }
                        throw th;
                    }
                }
            } else {
                throw new IllegalArgumentException(("byteCount < 0: " + j4).toString());
            }
        }

        public final void h(l.h hVar, long j2) {
            boolean z;
            boolean z2;
            boolean z3;
            long j3;
            k.f(hVar, "source");
            h hVar2 = h.this;
            if (!k.h0.b.f10365g || !Thread.holdsLock(hVar2)) {
                while (j2 > 0) {
                    synchronized (h.this) {
                        z = this.f11444k;
                        z2 = true;
                        z3 = this.f11441h.T0() + j2 > this.f11443j;
                        x xVar = x.a;
                    }
                    if (z3) {
                        hVar.x(j2);
                        h.this.f(a.FLOW_CONTROL_ERROR);
                        return;
                    } else if (z) {
                        hVar.x(j2);
                        return;
                    } else {
                        long g0 = hVar.g0(this.f11440g, j2);
                        if (g0 != -1) {
                            j2 -= g0;
                            synchronized (h.this) {
                                if (this.f11442i) {
                                    j3 = this.f11440g.T0();
                                    this.f11440g.h();
                                } else {
                                    if (this.f11441h.T0() != 0) {
                                        z2 = false;
                                    }
                                    this.f11441h.t(this.f11440g);
                                    if (z2) {
                                        h hVar3 = h.this;
                                        if (hVar3 != null) {
                                            hVar3.notifyAll();
                                        } else {
                                            throw new TypeCastException("null cannot be cast to non-null type java.lang.Object");
                                        }
                                    }
                                    j3 = 0;
                                }
                                x xVar2 = x.a;
                            }
                            if (j3 > 0) {
                                k(j3);
                            }
                        } else {
                            throw new EOFException();
                        }
                    }
                }
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread currentThread = Thread.currentThread();
            k.b(currentThread, "Thread.currentThread()");
            sb.append(currentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(hVar2);
            throw new AssertionError(sb.toString());
        }

        public final void i(boolean z) {
            this.f11444k = z;
        }

        public final void j(u uVar) {
        }
    }

    /* compiled from: Http2Stream.kt */
    public final class d extends l.d {
        public d() {
        }

        /* access modifiers changed from: protected */
        public IOException t(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        /* access modifiers changed from: protected */
        public void x() {
            h.this.f(a.CANCEL);
            h.this.g().T0();
        }

        public final void y() {
            if (s()) {
                throw t((IOException) null);
            }
        }
    }

    static {
        new a((DefaultConstructorMarker) null);
    }

    public h(int i2, e eVar, boolean z, boolean z2, u uVar) {
        k.f(eVar, "connection");
        this.f11433m = i2;
        this.f11434n = eVar;
        this.f11424d = (long) eVar.F0().c();
        this.f11427g = new c((long) this.f11434n.w0().c(), z2);
        this.f11428h = new b(z);
        this.f11429i = new d();
        this.f11430j = new d();
        if (uVar != null) {
            if (!t()) {
                this.f11425e.add(uVar);
                return;
            }
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet".toString());
        } else if (!t()) {
            throw new IllegalStateException("remotely-initiated streams should have headers".toString());
        }
    }

    private final boolean e(a aVar, IOException iOException) {
        if (!k.h0.b.f10365g || !Thread.holdsLock(this)) {
            synchronized (this) {
                if (this.f11431k != null) {
                    return false;
                }
                if (this.f11427g.b() && this.f11428h.h()) {
                    return false;
                }
                this.f11431k = aVar;
                this.f11432l = iOException;
                notifyAll();
                x xVar = x.a;
                this.f11434n.S0(this.f11433m);
                return true;
            }
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

    public final void A(long j2) {
        this.a = j2;
    }

    public final void B(long j2) {
        this.c = j2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0047, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0048, code lost:
        r2.f11429i.y();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004d, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized k.u C() {
        /*
            r2 = this;
            monitor-enter(r2)
            okhttp3.internal.http2.h$d r0 = r2.f11429i     // Catch:{ all -> 0x004e }
            r0.r()     // Catch:{ all -> 0x004e }
        L_0x0006:
            java.util.ArrayDeque<k.u> r0 = r2.f11425e     // Catch:{ all -> 0x0047 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0047 }
            if (r0 == 0) goto L_0x0016
            okhttp3.internal.http2.a r0 = r2.f11431k     // Catch:{ all -> 0x0047 }
            if (r0 != 0) goto L_0x0016
            r2.D()     // Catch:{ all -> 0x0047 }
            goto L_0x0006
        L_0x0016:
            okhttp3.internal.http2.h$d r0 = r2.f11429i     // Catch:{ all -> 0x004e }
            r0.y()     // Catch:{ all -> 0x004e }
            java.util.ArrayDeque<k.u> r0 = r2.f11425e     // Catch:{ all -> 0x004e }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x004e }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0034
            java.util.ArrayDeque<k.u> r0 = r2.f11425e     // Catch:{ all -> 0x004e }
            java.lang.Object r0 = r0.removeFirst()     // Catch:{ all -> 0x004e }
            java.lang.String r1 = "headersQueue.removeFirst()"
            kotlin.jvm.internal.k.b(r0, r1)     // Catch:{ all -> 0x004e }
            k.u r0 = (k.u) r0     // Catch:{ all -> 0x004e }
            monitor-exit(r2)
            return r0
        L_0x0034:
            java.io.IOException r0 = r2.f11432l     // Catch:{ all -> 0x004e }
            if (r0 != 0) goto L_0x0046
            okhttp3.internal.http2.StreamResetException r0 = new okhttp3.internal.http2.StreamResetException     // Catch:{ all -> 0x004e }
            okhttp3.internal.http2.a r1 = r2.f11431k     // Catch:{ all -> 0x004e }
            if (r1 != 0) goto L_0x0043
            kotlin.jvm.internal.k.m()     // Catch:{ all -> 0x004e }
            r0 = 0
            throw r0
        L_0x0043:
            r0.<init>(r1)     // Catch:{ all -> 0x004e }
        L_0x0046:
            throw r0     // Catch:{ all -> 0x004e }
        L_0x0047:
            r0 = move-exception
            okhttp3.internal.http2.h$d r1 = r2.f11429i     // Catch:{ all -> 0x004e }
            r1.y()     // Catch:{ all -> 0x004e }
            throw r0     // Catch:{ all -> 0x004e }
        L_0x004e:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.h.C():k.u");
    }

    public final void D() {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public final c0 E() {
        return this.f11430j;
    }

    public final void a(long j2) {
        this.f11424d += j2;
        if (j2 > 0) {
            notifyAll();
        }
    }

    public final void b() {
        boolean z;
        boolean u;
        if (!k.h0.b.f10365g || !Thread.holdsLock(this)) {
            synchronized (this) {
                z = !this.f11427g.b() && this.f11427g.a() && (this.f11428h.h() || this.f11428h.b());
                u = u();
                x xVar = x.a;
            }
            if (z) {
                d(a.CANCEL, (IOException) null);
            } else if (!u) {
                this.f11434n.S0(this.f11433m);
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread currentThread = Thread.currentThread();
            k.b(currentThread, "Thread.currentThread()");
            sb.append(currentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
    }

    public final void c() {
        if (this.f11428h.b()) {
            throw new IOException("stream closed");
        } else if (this.f11428h.h()) {
            throw new IOException("stream finished");
        } else if (this.f11431k != null) {
            Throwable th = this.f11432l;
            if (th == null) {
                a aVar = this.f11431k;
                if (aVar == null) {
                    k.m();
                    throw null;
                }
                th = new StreamResetException(aVar);
            }
            throw th;
        }
    }

    public final void d(a aVar, IOException iOException) {
        k.f(aVar, "rstStatusCode");
        if (e(aVar, iOException)) {
            this.f11434n.d1(this.f11433m, aVar);
        }
    }

    public final void f(a aVar) {
        k.f(aVar, "errorCode");
        if (e(aVar, (IOException) null)) {
            this.f11434n.e1(this.f11433m, aVar);
        }
    }

    public final e g() {
        return this.f11434n;
    }

    public final synchronized a h() {
        return this.f11431k;
    }

    public final IOException i() {
        return this.f11432l;
    }

    public final int j() {
        return this.f11433m;
    }

    public final long k() {
        return this.b;
    }

    public final long l() {
        return this.a;
    }

    public final d m() {
        return this.f11429i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0011  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0017  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final l.z n() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f11426f     // Catch:{ all -> 0x0023 }
            if (r0 != 0) goto L_0x000e
            boolean r0 = r2.t()     // Catch:{ all -> 0x0023 }
            if (r0 == 0) goto L_0x000c
            goto L_0x000e
        L_0x000c:
            r0 = 0
            goto L_0x000f
        L_0x000e:
            r0 = 1
        L_0x000f:
            if (r0 == 0) goto L_0x0017
            kotlin.x r0 = kotlin.x.a     // Catch:{ all -> 0x0023 }
            monitor-exit(r2)
            okhttp3.internal.http2.h$b r0 = r2.f11428h
            return r0
        L_0x0017:
            java.lang.String r0 = "reply before requesting the sink"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0023 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0023 }
            r1.<init>(r0)     // Catch:{ all -> 0x0023 }
            throw r1     // Catch:{ all -> 0x0023 }
        L_0x0023:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.h.n():l.z");
    }

    public final b o() {
        return this.f11428h;
    }

    public final c p() {
        return this.f11427g;
    }

    public final long q() {
        return this.f11424d;
    }

    public final long r() {
        return this.c;
    }

    public final d s() {
        return this.f11430j;
    }

    public final boolean t() {
        if (this.f11434n.i0() == ((this.f11433m & 1) == 1)) {
            return true;
        }
        return false;
    }

    public final synchronized boolean u() {
        if (this.f11431k != null) {
            return false;
        }
        if ((this.f11427g.b() || this.f11427g.a()) && ((this.f11428h.h() || this.f11428h.b()) && this.f11426f)) {
            return false;
        }
        return true;
    }

    public final c0 v() {
        return this.f11429i;
    }

    public final void w(l.h hVar, int i2) {
        k.f(hVar, "source");
        if (!k.h0.b.f10365g || !Thread.holdsLock(this)) {
            this.f11427g.h(hVar, (long) i2);
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

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0054  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void x(k.u r3, boolean r4) {
        /*
            r2 = this;
            java.lang.String r0 = "headers"
            kotlin.jvm.internal.k.f(r3, r0)
            boolean r0 = k.h0.b.f10365g
            if (r0 == 0) goto L_0x003c
            boolean r0 = java.lang.Thread.holdsLock(r2)
            if (r0 != 0) goto L_0x0010
            goto L_0x003c
        L_0x0010:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Thread "
            r4.append(r0)
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r1 = "Thread.currentThread()"
            kotlin.jvm.internal.k.b(r0, r1)
            java.lang.String r0 = r0.getName()
            r4.append(r0)
            java.lang.String r0 = " MUST NOT hold lock on "
            r4.append(r0)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L_0x003c:
            monitor-enter(r2)
            boolean r0 = r2.f11426f     // Catch:{ all -> 0x006d }
            r1 = 1
            if (r0 == 0) goto L_0x004b
            if (r4 != 0) goto L_0x0045
            goto L_0x004b
        L_0x0045:
            okhttp3.internal.http2.h$c r0 = r2.f11427g     // Catch:{ all -> 0x006d }
            r0.j(r3)     // Catch:{ all -> 0x006d }
            goto L_0x0052
        L_0x004b:
            r2.f11426f = r1     // Catch:{ all -> 0x006d }
            java.util.ArrayDeque<k.u> r0 = r2.f11425e     // Catch:{ all -> 0x006d }
            r0.add(r3)     // Catch:{ all -> 0x006d }
        L_0x0052:
            if (r4 == 0) goto L_0x0059
            okhttp3.internal.http2.h$c r3 = r2.f11427g     // Catch:{ all -> 0x006d }
            r3.i(r1)     // Catch:{ all -> 0x006d }
        L_0x0059:
            boolean r3 = r2.u()     // Catch:{ all -> 0x006d }
            r2.notifyAll()     // Catch:{ all -> 0x006d }
            kotlin.x r4 = kotlin.x.a     // Catch:{ all -> 0x006d }
            monitor-exit(r2)
            if (r3 != 0) goto L_0x006c
            okhttp3.internal.http2.e r3 = r2.f11434n
            int r4 = r2.f11433m
            r3.S0(r4)
        L_0x006c:
            return
        L_0x006d:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.h.x(k.u, boolean):void");
    }

    public final synchronized void y(a aVar) {
        k.f(aVar, "errorCode");
        if (this.f11431k == null) {
            this.f11431k = aVar;
            notifyAll();
        }
    }

    public final void z(long j2) {
        this.b = j2;
    }

    /* compiled from: Http2Stream.kt */
    public final class b implements z {

        /* renamed from: g  reason: collision with root package name */
        private final f f11435g;

        /* renamed from: h  reason: collision with root package name */
        private u f11436h;

        /* renamed from: i  reason: collision with root package name */
        private boolean f11437i;

        /* renamed from: j  reason: collision with root package name */
        private boolean f11438j;

        public b(boolean z) {
            this.f11438j = z;
            this.f11435g = new f();
        }

        /* JADX INFO: finally extract failed */
        private final void a(boolean z) {
            long min;
            boolean z2;
            synchronized (h.this) {
                h.this.s().r();
                while (h.this.r() >= h.this.q() && !this.f11438j && !this.f11437i && h.this.h() == null) {
                    try {
                        h.this.D();
                    } catch (Throwable th) {
                        h.this.s().y();
                        throw th;
                    }
                }
                h.this.s().y();
                h.this.c();
                min = Math.min(h.this.q() - h.this.r(), this.f11435g.T0());
                h hVar = h.this;
                hVar.B(hVar.r() + min);
                z2 = z && min == this.f11435g.T0() && h.this.h() == null;
                x xVar = x.a;
            }
            h.this.s().r();
            try {
                h.this.g().a1(h.this.j(), z2, this.f11435g, min);
            } finally {
                h.this.s().y();
            }
        }

        public final boolean b() {
            return this.f11437i;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:21:0x005a, code lost:
            if (r10.f11439k.o().f11438j != false) goto L_0x00c4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0066, code lost:
            if (r10.f11435g.T0() <= 0) goto L_0x006a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0068, code lost:
            r0 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x006a, code lost:
            r0 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x006d, code lost:
            if (r10.f11436h == null) goto L_0x0071;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x006f, code lost:
            r4 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0071, code lost:
            r4 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x0072, code lost:
            if (r4 == false) goto L_0x009f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x007c, code lost:
            if (r10.f11435g.T0() <= 0) goto L_0x0082;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x007e, code lost:
            a(false);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x0082, code lost:
            r0 = r10.f11439k.g();
            r2 = r10.f11439k.j();
            r4 = r10.f11436h;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x0090, code lost:
            if (r4 == null) goto L_0x009a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x0092, code lost:
            r0.b1(r2, r1, k.h0.b.K(r4));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x009a, code lost:
            kotlin.jvm.internal.k.m();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x009e, code lost:
            throw null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x009f, code lost:
            if (r0 == false) goto L_0x00af;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a9, code lost:
            if (r10.f11435g.T0() <= 0) goto L_0x00c4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ab, code lost:
            a(true);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x00af, code lost:
            if (r1 == false) goto L_0x00c4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b1, code lost:
            r10.f11439k.g().a1(r10.f11439k.j(), true, (l.f) null, 0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c4, code lost:
            r0 = r10.f11439k;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c6, code lost:
            monitor-enter(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
            r10.f11437i = true;
            r1 = kotlin.x.a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x00cb, code lost:
            monitor-exit(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x00cc, code lost:
            r10.f11439k.g().flush();
            r10.f11439k.b();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x00da, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void close() {
            /*
                r10 = this;
                okhttp3.internal.http2.h r0 = okhttp3.internal.http2.h.this
                boolean r1 = k.h0.b.f10365g
                if (r1 == 0) goto L_0x0039
                boolean r1 = java.lang.Thread.holdsLock(r0)
                if (r1 != 0) goto L_0x000d
                goto L_0x0039
            L_0x000d:
                java.lang.AssertionError r1 = new java.lang.AssertionError
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Thread "
                r2.append(r3)
                java.lang.Thread r3 = java.lang.Thread.currentThread()
                java.lang.String r4 = "Thread.currentThread()"
                kotlin.jvm.internal.k.b(r3, r4)
                java.lang.String r3 = r3.getName()
                r2.append(r3)
                java.lang.String r3 = " MUST NOT hold lock on "
                r2.append(r3)
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                r1.<init>(r0)
                throw r1
            L_0x0039:
                okhttp3.internal.http2.h r0 = okhttp3.internal.http2.h.this
                monitor-enter(r0)
                boolean r1 = r10.f11437i     // Catch:{ all -> 0x00de }
                if (r1 == 0) goto L_0x0042
                monitor-exit(r0)
                return
            L_0x0042:
                okhttp3.internal.http2.h r1 = okhttp3.internal.http2.h.this     // Catch:{ all -> 0x00de }
                okhttp3.internal.http2.a r1 = r1.h()     // Catch:{ all -> 0x00de }
                r2 = 0
                r3 = 1
                if (r1 != 0) goto L_0x004e
                r1 = 1
                goto L_0x004f
            L_0x004e:
                r1 = 0
            L_0x004f:
                kotlin.x r4 = kotlin.x.a     // Catch:{ all -> 0x00de }
                monitor-exit(r0)
                okhttp3.internal.http2.h r0 = okhttp3.internal.http2.h.this
                okhttp3.internal.http2.h$b r0 = r0.o()
                boolean r0 = r0.f11438j
                if (r0 != 0) goto L_0x00c4
                l.f r0 = r10.f11435g
                long r4 = r0.T0()
                r6 = 0
                int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r0 <= 0) goto L_0x006a
                r0 = 1
                goto L_0x006b
            L_0x006a:
                r0 = 0
            L_0x006b:
                k.u r4 = r10.f11436h
                if (r4 == 0) goto L_0x0071
                r4 = 1
                goto L_0x0072
            L_0x0071:
                r4 = 0
            L_0x0072:
                if (r4 == 0) goto L_0x009f
            L_0x0074:
                l.f r0 = r10.f11435g
                long r4 = r0.T0()
                int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r0 <= 0) goto L_0x0082
                r10.a(r2)
                goto L_0x0074
            L_0x0082:
                okhttp3.internal.http2.h r0 = okhttp3.internal.http2.h.this
                okhttp3.internal.http2.e r0 = r0.g()
                okhttp3.internal.http2.h r2 = okhttp3.internal.http2.h.this
                int r2 = r2.j()
                k.u r4 = r10.f11436h
                if (r4 == 0) goto L_0x009a
                java.util.List r4 = k.h0.b.K(r4)
                r0.b1(r2, r1, r4)
                goto L_0x00c4
            L_0x009a:
                kotlin.jvm.internal.k.m()
                r0 = 0
                throw r0
            L_0x009f:
                if (r0 == 0) goto L_0x00af
            L_0x00a1:
                l.f r0 = r10.f11435g
                long r0 = r0.T0()
                int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
                if (r2 <= 0) goto L_0x00c4
                r10.a(r3)
                goto L_0x00a1
            L_0x00af:
                if (r1 == 0) goto L_0x00c4
                okhttp3.internal.http2.h r0 = okhttp3.internal.http2.h.this
                okhttp3.internal.http2.e r4 = r0.g()
                okhttp3.internal.http2.h r0 = okhttp3.internal.http2.h.this
                int r5 = r0.j()
                r6 = 1
                r7 = 0
                r8 = 0
                r4.a1(r5, r6, r7, r8)
            L_0x00c4:
                okhttp3.internal.http2.h r0 = okhttp3.internal.http2.h.this
                monitor-enter(r0)
                r10.f11437i = r3     // Catch:{ all -> 0x00db }
                kotlin.x r1 = kotlin.x.a     // Catch:{ all -> 0x00db }
                monitor-exit(r0)
                okhttp3.internal.http2.h r0 = okhttp3.internal.http2.h.this
                okhttp3.internal.http2.e r0 = r0.g()
                r0.flush()
                okhttp3.internal.http2.h r0 = okhttp3.internal.http2.h.this
                r0.b()
                return
            L_0x00db:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            L_0x00de:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.h.b.close():void");
        }

        public c0 e() {
            return h.this.s();
        }

        public void flush() {
            h hVar = h.this;
            if (!k.h0.b.f10365g || !Thread.holdsLock(hVar)) {
                synchronized (h.this) {
                    h.this.c();
                    x xVar = x.a;
                }
                while (this.f11435g.T0() > 0) {
                    a(false);
                    h.this.g().flush();
                }
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread currentThread = Thread.currentThread();
            k.b(currentThread, "Thread.currentThread()");
            sb.append(currentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(hVar);
            throw new AssertionError(sb.toString());
        }

        public final boolean h() {
            return this.f11438j;
        }

        public void p(f fVar, long j2) {
            k.f(fVar, "source");
            h hVar = h.this;
            if (!k.h0.b.f10365g || !Thread.holdsLock(hVar)) {
                this.f11435g.p(fVar, j2);
                while (this.f11435g.T0() >= 16384) {
                    a(false);
                }
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread currentThread = Thread.currentThread();
            k.b(currentThread, "Thread.currentThread()");
            sb.append(currentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(hVar);
            throw new AssertionError(sb.toString());
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ b(h hVar, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? false : z);
        }
    }
}
