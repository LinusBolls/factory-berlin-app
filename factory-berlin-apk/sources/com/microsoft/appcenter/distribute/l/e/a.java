package com.microsoft.appcenter.distribute.l.e;

import android.app.DownloadManager;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.microsoft.appcenter.distribute.h;
import com.microsoft.appcenter.distribute.l.b;
import com.microsoft.appcenter.utils.d;

/* compiled from: DownloadManagerReleaseDownloader */
public class a extends com.microsoft.appcenter.distribute.l.a {

    /* renamed from: e  reason: collision with root package name */
    private long f4482e = -1;

    /* renamed from: f  reason: collision with root package name */
    private d f4483f;

    /* renamed from: g  reason: collision with root package name */
    private c f4484g;

    /* renamed from: com.microsoft.appcenter.distribute.l.e.a$a  reason: collision with other inner class name */
    /* compiled from: DownloadManagerReleaseDownloader */
    class C0123a implements Runnable {
        C0123a() {
        }

        public void run() {
            a.this.q();
        }
    }

    public a(Context context, h hVar, b.a aVar) {
        super(context, hVar, aVar);
    }

    private static Uri h(Cursor cursor) {
        return Uri.parse("file://" + cursor.getString(cursor.getColumnIndexOrThrow("local_filename")));
    }

    private void n(long j2) {
        com.microsoft.appcenter.utils.a.a("AppCenterDistribute", "Removing download and notification id=" + j2);
        d.a("AppCenterDistribute", new b(this.a, j2), new Void[0]);
    }

    private synchronized void o() {
        if (!d()) {
            if (this.f4484g != null) {
                com.microsoft.appcenter.utils.a.a("AppCenterDistribute", "Downloading is already in progress.");
            } else {
                this.f4484g = (c) d.a("AppCenterDistribute", new c(this), new Void[0]);
            }
        }
    }

    private synchronized void p(long j2) {
        this.f4482e = j2;
        if (j2 != -1) {
            com.microsoft.appcenter.utils.o.d.m("Distribute.download_id", j2);
        } else {
            com.microsoft.appcenter.utils.o.d.p("Distribute.download_id");
        }
    }

    /* access modifiers changed from: private */
    public synchronized void q() {
        if (!d()) {
            this.f4483f = (d) d.a("AppCenterDistribute", new d(this), new Void[0]);
        }
    }

    public synchronized void a() {
        q();
    }

    public synchronized boolean b() {
        return this.f4482e != -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0035, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void cancel() {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.d()     // Catch:{ all -> 0x0036 }
            if (r0 == 0) goto L_0x0009
            monitor-exit(r5)
            return
        L_0x0009:
            super.cancel()     // Catch:{ all -> 0x0036 }
            com.microsoft.appcenter.distribute.l.e.c r0 = r5.f4484g     // Catch:{ all -> 0x0036 }
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0019
            com.microsoft.appcenter.distribute.l.e.c r0 = r5.f4484g     // Catch:{ all -> 0x0036 }
            r0.cancel(r2)     // Catch:{ all -> 0x0036 }
            r5.f4484g = r1     // Catch:{ all -> 0x0036 }
        L_0x0019:
            com.microsoft.appcenter.distribute.l.e.d r0 = r5.f4483f     // Catch:{ all -> 0x0036 }
            if (r0 == 0) goto L_0x0024
            com.microsoft.appcenter.distribute.l.e.d r0 = r5.f4483f     // Catch:{ all -> 0x0036 }
            r0.cancel(r2)     // Catch:{ all -> 0x0036 }
            r5.f4483f = r1     // Catch:{ all -> 0x0036 }
        L_0x0024:
            long r0 = r5.f()     // Catch:{ all -> 0x0036 }
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x0034
            r5.n(r0)     // Catch:{ all -> 0x0036 }
            r5.p(r2)     // Catch:{ all -> 0x0036 }
        L_0x0034:
            monitor-exit(r5)
            return
        L_0x0036:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.microsoft.appcenter.distribute.l.e.a.cancel():void");
    }

    /* access modifiers changed from: package-private */
    public synchronized long f() {
        if (this.f4482e == -1) {
            this.f4482e = com.microsoft.appcenter.utils.o.d.e("Distribute.download_id", -1);
        }
        return this.f4482e;
    }

    /* access modifiers changed from: package-private */
    public DownloadManager g() {
        return (DownloadManager) this.a.getSystemService("download");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0054, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void i(android.database.Cursor r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.d()     // Catch:{ all -> 0x0055 }
            if (r0 == 0) goto L_0x0009
            monitor-exit(r4)
            return
        L_0x0009:
            java.lang.String r0 = "AppCenterDistribute"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0055 }
            r1.<init>()     // Catch:{ all -> 0x0055 }
            java.lang.String r2 = "Download was successful for id="
            r1.append(r2)     // Catch:{ all -> 0x0055 }
            long r2 = r4.f4482e     // Catch:{ all -> 0x0055 }
            r1.append(r2)     // Catch:{ all -> 0x0055 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0055 }
            com.microsoft.appcenter.utils.a.a(r0, r1)     // Catch:{ all -> 0x0055 }
            java.lang.String r0 = "local_uri"
            int r0 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0055 }
            java.lang.String r0 = r5.getString(r0)     // Catch:{ all -> 0x0055 }
            android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch:{ all -> 0x0055 }
            r1 = 0
            com.microsoft.appcenter.distribute.l.b$a r2 = r4.c     // Catch:{ all -> 0x0055 }
            boolean r0 = r2.b(r0)     // Catch:{ all -> 0x0055 }
            if (r0 != 0) goto L_0x0049
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0055 }
            r2 = 24
            if (r0 >= r2) goto L_0x004a
            com.microsoft.appcenter.distribute.l.b$a r0 = r4.c     // Catch:{ all -> 0x0055 }
            android.net.Uri r5 = h(r5)     // Catch:{ all -> 0x0055 }
            boolean r1 = r0.b(r5)     // Catch:{ all -> 0x0055 }
            goto L_0x004a
        L_0x0049:
            r1 = 1
        L_0x004a:
            if (r1 != 0) goto L_0x0053
            com.microsoft.appcenter.distribute.l.b$a r5 = r4.c     // Catch:{ all -> 0x0055 }
            java.lang.String r0 = "Installer not found"
            r5.d(r0)     // Catch:{ all -> 0x0055 }
        L_0x0053:
            monitor-exit(r4)
            return
        L_0x0055:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.microsoft.appcenter.distribute.l.e.a.i(android.database.Cursor):void");
    }

    /* access modifiers changed from: package-private */
    public synchronized void j(RuntimeException runtimeException) {
        if (!d()) {
            com.microsoft.appcenter.utils.a.c("AppCenterDistribute", "Failed to download update id=" + this.f4482e, runtimeException);
            this.c.d(runtimeException.getMessage());
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void k(android.database.Cursor r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.d()     // Catch:{ all -> 0x003c }
            if (r0 == 0) goto L_0x0009
            monitor-exit(r6)
            return
        L_0x0009:
            java.lang.String r0 = "total_size"
            int r0 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x003c }
            long r0 = r7.getLong(r0)     // Catch:{ all -> 0x003c }
            java.lang.String r2 = "bytes_so_far"
            int r2 = r7.getColumnIndexOrThrow(r2)     // Catch:{ all -> 0x003c }
            long r2 = r7.getLong(r2)     // Catch:{ all -> 0x003c }
            com.microsoft.appcenter.distribute.l.b$a r7 = r6.c     // Catch:{ all -> 0x003c }
            boolean r7 = r7.a(r2, r0)     // Catch:{ all -> 0x003c }
            if (r7 == 0) goto L_0x003a
            android.os.Handler r7 = com.microsoft.appcenter.utils.e.a()     // Catch:{ all -> 0x003c }
            com.microsoft.appcenter.distribute.l.e.a$a r0 = new com.microsoft.appcenter.distribute.l.e.a$a     // Catch:{ all -> 0x003c }
            r0.<init>()     // Catch:{ all -> 0x003c }
            java.lang.String r1 = "Distribute.handler_token_check_progress"
            long r2 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x003c }
            r4 = 500(0x1f4, double:2.47E-321)
            long r2 = r2 + r4
            r7.postAtTime(r0, r1, r2)     // Catch:{ all -> 0x003c }
        L_0x003a:
            monitor-exit(r6)
            return
        L_0x003c:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.microsoft.appcenter.distribute.l.e.a.k(android.database.Cursor):void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void l(long r2, long r4) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.d()     // Catch:{ all -> 0x001e }
            if (r0 == 0) goto L_0x0009
            monitor-exit(r1)
            return
        L_0x0009:
            r1.p(r2)     // Catch:{ all -> 0x001e }
            com.microsoft.appcenter.distribute.l.b$a r2 = r1.c     // Catch:{ all -> 0x001e }
            r2.c(r4)     // Catch:{ all -> 0x001e }
            com.microsoft.appcenter.distribute.h r2 = r1.b     // Catch:{ all -> 0x001e }
            boolean r2 = r2.k()     // Catch:{ all -> 0x001e }
            if (r2 == 0) goto L_0x001c
            r1.q()     // Catch:{ all -> 0x001e }
        L_0x001c:
            monitor-exit(r1)
            return
        L_0x001e:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.microsoft.appcenter.distribute.l.e.a.l(long, long):void");
    }

    /* access modifiers changed from: package-private */
    public synchronized void m() {
        o();
    }
}
