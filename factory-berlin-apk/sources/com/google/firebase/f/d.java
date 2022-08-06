package com.google.firebase.f;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: HeartBeatInfoStorage */
class d {
    private static d b;
    private final SharedPreferences a;

    private d(Context context) {
        this.a = context.getSharedPreferences("FirebaseAppHeartBeat", 0);
    }

    static synchronized d a(Context context) {
        d dVar;
        synchronized (d.class) {
            if (b == null) {
                b = new d(context);
            }
            dVar = b;
        }
        return dVar;
    }

    /* access modifiers changed from: package-private */
    public synchronized boolean b(long j2) {
        return c("fire-global", j2);
    }

    /* access modifiers changed from: package-private */
    public synchronized boolean c(String str, long j2) {
        if (!this.a.contains(str)) {
            this.a.edit().putLong(str, j2).apply();
            return true;
        } else if (j2 - this.a.getLong(str, -1) < 86400000) {
            return false;
        } else {
            this.a.edit().putLong(str, j2).apply();
            return true;
        }
    }
}
