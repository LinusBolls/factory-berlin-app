package l;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.k;

/* compiled from: Timeout.kt */
public class c0 {

    /* renamed from: d  reason: collision with root package name */
    public static final c0 f11087d = new a();
    private boolean a;
    private long b;
    private long c;

    /* compiled from: Timeout.kt */
    public static final class a extends c0 {
        a() {
        }

        public c0 d(long j2) {
            return this;
        }

        public void f() {
        }

        public c0 g(long j2, TimeUnit timeUnit) {
            k.f(timeUnit, "unit");
            return this;
        }
    }

    /* compiled from: Timeout.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new b((DefaultConstructorMarker) null);
    }

    public c0 a() {
        this.a = false;
        return this;
    }

    public c0 b() {
        this.c = 0;
        return this;
    }

    public long c() {
        if (this.a) {
            return this.b;
        }
        throw new IllegalStateException("No deadline".toString());
    }

    public c0 d(long j2) {
        this.a = true;
        this.b = j2;
        return this;
    }

    public boolean e() {
        return this.a;
    }

    public void f() {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        } else if (this.a && this.b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public c0 g(long j2, TimeUnit timeUnit) {
        k.f(timeUnit, "unit");
        if (j2 >= 0) {
            this.c = timeUnit.toNanos(j2);
            return this;
        }
        throw new IllegalArgumentException(("timeout < 0: " + j2).toString());
    }

    public long h() {
        return this.c;
    }
}
