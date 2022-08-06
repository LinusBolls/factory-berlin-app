package com.microsoft.appcenter.http;

import android.os.Handler;
import android.os.Looper;
import com.microsoft.appcenter.http.d;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* compiled from: HttpClientRetryer */
public class h extends f {

    /* renamed from: j  reason: collision with root package name */
    static final long[] f4510j = {TimeUnit.SECONDS.toMillis(10), TimeUnit.MINUTES.toMillis(5), TimeUnit.MINUTES.toMillis(20)};
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final Handler f4511h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final Random f4512i;

    /* compiled from: HttpClientRetryer */
    private class a extends e {

        /* renamed from: n  reason: collision with root package name */
        private int f4513n;

        a(d dVar, String str, String str2, Map<String, String> map, d.a aVar, l lVar) {
            super(dVar, str, str2, map, aVar, lVar);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0013, code lost:
            r0 = ((com.microsoft.appcenter.http.HttpException) r6).b().a().get("x-ms-retry-after-ms");
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void b(java.lang.Exception r6) {
            /*
                r5 = this;
                int r0 = r5.f4513n
                long[] r1 = com.microsoft.appcenter.http.h.f4510j
                int r1 = r1.length
                if (r0 >= r1) goto L_0x0090
                boolean r0 = com.microsoft.appcenter.http.j.h(r6)
                if (r0 == 0) goto L_0x0090
                boolean r0 = r6 instanceof com.microsoft.appcenter.http.HttpException
                r1 = 0
                if (r0 == 0) goto L_0x002d
                r0 = r6
                com.microsoft.appcenter.http.HttpException r0 = (com.microsoft.appcenter.http.HttpException) r0
                com.microsoft.appcenter.http.i r0 = r0.b()
                java.util.Map r0 = r0.a()
                java.lang.String r3 = "x-ms-retry-after-ms"
                java.lang.Object r0 = r0.get(r3)
                java.lang.String r0 = (java.lang.String) r0
                if (r0 == 0) goto L_0x002d
                long r3 = java.lang.Long.parseLong(r0)
                goto L_0x002e
            L_0x002d:
                r3 = r1
            L_0x002e:
                int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r0 != 0) goto L_0x004c
                long[] r0 = com.microsoft.appcenter.http.h.f4510j
                int r1 = r5.f4513n
                int r2 = r1 + 1
                r5.f4513n = r2
                r1 = r0[r1]
                r3 = 2
                long r1 = r1 / r3
                com.microsoft.appcenter.http.h r0 = com.microsoft.appcenter.http.h.this
                java.util.Random r0 = r0.f4512i
                int r3 = (int) r1
                int r0 = r0.nextInt(r3)
                long r3 = (long) r0
                long r3 = r3 + r1
            L_0x004c:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Try #"
                r0.append(r1)
                int r1 = r5.f4513n
                r0.append(r1)
                java.lang.String r1 = " failed and will be retried in "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r1 = " ms"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                boolean r1 = r6 instanceof java.net.UnknownHostException
                if (r1 == 0) goto L_0x0081
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r0)
                java.lang.String r0 = " (UnknownHostException)"
                r1.append(r0)
                java.lang.String r0 = r1.toString()
            L_0x0081:
                java.lang.String r1 = "AppCenter"
                com.microsoft.appcenter.utils.a.j(r1, r0, r6)
                com.microsoft.appcenter.http.h r6 = com.microsoft.appcenter.http.h.this
                android.os.Handler r6 = r6.f4511h
                r6.postDelayed(r5, r3)
                goto L_0x0095
            L_0x0090:
                com.microsoft.appcenter.http.l r0 = r5.f4504l
                r0.b(r6)
            L_0x0095:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.microsoft.appcenter.http.h.a.b(java.lang.Exception):void");
        }

        public synchronized void cancel() {
            h.this.f4511h.removeCallbacks(this);
            super.cancel();
        }
    }

    h(d dVar) {
        this(dVar, new Handler(Looper.getMainLooper()));
    }

    public k p0(String str, String str2, Map<String, String> map, d.a aVar, l lVar) {
        a aVar2 = new a(this.f4506g, str, str2, map, aVar, lVar);
        aVar2.run();
        return aVar2;
    }

    h(d dVar, Handler handler) {
        super(dVar);
        this.f4512i = new Random();
        this.f4511h = handler;
    }
}
