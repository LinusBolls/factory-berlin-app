package com.microsoft.appcenter.distribute.l.e;

import android.annotation.SuppressLint;
import android.app.DownloadManager;
import android.content.Context;
import android.os.AsyncTask;

/* compiled from: DownloadManagerRemoveTask */
class b extends AsyncTask<Void, Void, Void> {
    @SuppressLint({"StaticFieldLeak"})
    private final Context a;
    private final long b;

    b(Context context, long j2) {
        this.a = context;
        this.b = j2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Void doInBackground(Void... voidArr) {
        ((DownloadManager) this.a.getSystemService("download")).remove(new long[]{this.b});
        return null;
    }
}
