package com.firebase.jobdispatcher;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.firebase.jobdispatcher.l;
import com.firebase.jobdispatcher.q;
import e.e.g;

/* compiled from: ExecutionDelegator */
class e {

    /* renamed from: e  reason: collision with root package name */
    private static final g<String, s> f1849e = new g<>();
    private final l a = new a();
    private final Context b;
    private final b c;

    /* renamed from: d  reason: collision with root package name */
    private final b f1850d;

    /* compiled from: ExecutionDelegator */
    class a extends l.a {
        a() {
        }

        public void D0(Bundle bundle, int i2) {
            q.b c = GooglePlayReceiver.d().c(bundle);
            if (c == null) {
                Log.wtf("FJD.ExternalReceiver", "jobFinished: unknown invocation provided");
            } else {
                e.this.c(c.l(), i2);
            }
        }
    }

    /* compiled from: ExecutionDelegator */
    interface b {
        void a(q qVar, int i2);
    }

    e(Context context, b bVar, b bVar2) {
        this.b = context;
        this.c = bVar;
        this.f1850d = bVar2;
    }

    /* access modifiers changed from: private */
    public void c(q qVar, int i2) {
        s sVar;
        synchronized (f1849e) {
            sVar = f1849e.get(qVar.c());
        }
        if (sVar != null) {
            sVar.c(qVar);
            if (sVar.i()) {
                synchronized (f1849e) {
                    f1849e.remove(qVar.c());
                }
            }
        }
        this.c.a(qVar, i2);
    }

    static void d(q qVar, boolean z) {
        s sVar;
        synchronized (f1849e) {
            sVar = f1849e.get(qVar.c());
        }
        if (sVar != null) {
            sVar.d(qVar, z);
            if (sVar.i()) {
                synchronized (f1849e) {
                    f1849e.remove(qVar.c());
                }
            }
        }
    }

    private boolean e(q qVar, s sVar) {
        try {
            return this.b.bindService(new Intent("com.firebase.jobdispatcher.ACTION_EXECUTE").setClassName(this.b, qVar.c()), sVar, 1);
        } catch (SecurityException e2) {
            Log.e("FJD.ExternalReceiver", "Failed to bind to " + qVar.c() + ": " + e2);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x009f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(com.firebase.jobdispatcher.q r6) {
        /*
            r5 = this;
            if (r6 != 0) goto L_0x0003
            return
        L_0x0003:
            com.firebase.jobdispatcher.b r0 = r5.f1850d
            boolean r0 = r0.a(r6)
            r1 = 3
            if (r0 != 0) goto L_0x0031
            java.lang.String r0 = "FJD.ExternalReceiver"
            boolean r0 = android.util.Log.isLoggable(r0, r1)
            if (r0 == 0) goto L_0x002a
            java.lang.String r0 = "FJD.ExternalReceiver"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Not executing job because constraints still unmet. Job: "
            r1.append(r2)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r0, r1)
        L_0x002a:
            com.firebase.jobdispatcher.e$b r0 = r5.c
            r1 = 1
            r0.a(r6, r1)
            return
        L_0x0031:
            java.lang.String r0 = "FJD.ExternalReceiver"
            boolean r0 = android.util.Log.isLoggable(r0, r1)
            if (r0 == 0) goto L_0x004f
            java.lang.String r0 = "FJD.ExternalReceiver"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Proceeding to execute job because constraints met. Job: "
            r1.append(r2)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r0, r1)
        L_0x004f:
            e.e.g<java.lang.String, com.firebase.jobdispatcher.s> r0 = f1849e
            monitor-enter(r0)
            e.e.g<java.lang.String, com.firebase.jobdispatcher.s> r1 = f1849e     // Catch:{ all -> 0x00a0 }
            java.lang.String r2 = r6.c()     // Catch:{ all -> 0x00a0 }
            java.lang.Object r1 = r1.get(r2)     // Catch:{ all -> 0x00a0 }
            com.firebase.jobdispatcher.s r1 = (com.firebase.jobdispatcher.s) r1     // Catch:{ all -> 0x00a0 }
            if (r1 == 0) goto L_0x0065
            r1.f(r6)     // Catch:{ all -> 0x00a0 }
            monitor-exit(r0)     // Catch:{ all -> 0x00a0 }
            return
        L_0x0065:
            com.firebase.jobdispatcher.s r1 = new com.firebase.jobdispatcher.s     // Catch:{ all -> 0x00a0 }
            com.firebase.jobdispatcher.l r2 = r5.a     // Catch:{ all -> 0x00a0 }
            android.content.Context r3 = r5.b     // Catch:{ all -> 0x00a0 }
            r1.<init>(r2, r3)     // Catch:{ all -> 0x00a0 }
            e.e.g<java.lang.String, com.firebase.jobdispatcher.s> r2 = f1849e     // Catch:{ all -> 0x00a0 }
            java.lang.String r3 = r6.c()     // Catch:{ all -> 0x00a0 }
            r2.put(r3, r1)     // Catch:{ all -> 0x00a0 }
            r1.f(r6)     // Catch:{ all -> 0x00a0 }
            boolean r2 = r5.e(r6, r1)     // Catch:{ all -> 0x00a0 }
            if (r2 == 0) goto L_0x0081
            goto L_0x009e
        L_0x0081:
            java.lang.String r2 = "FJD.ExternalReceiver"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a0 }
            r3.<init>()     // Catch:{ all -> 0x00a0 }
            java.lang.String r4 = "Unable to bind to "
            r3.append(r4)     // Catch:{ all -> 0x00a0 }
            java.lang.String r6 = r6.c()     // Catch:{ all -> 0x00a0 }
            r3.append(r6)     // Catch:{ all -> 0x00a0 }
            java.lang.String r6 = r3.toString()     // Catch:{ all -> 0x00a0 }
            android.util.Log.e(r2, r6)     // Catch:{ all -> 0x00a0 }
            r1.h()     // Catch:{ all -> 0x00a0 }
        L_0x009e:
            monitor-exit(r0)     // Catch:{ all -> 0x00a0 }
            return
        L_0x00a0:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00a0 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.firebase.jobdispatcher.e.b(com.firebase.jobdispatcher.q):void");
    }
}
