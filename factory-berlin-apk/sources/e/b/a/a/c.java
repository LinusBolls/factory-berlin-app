package e.b.a.a;

/* compiled from: TaskExecutor */
public abstract class c {
    public abstract void a(Runnable runnable);

    public void b(Runnable runnable) {
        if (c()) {
            runnable.run();
        } else {
            d(runnable);
        }
    }

    public abstract boolean c();

    public abstract void d(Runnable runnable);
}
