package com.microsoft.appcenter.utils.o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.Set;

/* compiled from: SharedPreferencesManager */
public class d {
    @SuppressLint({"StaticFieldLeak"})
    private static Context a;
    private static SharedPreferences b;

    public static boolean a(String str, boolean z) {
        return b.getBoolean(str, z);
    }

    public static int b(String str) {
        return c(str, 0);
    }

    public static int c(String str, int i2) {
        return b.getInt(str, i2);
    }

    public static long d(String str) {
        return e(str, 0);
    }

    public static long e(String str, long j2) {
        return b.getLong(str, j2);
    }

    public static String f(String str) {
        return g(str, (String) null);
    }

    public static String g(String str, String str2) {
        return b.getString(str, str2);
    }

    public static Set<String> h(String str) {
        return i(str, (Set<String>) null);
    }

    public static Set<String> i(String str, Set<String> set) {
        return b.getStringSet(str, set);
    }

    public static synchronized void j(Context context) {
        synchronized (d.class) {
            if (a == null) {
                a = context;
                b = context.getSharedPreferences("AppCenter", 0);
            }
        }
    }

    public static void k(String str, boolean z) {
        SharedPreferences.Editor edit = b.edit();
        edit.putBoolean(str, z);
        edit.apply();
    }

    public static void l(String str, int i2) {
        SharedPreferences.Editor edit = b.edit();
        edit.putInt(str, i2);
        edit.apply();
    }

    public static void m(String str, long j2) {
        SharedPreferences.Editor edit = b.edit();
        edit.putLong(str, j2);
        edit.apply();
    }

    public static void n(String str, String str2) {
        SharedPreferences.Editor edit = b.edit();
        edit.putString(str, str2);
        edit.apply();
    }

    public static void o(String str, Set<String> set) {
        SharedPreferences.Editor edit = b.edit();
        edit.putStringSet(str, set);
        edit.apply();
    }

    public static void p(String str) {
        SharedPreferences.Editor edit = b.edit();
        edit.remove(str);
        edit.apply();
    }
}
