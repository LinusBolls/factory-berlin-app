package kotlinx.coroutines;

import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.c0.g;

/* compiled from: CommonPool.kt */
public final class r extends m1 {

    /* renamed from: h  reason: collision with root package name */
    private static final int f11056h;

    /* renamed from: i  reason: collision with root package name */
    private static boolean f11057i;

    /* renamed from: j  reason: collision with root package name */
    public static final r f11058j = new r();
    private static volatile Executor pool;

    /* compiled from: CommonPool.kt */
    static final class a implements ThreadFactory {
        final /* synthetic */ AtomicInteger a;

        a(AtomicInteger atomicInteger) {
            this.a = atomicInteger;
        }

        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "CommonPool-worker-" + this.a.incrementAndGet());
            thread.setDaemon(true);
            return thread;
        }
    }

    /* compiled from: CommonPool.kt */
    static final class b implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        public static final b f11059g = new b();

        b() {
        }

        public final void run() {
        }
    }

    static {
        String str;
        int i2;
        try {
            str = System.getProperty("kotlinx.coroutines.default.parallelism");
        } catch (Throwable unused) {
            str = null;
        }
        if (str != null) {
            Integer i3 = o.i(str);
            if (i3 == null || i3.intValue() < 1) {
                throw new IllegalStateException(("Expected positive number in kotlinx.coroutines.default.parallelism, but has " + str).toString());
            }
            i2 = i3.intValue();
        } else {
            i2 = -1;
        }
        f11056h = i2;
    }

    private r() {
    }

    private final synchronized Executor F0() {
        Executor executor;
        executor = pool;
        if (executor == null) {
            executor = w0();
            pool = executor;
        }
        return executor;
    }

    private final int G0() {
        Integer valueOf = Integer.valueOf(f11056h);
        if (!(valueOf.intValue() > 0)) {
            valueOf = null;
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return f.b(Runtime.getRuntime().availableProcessors() - 1, 1);
    }

    private final ExecutorService t0() {
        return Executors.newFixedThreadPool(G0(), new a(new AtomicInteger()));
    }

    private final ExecutorService w0() {
        Class<?> cls;
        ExecutorService executorService;
        if (System.getSecurityManager() != null) {
            return t0();
        }
        ExecutorService executorService2 = null;
        try {
            cls = Class.forName("java.util.concurrent.ForkJoinPool");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return t0();
        }
        if (!f11057i && f11056h < 0) {
            try {
                Method method = cls.getMethod("commonPool", new Class[0]);
                Object invoke = method != null ? method.invoke((Object) null, new Object[0]) : null;
                if (!(invoke instanceof ExecutorService)) {
                    invoke = null;
                }
                executorService = (ExecutorService) invoke;
            } catch (Throwable unused2) {
                executorService = null;
            }
            if (executorService != null) {
                if (!f11058j.H0(cls, executorService)) {
                    executorService = null;
                }
                if (executorService != null) {
                    return executorService;
                }
            }
        }
        try {
            Object newInstance = cls.getConstructor(new Class[]{Integer.TYPE}).newInstance(new Object[]{Integer.valueOf(f11058j.G0())});
            if (!(newInstance instanceof ExecutorService)) {
                newInstance = null;
            }
            executorService2 = (ExecutorService) newInstance;
        } catch (Throwable unused3) {
        }
        if (executorService2 != null) {
            return executorService2;
        }
        return t0();
    }

    public final boolean H0(Class<?> cls, ExecutorService executorService) {
        executorService.submit(b.f11059g);
        Integer num = null;
        try {
            Object invoke = cls.getMethod("getPoolSize", new Class[0]).invoke(executorService, new Object[0]);
            if (!(invoke instanceof Integer)) {
                invoke = null;
            }
            num = (Integer) invoke;
        } catch (Throwable unused) {
        }
        if (num == null || num.intValue() < 1) {
            return false;
        }
        return true;
    }

    public void close() {
        throw new IllegalStateException("Close cannot be invoked on CommonPool".toString());
    }

    public void i0(g gVar, Runnable runnable) {
        Runnable runnable2;
        try {
            Executor executor = pool;
            if (executor == null) {
                executor = F0();
            }
            w2 a2 = x2.a();
            if (a2 == null || (runnable2 = a2.c(runnable)) == null) {
                runnable2 = runnable;
            }
            executor.execute(runnable2);
        } catch (RejectedExecutionException unused) {
            w2 a3 = x2.a();
            if (a3 != null) {
                a3.e();
            }
            p0.f11050n.S0(runnable);
        }
    }

    public Executor r0() {
        Executor executor = pool;
        return executor != null ? executor : F0();
    }

    public String toString() {
        return "CommonPool";
    }
}
