package g.e.e;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.j;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.v;
import kotlin.x;

/* compiled from: Executioner.kt */
public final class a {
    static final /* synthetic */ kotlin.h0.f[] a;
    /* access modifiers changed from: private */
    public static Executor b;
    private static final kotlin.e c = g.a(f.f9791h);

    /* renamed from: d  reason: collision with root package name */
    private static final kotlin.e f9776d = g.a(e.f9790h);

    /* renamed from: e  reason: collision with root package name */
    private static final kotlin.e f9777e = g.a(d.f9789h);

    /* renamed from: f  reason: collision with root package name */
    public static final a f9778f = new a();

    /* renamed from: g.e.e.a$a  reason: collision with other inner class name */
    /* compiled from: Executioner.kt */
    public static final class C0667a implements Executor {

        /* renamed from: i  reason: collision with root package name */
        static final /* synthetic */ kotlin.h0.f[] f9779i;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public final HandlerThread f9780g;

        /* renamed from: h  reason: collision with root package name */
        private final kotlin.e f9781h = g.a(new C0668a(this));

        /* renamed from: g.e.e.a$a$a  reason: collision with other inner class name */
        /* compiled from: Executioner.kt */
        static final class C0668a extends l implements kotlin.e0.c.a<Handler> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ C0667a f9782h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0668a(C0667a aVar) {
                super(0);
                this.f9782h = aVar;
            }

            /* renamed from: a */
            public final Handler d() {
                return new Handler(this.f9782h.f9780g.getLooper());
            }
        }

        static {
            o oVar = new o(v.b(C0667a.class), "handler", "getHandler()Landroid/os/Handler;");
            v.d(oVar);
            f9779i = new kotlin.h0.f[]{oVar};
        }

        public C0667a() {
            HandlerThread handlerThread = new HandlerThread("single-executor");
            handlerThread.start();
            this.f9780g = handlerThread;
        }

        private final Handler b() {
            kotlin.e eVar = this.f9781h;
            kotlin.h0.f fVar = f9779i[0];
            return (Handler) eVar.getValue();
        }

        public void execute(Runnable runnable) {
            k.f(runnable, "command");
            b().post(runnable);
        }
    }

    /* compiled from: Executioner.kt */
    public static final class b implements Executor {

        /* renamed from: h  reason: collision with root package name */
        static final /* synthetic */ kotlin.h0.f[] f9783h;

        /* renamed from: g  reason: collision with root package name */
        private final kotlin.e f9784g = g.a(C0669a.f9785h);

        /* renamed from: g.e.e.a$b$a  reason: collision with other inner class name */
        /* compiled from: Executioner.kt */
        static final class C0669a extends l implements kotlin.e0.c.a<Handler> {

            /* renamed from: h  reason: collision with root package name */
            public static final C0669a f9785h = new C0669a();

            C0669a() {
                super(0);
            }

            /* renamed from: a */
            public final Handler d() {
                return new Handler(Looper.getMainLooper());
            }
        }

        static {
            o oVar = new o(v.b(b.class), "handler", "getHandler()Landroid/os/Handler;");
            v.d(oVar);
            f9783h = new kotlin.h0.f[]{oVar};
        }

        private final Handler a() {
            kotlin.e eVar = this.f9784g;
            kotlin.h0.f fVar = f9783h[0];
            return (Handler) eVar.getValue();
        }

        public void execute(Runnable runnable) {
            k.f(runnable, "command");
            if (k.a(Looper.getMainLooper(), Looper.myLooper())) {
                runnable.run();
            } else {
                a().post(runnable);
            }
        }
    }

    /* compiled from: Executioner.kt */
    public static final class c {
        /* access modifiers changed from: private */
        public volatile boolean a;
        /* access modifiers changed from: private */
        public final List<j<Executor, Runnable>> b = new ArrayList();
        /* access modifiers changed from: private */
        public Runnable c;

        /* renamed from: d  reason: collision with root package name */
        private final Runnable f9786d = new b(this);

        /* renamed from: g.e.e.a$c$a  reason: collision with other inner class name */
        /* compiled from: Executioner.kt */
        static final class C0670a implements Runnable {

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ kotlin.e0.c.a f9787g;

            C0670a(kotlin.e0.c.a aVar) {
                this.f9787g = aVar;
            }

            public final void run() {
                this.f9787g.d();
            }
        }

        /* compiled from: Executioner.kt */
        static final class b implements Runnable {

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ c f9788g;

            b(c cVar) {
                this.f9788g = cVar;
            }

            public final void run() {
                Runnable c = this.f9788g.c;
                if (c != null) {
                    c.run();
                    this.f9788g.c = null;
                    synchronized (this.f9788g) {
                        this.f9788g.a = false;
                        if (!this.f9788g.b.isEmpty()) {
                            j jVar = (j) this.f9788g.b.remove(0);
                            this.f9788g.i((Executor) jVar.a(), (Runnable) jVar.b());
                        }
                        x xVar = x.a;
                    }
                    return;
                }
                k.m();
                throw null;
            }
        }

        /* access modifiers changed from: private */
        public final void i(Executor executor, Runnable runnable) {
            if (!this.a) {
                this.a = true;
                this.c = runnable;
                executor.execute(this.f9786d);
                return;
            }
            throw new IllegalStateException("Already awaiting for another operation");
        }

        public final c f(Executor executor, Runnable runnable) {
            k.f(executor, "executor");
            k.f(runnable, "command");
            h(executor, runnable);
            return this;
        }

        public final c g(Executor executor, kotlin.e0.c.a<x> aVar) {
            k.f(executor, "executor");
            k.f(aVar, "command");
            f(executor, new C0670a(aVar));
            return this;
        }

        public final void h(Executor executor, Runnable runnable) {
            k.f(executor, "executor");
            k.f(runnable, "command");
            if (!(executor instanceof g)) {
                n.a.a.k("Executing command on a normal java Executor. To support better testability it's highly advisable to run on an executor acquired through the Executioner class", new Object[0]);
            }
            synchronized (this) {
                if (this.a) {
                    this.b.add(new j(executor, runnable));
                } else {
                    i(executor, runnable);
                    x xVar = x.a;
                }
            }
        }
    }

    /* compiled from: Executioner.kt */
    static final class d extends l implements kotlin.e0.c.a<Executor> {

        /* renamed from: h  reason: collision with root package name */
        public static final d f9789h = new d();

        d() {
            super(0);
        }

        /* renamed from: a */
        public final Executor d() {
            return a.f9778f.g();
        }
    }

    /* compiled from: Executioner.kt */
    static final class e extends l implements kotlin.e0.c.a<Executor> {

        /* renamed from: h  reason: collision with root package name */
        public static final e f9790h = new e();

        e() {
            super(0);
        }

        /* renamed from: a */
        public final Executor d() {
            return a.f9778f.h();
        }
    }

    /* compiled from: Executioner.kt */
    static final class f extends l implements kotlin.e0.c.a<Executor> {

        /* renamed from: h  reason: collision with root package name */
        public static final f f9791h = new f();

        /* renamed from: g.e.e.a$f$a  reason: collision with other inner class name */
        /* compiled from: Executioner.kt */
        static final class C0671a implements Executor {

            /* renamed from: g  reason: collision with root package name */
            public static final C0671a f9792g = new C0671a();

            C0671a() {
            }

            public final void execute(Runnable runnable) {
                runnable.run();
            }
        }

        f() {
            super(0);
        }

        /* renamed from: a */
        public final Executor d() {
            Executor executor;
            a aVar = a.f9778f;
            if (aVar.f()) {
                executor = new b();
            } else {
                executor = C0671a.f9792g;
            }
            return aVar.k(executor);
        }
    }

    /* compiled from: Executioner.kt */
    private static final class g implements Executor {

        /* renamed from: g  reason: collision with root package name */
        private final Executor f9793g;

        public g(Executor executor) {
            k.f(executor, "executor");
            this.f9793g = executor;
        }

        public void execute(Runnable runnable) {
            k.f(runnable, "command");
            Executor a = a.b;
            if (a == null) {
                this.f9793g.execute(runnable);
            } else {
                a.execute(runnable);
            }
        }
    }

    /* compiled from: Executioner.kt */
    static final class h implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ kotlin.e0.c.a f9794g;

        h(kotlin.e0.c.a aVar) {
            this.f9794g = aVar;
        }

        public final void run() {
            this.f9794g.d();
        }
    }

    static {
        Class<a> cls = a.class;
        o oVar = new o(v.b(cls), "UI", "getUI()Ljava/util/concurrent/Executor;");
        v.d(oVar);
        o oVar2 = new o(v.b(cls), "SINGLE", "getSINGLE()Ljava/util/concurrent/Executor;");
        v.d(oVar2);
        o oVar3 = new o(v.b(cls), "POOL", "getPOOL()Ljava/util/concurrent/Executor;");
        v.d(oVar3);
        a = new kotlin.h0.f[]{oVar, oVar2, oVar3};
    }

    private a() {
    }

    /* access modifiers changed from: private */
    public final boolean f() {
        String property = System.getProperty("java.vm.vendor");
        return property != null && q.I(property, "Android", false, 2, (Object) null);
    }

    public final Executor c() {
        kotlin.e eVar = f9777e;
        kotlin.h0.f fVar = a[2];
        return (Executor) eVar.getValue();
    }

    public final Executor d() {
        kotlin.e eVar = f9776d;
        kotlin.h0.f fVar = a[1];
        return (Executor) eVar.getValue();
    }

    public final Executor e() {
        kotlin.e eVar = c;
        kotlin.h0.f fVar = a[0];
        return (Executor) eVar.getValue();
    }

    public final Executor g() {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        if (availableProcessors <= 0) {
            availableProcessors = 1;
        }
        int i2 = availableProcessors > 16 ? 16 : availableProcessors;
        return k(new ThreadPoolExecutor(i2, i2, 3, TimeUnit.SECONDS, new LinkedBlockingQueue()));
    }

    public final Executor h() {
        Executor executor;
        if (f()) {
            executor = new C0667a();
        } else {
            executor = Executors.newSingleThreadExecutor();
        }
        k.b(executor, "if (isAndroid()) {\n     …dExecutor()\n            }");
        return k(executor);
    }

    public final c i(Executor executor, Runnable runnable) {
        k.f(executor, "executor");
        k.f(runnable, "command");
        c cVar = new c();
        cVar.h(executor, runnable);
        return cVar;
    }

    public final c j(Executor executor, kotlin.e0.c.a<x> aVar) {
        k.f(executor, "executor");
        k.f(aVar, "command");
        return i(executor, new h(aVar));
    }

    public final Executor k(Executor executor) {
        k.f(executor, "executor");
        return new g(executor);
    }
}
