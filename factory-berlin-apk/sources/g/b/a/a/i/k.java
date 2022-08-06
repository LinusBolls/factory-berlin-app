package g.b.a.a.i;

import java.util.concurrent.Executor;

/* compiled from: SafeLoggingExecutor */
class k implements Executor {

    /* renamed from: g  reason: collision with root package name */
    private final Executor f9280g;

    /* compiled from: SafeLoggingExecutor */
    static class a implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        private final Runnable f9281g;

        a(Runnable runnable) {
            this.f9281g = runnable;
        }

        public void run() {
            try {
                this.f9281g.run();
            } catch (Exception e2) {
                g.b.a.a.i.t.a.c("Executor", "Background execution failure.", e2);
            }
        }
    }

    k(Executor executor) {
        this.f9280g = executor;
    }

    public void execute(Runnable runnable) {
        this.f9280g.execute(new a(runnable));
    }
}
