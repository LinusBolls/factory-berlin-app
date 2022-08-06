package com.microsoft.appcenter.distribute.l.e;

import android.app.DownloadManager;
import android.net.Uri;
import android.os.AsyncTask;
import com.microsoft.appcenter.distribute.h;
import com.microsoft.appcenter.utils.a;

/* compiled from: DownloadManagerRequestTask */
class c extends AsyncTask<Void, Void, Void> {
    private final a a;

    c(a aVar) {
        this.a = aVar;
    }

    /* access modifiers changed from: package-private */
    public DownloadManager.Request a(Uri uri) {
        return new DownloadManager.Request(uri);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Void doInBackground(Void... voidArr) {
        h c = this.a.c();
        Uri b = c.b();
        a.a("AppCenterDistribute", "Start downloading new release from " + b);
        DownloadManager g2 = this.a.g();
        DownloadManager.Request a2 = a(b);
        if (c.k()) {
            a2.setNotificationVisibility(2);
            a2.setVisibleInDownloadsUi(false);
        }
        long currentTimeMillis = System.currentTimeMillis();
        long enqueue = g2.enqueue(a2);
        if (isCancelled()) {
            return null;
        }
        this.a.l(enqueue, currentTimeMillis);
        return null;
    }
}
