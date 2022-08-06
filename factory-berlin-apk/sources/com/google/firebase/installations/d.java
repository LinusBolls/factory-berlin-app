package com.google.firebase.installations;

import android.text.TextUtils;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.tasks.g;
import com.google.android.gms.tasks.j;
import com.google.firebase.c;
import com.google.firebase.i.h;
import com.google.firebase.installations.FirebaseInstallationsException;
import com.google.firebase.installations.l.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: FirebaseInstallations */
public class d implements e {

    /* renamed from: l  reason: collision with root package name */
    private static final Object f4175l = new Object();

    /* renamed from: m  reason: collision with root package name */
    private static final ThreadFactory f4176m = new a();
    private final c a;
    private final com.google.firebase.installations.l.c b;
    private final com.google.firebase.installations.k.c c;

    /* renamed from: d  reason: collision with root package name */
    private final j f4177d;

    /* renamed from: e  reason: collision with root package name */
    private final com.google.firebase.installations.k.b f4178e;

    /* renamed from: f  reason: collision with root package name */
    private final h f4179f;

    /* renamed from: g  reason: collision with root package name */
    private final Object f4180g;

    /* renamed from: h  reason: collision with root package name */
    private final ExecutorService f4181h;

    /* renamed from: i  reason: collision with root package name */
    private final ExecutorService f4182i;

    /* renamed from: j  reason: collision with root package name */
    private String f4183j;

    /* renamed from: k  reason: collision with root package name */
    private final List<i> f4184k;

    /* compiled from: FirebaseInstallations */
    class a implements ThreadFactory {
        private final AtomicInteger a = new AtomicInteger(1);

        a() {
        }

        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", new Object[]{Integer.valueOf(this.a.getAndIncrement())}));
        }
    }

    /* compiled from: FirebaseInstallations */
    static /* synthetic */ class b {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x001d */
        static {
            /*
                com.google.firebase.installations.l.e$b[] r0 = com.google.firebase.installations.l.e.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                b = r0
                r1 = 1
                com.google.firebase.installations.l.e$b r2 = com.google.firebase.installations.l.e.b.OK     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.firebase.installations.l.e$b r3 = com.google.firebase.installations.l.e.b.BAD_CONFIG     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r2 = b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.firebase.installations.l.e$b r3 = com.google.firebase.installations.l.e.b.AUTH_ERROR     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r4 = 3
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                com.google.firebase.installations.l.d$b[] r2 = com.google.firebase.installations.l.d.b.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                a = r2
                com.google.firebase.installations.l.d$b r3 = com.google.firebase.installations.l.d.b.OK     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = a     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.google.firebase.installations.l.d$b r2 = com.google.firebase.installations.l.d.b.BAD_CONFIG     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.d.b.<clinit>():void");
        }
    }

    d(c cVar, h hVar, com.google.firebase.f.c cVar2) {
        this(new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), f4176m), cVar, new com.google.firebase.installations.l.c(cVar.g(), hVar, cVar2), new com.google.firebase.installations.k.c(cVar), new j(), new com.google.firebase.installations.k.b(cVar), new h());
    }

    private g<String> a() {
        com.google.android.gms.tasks.h hVar = new com.google.android.gms.tasks.h();
        b(new g(hVar));
        return hVar.a();
    }

    private void b(i iVar) {
        synchronized (this.f4180g) {
            this.f4184k.add(iVar);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0047  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c(boolean r3) {
        /*
            r2 = this;
            com.google.firebase.installations.k.d r0 = r2.k()
            boolean r1 = r0.i()     // Catch:{ FirebaseInstallationsException -> 0x005c }
            if (r1 != 0) goto L_0x0022
            boolean r1 = r0.l()     // Catch:{ FirebaseInstallationsException -> 0x005c }
            if (r1 == 0) goto L_0x0011
            goto L_0x0022
        L_0x0011:
            if (r3 != 0) goto L_0x001d
            com.google.firebase.installations.j r3 = r2.f4177d     // Catch:{ FirebaseInstallationsException -> 0x005c }
            boolean r3 = r3.b(r0)     // Catch:{ FirebaseInstallationsException -> 0x005c }
            if (r3 == 0) goto L_0x001c
            goto L_0x001d
        L_0x001c:
            return
        L_0x001d:
            com.google.firebase.installations.k.d r3 = r2.e(r0)     // Catch:{ FirebaseInstallationsException -> 0x005c }
            goto L_0x0026
        L_0x0022:
            com.google.firebase.installations.k.d r3 = r2.s(r0)     // Catch:{ FirebaseInstallationsException -> 0x005c }
        L_0x0026:
            r2.n(r3)
            boolean r0 = r3.k()
            if (r0 == 0) goto L_0x0036
            java.lang.String r0 = r3.d()
            r2.v(r0)
        L_0x0036:
            boolean r0 = r3.i()
            if (r0 == 0) goto L_0x0047
            com.google.firebase.installations.FirebaseInstallationsException r0 = new com.google.firebase.installations.FirebaseInstallationsException
            com.google.firebase.installations.FirebaseInstallationsException$a r1 = com.google.firebase.installations.FirebaseInstallationsException.a.BAD_CONFIG
            r0.<init>(r1)
            r2.t(r3, r0)
            goto L_0x005b
        L_0x0047:
            boolean r0 = r3.j()
            if (r0 == 0) goto L_0x0058
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."
            r0.<init>(r1)
            r2.t(r3, r0)
            goto L_0x005b
        L_0x0058:
            r2.u(r3)
        L_0x005b:
            return
        L_0x005c:
            r3 = move-exception
            r2.t(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.d.c(boolean):void");
    }

    /* access modifiers changed from: private */
    public final void d(boolean z) {
        com.google.firebase.installations.k.d l2 = l();
        if (z) {
            l2 = l2.p();
        }
        u(l2);
        this.f4182i.execute(c.a(this, z));
    }

    private com.google.firebase.installations.k.d e(com.google.firebase.installations.k.d dVar) {
        e e2 = this.b.e(f(), dVar.d(), m(), dVar.f());
        int i2 = b.b[e2.b().ordinal()];
        if (i2 == 1) {
            return dVar.o(e2.c(), e2.d(), this.f4177d.a());
        } else if (i2 == 2) {
            return dVar.q("BAD CONFIG");
        } else {
            if (i2 == 3) {
                v((String) null);
                return dVar.r();
            }
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.a.UNAVAILABLE);
        }
    }

    private synchronized String h() {
        return this.f4183j;
    }

    public static d i() {
        return j(c.h());
    }

    public static d j(c cVar) {
        r.b(cVar != null, "Null is not a valid value of FirebaseApp.");
        return (d) cVar.f(e.class);
    }

    private com.google.firebase.installations.k.d k() {
        com.google.firebase.installations.k.d c2;
        synchronized (f4175l) {
            a a2 = a.a(this.a.g(), "generatefid.lock");
            try {
                c2 = this.c.c();
                if (a2 != null) {
                    a2.b();
                }
            } catch (Throwable th) {
                if (a2 != null) {
                    a2.b();
                }
                throw th;
            }
        }
        return c2;
    }

    private com.google.firebase.installations.k.d l() {
        com.google.firebase.installations.k.d c2;
        synchronized (f4175l) {
            a a2 = a.a(this.a.g(), "generatefid.lock");
            try {
                c2 = this.c.c();
                if (c2.j()) {
                    String r = r(c2);
                    com.google.firebase.installations.k.c cVar = this.c;
                    c2 = c2.t(r);
                    cVar.a(c2);
                }
                if (a2 != null) {
                    a2.b();
                }
            } catch (Throwable th) {
                if (a2 != null) {
                    a2.b();
                }
                throw th;
            }
        }
        return c2;
    }

    private void n(com.google.firebase.installations.k.d dVar) {
        synchronized (f4175l) {
            a a2 = a.a(this.a.g(), "generatefid.lock");
            try {
                this.c.a(dVar);
                if (a2 != null) {
                    a2.b();
                }
            } catch (Throwable th) {
                if (a2 != null) {
                    a2.b();
                }
                throw th;
            }
        }
    }

    private void q() {
        r.h(g(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        r.h(m(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        r.h(f(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        r.b(j.d(g()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        r.b(j.c(f()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    private String r(com.google.firebase.installations.k.d dVar) {
        if ((!this.a.i().equals("CHIME_ANDROID_SDK") && !this.a.q()) || !dVar.m()) {
            return this.f4179f.a();
        }
        String f2 = this.f4178e.f();
        return TextUtils.isEmpty(f2) ? this.f4179f.a() : f2;
    }

    private com.google.firebase.installations.k.d s(com.google.firebase.installations.k.d dVar) {
        com.google.firebase.installations.l.d d2 = this.b.d(f(), dVar.d(), m(), g(), (dVar.d() == null || dVar.d().length() != 11) ? null : this.f4178e.i());
        int i2 = b.a[d2.e().ordinal()];
        if (i2 == 1) {
            return dVar.s(d2.c(), d2.d(), this.f4177d.a(), d2.b().c(), d2.b().d());
        } else if (i2 == 2) {
            return dVar.q("BAD CONFIG");
        } else {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.a.UNAVAILABLE);
        }
    }

    private void t(com.google.firebase.installations.k.d dVar, Exception exc) {
        synchronized (this.f4180g) {
            Iterator<i> it = this.f4184k.iterator();
            while (it.hasNext()) {
                if (it.next().a(dVar, exc)) {
                    it.remove();
                }
            }
        }
    }

    private void u(com.google.firebase.installations.k.d dVar) {
        synchronized (this.f4180g) {
            Iterator<i> it = this.f4184k.iterator();
            while (it.hasNext()) {
                if (it.next().b(dVar)) {
                    it.remove();
                }
            }
        }
    }

    private synchronized void v(String str) {
        this.f4183j = str;
    }

    /* access modifiers changed from: package-private */
    public String f() {
        return this.a.j().b();
    }

    /* access modifiers changed from: package-private */
    public String g() {
        return this.a.j().c();
    }

    public g<String> getId() {
        q();
        String h2 = h();
        if (h2 != null) {
            return j.d(h2);
        }
        g<String> a2 = a();
        this.f4181h.execute(b.a(this));
        return a2;
    }

    /* access modifiers changed from: package-private */
    public String m() {
        return this.a.j().e();
    }

    d(ExecutorService executorService, c cVar, com.google.firebase.installations.l.c cVar2, com.google.firebase.installations.k.c cVar3, j jVar, com.google.firebase.installations.k.b bVar, h hVar) {
        this.f4180g = new Object();
        this.f4184k = new ArrayList();
        this.a = cVar;
        this.b = cVar2;
        this.c = cVar3;
        this.f4177d = jVar;
        this.f4178e = bVar;
        this.f4179f = hVar;
        this.f4181h = executorService;
        this.f4182i = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), f4176m);
    }
}
