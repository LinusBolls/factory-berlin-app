package androidx.work;

import android.os.Build;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: Configuration */
public final class b {
    private final Executor a;
    private final Executor b;
    private final s c;

    /* renamed from: d  reason: collision with root package name */
    private final int f1565d;

    /* renamed from: e  reason: collision with root package name */
    private final int f1566e;

    /* renamed from: f  reason: collision with root package name */
    private final int f1567f;

    /* renamed from: g  reason: collision with root package name */
    private final int f1568g;

    /* compiled from: Configuration */
    public static final class a {
        Executor a;
        s b;
        Executor c;

        /* renamed from: d  reason: collision with root package name */
        int f1569d = 4;

        /* renamed from: e  reason: collision with root package name */
        int f1570e = 0;

        /* renamed from: f  reason: collision with root package name */
        int f1571f = Integer.MAX_VALUE;

        /* renamed from: g  reason: collision with root package name */
        int f1572g = 20;

        public b a() {
            return new b(this);
        }
    }

    /* renamed from: androidx.work.b$b  reason: collision with other inner class name */
    /* compiled from: Configuration */
    public interface C0041b {
        b a();
    }

    b(a aVar) {
        Executor executor = aVar.a;
        if (executor == null) {
            this.a = a();
        } else {
            this.a = executor;
        }
        Executor executor2 = aVar.c;
        if (executor2 == null) {
            this.b = a();
        } else {
            this.b = executor2;
        }
        s sVar = aVar.b;
        if (sVar == null) {
            this.c = s.c();
        } else {
            this.c = sVar;
        }
        this.f1565d = aVar.f1569d;
        this.f1566e = aVar.f1570e;
        this.f1567f = aVar.f1571f;
        this.f1568g = aVar.f1572g;
    }

    private Executor a() {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)));
    }

    public Executor b() {
        return this.a;
    }

    public int c() {
        return this.f1567f;
    }

    public int d() {
        if (Build.VERSION.SDK_INT == 23) {
            return this.f1568g / 2;
        }
        return this.f1568g;
    }

    public int e() {
        return this.f1566e;
    }

    public int f() {
        return this.f1565d;
    }

    public Executor g() {
        return this.b;
    }

    public s h() {
        return this.c;
    }
}
