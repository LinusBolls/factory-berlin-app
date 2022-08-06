package com.microsoft.appcenter.distribute;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import com.microsoft.appcenter.distribute.l.b;
import com.microsoft.appcenter.utils.e;
import java.text.NumberFormat;
import java.util.Locale;

/* compiled from: ReleaseDownloadListener */
class i implements b.a {
    /* access modifiers changed from: private */
    public final Context a;
    private final h b;
    private ProgressDialog c;

    /* compiled from: ReleaseDownloadListener */
    class a implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ long f4472g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ long f4473h;

        a(long j2, long j3) {
            this.f4472g = j2;
            this.f4473h = j3;
        }

        public void run() {
            i.this.i(this.f4472g, this.f4473h);
        }
    }

    /* compiled from: ReleaseDownloadListener */
    class b implements Runnable {
        b() {
        }

        public void run() {
            Toast.makeText(i.this.a, g.appcenter_distribute_downloading_error, 0).show();
        }
    }

    /* compiled from: ReleaseDownloadListener */
    class c implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ ProgressDialog f4476g;

        c(i iVar, ProgressDialog progressDialog) {
            this.f4476g = progressDialog;
        }

        public void run() {
            this.f4476g.hide();
        }
    }

    i(Context context, h hVar) {
        this.a = context;
        this.b = hVar;
    }

    /* access modifiers changed from: private */
    public synchronized void i(long j2, long j3) {
        if (this.c != null && j3 >= 0) {
            if (this.c.isIndeterminate()) {
                this.c.setProgressPercentFormat(NumberFormat.getPercentInstance());
                this.c.setProgressNumberFormat(this.a.getString(g.appcenter_distribute_download_progress_number_format));
                this.c.setIndeterminate(false);
                this.c.setMax((int) (j3 / 1048576));
            }
            this.c.setProgress((int) (j2 / 1048576));
        }
    }

    public synchronized boolean a(long j2, long j3) {
        boolean z;
        synchronized (this) {
            z = false;
            com.microsoft.appcenter.utils.a.g("AppCenterDistribute", String.format(Locale.ENGLISH, "Downloading %s (%d) update: %d KiB / %d KiB", new Object[]{this.b.h(), Integer.valueOf(this.b.j()), Long.valueOf(j2 / 1024), Long.valueOf(j3 / 1024)}));
            e.b(new a(j2, j3));
            if (this.c != null) {
                z = true;
            }
        }
        return z;
    }

    public boolean b(Uri uri) {
        Intent a2 = e.a(uri);
        if (a2.resolveActivity(this.a.getPackageManager()) == null) {
            com.microsoft.appcenter.utils.a.a("AppCenterDistribute", "Cannot resolve install intent for " + uri);
            return false;
        }
        com.microsoft.appcenter.utils.a.a("AppCenterDistribute", String.format(Locale.ENGLISH, "Download %s (%d) update completed.", new Object[]{this.b.h(), Integer.valueOf(this.b.j())}));
        if (!Distribute.getInstance().b0(this.b, a2)) {
            com.microsoft.appcenter.utils.a.e("AppCenterDistribute", "Show install UI for " + uri);
            this.a.startActivity(a2);
            Distribute.getInstance().k0(this.b);
        }
        return true;
    }

    public void c(long j2) {
        com.microsoft.appcenter.utils.a.a("AppCenterDistribute", String.format(Locale.ENGLISH, "Start download %s (%d) update.", new Object[]{this.b.h(), Integer.valueOf(this.b.j())}));
        Distribute.getInstance().i0(this.b, j2);
    }

    public void d(String str) {
        com.microsoft.appcenter.utils.a.b("AppCenterDistribute", String.format(Locale.ENGLISH, "Failed to download %s (%d) update: %s", new Object[]{this.b.h(), Integer.valueOf(this.b.j()), str}));
        e.b(new b());
        Distribute.getInstance().K(this.b);
    }

    /* access modifiers changed from: package-private */
    public synchronized void g() {
        if (this.c != null) {
            ProgressDialog progressDialog = this.c;
            this.c = null;
            e.b(new c(this, progressDialog));
            e.a().removeCallbacksAndMessages("Distribute.handler_token_check_progress");
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized ProgressDialog h(Activity activity) {
        if (!this.b.k()) {
            return null;
        }
        ProgressDialog progressDialog = new ProgressDialog(activity);
        this.c = progressDialog;
        progressDialog.setTitle(g.appcenter_distribute_downloading_update);
        this.c.setCancelable(false);
        this.c.setProgressStyle(1);
        this.c.setIndeterminate(true);
        this.c.setProgressNumberFormat((String) null);
        this.c.setProgressPercentFormat((NumberFormat) null);
        return this.c;
    }
}
