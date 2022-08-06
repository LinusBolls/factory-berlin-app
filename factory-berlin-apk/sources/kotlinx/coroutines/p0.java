package kotlinx.coroutines;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* compiled from: DefaultExecutor.kt */
public final class p0 extends h1 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: m  reason: collision with root package name */
    private static final long f11049m;

    /* renamed from: n  reason: collision with root package name */
    public static final p0 f11050n;

    static {
        Long l2;
        p0 p0Var = new p0();
        f11050n = p0Var;
        g1.H0(p0Var, false, 1, (Object) null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l2 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000);
        } catch (SecurityException unused) {
            l2 = 1000L;
        }
        f11049m = timeUnit.toNanos(l2.longValue());
    }

    private p0() {
    }

    private final synchronized void e1() {
        if (g1()) {
            debugStatus = 3;
            Y0();
            notifyAll();
        }
    }

    private final synchronized Thread f1() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    private final boolean g1() {
        int i2 = debugStatus;
        return i2 == 2 || i2 == 3;
    }

    private final synchronized boolean h1() {
        if (g1()) {
            return false;
        }
        debugStatus = 1;
        notifyAll();
        return true;
    }

    /* access modifiers changed from: protected */
    public Thread M0() {
        Thread thread = _thread;
        return thread != null ? thread : f1();
    }

    public c1 U(long j2, Runnable runnable) {
        return b1(j2, runnable);
    }

    public void run() {
        v2.b.c(this);
        w2 a = x2.a();
        if (a != null) {
            a.d();
        }
        try {
            if (h1()) {
                long j2 = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long W0 = W0();
                    if (W0 == Long.MAX_VALUE) {
                        w2 a2 = x2.a();
                        long a3 = a2 != null ? a2.a() : System.nanoTime();
                        if (j2 == Long.MAX_VALUE) {
                            j2 = f11049m + a3;
                        }
                        long j3 = j2 - a3;
                        if (j3 <= 0) {
                            _thread = null;
                            e1();
                            w2 a4 = x2.a();
                            if (a4 != null) {
                                a4.g();
                            }
                            if (!V0()) {
                                M0();
                                return;
                            }
                            return;
                        }
                        W0 = f.e(W0, j3);
                    } else {
                        j2 = Long.MAX_VALUE;
                    }
                    if (W0 > 0) {
                        if (g1()) {
                            _thread = null;
                            e1();
                            w2 a5 = x2.a();
                            if (a5 != null) {
                                a5.g();
                            }
                            if (!V0()) {
                                M0();
                                return;
                            }
                            return;
                        }
                        w2 a6 = x2.a();
                        if (a6 != null) {
                            a6.b(this, W0);
                        } else {
                            LockSupport.parkNanos(this, W0);
                        }
                    }
                }
            }
        } finally {
            _thread = null;
            e1();
            w2 a7 = x2.a();
            if (a7 != null) {
                a7.g();
            }
            if (!V0()) {
                M0();
            }
        }
    }
}
