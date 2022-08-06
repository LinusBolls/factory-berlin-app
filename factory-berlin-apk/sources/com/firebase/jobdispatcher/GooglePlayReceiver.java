package com.firebase.jobdispatcher;

import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.Pair;
import com.firebase.jobdispatcher.e;
import com.firebase.jobdispatcher.n;
import com.firebase.jobdispatcher.q;
import com.firebase.jobdispatcher.t;
import e.e.g;

public class GooglePlayReceiver extends Service implements e.b {

    /* renamed from: m  reason: collision with root package name */
    private static final p f1841m = new p("com.firebase.jobdispatcher.");

    /* renamed from: n  reason: collision with root package name */
    private static final g<String, g<String, o>> f1842n = new g<>(1);

    /* renamed from: g  reason: collision with root package name */
    private final f f1843g = new f();

    /* renamed from: h  reason: collision with root package name */
    Messenger f1844h;

    /* renamed from: i  reason: collision with root package name */
    d f1845i;

    /* renamed from: j  reason: collision with root package name */
    ValidationEnforcer f1846j;

    /* renamed from: k  reason: collision with root package name */
    private e f1847k;

    /* renamed from: l  reason: collision with root package name */
    private int f1848l;

    private synchronized d c() {
        if (this.f1845i == null) {
            this.f1845i = new g(getApplicationContext());
        }
        return this.f1845i;
    }

    static p d() {
        return f1841m;
    }

    private synchronized Messenger e() {
        if (this.f1844h == null) {
            this.f1844h = new Messenger(new j(Looper.getMainLooper(), this));
        }
        return this.f1844h;
    }

    private synchronized ValidationEnforcer f() {
        if (this.f1846j == null) {
            this.f1846j = new ValidationEnforcer(c().a());
        }
        return this.f1846j;
    }

    private static boolean g(r rVar, int i2) {
        if (!rVar.h() || !(rVar.d() instanceof t.a) || i2 == 1) {
            return false;
        }
        return true;
    }

    static void h(n nVar) {
        synchronized (f1842n) {
            g gVar = f1842n.get(nVar.c());
            if (gVar != null) {
                if (((o) gVar.get(nVar.a())) != null) {
                    q.b bVar = new q.b();
                    bVar.s(nVar.a());
                    bVar.r(nVar.c());
                    bVar.t(nVar.d());
                    e.d(bVar.l(), false);
                }
            }
        }
    }

    private void k(q qVar) {
        n.b bVar = new n.b(f(), qVar);
        bVar.t(true);
        c().b(bVar.s());
    }

    private static void l(o oVar, int i2) {
        try {
            oVar.a(i2);
        } catch (Throwable th) {
            Log.e("FJD.GooglePlayReceiver", "Encountered error running callback: " + th.getMessage());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001b, code lost:
        if (f1842n.isEmpty() == false) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001d, code lost:
        stopSelf(r4.f1848l);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0022, code lost:
        monitor-exit(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0023, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0034, code lost:
        r5 = f1842n;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0036, code lost:
        monitor-enter(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x003d, code lost:
        if (f1842n.isEmpty() == false) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x003f, code lost:
        stopSelf(r4.f1848l);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0044, code lost:
        monitor-exit(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0045, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x005d, code lost:
        if (g(r5, r6) == false) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x005f, code lost:
        k(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x006a, code lost:
        if (android.util.Log.isLoggable("FJD.GooglePlayReceiver", 2) == false) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x006c, code lost:
        android.util.Log.v("FJD.GooglePlayReceiver", "sending jobFinished for " + r5.a() + " = " + r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x008e, code lost:
        l(r2, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0091, code lost:
        r5 = f1842n;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0093, code lost:
        monitor-enter(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x009a, code lost:
        if (f1842n.isEmpty() == false) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x009c, code lost:
        stopSelf(r4.f1848l);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00a1, code lost:
        monitor-exit(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00a2, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0012, code lost:
        r5 = f1842n;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0014, code lost:
        monitor-enter(r5);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.firebase.jobdispatcher.q r5, int r6) {
        /*
            r4 = this;
            e.e.g<java.lang.String, e.e.g<java.lang.String, com.firebase.jobdispatcher.o>> r0 = f1842n     // Catch:{ all -> 0x00a9 }
            monitor-enter(r0)     // Catch:{ all -> 0x00a9 }
            e.e.g<java.lang.String, e.e.g<java.lang.String, com.firebase.jobdispatcher.o>> r1 = f1842n     // Catch:{ all -> 0x00a6 }
            java.lang.String r2 = r5.c()     // Catch:{ all -> 0x00a6 }
            java.lang.Object r1 = r1.get(r2)     // Catch:{ all -> 0x00a6 }
            e.e.g r1 = (e.e.g) r1     // Catch:{ all -> 0x00a6 }
            if (r1 != 0) goto L_0x0027
            monitor-exit(r0)     // Catch:{ all -> 0x00a6 }
            e.e.g<java.lang.String, e.e.g<java.lang.String, com.firebase.jobdispatcher.o>> r5 = f1842n
            monitor-enter(r5)
            e.e.g<java.lang.String, e.e.g<java.lang.String, com.firebase.jobdispatcher.o>> r6 = f1842n     // Catch:{ all -> 0x0024 }
            boolean r6 = r6.isEmpty()     // Catch:{ all -> 0x0024 }
            if (r6 == 0) goto L_0x0022
            int r6 = r4.f1848l     // Catch:{ all -> 0x0024 }
            r4.stopSelf(r6)     // Catch:{ all -> 0x0024 }
        L_0x0022:
            monitor-exit(r5)     // Catch:{ all -> 0x0024 }
            return
        L_0x0024:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0024 }
            throw r6
        L_0x0027:
            java.lang.String r2 = r5.a()     // Catch:{ all -> 0x00a6 }
            java.lang.Object r2 = r1.remove(r2)     // Catch:{ all -> 0x00a6 }
            com.firebase.jobdispatcher.o r2 = (com.firebase.jobdispatcher.o) r2     // Catch:{ all -> 0x00a6 }
            if (r2 != 0) goto L_0x0049
            monitor-exit(r0)     // Catch:{ all -> 0x00a6 }
            e.e.g<java.lang.String, e.e.g<java.lang.String, com.firebase.jobdispatcher.o>> r5 = f1842n
            monitor-enter(r5)
            e.e.g<java.lang.String, e.e.g<java.lang.String, com.firebase.jobdispatcher.o>> r6 = f1842n     // Catch:{ all -> 0x0046 }
            boolean r6 = r6.isEmpty()     // Catch:{ all -> 0x0046 }
            if (r6 == 0) goto L_0x0044
            int r6 = r4.f1848l     // Catch:{ all -> 0x0046 }
            r4.stopSelf(r6)     // Catch:{ all -> 0x0046 }
        L_0x0044:
            monitor-exit(r5)     // Catch:{ all -> 0x0046 }
            return
        L_0x0046:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0046 }
            throw r6
        L_0x0049:
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x00a6 }
            if (r1 == 0) goto L_0x0058
            e.e.g<java.lang.String, e.e.g<java.lang.String, com.firebase.jobdispatcher.o>> r1 = f1842n     // Catch:{ all -> 0x00a6 }
            java.lang.String r3 = r5.c()     // Catch:{ all -> 0x00a6 }
            r1.remove(r3)     // Catch:{ all -> 0x00a6 }
        L_0x0058:
            monitor-exit(r0)     // Catch:{ all -> 0x00a6 }
            boolean r0 = g(r5, r6)     // Catch:{ all -> 0x00a9 }
            if (r0 == 0) goto L_0x0063
            r4.k(r5)     // Catch:{ all -> 0x00a9 }
            goto L_0x0091
        L_0x0063:
            java.lang.String r0 = "FJD.GooglePlayReceiver"
            r1 = 2
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00a9 }
            if (r0 == 0) goto L_0x008e
            java.lang.String r0 = "FJD.GooglePlayReceiver"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a9 }
            r1.<init>()     // Catch:{ all -> 0x00a9 }
            java.lang.String r3 = "sending jobFinished for "
            r1.append(r3)     // Catch:{ all -> 0x00a9 }
            java.lang.String r5 = r5.a()     // Catch:{ all -> 0x00a9 }
            r1.append(r5)     // Catch:{ all -> 0x00a9 }
            java.lang.String r5 = " = "
            r1.append(r5)     // Catch:{ all -> 0x00a9 }
            r1.append(r6)     // Catch:{ all -> 0x00a9 }
            java.lang.String r5 = r1.toString()     // Catch:{ all -> 0x00a9 }
            android.util.Log.v(r0, r5)     // Catch:{ all -> 0x00a9 }
        L_0x008e:
            l(r2, r6)     // Catch:{ all -> 0x00a9 }
        L_0x0091:
            e.e.g<java.lang.String, e.e.g<java.lang.String, com.firebase.jobdispatcher.o>> r5 = f1842n
            monitor-enter(r5)
            e.e.g<java.lang.String, e.e.g<java.lang.String, com.firebase.jobdispatcher.o>> r6 = f1842n     // Catch:{ all -> 0x00a3 }
            boolean r6 = r6.isEmpty()     // Catch:{ all -> 0x00a3 }
            if (r6 == 0) goto L_0x00a1
            int r6 = r4.f1848l     // Catch:{ all -> 0x00a3 }
            r4.stopSelf(r6)     // Catch:{ all -> 0x00a3 }
        L_0x00a1:
            monitor-exit(r5)     // Catch:{ all -> 0x00a3 }
            return
        L_0x00a3:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00a3 }
            throw r6
        L_0x00a6:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00a6 }
            throw r5     // Catch:{ all -> 0x00a9 }
        L_0x00a9:
            r5 = move-exception
            e.e.g<java.lang.String, e.e.g<java.lang.String, com.firebase.jobdispatcher.o>> r6 = f1842n
            monitor-enter(r6)
            e.e.g<java.lang.String, e.e.g<java.lang.String, com.firebase.jobdispatcher.o>> r0 = f1842n     // Catch:{ all -> 0x00bc }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x00bc }
            if (r0 == 0) goto L_0x00ba
            int r0 = r4.f1848l     // Catch:{ all -> 0x00bc }
            r4.stopSelf(r0)     // Catch:{ all -> 0x00bc }
        L_0x00ba:
            monitor-exit(r6)     // Catch:{ all -> 0x00bc }
            throw r5
        L_0x00bc:
            r5 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x00bc }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.firebase.jobdispatcher.GooglePlayReceiver.a(com.firebase.jobdispatcher.q, int):void");
    }

    /* access modifiers changed from: package-private */
    public synchronized e b() {
        if (this.f1847k == null) {
            this.f1847k = new e(this, this, new b(getApplicationContext()));
        }
        return this.f1847k;
    }

    /* access modifiers changed from: package-private */
    public q i(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            Log.e("FJD.GooglePlayReceiver", "No data provided, terminating");
            return null;
        }
        Pair<o, Bundle> b = this.f1843g.b(extras);
        if (b != null) {
            return j((o) b.first, (Bundle) b.second);
        }
        Log.i("FJD.GooglePlayReceiver", "no callback found");
        return null;
    }

    /* access modifiers changed from: package-private */
    public q j(o oVar, Bundle bundle) {
        q d2 = f1841m.d(bundle);
        if (d2 == null) {
            Log.e("FJD.GooglePlayReceiver", "unable to decode job");
            l(oVar, 2);
            return null;
        }
        synchronized (f1842n) {
            g gVar = f1842n.get(d2.c());
            if (gVar == null) {
                gVar = new g(1);
                f1842n.put(d2.c(), gVar);
            }
            gVar.put(d2.a(), oVar);
        }
        return d2;
    }

    public IBinder onBind(Intent intent) {
        if (intent == null || Build.VERSION.SDK_INT < 21 || !"com.google.android.gms.gcm.ACTION_TASK_READY".equals(intent.getAction())) {
            return null;
        }
        return e().getBinder();
    }

    public final int onStartCommand(Intent intent, int i2, int i3) {
        try {
            super.onStartCommand(intent, i2, i3);
            if (intent == null) {
                Log.w("FJD.GooglePlayReceiver", "Null Intent passed, terminating");
                synchronized (f1842n) {
                    this.f1848l = i3;
                    if (f1842n.isEmpty()) {
                        stopSelf(this.f1848l);
                    }
                }
                return 2;
            }
            String action = intent.getAction();
            if ("com.google.android.gms.gcm.ACTION_TASK_READY".equals(action)) {
                b().b(i(intent));
                synchronized (f1842n) {
                    this.f1848l = i3;
                    if (f1842n.isEmpty()) {
                        stopSelf(this.f1848l);
                    }
                }
                return 2;
            } else if ("com.google.android.gms.gcm.SERVICE_ACTION_INITIALIZE".equals(action)) {
                synchronized (f1842n) {
                    this.f1848l = i3;
                    if (f1842n.isEmpty()) {
                        stopSelf(this.f1848l);
                    }
                }
                return 2;
            } else {
                Log.e("FJD.GooglePlayReceiver", "Unknown action received, terminating");
                synchronized (f1842n) {
                    this.f1848l = i3;
                    if (f1842n.isEmpty()) {
                        stopSelf(this.f1848l);
                    }
                }
                return 2;
            }
        } catch (Throwable th) {
            synchronized (f1842n) {
                this.f1848l = i3;
                if (f1842n.isEmpty()) {
                    stopSelf(this.f1848l);
                }
                throw th;
            }
        }
    }
}
