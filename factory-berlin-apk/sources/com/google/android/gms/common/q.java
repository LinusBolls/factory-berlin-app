package com.google.android.gms.common;

import android.content.Context;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.common.internal.p0;
import com.google.android.gms.common.internal.q0;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.dynamite.DynamiteModule;

final class q {
    private static volatile p0 a;
    private static final Object b = new Object();
    private static Context c;

    static a0 a(String str, s sVar, boolean z, boolean z2) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return d(str, sVar, z, z2);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    static final /* synthetic */ String b(boolean z, String str, s sVar) {
        boolean z2 = true;
        if (z || !d(str, sVar, true, false).a) {
            z2 = false;
        }
        return a0.e(str, sVar, z, z2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0019, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static synchronized void c(android.content.Context r2) {
        /*
            java.lang.Class<com.google.android.gms.common.q> r0 = com.google.android.gms.common.q.class
            monitor-enter(r0)
            android.content.Context r1 = c     // Catch:{ all -> 0x001a }
            if (r1 != 0) goto L_0x0011
            if (r2 == 0) goto L_0x0018
            android.content.Context r2 = r2.getApplicationContext()     // Catch:{ all -> 0x001a }
            c = r2     // Catch:{ all -> 0x001a }
            monitor-exit(r0)
            return
        L_0x0011:
            java.lang.String r2 = "GoogleCertificates"
            java.lang.String r1 = "GoogleCertificates has been initialized already"
            android.util.Log.w(r2, r1)     // Catch:{ all -> 0x001a }
        L_0x0018:
            monitor-exit(r0)
            return
        L_0x001a:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.q.c(android.content.Context):void");
    }

    private static a0 d(String str, s sVar, boolean z, boolean z2) {
        try {
            if (a == null) {
                r.k(c);
                synchronized (b) {
                    if (a == null) {
                        a = q0.l(DynamiteModule.d(c, DynamiteModule.f2187j, "com.google.android.gms.googlecertificates").c("com.google.android.gms.common.GoogleCertificatesImpl"));
                    }
                }
            }
            r.k(c);
            try {
                if (a.c0(new y(str, sVar, z, z2), b.S0(c.getPackageManager()))) {
                    return a0.f();
                }
                return a0.c(new r(z, str, sVar));
            } catch (RemoteException e2) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
                return a0.b("module call", e2);
            }
        } catch (DynamiteModule.LoadingException e3) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e3);
            String valueOf = String.valueOf(e3.getMessage());
            return a0.b(valueOf.length() != 0 ? "module init: ".concat(valueOf) : new String("module init: "), e3);
        }
    }
}
