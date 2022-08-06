package androidx.room;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* compiled from: TransactionExecutor */
class u implements Executor {

    /* renamed from: g  reason: collision with root package name */
    private final Executor f1446g;

    /* renamed from: h  reason: collision with root package name */
    private final ArrayDeque<Runnable> f1447h = new ArrayDeque<>();

    /* renamed from: i  reason: collision with root package name */
    private Runnable f1448i;

    /* compiled from: TransactionExecutor */
    class a implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ Runnable f1449g;

        a(Runnable runnable) {
            this.f1449g = runnable;
        }

        public void run() {
            try {
                this.f1449g.run();
            } finally {
                u.this.a();
            }
        }
    }

    u(Executor executor) {
        this.f1446g = executor;
    }

    /* access modifiers changed from: package-private */
    public synchronized void a() {
        Runnable poll = this.f1447h.poll();
        this.f1448i = poll;
        if (poll != null) {
            this.f1446g.execute(poll);
        }
    }

    public synchronized void execute(Runnable runnable) {
        this.f1447h.offer(new a(runnable));
        if (this.f1448i == null) {
            a();
        }
    }
}
