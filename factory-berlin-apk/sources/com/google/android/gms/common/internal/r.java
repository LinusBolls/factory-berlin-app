package com.google.android.gms.common.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.util.q;

public final class r {
    public static void a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void c(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static void d(Handler handler) {
        e(handler, "Must be called on the handler thread");
    }

    public static void e(Handler handler, String str) {
        if (Looper.myLooper() != handler.getLooper()) {
            throw new IllegalStateException(str);
        }
    }

    public static void f(String str) {
        if (!q.a()) {
            throw new IllegalStateException(str);
        }
    }

    public static String g(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException("Given String is empty or null");
    }

    public static String h(String str, Object obj) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    public static void i() {
        j("Must not be called on the main application thread");
    }

    public static void j(String str) {
        if (q.a()) {
            throw new IllegalStateException(str);
        }
    }

    public static <T> T k(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException("null reference");
    }

    public static <T> T l(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static int m(int i2) {
        if (i2 != 0) {
            return i2;
        }
        throw new IllegalArgumentException("Given Integer is zero");
    }

    public static void n(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void o(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }
}
