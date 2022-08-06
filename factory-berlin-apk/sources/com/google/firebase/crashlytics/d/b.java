package com.google.firebase.crashlytics.d;

import android.util.Log;

/* compiled from: Logger */
public class b {
    static final b c = new b("FirebaseCrashlytics");
    private final String a;
    private int b = 4;

    public b(String str) {
        this.a = str;
    }

    private boolean a(int i2) {
        return this.b <= i2 || Log.isLoggable(this.a, i2);
    }

    public static b f() {
        return c;
    }

    public void b(String str) {
        c(str, (Throwable) null);
    }

    public void c(String str, Throwable th) {
        if (a(3)) {
            Log.d(this.a, str, th);
        }
    }

    public void d(String str) {
        e(str, (Throwable) null);
    }

    public void e(String str, Throwable th) {
        if (a(6)) {
            Log.e(this.a, str, th);
        }
    }

    public void g(String str) {
        h(str, (Throwable) null);
    }

    public void h(String str, Throwable th) {
        if (a(4)) {
            Log.i(this.a, str, th);
        }
    }

    public void i(String str) {
        j(str, (Throwable) null);
    }

    public void j(String str, Throwable th) {
        if (a(5)) {
            Log.w(this.a, str, th);
        }
    }
}
