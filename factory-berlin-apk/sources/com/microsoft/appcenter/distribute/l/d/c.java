package com.microsoft.appcenter.distribute.l.d;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import com.microsoft.appcenter.distribute.f;
import com.microsoft.appcenter.distribute.g;
import com.microsoft.appcenter.distribute.h;
import com.microsoft.appcenter.distribute.l.a;
import com.microsoft.appcenter.distribute.l.b;
import com.microsoft.appcenter.utils.d;
import com.microsoft.appcenter.utils.i;
import java.io.File;
import java.util.ArrayList;

/* compiled from: HttpConnectionReleaseDownloader */
public class c extends a {

    /* renamed from: e  reason: collision with root package name */
    private File f4478e;

    /* renamed from: f  reason: collision with root package name */
    private Notification.Builder f4479f;

    /* renamed from: g  reason: collision with root package name */
    private a f4480g;

    /* renamed from: h  reason: collision with root package name */
    private b f4481h;

    public c(Context context, h hVar, b.a aVar) {
        super(context, hVar, aVar);
    }

    private void e() {
        k().cancel(j());
    }

    private synchronized void f() {
        this.f4480g = (a) d.a("AppCenterDistribute", new a(this), new Void[0]);
    }

    private synchronized void g(File file) {
        if (this.f4481h != null) {
            com.microsoft.appcenter.utils.a.a("AppCenterDistribute", "Downloading of " + file.getPath() + " is already in progress.");
            return;
        }
        Uri b = this.b.b();
        com.microsoft.appcenter.utils.a.a("AppCenterDistribute", "Start downloading new release from " + b);
        this.f4481h = (b) d.a("AppCenterDistribute", new b(this, b, file), new Void[0]);
    }

    private static int j() {
        return c.class.getName().hashCode();
    }

    private NotificationManager k() {
        return (NotificationManager) this.a.getSystemService("notification");
    }

    private void r(File file) {
        com.microsoft.appcenter.utils.a.a("AppCenterDistribute", "Removing downloaded file from " + file.getAbsolutePath());
        d.a("AppCenterDistribute", new d(file), new Void[0]);
    }

    static String[] s() {
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT < 19) {
            arrayList.add("android.permission.WRITE_EXTERNAL_STORAGE");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    private void u(long j2, long j3) {
        if (!this.b.k()) {
            Notification.Builder i2 = i();
            i2.setContentTitle(this.a.getString(g.appcenter_distribute_downloading_update)).setSmallIcon(this.a.getApplicationInfo().icon).setProgress((int) (j3 / 1024), (int) (j2 / 1024), j3 <= 0);
            k().notify(j(), i2.build());
        }
    }

    public synchronized void a() {
        if (!d()) {
            if (!i.k(this.a).o()) {
                this.c.d("No network connection, abort downloading.");
                return;
            }
            if (!f.a(f.b(this.a, s()))) {
                this.c.d("No external storage permission.");
            } else {
                f();
            }
        }
    }

    public synchronized boolean b() {
        return this.f4481h != null;
    }

    public synchronized void cancel() {
        if (!d()) {
            super.cancel();
            if (this.f4480g != null) {
                this.f4480g.cancel(true);
                this.f4480g = null;
            }
            if (this.f4481h != null) {
                this.f4481h.cancel(true);
                this.f4481h = null;
            }
            String h2 = h();
            if (h2 != null) {
                r(new File(h2));
                com.microsoft.appcenter.utils.o.d.p("Distribute.downloaded_release_file");
            }
            e();
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized String h() {
        return com.microsoft.appcenter.utils.o.d.g("Distribute.downloaded_release_file", (String) null);
    }

    /* access modifiers changed from: package-private */
    public Notification.Builder i() {
        if (this.f4479f == null) {
            this.f4479f = new Notification.Builder(this.a);
        }
        return this.f4479f;
    }

    /* access modifiers changed from: package-private */
    public File l() {
        File externalFilesDir;
        if (this.f4478e == null && (externalFilesDir = this.a.getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS)) != null) {
            this.f4478e = new File(externalFilesDir, this.b.e() + ".apk");
        }
        return this.f4478e;
    }

    /* access modifiers changed from: package-private */
    public synchronized void m(File file) {
        if (!d()) {
            e();
            if (this.b.i() != file.length()) {
                this.c.d("Downloaded file has incorrect size.");
                return;
            }
            String absolutePath = file.getAbsolutePath();
            t(absolutePath);
            b.a aVar = this.c;
            aVar.b(Uri.parse("file://" + absolutePath));
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized void n(String str) {
        if (!d()) {
            e();
            this.c.d(str);
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized void o(long j2, long j3) {
        if (!d()) {
            u(j2, j3);
            this.c.a(j2, j3);
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized void p(long j2) {
        if (!d()) {
            u(0, 0);
            this.c.c(j2);
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized void q(File file) {
        if (!d()) {
            g(file);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0017, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void t(java.lang.String r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.d()     // Catch:{ all -> 0x0018 }
            if (r0 == 0) goto L_0x0009
            monitor-exit(r1)
            return
        L_0x0009:
            if (r2 == 0) goto L_0x0011
            java.lang.String r0 = "Distribute.downloaded_release_file"
            com.microsoft.appcenter.utils.o.d.n(r0, r2)     // Catch:{ all -> 0x0018 }
            goto L_0x0016
        L_0x0011:
            java.lang.String r2 = "Distribute.downloaded_release_file"
            com.microsoft.appcenter.utils.o.d.p(r2)     // Catch:{ all -> 0x0018 }
        L_0x0016:
            monitor-exit(r1)
            return
        L_0x0018:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.microsoft.appcenter.distribute.l.d.c.t(java.lang.String):void");
    }
}
