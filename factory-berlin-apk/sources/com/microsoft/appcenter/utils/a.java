package com.microsoft.appcenter.utils;

import android.util.Log;

/* compiled from: AppCenterLog */
public class a {
    private static int a = 7;

    public static void a(String str, String str2) {
        if (a <= 3) {
            Log.d(str, str2);
        }
    }

    public static void b(String str, String str2) {
        if (a <= 6) {
            Log.e(str, str2);
        }
    }

    public static void c(String str, String str2, Throwable th) {
        if (a <= 6) {
            Log.e(str, str2, th);
        }
    }

    public static int d() {
        return a;
    }

    public static void e(String str, String str2) {
        if (a <= 4) {
            Log.i(str, str2);
        }
    }

    public static void f(int i2) {
        a = i2;
    }

    public static void g(String str, String str2) {
        if (a <= 2) {
            Log.v(str, str2);
        }
    }

    public static void h(String str, String str2, Throwable th) {
        if (a <= 2) {
            Log.v(str, str2, th);
        }
    }

    public static void i(String str, String str2) {
        if (a <= 5) {
            Log.w(str, str2);
        }
    }

    public static void j(String str, String str2, Throwable th) {
        if (a <= 5) {
            Log.w(str, str2, th);
        }
    }
}
