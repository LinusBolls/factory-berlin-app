package com.microsoft.appcenter;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import com.microsoft.appcenter.http.j;
import com.microsoft.appcenter.j.b;
import com.microsoft.appcenter.k.d.i.f;
import com.microsoft.appcenter.k.d.i.g;
import com.microsoft.appcenter.k.d.i.h;
import com.microsoft.appcenter.utils.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: AppCenter */
public class b {
    @SuppressLint({"StaticFieldLeak"})
    private static b t;
    private boolean a;
    private String b;
    private Application c;

    /* renamed from: d  reason: collision with root package name */
    private com.microsoft.appcenter.utils.c f4416d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public String f4417e;

    /* renamed from: f  reason: collision with root package name */
    private String f4418f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f4419g;

    /* renamed from: h  reason: collision with root package name */
    private i f4420h;

    /* renamed from: i  reason: collision with root package name */
    private final List<String> f4421i = new ArrayList();

    /* renamed from: j  reason: collision with root package name */
    private Set<d> f4422j;

    /* renamed from: k  reason: collision with root package name */
    private Set<d> f4423k;

    /* renamed from: l  reason: collision with root package name */
    private g f4424l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public com.microsoft.appcenter.j.b f4425m;

    /* renamed from: n  reason: collision with root package name */
    private HandlerThread f4426n;
    private Handler o;
    private c p;
    private long q = 10485760;
    private com.microsoft.appcenter.utils.l.a<Boolean> r;
    private com.microsoft.appcenter.j.d s;

    /* compiled from: AppCenter */
    class a implements Runnable {
        a() {
        }

        public void run() {
            b.this.f4425m.g(b.this.f4417e);
            b.this.g();
        }
    }

    /* renamed from: com.microsoft.appcenter.b$b  reason: collision with other inner class name */
    /* compiled from: AppCenter */
    class C0122b implements c {
        C0122b() {
        }

        public void a(Runnable runnable, Runnable runnable2) {
            b.this.p(runnable, runnable2);
        }
    }

    /* compiled from: AppCenter */
    class c implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ boolean f4428g;

        c(boolean z) {
            this.f4428g = z;
        }

        public void run() {
            b.this.m(this.f4428g);
        }
    }

    /* compiled from: AppCenter */
    class d implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ Runnable f4430g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Runnable f4431h;

        d(Runnable runnable, Runnable runnable2) {
            this.f4430g = runnable;
            this.f4431h = runnable2;
        }

        public void run() {
            if (b.this.r()) {
                this.f4430g.run();
                return;
            }
            Runnable runnable = this.f4431h;
            if (runnable != null) {
                runnable.run();
            } else {
                com.microsoft.appcenter.utils.a.b("AppCenter", "App Center SDK is disabled.");
            }
        }
    }

    /* compiled from: AppCenter */
    class e implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ Collection f4433g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Collection f4434h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ boolean f4435i;

        e(Collection collection, Collection collection2, boolean z) {
            this.f4433g = collection;
            this.f4434h = collection2;
            this.f4435i = z;
        }

        public void run() {
            b.this.n(this.f4433g, this.f4434h, this.f4435i);
        }
    }

    @SafeVarargs
    private final synchronized void A(boolean z, Class<? extends d>... clsArr) {
        if (clsArr == null) {
            com.microsoft.appcenter.utils.a.b("AppCenter", "Cannot start services, services array is null. Failed to start services.");
            return;
        }
        if (this.c == null) {
            StringBuilder sb = new StringBuilder();
            for (Class<? extends d> name : clsArr) {
                sb.append("\t");
                sb.append(name.getName());
                sb.append("\n");
            }
            com.microsoft.appcenter.utils.a.b("AppCenter", "Cannot start services, App Center has not been configured. Failed to start the following services:\n" + sb);
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Class<? extends d> cls : clsArr) {
            if (cls == null) {
                com.microsoft.appcenter.utils.a.i("AppCenter", "Skipping null service, please check your varargs/array does not contain any null reference.");
            } else {
                try {
                    w((d) cls.getMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]), arrayList, arrayList2, z);
                } catch (Exception e2) {
                    com.microsoft.appcenter.utils.a.c("AppCenter", "Failed to get service instance '" + cls.getName() + "', skipping it.", e2);
                }
            }
        }
        this.o.post(new e(arrayList2, arrayList, z));
    }

    /* access modifiers changed from: private */
    public void g() {
        boolean n2 = this.f4425m.n(this.q);
        com.microsoft.appcenter.utils.l.a<Boolean> aVar = this.r;
        if (aVar != null) {
            aVar.a(Boolean.valueOf(n2));
            throw null;
        }
    }

    private synchronized boolean h() {
        if (q()) {
            return true;
        }
        com.microsoft.appcenter.utils.a.b("AppCenter", "App Center hasn't been configured. You need to call AppCenter.start with appSecret or AppCenter.configure first.");
        return false;
    }

    private void i(Application application, String str, boolean z, Class<? extends d>[] clsArr) {
        if (k(application, str, z)) {
            A(z, clsArr);
        }
    }

    private synchronized void j(Application application, String str, Class<? extends d>[] clsArr) {
        if (str != null) {
            if (!str.isEmpty()) {
                i(application, str, true, clsArr);
            }
        }
        com.microsoft.appcenter.utils.a.b("AppCenter", "appSecret may not be null or empty.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0047, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized boolean k(android.app.Application r4, java.lang.String r5, boolean r6) {
        /*
            r3 = this;
            monitor-enter(r3)
            r0 = 0
            if (r4 != 0) goto L_0x000d
            java.lang.String r4 = "AppCenter"
            java.lang.String r5 = "Application context may not be null."
            com.microsoft.appcenter.utils.a.b(r4, r5)     // Catch:{ all -> 0x0099 }
            monitor-exit(r3)
            return r0
        L_0x000d:
            boolean r1 = r3.a     // Catch:{ all -> 0x0099 }
            if (r1 != 0) goto L_0x001f
            android.content.pm.ApplicationInfo r1 = r4.getApplicationInfo()     // Catch:{ all -> 0x0099 }
            int r1 = r1.flags     // Catch:{ all -> 0x0099 }
            r2 = 2
            r1 = r1 & r2
            if (r1 != r2) goto L_0x001f
            r1 = 5
            com.microsoft.appcenter.utils.a.f(r1)     // Catch:{ all -> 0x0099 }
        L_0x001f:
            java.lang.String r1 = r3.f4417e     // Catch:{ all -> 0x0099 }
            if (r6 == 0) goto L_0x002b
            boolean r5 = r3.l(r5)     // Catch:{ all -> 0x0099 }
            if (r5 != 0) goto L_0x002b
            monitor-exit(r3)
            return r0
        L_0x002b:
            android.os.Handler r5 = r3.o     // Catch:{ all -> 0x0099 }
            r0 = 1
            if (r5 == 0) goto L_0x0048
            java.lang.String r4 = r3.f4417e     // Catch:{ all -> 0x0099 }
            if (r4 == 0) goto L_0x0046
            java.lang.String r4 = r3.f4417e     // Catch:{ all -> 0x0099 }
            boolean r4 = r4.equals(r1)     // Catch:{ all -> 0x0099 }
            if (r4 != 0) goto L_0x0046
            android.os.Handler r4 = r3.o     // Catch:{ all -> 0x0099 }
            com.microsoft.appcenter.b$a r5 = new com.microsoft.appcenter.b$a     // Catch:{ all -> 0x0099 }
            r5.<init>()     // Catch:{ all -> 0x0099 }
            r4.post(r5)     // Catch:{ all -> 0x0099 }
        L_0x0046:
            monitor-exit(r3)
            return r0
        L_0x0048:
            r3.c = r4     // Catch:{ all -> 0x0099 }
            android.os.HandlerThread r4 = new android.os.HandlerThread     // Catch:{ all -> 0x0099 }
            java.lang.String r5 = "AppCenter.Looper"
            r4.<init>(r5)     // Catch:{ all -> 0x0099 }
            r3.f4426n = r4     // Catch:{ all -> 0x0099 }
            r4.start()     // Catch:{ all -> 0x0099 }
            android.os.Handler r4 = new android.os.Handler     // Catch:{ all -> 0x0099 }
            android.os.HandlerThread r5 = r3.f4426n     // Catch:{ all -> 0x0099 }
            android.os.Looper r5 = r5.getLooper()     // Catch:{ all -> 0x0099 }
            r4.<init>(r5)     // Catch:{ all -> 0x0099 }
            r3.o = r4     // Catch:{ all -> 0x0099 }
            com.microsoft.appcenter.b$b r4 = new com.microsoft.appcenter.b$b     // Catch:{ all -> 0x0099 }
            r4.<init>()     // Catch:{ all -> 0x0099 }
            r3.p = r4     // Catch:{ all -> 0x0099 }
            com.microsoft.appcenter.utils.c r4 = new com.microsoft.appcenter.utils.c     // Catch:{ all -> 0x0099 }
            android.os.Handler r5 = r3.o     // Catch:{ all -> 0x0099 }
            r4.<init>(r5)     // Catch:{ all -> 0x0099 }
            r3.f4416d = r4     // Catch:{ all -> 0x0099 }
            android.app.Application r5 = r3.c     // Catch:{ all -> 0x0099 }
            r5.registerActivityLifecycleCallbacks(r4)     // Catch:{ all -> 0x0099 }
            java.util.HashSet r4 = new java.util.HashSet     // Catch:{ all -> 0x0099 }
            r4.<init>()     // Catch:{ all -> 0x0099 }
            r3.f4422j = r4     // Catch:{ all -> 0x0099 }
            java.util.HashSet r4 = new java.util.HashSet     // Catch:{ all -> 0x0099 }
            r4.<init>()     // Catch:{ all -> 0x0099 }
            r3.f4423k = r4     // Catch:{ all -> 0x0099 }
            android.os.Handler r4 = r3.o     // Catch:{ all -> 0x0099 }
            com.microsoft.appcenter.b$c r5 = new com.microsoft.appcenter.b$c     // Catch:{ all -> 0x0099 }
            r5.<init>(r6)     // Catch:{ all -> 0x0099 }
            r4.post(r5)     // Catch:{ all -> 0x0099 }
            java.lang.String r4 = "AppCenter"
            java.lang.String r5 = "App Center SDK configured successfully."
            com.microsoft.appcenter.utils.a.e(r4, r5)     // Catch:{ all -> 0x0099 }
            monitor-exit(r3)
            return r0
        L_0x0099:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.microsoft.appcenter.b.k(android.app.Application, java.lang.String, boolean):boolean");
    }

    private boolean l(String str) {
        if (this.f4419g) {
            com.microsoft.appcenter.utils.a.i("AppCenter", "App Center may only be configured once.");
            return false;
        }
        this.f4419g = true;
        if (str != null) {
            for (String split : str.split(";")) {
                String[] split2 = split.split("=", -1);
                String str2 = split2[0];
                if (split2.length == 1) {
                    if (!str2.isEmpty()) {
                        this.f4417e = str2;
                    }
                } else if (!split2[1].isEmpty()) {
                    String str3 = split2[1];
                    if ("appsecret".equals(str2)) {
                        this.f4417e = str3;
                    } else if ("target".equals(str2)) {
                        this.f4418f = str3;
                    }
                }
            }
        }
        return true;
    }

    /* access modifiers changed from: private */
    public void m(boolean z) {
        e.b(this.c);
        com.microsoft.appcenter.utils.o.b.a(this.c);
        com.microsoft.appcenter.utils.o.d.j(this.c);
        com.microsoft.appcenter.utils.m.a.b();
        boolean r2 = r();
        com.microsoft.appcenter.http.d a2 = f.a();
        if (a2 == null) {
            a2 = j.a(this.c);
        }
        com.microsoft.appcenter.k.d.i.c cVar = new com.microsoft.appcenter.k.d.i.c();
        this.f4424l = cVar;
        cVar.b("startService", new h());
        this.f4424l.b("customProperties", new com.microsoft.appcenter.k.d.i.b());
        com.microsoft.appcenter.j.c cVar2 = new com.microsoft.appcenter.j.c((Context) this.c, this.f4417e, this.f4424l, a2, this.o);
        this.f4425m = cVar2;
        if (z) {
            g();
        } else {
            cVar2.n(10485760);
        }
        this.f4425m.setEnabled(r2);
        this.f4425m.l("group_core", 50, 3000, 3, (com.microsoft.appcenter.k.b) null, (b.a) null);
        this.s = new com.microsoft.appcenter.j.d(this.f4425m, this.f4424l, a2, com.microsoft.appcenter.utils.g.a());
        if (this.b != null) {
            if (this.f4417e != null) {
                com.microsoft.appcenter.utils.a.e("AppCenter", "The log url of App Center endpoint has been changed to " + this.b);
                this.f4425m.f(this.b);
            } else {
                com.microsoft.appcenter.utils.a.e("AppCenter", "The log url of One Collector endpoint has been changed to " + this.b);
                this.s.k(this.b);
            }
        }
        this.f4425m.k(this.s);
        if (!r2) {
            i.k(this.c).close();
        }
        i iVar = new i(this.o, this.f4425m);
        this.f4420h = iVar;
        if (r2) {
            iVar.b();
        }
        com.microsoft.appcenter.utils.a.a("AppCenter", "App Center initialized.");
    }

    /* access modifiers changed from: private */
    public void n(Iterable<d> iterable, Iterable<d> iterable2, boolean z) {
        for (d next : iterable) {
            next.c(this.f4417e, this.f4418f);
            com.microsoft.appcenter.utils.a.e("AppCenter", next.getClass().getSimpleName() + " service configuration updated.");
        }
        boolean r2 = r();
        for (d next2 : iterable2) {
            Map<String, f> f2 = next2.f();
            if (f2 != null) {
                for (Map.Entry next3 : f2.entrySet()) {
                    this.f4424l.b((String) next3.getKey(), (f) next3.getValue());
                }
            }
            if (!r2 && next2.d()) {
                next2.a(false);
            }
            if (z) {
                next2.j(this.c, this.f4425m, this.f4417e, this.f4418f, true);
                com.microsoft.appcenter.utils.a.e("AppCenter", next2.getClass().getSimpleName() + " service started from application.");
            } else {
                next2.j(this.c, this.f4425m, (String) null, (String) null, false);
                com.microsoft.appcenter.utils.a.e("AppCenter", next2.getClass().getSimpleName() + " service started from library.");
            }
        }
        if (z) {
            for (d b2 : iterable) {
                this.f4421i.add(b2.b());
            }
            for (d b3 : iterable2) {
                this.f4421i.add(b3.b());
            }
            s();
        }
    }

    public static synchronized b o() {
        b bVar;
        synchronized (b.class) {
            if (t == null) {
                t = new b();
            }
            bVar = t;
        }
        return bVar;
    }

    /* access modifiers changed from: private */
    public synchronized void p(Runnable runnable, Runnable runnable2) {
        if (h()) {
            d dVar = new d(runnable, runnable2);
            if (Thread.currentThread() == this.f4426n) {
                runnable.run();
            } else {
                this.o.post(dVar);
            }
        }
    }

    private synchronized boolean q() {
        return this.c != null;
    }

    private void s() {
        if (!this.f4421i.isEmpty() && r()) {
            ArrayList arrayList = new ArrayList(this.f4421i);
            this.f4421i.clear();
            com.microsoft.appcenter.k.d.g gVar = new com.microsoft.appcenter.k.d.g();
            gVar.p(arrayList);
            this.f4425m.m(gVar, "group_core", 1);
        }
    }

    private synchronized void t(int i2) {
        this.a = true;
        com.microsoft.appcenter.utils.a.f(i2);
    }

    public static void u(int i2) {
        o().t(i2);
    }

    @SafeVarargs
    public static void v(Application application, String str, Class<? extends d>... clsArr) {
        o().j(application, str, clsArr);
    }

    private void w(d dVar, Collection<d> collection, Collection<d> collection2, boolean z) {
        if (z) {
            x(dVar, collection, collection2);
        } else if (!this.f4422j.contains(dVar)) {
            z(dVar, collection);
        }
    }

    private void x(d dVar, Collection<d> collection, Collection<d> collection2) {
        String b2 = dVar.b();
        if (this.f4422j.contains(dVar)) {
            if (this.f4423k.remove(dVar)) {
                collection2.add(dVar);
                return;
            }
            com.microsoft.appcenter.utils.a.i("AppCenter", "App Center has already started the service with class name: " + dVar.b());
        } else if (this.f4417e != null || !dVar.e()) {
            y(dVar, collection);
        } else {
            com.microsoft.appcenter.utils.a.b("AppCenter", "App Center was started without app secret, but the service requires it; not starting service " + b2 + ".");
        }
    }

    private boolean y(d dVar, Collection<d> collection) {
        String b2 = dVar.b();
        if (h.a(b2)) {
            com.microsoft.appcenter.utils.a.a("AppCenter", "Instrumentation variable to disable service has been set; not starting service " + b2 + ".");
            return false;
        }
        dVar.h(this.p);
        this.f4416d.m(dVar);
        this.c.registerActivityLifecycleCallbacks(dVar);
        this.f4422j.add(dVar);
        collection.add(dVar);
        return true;
    }

    private void z(d dVar, Collection<d> collection) {
        String b2 = dVar.b();
        if (dVar.e()) {
            com.microsoft.appcenter.utils.a.b("AppCenter", "This service cannot be started from a library: " + b2 + ".");
        } else if (y(dVar, collection)) {
            this.f4423k.add(dVar);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean r() {
        return com.microsoft.appcenter.utils.o.d.a("enabled", true);
    }
}
