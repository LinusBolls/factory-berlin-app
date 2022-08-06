package com.microsoft.appcenter.distribute.l.e;

import android.app.DownloadManager;
import android.database.Cursor;
import android.os.AsyncTask;
import java.util.NoSuchElementException;

/* compiled from: DownloadManagerUpdateTask */
class d extends AsyncTask<Void, Void, Void> {
    private final a a;

    d(a aVar) {
        this.a = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Void doInBackground(Void... voidArr) {
        Cursor query;
        DownloadManager g2 = this.a.g();
        long f2 = this.a.f();
        if (f2 == -1) {
            this.a.m();
            return null;
        }
        try {
            query = g2.query(new DownloadManager.Query().setFilterById(new long[]{f2}));
            if (query == null) {
                throw new NoSuchElementException("Cannot find download with id=" + f2);
            } else if (!query.moveToFirst()) {
                throw new NoSuchElementException("Cannot find download with id=" + f2);
            } else if (isCancelled()) {
                query.close();
                return null;
            } else {
                int i2 = query.getInt(query.getColumnIndexOrThrow("status"));
                if (i2 == 16) {
                    int i3 = query.getInt(query.getColumnIndexOrThrow("reason"));
                    throw new IllegalStateException("The download has failed with reason code: " + i3);
                } else if (i2 != 8) {
                    this.a.k(query);
                    query.close();
                    return null;
                } else {
                    this.a.i(query);
                    query.close();
                    return null;
                }
            }
        } catch (RuntimeException e2) {
            this.a.j(e2);
        } catch (Throwable th) {
            query.close();
            throw th;
        }
    }
}
