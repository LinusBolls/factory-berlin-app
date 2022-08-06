package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.datatransport.runtime.backends.e;
import com.google.android.datatransport.runtime.backends.f;
import com.google.android.datatransport.runtime.backends.g;
import com.google.android.datatransport.runtime.synchronization.a;
import g.b.a.a.i.v.j.c;
import g.b.a.a.i.v.j.i;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* compiled from: Uploader */
public class m {
    private final Context a;
    private final e b;
    private final c c;

    /* renamed from: d  reason: collision with root package name */
    private final s f2000d;

    /* renamed from: e  reason: collision with root package name */
    private final Executor f2001e;

    /* renamed from: f  reason: collision with root package name */
    private final a f2002f;

    /* renamed from: g  reason: collision with root package name */
    private final g.b.a.a.i.w.a f2003g;

    public m(Context context, e eVar, c cVar, s sVar, Executor executor, a aVar, g.b.a.a.i.w.a aVar2) {
        this.a = context;
        this.b = eVar;
        this.c = cVar;
        this.f2000d = sVar;
        this.f2001e = executor;
        this.f2002f = aVar;
        this.f2003g = aVar2;
    }

    static /* synthetic */ Object c(m mVar, g gVar, Iterable iterable, g.b.a.a.i.m mVar2, int i2) {
        if (gVar.c() == g.a.TRANSIENT_ERROR) {
            mVar.c.q0(iterable);
            mVar.f2000d.a(mVar2, i2 + 1);
            return null;
        }
        mVar.c.r(iterable);
        if (gVar.c() == g.a.OK) {
            mVar.c.O(mVar2, mVar.f2003g.a() + gVar.b());
        }
        if (!mVar.c.m0(mVar2)) {
            return null;
        }
        mVar.f2000d.a(mVar2, 1);
        return null;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:6|7) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002f, code lost:
        r5.run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0032, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0022, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        r2.f2000d.a(r3, r4 + 1);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0024 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ void e(com.google.android.datatransport.runtime.scheduling.jobscheduling.m r2, g.b.a.a.i.m r3, int r4, java.lang.Runnable r5) {
        /*
            com.google.android.datatransport.runtime.synchronization.a r0 = r2.f2002f     // Catch:{ SynchronizationException -> 0x0024 }
            g.b.a.a.i.v.j.c r1 = r2.c     // Catch:{ SynchronizationException -> 0x0024 }
            r1.getClass()     // Catch:{ SynchronizationException -> 0x0024 }
            com.google.android.datatransport.runtime.synchronization.a$a r1 = com.google.android.datatransport.runtime.scheduling.jobscheduling.k.b(r1)     // Catch:{ SynchronizationException -> 0x0024 }
            r0.a(r1)     // Catch:{ SynchronizationException -> 0x0024 }
            boolean r0 = r2.a()     // Catch:{ SynchronizationException -> 0x0024 }
            if (r0 != 0) goto L_0x001e
            com.google.android.datatransport.runtime.synchronization.a r0 = r2.f2002f     // Catch:{ SynchronizationException -> 0x0024 }
            com.google.android.datatransport.runtime.synchronization.a$a r1 = com.google.android.datatransport.runtime.scheduling.jobscheduling.l.b(r2, r3, r4)     // Catch:{ SynchronizationException -> 0x0024 }
            r0.a(r1)     // Catch:{ SynchronizationException -> 0x0024 }
            goto L_0x002b
        L_0x001e:
            r2.f(r3, r4)     // Catch:{ SynchronizationException -> 0x0024 }
            goto L_0x002b
        L_0x0022:
            r2 = move-exception
            goto L_0x002f
        L_0x0024:
            com.google.android.datatransport.runtime.scheduling.jobscheduling.s r2 = r2.f2000d     // Catch:{ all -> 0x0022 }
            int r4 = r4 + 1
            r2.a(r3, r4)     // Catch:{ all -> 0x0022 }
        L_0x002b:
            r5.run()
            return
        L_0x002f:
            r5.run()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.datatransport.runtime.scheduling.jobscheduling.m.e(com.google.android.datatransport.runtime.scheduling.jobscheduling.m, g.b.a.a.i.m, int, java.lang.Runnable):void");
    }

    /* access modifiers changed from: package-private */
    public boolean a() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.a.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* access modifiers changed from: package-private */
    public void f(g.b.a.a.i.m mVar, int i2) {
        g gVar;
        com.google.android.datatransport.runtime.backends.m a2 = this.b.a(mVar.b());
        Iterable<i> iterable = (Iterable) this.f2002f.a(i.b(this, mVar));
        if (iterable.iterator().hasNext()) {
            if (a2 == null) {
                g.b.a.a.i.t.a.a("Uploader", "Unknown backend for %s, deleting event batch for it...", mVar);
                gVar = g.a();
            } else {
                ArrayList arrayList = new ArrayList();
                for (i b2 : iterable) {
                    arrayList.add(b2.b());
                }
                f.a a3 = f.a();
                a3.b(arrayList);
                a3.c(mVar.c());
                gVar = a2.b(a3.a());
            }
            this.f2002f.a(j.b(this, gVar, iterable, mVar, i2));
        }
    }

    public void g(g.b.a.a.i.m mVar, int i2, Runnable runnable) {
        this.f2001e.execute(h.a(this, mVar, i2, runnable));
    }
}
