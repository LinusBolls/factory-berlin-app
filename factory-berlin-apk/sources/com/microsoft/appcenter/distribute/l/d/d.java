package com.microsoft.appcenter.distribute.l.d;

import android.os.AsyncTask;
import java.io.File;

/* compiled from: HttpConnectionRemoveFileTask */
class d extends AsyncTask<Void, Void, Void> {
    private final File a;

    d(File file) {
        this.a = file;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Void doInBackground(Void... voidArr) {
        this.a.delete();
        return null;
    }
}
