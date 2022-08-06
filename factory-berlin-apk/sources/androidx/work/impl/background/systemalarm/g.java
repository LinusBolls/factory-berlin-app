package androidx.work.impl.background.systemalarm;

import androidx.work.i;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* compiled from: WorkTimer */
class g {

    /* renamed from: f  reason: collision with root package name */
    private static final String f1636f = i.f("WorkTimer");
    private final ThreadFactory a = new a(this);
    private final ScheduledExecutorService b = Executors.newSingleThreadScheduledExecutor(this.a);
    final Map<String, c> c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    final Map<String, b> f1637d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    final Object f1638e = new Object();

    /* compiled from: WorkTimer */
    class a implements ThreadFactory {
        private int a = 0;

        a(g gVar) {
        }

        public Thread newThread(Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
            newThread.setName("WorkManager-WorkTimer-thread-" + this.a);
            this.a = this.a + 1;
            return newThread;
        }
    }

    /* compiled from: WorkTimer */
    interface b {
        void b(String str);
    }

    /* compiled from: WorkTimer */
    static class c implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        private final g f1639g;

        /* renamed from: h  reason: collision with root package name */
        private final String f1640h;

        c(g gVar, String str) {
            this.f1639g = gVar;
            this.f1640h = str;
        }

        public void run() {
            synchronized (this.f1639g.f1638e) {
                if (this.f1639g.c.remove(this.f1640h) != null) {
                    b remove = this.f1639g.f1637d.remove(this.f1640h);
                    if (remove != null) {
                        remove.b(this.f1640h);
                    }
                } else {
                    i.c().a("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", new Object[]{this.f1640h}), new Throwable[0]);
                }
            }
        }
    }

    g() {
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (!this.b.isShutdown()) {
            this.b.shutdownNow();
        }
    }

    /* access modifiers changed from: package-private */
    public void b(String str, long j2, b bVar) {
        synchronized (this.f1638e) {
            i.c().a(f1636f, String.format("Starting timer for %s", new Object[]{str}), new Throwable[0]);
            c(str);
            c cVar = new c(this, str);
            this.c.put(str, cVar);
            this.f1637d.put(str, bVar);
            this.b.schedule(cVar, j2, TimeUnit.MILLISECONDS);
        }
    }

    /* access modifiers changed from: package-private */
    public void c(String str) {
        synchronized (this.f1638e) {
            if (this.c.remove(str) != null) {
                i.c().a(f1636f, String.format("Stopping timer for %s", new Object[]{str}), new Throwable[0]);
                this.f1637d.remove(str);
            }
        }
    }
}
