package androidx.work.impl.utils;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* compiled from: SerialExecutor */
public class f implements Executor {

    /* renamed from: g  reason: collision with root package name */
    private final ArrayDeque<a> f1752g = new ArrayDeque<>();

    /* renamed from: h  reason: collision with root package name */
    private final Executor f1753h;

    /* renamed from: i  reason: collision with root package name */
    private final Object f1754i = new Object();

    /* renamed from: j  reason: collision with root package name */
    private volatile Runnable f1755j;

    /* compiled from: SerialExecutor */
    static class a implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        final f f1756g;

        /* renamed from: h  reason: collision with root package name */
        final Runnable f1757h;

        a(f fVar, Runnable runnable) {
            this.f1756g = fVar;
            this.f1757h = runnable;
        }

        public void run() {
            try {
                this.f1757h.run();
            } finally {
                this.f1756g.b();
            }
        }
    }

    public f(Executor executor) {
        this.f1753h = executor;
    }

    public boolean a() {
        boolean z;
        synchronized (this.f1754i) {
            z = !this.f1752g.isEmpty();
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    public void b() {
        synchronized (this.f1754i) {
            Runnable poll = this.f1752g.poll();
            this.f1755j = poll;
            if (poll != null) {
                this.f1753h.execute(this.f1755j);
            }
        }
    }

    public void execute(Runnable runnable) {
        synchronized (this.f1754i) {
            this.f1752g.add(new a(this, runnable));
            if (this.f1755j == null) {
                b();
            }
        }
    }
}
