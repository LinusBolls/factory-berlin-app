package l;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.k;
import kotlin.x;

/* compiled from: AsyncTimeout.kt */
public class d extends c0 {
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final long f11088h = TimeUnit.SECONDS.toMillis(60);
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public static final long f11089i = TimeUnit.MILLISECONDS.toNanos(f11088h);
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public static d f11090j;

    /* renamed from: k  reason: collision with root package name */
    public static final a f11091k = new a((DefaultConstructorMarker) null);

    /* renamed from: e  reason: collision with root package name */
    private boolean f11092e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public d f11093f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public long f11094g;

    /* compiled from: AsyncTimeout.kt */
    public static final class a {
        private a() {
        }

        /* access modifiers changed from: private */
        public final boolean d(d dVar) {
            synchronized (d.class) {
                for (d i2 = d.f11090j; i2 != null; i2 = i2.f11093f) {
                    if (i2.f11093f == dVar) {
                        i2.f11093f = dVar.f11093f;
                        dVar.f11093f = null;
                        return false;
                    }
                }
                return true;
            }
        }

        /* access modifiers changed from: private */
        public final void e(d dVar, long j2, boolean z) {
            Class<d> cls = d.class;
            synchronized (cls) {
                if (d.f11090j == null) {
                    d.f11090j = new d();
                    new b().start();
                }
                long nanoTime = System.nanoTime();
                int i2 = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
                if (i2 != 0 && z) {
                    dVar.f11094g = Math.min(j2, dVar.c() - nanoTime) + nanoTime;
                } else if (i2 != 0) {
                    dVar.f11094g = j2 + nanoTime;
                } else if (z) {
                    dVar.f11094g = dVar.c();
                } else {
                    throw new AssertionError();
                }
                long n2 = dVar.u(nanoTime);
                d i3 = d.f11090j;
                if (i3 != null) {
                    while (true) {
                        if (i3.f11093f != null) {
                            d l2 = i3.f11093f;
                            if (l2 == null) {
                                k.m();
                                throw null;
                            } else if (n2 < l2.u(nanoTime)) {
                                break;
                            } else {
                                i3 = i3.f11093f;
                                if (i3 == null) {
                                    k.m();
                                    throw null;
                                }
                            }
                        }
                    }
                    dVar.f11093f = i3.f11093f;
                    i3.f11093f = dVar;
                    if (i3 == d.f11090j) {
                        cls.notify();
                    }
                    x xVar = x.a;
                } else {
                    k.m();
                    throw null;
                }
            }
        }

        public final d c() {
            Class<d> cls = d.class;
            d i2 = d.f11090j;
            if (i2 != null) {
                d l2 = i2.f11093f;
                if (l2 == null) {
                    long nanoTime = System.nanoTime();
                    cls.wait(d.f11088h);
                    d i3 = d.f11090j;
                    if (i3 == null) {
                        k.m();
                        throw null;
                    } else if (i3.f11093f != null || System.nanoTime() - nanoTime < d.f11089i) {
                        return null;
                    } else {
                        return d.f11090j;
                    }
                } else {
                    long n2 = l2.u(System.nanoTime());
                    if (n2 > 0) {
                        long j2 = n2 / 1000000;
                        cls.wait(j2, (int) (n2 - (1000000 * j2)));
                        return null;
                    }
                    d i4 = d.f11090j;
                    if (i4 != null) {
                        i4.f11093f = l2.f11093f;
                        l2.f11093f = null;
                        return l2;
                    }
                    k.m();
                    throw null;
                }
            } else {
                k.m();
                throw null;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: AsyncTimeout.kt */
    private static final class b extends Thread {
        public b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0018, code lost:
            if (r1 == null) goto L_0x0000;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x001a, code lost:
            r1.x();
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r3 = this;
            L_0x0000:
                java.lang.Class<l.d> r0 = l.d.class
                monitor-enter(r0)     // Catch:{ InterruptedException -> 0x0000 }
                l.d$a r1 = l.d.f11091k     // Catch:{ all -> 0x001e }
                l.d r1 = r1.c()     // Catch:{ all -> 0x001e }
                l.d r2 = l.d.f11090j     // Catch:{ all -> 0x001e }
                if (r1 != r2) goto L_0x0015
                r1 = 0
                l.d.f11090j = r1     // Catch:{ all -> 0x001e }
                monitor-exit(r0)     // Catch:{ InterruptedException -> 0x0000 }
                return
            L_0x0015:
                kotlin.x r2 = kotlin.x.a     // Catch:{ all -> 0x001e }
                monitor-exit(r0)     // Catch:{ InterruptedException -> 0x0000 }
                if (r1 == 0) goto L_0x0000
                r1.x()     // Catch:{ InterruptedException -> 0x0000 }
                goto L_0x0000
            L_0x001e:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ InterruptedException -> 0x0000 }
                throw r1     // Catch:{ InterruptedException -> 0x0000 }
            */
            throw new UnsupportedOperationException("Method not decompiled: l.d.b.run():void");
        }
    }

    /* compiled from: AsyncTimeout.kt */
    public static final class c implements z {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ d f11095g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ z f11096h;

        c(d dVar, z zVar) {
            this.f11095g = dVar;
            this.f11096h = zVar;
        }

        /* renamed from: a */
        public d e() {
            return this.f11095g;
        }

        public void close() {
            d dVar = this.f11095g;
            dVar.r();
            try {
                this.f11096h.close();
                x xVar = x.a;
                if (dVar.s()) {
                    throw dVar.m((IOException) null);
                }
            } catch (IOException e2) {
                e = e2;
                if (dVar.s()) {
                    e = dVar.m(e);
                }
                throw e;
            } finally {
                boolean s = dVar.s();
            }
        }

        public void flush() {
            d dVar = this.f11095g;
            dVar.r();
            try {
                this.f11096h.flush();
                x xVar = x.a;
                if (dVar.s()) {
                    throw dVar.m((IOException) null);
                }
            } catch (IOException e2) {
                e = e2;
                if (dVar.s()) {
                    e = dVar.m(e);
                }
                throw e;
            } finally {
                boolean s = dVar.s();
            }
        }

        public void p(f fVar, long j2) {
            k.f(fVar, "source");
            c.b(fVar.T0(), 0, j2);
            while (true) {
                long j3 = 0;
                if (j2 > 0) {
                    w wVar = fVar.f11099g;
                    if (wVar != null) {
                        while (true) {
                            if (j3 >= ((long) 65536)) {
                                break;
                            }
                            j3 += (long) (wVar.c - wVar.b);
                            if (j3 >= j2) {
                                j3 = j2;
                                break;
                            }
                            wVar = wVar.f11136f;
                            if (wVar == null) {
                                k.m();
                                throw null;
                            }
                        }
                        d dVar = this.f11095g;
                        dVar.r();
                        try {
                            this.f11096h.p(fVar, j3);
                            x xVar = x.a;
                            if (!dVar.s()) {
                                j2 -= j3;
                            } else {
                                throw dVar.m((IOException) null);
                            }
                        } catch (IOException e2) {
                            e = e2;
                            if (dVar.s()) {
                                e = dVar.m(e);
                            }
                            throw e;
                        } finally {
                            boolean s = dVar.s();
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

        public String toString() {
            return "AsyncTimeout.sink(" + this.f11096h + ')';
        }
    }

    /* renamed from: l.d$d  reason: collision with other inner class name */
    /* compiled from: AsyncTimeout.kt */
    public static final class C0780d implements b0 {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ d f11097g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ b0 f11098h;

        C0780d(d dVar, b0 b0Var) {
            this.f11097g = dVar;
            this.f11098h = b0Var;
        }

        /* renamed from: a */
        public d e() {
            return this.f11097g;
        }

        public void close() {
            d dVar = this.f11097g;
            dVar.r();
            try {
                this.f11098h.close();
                x xVar = x.a;
                if (dVar.s()) {
                    throw dVar.m((IOException) null);
                }
            } catch (IOException e2) {
                e = e2;
                if (dVar.s()) {
                    e = dVar.m(e);
                }
                throw e;
            } finally {
                boolean s = dVar.s();
            }
        }

        public long g0(f fVar, long j2) {
            k.f(fVar, "sink");
            d dVar = this.f11097g;
            dVar.r();
            try {
                long g0 = this.f11098h.g0(fVar, j2);
                if (!dVar.s()) {
                    return g0;
                }
                throw dVar.m((IOException) null);
            } catch (IOException e2) {
                e = e2;
                if (dVar.s()) {
                    e = dVar.m(e);
                }
                throw e;
            } finally {
                boolean s = dVar.s();
            }
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.f11098h + ')';
        }
    }

    /* access modifiers changed from: private */
    public final long u(long j2) {
        return this.f11094g - j2;
    }

    public final IOException m(IOException iOException) {
        return t(iOException);
    }

    public final void r() {
        if (!this.f11092e) {
            long h2 = h();
            boolean e2 = e();
            if (h2 != 0 || e2) {
                this.f11092e = true;
                f11091k.e(this, h2, e2);
                return;
            }
            return;
        }
        throw new IllegalStateException("Unbalanced enter/exit".toString());
    }

    public final boolean s() {
        if (!this.f11092e) {
            return false;
        }
        this.f11092e = false;
        return f11091k.d(this);
    }

    /* access modifiers changed from: protected */
    public IOException t(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final z v(z zVar) {
        k.f(zVar, "sink");
        return new c(this, zVar);
    }

    public final b0 w(b0 b0Var) {
        k.f(b0Var, "source");
        return new C0780d(this, b0Var);
    }

    /* access modifiers changed from: protected */
    public void x() {
    }
}
