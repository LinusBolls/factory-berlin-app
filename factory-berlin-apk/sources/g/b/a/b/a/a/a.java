package g.b.a.b.a.a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.f;
import com.google.android.gms.common.h;
import com.google.android.gms.common.internal.r;
import g.b.a.b.c.a.d;
import g.b.a.b.c.a.e;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class a {
    private com.google.android.gms.common.a a;
    private d b;
    private boolean c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f9317d = new Object();

    /* renamed from: e  reason: collision with root package name */
    private b f9318e;

    /* renamed from: f  reason: collision with root package name */
    private final Context f9319f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f9320g;

    /* renamed from: h  reason: collision with root package name */
    private final long f9321h;

    /* renamed from: g.b.a.b.a.a.a$a  reason: collision with other inner class name */
    public static final class C0631a {
        private final String a;
        private final boolean b;

        public C0631a(String str, boolean z) {
            this.a = str;
            this.b = z;
        }

        public final String a() {
            return this.a;
        }

        public final boolean b() {
            return this.b;
        }

        public final String toString() {
            String str = this.a;
            boolean z = this.b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
            sb.append("{");
            sb.append(str);
            sb.append("}");
            sb.append(z);
            return sb.toString();
        }
    }

    static class b extends Thread {

        /* renamed from: g  reason: collision with root package name */
        private WeakReference<a> f9322g;

        /* renamed from: h  reason: collision with root package name */
        private long f9323h;

        /* renamed from: i  reason: collision with root package name */
        CountDownLatch f9324i = new CountDownLatch(1);

        /* renamed from: j  reason: collision with root package name */
        boolean f9325j = false;

        public b(a aVar, long j2) {
            this.f9322g = new WeakReference<>(aVar);
            this.f9323h = j2;
            start();
        }

        private final void a() {
            a aVar = (a) this.f9322g.get();
            if (aVar != null) {
                aVar.a();
                this.f9325j = true;
            }
        }

        public final void run() {
            try {
                if (!this.f9324i.await(this.f9323h, TimeUnit.MILLISECONDS)) {
                    a();
                }
            } catch (InterruptedException unused) {
                a();
            }
        }
    }

    private a(Context context, long j2, boolean z, boolean z2) {
        Context applicationContext;
        r.k(context);
        if (z && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.f9319f = context;
        this.c = false;
        this.f9321h = j2;
        this.f9320g = z2;
    }

    public static C0631a b(Context context) {
        c cVar = new c(context);
        boolean a2 = cVar.a("gads:ad_id_app_context:enabled", false);
        float b2 = cVar.b("gads:ad_id_app_context:ping_ratio", 0.0f);
        String c2 = cVar.c("gads:ad_id_use_shared_preference:experiment_id", "");
        a aVar = new a(context, -1, a2, cVar.a("gads:ad_id_use_persistent_service:enabled", false));
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            aVar.h(false);
            C0631a c3 = aVar.c();
            aVar.i(c3, a2, b2, SystemClock.elapsedRealtime() - elapsedRealtime, c2, (Throwable) null);
            aVar.a();
            return c3;
        } catch (Throwable th) {
            aVar.a();
            throw th;
        }
    }

    public static void d(boolean z) {
    }

    private static com.google.android.gms.common.a e(Context context, boolean z) {
        try {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            int h2 = f.f().h(context, h.a);
            if (h2 == 0 || h2 == 2) {
                String str = z ? "com.google.android.gms.ads.identifier.service.PERSISTENT_START" : "com.google.android.gms.ads.identifier.service.START";
                com.google.android.gms.common.a aVar = new com.google.android.gms.common.a();
                Intent intent = new Intent(str);
                intent.setPackage("com.google.android.gms");
                try {
                    if (com.google.android.gms.common.l.a.b().a(context, intent, aVar, 1)) {
                        return aVar;
                    }
                    throw new IOException("Connection failure");
                } catch (Throwable th) {
                    throw new IOException(th);
                }
            } else {
                throw new IOException("Google Play services not available");
            }
        } catch (PackageManager.NameNotFoundException unused) {
            throw new GooglePlayServicesNotAvailableException(9);
        }
    }

    private static d f(Context context, com.google.android.gms.common.a aVar) {
        try {
            return e.i(aVar.a(10000, TimeUnit.MILLISECONDS));
        } catch (InterruptedException unused) {
            throw new IOException("Interrupted exception");
        } catch (Throwable th) {
            throw new IOException(th);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:2|3|(3:5|6|7)|8|9|(1:11)|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0013 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void g() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f9317d
            monitor-enter(r0)
            g.b.a.b.a.a.a$b r1 = r6.f9318e     // Catch:{ all -> 0x0026 }
            if (r1 == 0) goto L_0x0013
            g.b.a.b.a.a.a$b r1 = r6.f9318e     // Catch:{ all -> 0x0026 }
            java.util.concurrent.CountDownLatch r1 = r1.f9324i     // Catch:{ all -> 0x0026 }
            r1.countDown()     // Catch:{ all -> 0x0026 }
            g.b.a.b.a.a.a$b r1 = r6.f9318e     // Catch:{ InterruptedException -> 0x0013 }
            r1.join()     // Catch:{ InterruptedException -> 0x0013 }
        L_0x0013:
            long r1 = r6.f9321h     // Catch:{ all -> 0x0026 }
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0024
            g.b.a.b.a.a.a$b r1 = new g.b.a.b.a.a.a$b     // Catch:{ all -> 0x0026 }
            long r2 = r6.f9321h     // Catch:{ all -> 0x0026 }
            r1.<init>(r6, r2)     // Catch:{ all -> 0x0026 }
            r6.f9318e = r1     // Catch:{ all -> 0x0026 }
        L_0x0024:
            monitor-exit(r0)     // Catch:{ all -> 0x0026 }
            return
        L_0x0026:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0026 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: g.b.a.b.a.a.a.g():void");
    }

    private final void h(boolean z) {
        r.j("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.c) {
                a();
            }
            com.google.android.gms.common.a e2 = e(this.f9319f, this.f9320g);
            this.a = e2;
            this.b = f(this.f9319f, e2);
            this.c = true;
            if (z) {
                g();
            }
        }
    }

    private final boolean i(C0631a aVar, boolean z, float f2, long j2, String str, Throwable th) {
        if (Math.random() > ((double) f2)) {
            return false;
        }
        HashMap hashMap = new HashMap();
        String str2 = k.h0.d.d.F;
        hashMap.put("app_context", z ? str2 : "0");
        if (aVar != null) {
            if (!aVar.b()) {
                str2 = "0";
            }
            hashMap.put("limit_ad_tracking", str2);
        }
        if (!(aVar == null || aVar.a() == null)) {
            hashMap.put("ad_id_size", Integer.toString(aVar.a().length()));
        }
        if (th != null) {
            hashMap.put("error", th.getClass().getName());
        }
        if (str != null && !str.isEmpty()) {
            hashMap.put("experiment_id", str);
        }
        hashMap.put("tag", "AdvertisingIdClient");
        hashMap.put("time_spent", Long.toString(j2));
        new b(this, hashMap).start();
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0032, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r3 = this;
            java.lang.String r0 = "Calling this from your main thread can lead to deadlock"
            com.google.android.gms.common.internal.r.j(r0)
            monitor-enter(r3)
            android.content.Context r0 = r3.f9319f     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x0031
            com.google.android.gms.common.a r0 = r3.a     // Catch:{ all -> 0x0033 }
            if (r0 != 0) goto L_0x000f
            goto L_0x0031
        L_0x000f:
            boolean r0 = r3.c     // Catch:{ all -> 0x001f }
            if (r0 == 0) goto L_0x0027
            com.google.android.gms.common.l.a r0 = com.google.android.gms.common.l.a.b()     // Catch:{ all -> 0x001f }
            android.content.Context r1 = r3.f9319f     // Catch:{ all -> 0x001f }
            com.google.android.gms.common.a r2 = r3.a     // Catch:{ all -> 0x001f }
            r0.c(r1, r2)     // Catch:{ all -> 0x001f }
            goto L_0x0027
        L_0x001f:
            r0 = move-exception
            java.lang.String r1 = "AdvertisingIdClient"
            java.lang.String r2 = "AdvertisingIdClient unbindService failed."
            android.util.Log.i(r1, r2, r0)     // Catch:{ all -> 0x0033 }
        L_0x0027:
            r0 = 0
            r3.c = r0     // Catch:{ all -> 0x0033 }
            r0 = 0
            r3.b = r0     // Catch:{ all -> 0x0033 }
            r3.a = r0     // Catch:{ all -> 0x0033 }
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            return
        L_0x0031:
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            return
        L_0x0033:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g.b.a.b.a.a.a.a():void");
    }

    public C0631a c() {
        C0631a aVar;
        r.j("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (!this.c) {
                synchronized (this.f9317d) {
                    if (this.f9318e == null || !this.f9318e.f9325j) {
                        throw new IOException("AdvertisingIdClient is not connected.");
                    }
                }
                try {
                    h(false);
                    if (!this.c) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                } catch (RemoteException e2) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e2);
                    throw new IOException("Remote exception");
                } catch (Exception e3) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e3);
                }
            }
            r.k(this.a);
            r.k(this.b);
            aVar = new C0631a(this.b.getId(), this.b.p0(true));
        }
        g();
        return aVar;
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        a();
        super.finalize();
    }
}
