package com.microsoft.appcenter.distribute.l.d;

import android.os.AsyncTask;
import java.io.File;

/* compiled from: HttpConnectionCheckTask */
class a extends AsyncTask<Void, Void, Void> {
    private final c a;

    a(c cVar) {
        this.a = cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Void doInBackground(Void... voidArr) {
        File l2 = this.a.l();
        if (l2 == null) {
            this.a.n("Cannot access to downloads folder. Shared storage is not currently available.");
            return null;
        }
        String h2 = this.a.h();
        if (h2 != null) {
            File file = new File(h2);
            if (!h2.equals(l2.getAbsolutePath())) {
                file.delete();
                this.a.t((String) null);
            } else if (file.exists()) {
                this.a.m(l2);
                return null;
            }
        }
        if (isCancelled()) {
            return null;
        }
        this.a.q(l2);
        return null;
    }
}
