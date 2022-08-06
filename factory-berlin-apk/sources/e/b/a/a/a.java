package e.b.a.a;

import java.util.concurrent.Executor;

/* compiled from: ArchTaskExecutor */
public class a extends c {
    private static volatile a c;

    /* renamed from: d  reason: collision with root package name */
    private static final Executor f8413d = new C0553a();

    /* renamed from: e  reason: collision with root package name */
    private static final Executor f8414e = new b();
    private c a;
    private c b;

    /* renamed from: e.b.a.a.a$a  reason: collision with other inner class name */
    /* compiled from: ArchTaskExecutor */
    static class C0553a implements Executor {
        C0553a() {
        }

        public void execute(Runnable runnable) {
            a.f().d(runnable);
        }
    }

    /* compiled from: ArchTaskExecutor */
    static class b implements Executor {
        b() {
        }

        public void execute(Runnable runnable) {
            a.f().a(runnable);
        }
    }

    private a() {
        b bVar = new b();
        this.b = bVar;
        this.a = bVar;
    }

    public static Executor e() {
        return f8414e;
    }

    public static a f() {
        if (c != null) {
            return c;
        }
        synchronized (a.class) {
            if (c == null) {
                c = new a();
            }
        }
        return c;
    }

    public static Executor g() {
        return f8413d;
    }

    public void a(Runnable runnable) {
        this.a.a(runnable);
    }

    public boolean c() {
        return this.a.c();
    }

    public void d(Runnable runnable) {
        this.a.d(runnable);
    }
}
