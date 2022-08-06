package com.google.firebase.crashlytics.d.h;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.tasks.g;
import com.google.android.gms.tasks.j;
import com.google.firebase.crashlytics.d.m.i;
import com.google.firebase.crashlytics.d.o.b;
import com.google.firebase.crashlytics.d.q.e;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: CrashlyticsCore */
public class m {
    private final Context a;
    private final com.google.firebase.c b;
    private final s c;

    /* renamed from: d  reason: collision with root package name */
    private final long f3950d = System.currentTimeMillis();
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public n f3951e;

    /* renamed from: f  reason: collision with root package name */
    private n f3952f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public k f3953g;

    /* renamed from: h  reason: collision with root package name */
    private final x f3954h;

    /* renamed from: i  reason: collision with root package name */
    private final com.google.firebase.crashlytics.d.g.b f3955i;

    /* renamed from: j  reason: collision with root package name */
    private final com.google.firebase.crashlytics.d.f.a f3956j;

    /* renamed from: k  reason: collision with root package name */
    private ExecutorService f3957k;

    /* renamed from: l  reason: collision with root package name */
    private i f3958l;

    /* renamed from: m  reason: collision with root package name */
    private com.google.firebase.crashlytics.d.a f3959m;

    /* compiled from: CrashlyticsCore */
    class a implements Callable<g<Void>> {
        final /* synthetic */ e a;

        a(e eVar) {
            this.a = eVar;
        }

        /* renamed from: a */
        public g<Void> call() {
            return m.this.f(this.a);
        }
    }

    /* compiled from: CrashlyticsCore */
    class b implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ e f3960g;

        b(e eVar) {
            this.f3960g = eVar;
        }

        public void run() {
            g unused = m.this.f(this.f3960g);
        }
    }

    /* compiled from: CrashlyticsCore */
    class c implements Callable<Boolean> {
        c() {
        }

        /* renamed from: a */
        public Boolean call() {
            try {
                boolean d2 = m.this.f3951e.d();
                com.google.firebase.crashlytics.d.b f2 = com.google.firebase.crashlytics.d.b.f();
                f2.b("Initialization marker file removed: " + d2);
                return Boolean.valueOf(d2);
            } catch (Exception e2) {
                com.google.firebase.crashlytics.d.b.f().e("Problem encountered deleting Crashlytics initialization marker.", e2);
                return Boolean.FALSE;
            }
        }
    }

    /* compiled from: CrashlyticsCore */
    class d implements Callable<Boolean> {
        d() {
        }

        /* renamed from: a */
        public Boolean call() {
            return Boolean.valueOf(m.this.f3953g.E());
        }
    }

    public m(com.google.firebase.c cVar, x xVar, com.google.firebase.crashlytics.d.a aVar, s sVar, com.google.firebase.crashlytics.d.g.b bVar, com.google.firebase.crashlytics.d.f.a aVar2, ExecutorService executorService) {
        this.b = cVar;
        this.c = sVar;
        this.a = cVar.g();
        this.f3954h = xVar;
        this.f3959m = aVar;
        this.f3955i = bVar;
        this.f3956j = aVar2;
        this.f3957k = executorService;
        this.f3958l = new i(executorService);
    }

    private void d() {
        try {
            Boolean.TRUE.equals((Boolean) k0.a(this.f3958l.h(new d())));
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public g<Void> f(e eVar) {
        m();
        this.f3953g.y();
        try {
            this.f3955i.a(l.b(this));
            com.google.firebase.crashlytics.d.q.i.e b2 = eVar.b();
            if (!b2.b().a) {
                com.google.firebase.crashlytics.d.b.f().b("Collection of crash reports disabled in Crashlytics settings.");
                return j.c(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
            }
            if (!this.f3953g.M(b2.a().a)) {
                com.google.firebase.crashlytics.d.b.f().b("Could not finalize previous sessions.");
            }
            g<Void> s0 = this.f3953g.s0(1.0f, eVar.a());
            l();
            return s0;
        } catch (Exception e2) {
            com.google.firebase.crashlytics.d.b.f().e("Crashlytics encountered a problem during asynchronous initialization.", e2);
            return j.c(e2);
        } finally {
            l();
        }
    }

    private void h(e eVar) {
        Future<?> submit = this.f3957k.submit(new b(eVar));
        com.google.firebase.crashlytics.d.b.f().b("Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
        try {
            submit.get(4, TimeUnit.SECONDS);
        } catch (InterruptedException e2) {
            com.google.firebase.crashlytics.d.b.f().e("Crashlytics was interrupted during initialization.", e2);
        } catch (ExecutionException e3) {
            com.google.firebase.crashlytics.d.b.f().e("Problem encountered during Crashlytics initialization.", e3);
        } catch (TimeoutException e4) {
            com.google.firebase.crashlytics.d.b.f().e("Crashlytics timed out during initialization.", e4);
        }
    }

    public static String i() {
        return "17.2.1";
    }

    static boolean j(String str, boolean z) {
        if (!z) {
            com.google.firebase.crashlytics.d.b.f().b("Configured not to require a build ID.");
            return true;
        } else if (!h.C(str)) {
            return true;
        } else {
            Log.e("FirebaseCrashlytics", ".");
            Log.e("FirebaseCrashlytics", ".     |  | ");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".   \\ |  | /");
            Log.e("FirebaseCrashlytics", ".    \\    /");
            Log.e("FirebaseCrashlytics", ".     \\  /");
            Log.e("FirebaseCrashlytics", ".      \\/");
            Log.e("FirebaseCrashlytics", ".");
            Log.e("FirebaseCrashlytics", "The Crashlytics build ID is missing. This occurs when Crashlytics tooling is absent from your app's build configuration. Please review Crashlytics onboarding instructions and ensure you have a valid Crashlytics account.");
            Log.e("FirebaseCrashlytics", ".");
            Log.e("FirebaseCrashlytics", ".      /\\");
            Log.e("FirebaseCrashlytics", ".     /  \\");
            Log.e("FirebaseCrashlytics", ".    /    \\");
            Log.e("FirebaseCrashlytics", ".   / |  | \\");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".");
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean e() {
        return this.f3951e.c();
    }

    public g<Void> g(e eVar) {
        return k0.b(this.f3957k, new a(eVar));
    }

    public void k(String str) {
        this.f3953g.L0(System.currentTimeMillis() - this.f3950d, str);
    }

    /* access modifiers changed from: package-private */
    public void l() {
        this.f3958l.h(new c());
    }

    /* access modifiers changed from: package-private */
    public void m() {
        this.f3958l.b();
        this.f3951e.a();
        com.google.firebase.crashlytics.d.b.f().b("Initialization marker file created.");
    }

    public boolean n(e eVar) {
        String p = h.p(this.a);
        com.google.firebase.crashlytics.d.b f2 = com.google.firebase.crashlytics.d.b.f();
        f2.b("Mapping file ID is: " + p);
        if (j(p, h.l(this.a, "com.crashlytics.RequireBuildId", true))) {
            String c2 = this.b.j().c();
            try {
                com.google.firebase.crashlytics.d.b f3 = com.google.firebase.crashlytics.d.b.f();
                f3.g("Initializing Crashlytics " + i());
                i iVar = new i(this.a);
                this.f3952f = new n("crash_marker", iVar);
                this.f3951e = new n("initialization_marker", iVar);
                com.google.firebase.crashlytics.d.l.c cVar = new com.google.firebase.crashlytics.d.l.c();
                b a2 = b.a(this.a, this.f3954h, c2, p);
                com.google.firebase.crashlytics.d.s.a aVar = new com.google.firebase.crashlytics.d.s.a(this.a);
                com.google.firebase.crashlytics.d.b f4 = com.google.firebase.crashlytics.d.b.f();
                f4.b("Installer package name is: " + a2.c);
                this.f3953g = new k(this.a, this.f3958l, cVar, this.f3954h, this.c, iVar, this.f3952f, a2, (com.google.firebase.crashlytics.d.o.a) null, (b.C0109b) null, this.f3959m, aVar, this.f3956j, eVar);
                boolean e2 = e();
                d();
                this.f3953g.J(Thread.getDefaultUncaughtExceptionHandler(), eVar);
                if (!e2 || !h.c(this.a)) {
                    com.google.firebase.crashlytics.d.b.f().b("Exception handling initialization successful");
                    return true;
                }
                com.google.firebase.crashlytics.d.b.f().b("Crashlytics did not finish previous background initialization. Initializing synchronously.");
                h(eVar);
                return false;
            } catch (Exception e3) {
                com.google.firebase.crashlytics.d.b.f().e("Crashlytics was not started due to an exception during initialization", e3);
                this.f3953g = null;
                return false;
            }
        } else {
            throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when Crashlytics tooling is absent from your app's build configuration. Please review Crashlytics onboarding instructions and ensure you have a valid Crashlytics account.");
        }
    }
}
