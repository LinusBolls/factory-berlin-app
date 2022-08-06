package okhttp3.internal.connection;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import k.b0;
import k.d0;
import k.f;
import k.g;
import k.h0.i.h;
import k.p;
import k.r;
import k.v;
import k.z;
import kotlin.jvm.internal.k;
import kotlin.x;
import l.d;

/* compiled from: RealCall.kt */
public final class e implements k.e {

    /* renamed from: g  reason: collision with root package name */
    private final h f11288g;

    /* renamed from: h  reason: collision with root package name */
    private final r f11289h = this.v.y().a(this);
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final c f11290i;

    /* renamed from: j  reason: collision with root package name */
    private final AtomicBoolean f11291j;

    /* renamed from: k  reason: collision with root package name */
    private Object f11292k;

    /* renamed from: l  reason: collision with root package name */
    private d f11293l;

    /* renamed from: m  reason: collision with root package name */
    private f f11294m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f11295n;
    private c o;
    private boolean p;
    private boolean q;
    private boolean r;
    private volatile boolean s;
    private volatile c t;
    private volatile f u;
    private final z v;
    private final b0 w;
    private final boolean x;

    /* compiled from: RealCall.kt */
    public final class a implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        private volatile AtomicInteger f11296g = new AtomicInteger(0);

        /* renamed from: h  reason: collision with root package name */
        private final f f11297h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ e f11298i;

        public a(e eVar, f fVar) {
            k.f(fVar, "responseCallback");
            this.f11298i = eVar;
            this.f11297h = fVar;
        }

        public final void a(ExecutorService executorService) {
            k.f(executorService, "executorService");
            p w = this.f11298i.s().w();
            if (!k.h0.b.f10365g || !Thread.holdsLock(w)) {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e2) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e2);
                    this.f11298i.B(interruptedIOException);
                    this.f11297h.b(this.f11298i, interruptedIOException);
                    this.f11298i.s().w().f(this);
                } catch (Throwable th) {
                    this.f11298i.s().w().f(this);
                    throw th;
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Thread ");
                Thread currentThread = Thread.currentThread();
                k.b(currentThread, "Thread.currentThread()");
                sb.append(currentThread.getName());
                sb.append(" MUST NOT hold lock on ");
                sb.append(w);
                throw new AssertionError(sb.toString());
            }
        }

        public final e b() {
            return this.f11298i;
        }

        public final AtomicInteger c() {
            return this.f11296g;
        }

        public final String d() {
            return this.f11298i.x().k().i();
        }

        public final void e(a aVar) {
            k.f(aVar, "other");
            this.f11296g = aVar.f11296g;
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x005b A[Catch:{ all -> 0x007c, all -> 0x00c9 }] */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0083 A[Catch:{ all -> 0x007c, all -> 0x00c9 }] */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x00a5 A[Catch:{ all -> 0x007c, all -> 0x00c9 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r6 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "OkHttp "
                r0.append(r1)
                okhttp3.internal.connection.e r1 = r6.f11298i
                java.lang.String r1 = r1.C()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                java.lang.String r2 = "currentThread"
                kotlin.jvm.internal.k.b(r1, r2)
                java.lang.String r2 = r1.getName()
                r1.setName(r0)
                r0 = 0
                okhttp3.internal.connection.e r3 = r6.f11298i     // Catch:{ all -> 0x00c9 }
                okhttp3.internal.connection.e$c r3 = r3.f11290i     // Catch:{ all -> 0x00c9 }
                r3.r()     // Catch:{ all -> 0x00c9 }
                okhttp3.internal.connection.e r3 = r6.f11298i     // Catch:{ IOException -> 0x007e, all -> 0x0051 }
                k.d0 r0 = r3.y()     // Catch:{ IOException -> 0x007e, all -> 0x0051 }
                r3 = 1
                k.f r4 = r6.f11297h     // Catch:{ IOException -> 0x004f, all -> 0x004d }
                okhttp3.internal.connection.e r5 = r6.f11298i     // Catch:{ IOException -> 0x004f, all -> 0x004d }
                r4.a(r5, r0)     // Catch:{ IOException -> 0x004f, all -> 0x004d }
                okhttp3.internal.connection.e r0 = r6.f11298i     // Catch:{ all -> 0x00c9 }
                k.z r0 = r0.s()     // Catch:{ all -> 0x00c9 }
                k.p r0 = r0.w()     // Catch:{ all -> 0x00c9 }
            L_0x0049:
                r0.f(r6)     // Catch:{ all -> 0x00c9 }
                goto L_0x00b7
            L_0x004d:
                r0 = move-exception
                goto L_0x0054
            L_0x004f:
                r0 = move-exception
                goto L_0x0081
            L_0x0051:
                r3 = move-exception
                r0 = r3
                r3 = 0
            L_0x0054:
                okhttp3.internal.connection.e r4 = r6.f11298i     // Catch:{ all -> 0x007c }
                r4.cancel()     // Catch:{ all -> 0x007c }
                if (r3 != 0) goto L_0x007b
                java.io.IOException r3 = new java.io.IOException     // Catch:{ all -> 0x007c }
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x007c }
                r4.<init>()     // Catch:{ all -> 0x007c }
                java.lang.String r5 = "canceled due to "
                r4.append(r5)     // Catch:{ all -> 0x007c }
                r4.append(r0)     // Catch:{ all -> 0x007c }
                java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x007c }
                r3.<init>(r4)     // Catch:{ all -> 0x007c }
                r3.addSuppressed(r0)     // Catch:{ all -> 0x007c }
                k.f r4 = r6.f11297h     // Catch:{ all -> 0x007c }
                okhttp3.internal.connection.e r5 = r6.f11298i     // Catch:{ all -> 0x007c }
                r4.b(r5, r3)     // Catch:{ all -> 0x007c }
            L_0x007b:
                throw r0     // Catch:{ all -> 0x007c }
            L_0x007c:
                r0 = move-exception
                goto L_0x00bb
            L_0x007e:
                r3 = move-exception
                r0 = r3
                r3 = 0
            L_0x0081:
                if (r3 == 0) goto L_0x00a5
                k.h0.i.h$a r3 = k.h0.i.h.c     // Catch:{ all -> 0x007c }
                k.h0.i.h r3 = r3.g()     // Catch:{ all -> 0x007c }
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x007c }
                r4.<init>()     // Catch:{ all -> 0x007c }
                java.lang.String r5 = "Callback failure for "
                r4.append(r5)     // Catch:{ all -> 0x007c }
                okhttp3.internal.connection.e r5 = r6.f11298i     // Catch:{ all -> 0x007c }
                java.lang.String r5 = r5.I()     // Catch:{ all -> 0x007c }
                r4.append(r5)     // Catch:{ all -> 0x007c }
                java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x007c }
                r5 = 4
                r3.k(r4, r5, r0)     // Catch:{ all -> 0x007c }
                goto L_0x00ac
            L_0x00a5:
                k.f r3 = r6.f11297h     // Catch:{ all -> 0x007c }
                okhttp3.internal.connection.e r4 = r6.f11298i     // Catch:{ all -> 0x007c }
                r3.b(r4, r0)     // Catch:{ all -> 0x007c }
            L_0x00ac:
                okhttp3.internal.connection.e r0 = r6.f11298i     // Catch:{ all -> 0x00c9 }
                k.z r0 = r0.s()     // Catch:{ all -> 0x00c9 }
                k.p r0 = r0.w()     // Catch:{ all -> 0x00c9 }
                goto L_0x0049
            L_0x00b7:
                r1.setName(r2)
                return
            L_0x00bb:
                okhttp3.internal.connection.e r3 = r6.f11298i     // Catch:{ all -> 0x00c9 }
                k.z r3 = r3.s()     // Catch:{ all -> 0x00c9 }
                k.p r3 = r3.w()     // Catch:{ all -> 0x00c9 }
                r3.f(r6)     // Catch:{ all -> 0x00c9 }
                throw r0     // Catch:{ all -> 0x00c9 }
            L_0x00c9:
                r0 = move-exception
                r1.setName(r2)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.e.a.run():void");
        }
    }

    /* compiled from: RealCall.kt */
    public static final class b extends WeakReference<e> {
        private final Object a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(e eVar, Object obj) {
            super(eVar);
            k.f(eVar, "referent");
            this.a = obj;
        }

        public final Object a() {
            return this.a;
        }
    }

    /* compiled from: RealCall.kt */
    public static final class c extends d {

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ e f11299l;

        c(e eVar) {
            this.f11299l = eVar;
        }

        /* access modifiers changed from: protected */
        public void x() {
            this.f11299l.cancel();
        }
    }

    public e(z zVar, b0 b0Var, boolean z) {
        k.f(zVar, "client");
        k.f(b0Var, "originalRequest");
        this.v = zVar;
        this.w = b0Var;
        this.x = z;
        this.f11288g = zVar.t().a();
        c cVar = new c(this);
        cVar.g((long) this.v.m(), TimeUnit.MILLISECONDS);
        this.f11290i = cVar;
        this.f11291j = new AtomicBoolean();
        this.r = true;
    }

    private final <E extends IOException> E H(E e2) {
        if (this.f11295n || !this.f11290i.s()) {
            return e2;
        }
        E interruptedIOException = new InterruptedIOException("timeout");
        if (e2 != null) {
            interruptedIOException.initCause(e2);
        }
        return interruptedIOException;
    }

    /* access modifiers changed from: private */
    public final String I() {
        StringBuilder sb = new StringBuilder();
        sb.append(n() ? "canceled " : "");
        sb.append(this.x ? "web socket" : "call");
        sb.append(" to ");
        sb.append(C());
        return sb.toString();
    }

    private final <E extends IOException> E f(E e2) {
        Socket D;
        if (!k.h0.b.f10365g || !Thread.holdsLock(this)) {
            f fVar = this.f11294m;
            if (fVar != null) {
                if (!k.h0.b.f10365g || !Thread.holdsLock(fVar)) {
                    synchronized (fVar) {
                        D = D();
                    }
                    if (this.f11294m == null) {
                        if (D != null) {
                            k.h0.b.k(D);
                        }
                        this.f11289h.l(this, fVar);
                    } else {
                        if (!(D == null)) {
                            throw new IllegalStateException("Check failed.".toString());
                        }
                    }
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Thread ");
                    Thread currentThread = Thread.currentThread();
                    k.b(currentThread, "Thread.currentThread()");
                    sb.append(currentThread.getName());
                    sb.append(" MUST NOT hold lock on ");
                    sb.append(fVar);
                    throw new AssertionError(sb.toString());
                }
            }
            E H = H(e2);
            if (e2 != null) {
                r rVar = this.f11289h;
                if (H != null) {
                    rVar.e(this, H);
                } else {
                    k.m();
                    throw null;
                }
            } else {
                this.f11289h.d(this);
            }
            return H;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Thread ");
        Thread currentThread2 = Thread.currentThread();
        k.b(currentThread2, "Thread.currentThread()");
        sb2.append(currentThread2.getName());
        sb2.append(" MUST NOT hold lock on ");
        sb2.append(this);
        throw new AssertionError(sb2.toString());
    }

    private final void g() {
        this.f11292k = h.c.g().i("response.body().close()");
        this.f11289h.f(this);
    }

    private final k.a m(v vVar) {
        g gVar;
        HostnameVerifier hostnameVerifier;
        SSLSocketFactory sSLSocketFactory;
        if (vVar.j()) {
            SSLSocketFactory R = this.v.R();
            hostnameVerifier = this.v.C();
            sSLSocketFactory = R;
            gVar = this.v.r();
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            gVar = null;
        }
        return new k.a(vVar.i(), vVar.o(), this.v.x(), this.v.Q(), sSLSocketFactory, hostnameVerifier, gVar, this.v.M(), this.v.J(), this.v.I(), this.v.u(), this.v.N());
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0023 A[Catch:{ all -> 0x0019 }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0027 A[Catch:{ all -> 0x0019 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0031 A[Catch:{ all -> 0x0019 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0033 A[Catch:{ all -> 0x0019 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0040 A[Catch:{ all -> 0x0019 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0041 A[Catch:{ all -> 0x0019 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <E extends java.io.IOException> E A(okhttp3.internal.connection.c r3, boolean r4, boolean r5, E r6) {
        /*
            r2 = this;
            java.lang.String r0 = "exchange"
            kotlin.jvm.internal.k.f(r3, r0)
            okhttp3.internal.connection.c r0 = r2.t
            boolean r3 = kotlin.jvm.internal.k.a(r3, r0)
            r0 = 1
            r3 = r3 ^ r0
            if (r3 == 0) goto L_0x0010
            return r6
        L_0x0010:
            monitor-enter(r2)
            r3 = 0
            if (r4 == 0) goto L_0x001b
            boolean r1 = r2.p     // Catch:{ all -> 0x0019 }
            if (r1 != 0) goto L_0x0021
            goto L_0x001b
        L_0x0019:
            r3 = move-exception
            goto L_0x005c
        L_0x001b:
            if (r5 == 0) goto L_0x0044
            boolean r1 = r2.q     // Catch:{ all -> 0x0019 }
            if (r1 == 0) goto L_0x0044
        L_0x0021:
            if (r4 == 0) goto L_0x0025
            r2.p = r3     // Catch:{ all -> 0x0019 }
        L_0x0025:
            if (r5 == 0) goto L_0x0029
            r2.q = r3     // Catch:{ all -> 0x0019 }
        L_0x0029:
            boolean r4 = r2.p     // Catch:{ all -> 0x0019 }
            if (r4 != 0) goto L_0x0033
            boolean r4 = r2.q     // Catch:{ all -> 0x0019 }
            if (r4 != 0) goto L_0x0033
            r4 = 1
            goto L_0x0034
        L_0x0033:
            r4 = 0
        L_0x0034:
            boolean r5 = r2.p     // Catch:{ all -> 0x0019 }
            if (r5 != 0) goto L_0x0041
            boolean r5 = r2.q     // Catch:{ all -> 0x0019 }
            if (r5 != 0) goto L_0x0041
            boolean r5 = r2.r     // Catch:{ all -> 0x0019 }
            if (r5 != 0) goto L_0x0041
            goto L_0x0042
        L_0x0041:
            r0 = 0
        L_0x0042:
            r3 = r4
            goto L_0x0045
        L_0x0044:
            r0 = 0
        L_0x0045:
            kotlin.x r4 = kotlin.x.a     // Catch:{ all -> 0x0019 }
            monitor-exit(r2)
            if (r3 == 0) goto L_0x0054
            r3 = 0
            r2.t = r3
            okhttp3.internal.connection.f r3 = r2.f11294m
            if (r3 == 0) goto L_0x0054
            r3.t()
        L_0x0054:
            if (r0 == 0) goto L_0x005b
            java.io.IOException r3 = r2.f(r6)
            return r3
        L_0x005b:
            return r6
        L_0x005c:
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.e.A(okhttp3.internal.connection.c, boolean, boolean, java.io.IOException):java.io.IOException");
    }

    public final IOException B(IOException iOException) {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.r) {
                this.r = false;
                if (!this.p && !this.q) {
                    z = true;
                }
            }
            x xVar = x.a;
        }
        return z ? f(iOException) : iOException;
    }

    public final String C() {
        return this.w.k().q();
    }

    public final Socket D() {
        f fVar = this.f11294m;
        if (fVar == null) {
            k.m();
            throw null;
        } else if (!k.h0.b.f10365g || Thread.holdsLock(fVar)) {
            List<Reference<e>> o2 = fVar.o();
            Iterator<Reference<e>> it = o2.iterator();
            boolean z = false;
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                } else if (k.a((e) it.next().get(), this)) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 != -1) {
                z = true;
            }
            if (z) {
                o2.remove(i2);
                this.f11294m = null;
                if (o2.isEmpty()) {
                    fVar.C(System.nanoTime());
                    if (this.f11288g.c(fVar)) {
                        return fVar.E();
                    }
                }
                return null;
            }
            throw new IllegalStateException("Check failed.".toString());
        } else {
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

    public final boolean E() {
        d dVar = this.f11293l;
        if (dVar != null) {
            return dVar.e();
        }
        k.m();
        throw null;
    }

    public final void F(f fVar) {
        this.u = fVar;
    }

    public final void G() {
        if (!this.f11295n) {
            this.f11295n = true;
            this.f11290i.s();
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public void K(f fVar) {
        k.f(fVar, "responseCallback");
        if (this.f11291j.compareAndSet(false, true)) {
            g();
            this.v.w().a(new a(this, fVar));
            return;
        }
        throw new IllegalStateException("Already Executed".toString());
    }

    public d0 a() {
        if (this.f11291j.compareAndSet(false, true)) {
            this.f11290i.r();
            g();
            try {
                this.v.w().b(this);
                return y();
            } finally {
                this.v.w().g(this);
            }
        } else {
            throw new IllegalStateException("Already Executed".toString());
        }
    }

    public void cancel() {
        if (!this.s) {
            this.s = true;
            c cVar = this.t;
            if (cVar != null) {
                cVar.b();
            }
            f fVar = this.u;
            if (fVar != null) {
                fVar.e();
            }
            this.f11289h.g(this);
        }
    }

    public final void e(f fVar) {
        k.f(fVar, "connection");
        if (!k.h0.b.f10365g || Thread.holdsLock(fVar)) {
            if (this.f11294m == null) {
                this.f11294m = fVar;
                fVar.o().add(new b(this, this.f11292k));
                return;
            }
            throw new IllegalStateException("Check failed.".toString());
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

    /* renamed from: h */
    public e clone() {
        return new e(this.v, this.w, this.x);
    }

    public b0 j() {
        return this.w;
    }

    public boolean n() {
        return this.s;
    }

    public final void p(b0 b0Var, boolean z) {
        k.f(b0Var, "request");
        if (this.o == null) {
            synchronized (this) {
                if (!(!this.q)) {
                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()".toString());
                } else if (!this.p) {
                    x xVar = x.a;
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
            if (z) {
                this.f11293l = new d(this.f11288g, m(b0Var.k()), this, this.f11289h);
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final void r(boolean z) {
        c cVar;
        synchronized (this) {
            if (this.r) {
                x xVar = x.a;
            } else {
                throw new IllegalStateException("released".toString());
            }
        }
        if (z && (cVar = this.t) != null) {
            cVar.d();
        }
        this.o = null;
    }

    public final z s() {
        return this.v;
    }

    public final f t() {
        return this.f11294m;
    }

    public final r u() {
        return this.f11289h;
    }

    public final boolean v() {
        return this.x;
    }

    public final c w() {
        return this.o;
    }

    public final b0 x() {
        return this.w;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final k.d0 y() {
        /*
            r10 = this;
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            k.z r0 = r10.v
            java.util.List r0 = r0.D()
            boolean unused = kotlin.a0.s.s(r2, r0)
            k.h0.f.j r0 = new k.h0.f.j
            k.z r1 = r10.v
            r0.<init>(r1)
            r2.add(r0)
            k.h0.f.a r0 = new k.h0.f.a
            k.z r1 = r10.v
            k.n r1 = r1.v()
            r0.<init>(r1)
            r2.add(r0)
            k.h0.d.a r0 = new k.h0.d.a
            k.z r1 = r10.v
            k.c r1 = r1.h()
            r0.<init>(r1)
            r2.add(r0)
            okhttp3.internal.connection.a r0 = okhttp3.internal.connection.a.b
            r2.add(r0)
            boolean r0 = r10.x
            if (r0 != 0) goto L_0x0046
            k.z r0 = r10.v
            java.util.List r0 = r0.F()
            boolean unused = kotlin.a0.s.s(r2, r0)
        L_0x0046:
            k.h0.f.b r0 = new k.h0.f.b
            boolean r1 = r10.x
            r0.<init>(r1)
            r2.add(r0)
            k.h0.f.g r9 = new k.h0.f.g
            r3 = 0
            r4 = 0
            k.b0 r5 = r10.w
            k.z r0 = r10.v
            int r6 = r0.s()
            k.z r0 = r10.v
            int r7 = r0.O()
            k.z r0 = r10.v
            int r8 = r0.T()
            r0 = r9
            r1 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = 0
            r1 = 0
            k.b0 r2 = r10.w     // Catch:{ IOException -> 0x008c, all -> 0x008a }
            k.d0 r2 = r9.a(r2)     // Catch:{ IOException -> 0x008c, all -> 0x008a }
            boolean r3 = r10.n()     // Catch:{ IOException -> 0x008c, all -> 0x008a }
            if (r3 != 0) goto L_0x007f
            r10.B(r1)
            return r2
        L_0x007f:
            k.h0.b.j(r2)     // Catch:{ IOException -> 0x008c, all -> 0x008a }
            java.io.IOException r2 = new java.io.IOException     // Catch:{ IOException -> 0x008c, all -> 0x008a }
            java.lang.String r3 = "Canceled"
            r2.<init>(r3)     // Catch:{ IOException -> 0x008c, all -> 0x008a }
            throw r2     // Catch:{ IOException -> 0x008c, all -> 0x008a }
        L_0x008a:
            r2 = move-exception
            goto L_0x00a0
        L_0x008c:
            r0 = move-exception
            r2 = 1
            java.io.IOException r0 = r10.B(r0)     // Catch:{ all -> 0x009d }
            if (r0 != 0) goto L_0x009c
            kotlin.TypeCastException r0 = new kotlin.TypeCastException     // Catch:{ all -> 0x009d }
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Throwable"
            r0.<init>(r3)     // Catch:{ all -> 0x009d }
            throw r0     // Catch:{ all -> 0x009d }
        L_0x009c:
            throw r0     // Catch:{ all -> 0x009d }
        L_0x009d:
            r0 = move-exception
            r2 = r0
            r0 = 1
        L_0x00a0:
            if (r0 != 0) goto L_0x00a5
            r10.B(r1)
        L_0x00a5:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.e.y():k.d0");
    }

    public final c z(k.h0.f.g gVar) {
        k.f(gVar, "chain");
        synchronized (this) {
            if (!this.r) {
                throw new IllegalStateException("released".toString());
            } else if (!(!this.q)) {
                throw new IllegalStateException("Check failed.".toString());
            } else if (!this.p) {
                x xVar = x.a;
            } else {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        d dVar = this.f11293l;
        if (dVar != null) {
            c cVar = new c(this, this.f11289h, dVar, dVar.a(this.v, gVar));
            this.o = cVar;
            this.t = cVar;
            synchronized (this) {
                this.p = true;
                this.q = true;
                x xVar2 = x.a;
            }
            if (!this.s) {
                return cVar;
            }
            throw new IOException("Canceled");
        }
        k.m();
        throw null;
    }
}
