package com.google.firebase.crashlytics.d.f;

import android.os.Bundle;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: BlockingAnalyticsEventLogger */
public class c implements b, a {
    private final e a;
    private final int b;
    private final TimeUnit c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f3899d = new Object();

    /* renamed from: e  reason: collision with root package name */
    private CountDownLatch f3900e;

    public c(e eVar, int i2, TimeUnit timeUnit) {
        this.a = eVar;
        this.b = i2;
        this.c = timeUnit;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:9|10) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        com.google.firebase.crashlytics.d.b.f().b("Interrupted while awaiting app exception callback from FA listener.");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0043 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(java.lang.String r4, android.os.Bundle r5) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f3899d
            monitor-enter(r0)
            com.google.firebase.crashlytics.d.b r1 = com.google.firebase.crashlytics.d.b.f()     // Catch:{ all -> 0x0051 }
            java.lang.String r2 = "Logging Crashlytics event to Firebase"
            r1.b(r2)     // Catch:{ all -> 0x0051 }
            java.util.concurrent.CountDownLatch r1 = new java.util.concurrent.CountDownLatch     // Catch:{ all -> 0x0051 }
            r2 = 1
            r1.<init>(r2)     // Catch:{ all -> 0x0051 }
            r3.f3900e = r1     // Catch:{ all -> 0x0051 }
            com.google.firebase.crashlytics.d.f.e r1 = r3.a     // Catch:{ all -> 0x0051 }
            r1.a(r4, r5)     // Catch:{ all -> 0x0051 }
            com.google.firebase.crashlytics.d.b r4 = com.google.firebase.crashlytics.d.b.f()     // Catch:{ all -> 0x0051 }
            java.lang.String r5 = "Awaiting app exception callback from FA..."
            r4.b(r5)     // Catch:{ all -> 0x0051 }
            java.util.concurrent.CountDownLatch r4 = r3.f3900e     // Catch:{ InterruptedException -> 0x0043 }
            int r5 = r3.b     // Catch:{ InterruptedException -> 0x0043 }
            long r1 = (long) r5     // Catch:{ InterruptedException -> 0x0043 }
            java.util.concurrent.TimeUnit r5 = r3.c     // Catch:{ InterruptedException -> 0x0043 }
            boolean r4 = r4.await(r1, r5)     // Catch:{ InterruptedException -> 0x0043 }
            if (r4 == 0) goto L_0x0039
            com.google.firebase.crashlytics.d.b r4 = com.google.firebase.crashlytics.d.b.f()     // Catch:{ InterruptedException -> 0x0043 }
            java.lang.String r5 = "App exception callback received from FA listener."
            r4.b(r5)     // Catch:{ InterruptedException -> 0x0043 }
            goto L_0x004c
        L_0x0039:
            com.google.firebase.crashlytics.d.b r4 = com.google.firebase.crashlytics.d.b.f()     // Catch:{ InterruptedException -> 0x0043 }
            java.lang.String r5 = "Timeout exceeded while awaiting app exception callback from FA listener."
            r4.b(r5)     // Catch:{ InterruptedException -> 0x0043 }
            goto L_0x004c
        L_0x0043:
            com.google.firebase.crashlytics.d.b r4 = com.google.firebase.crashlytics.d.b.f()     // Catch:{ all -> 0x0051 }
            java.lang.String r5 = "Interrupted while awaiting app exception callback from FA listener."
            r4.b(r5)     // Catch:{ all -> 0x0051 }
        L_0x004c:
            r4 = 0
            r3.f3900e = r4     // Catch:{ all -> 0x0051 }
            monitor-exit(r0)     // Catch:{ all -> 0x0051 }
            return
        L_0x0051:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0051 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.d.f.c.a(java.lang.String, android.os.Bundle):void");
    }

    public void n(String str, Bundle bundle) {
        CountDownLatch countDownLatch = this.f3900e;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }
}
