package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;

public final class i {
    private static Boolean a;
    private static Boolean b;
    private static Boolean c;

    @TargetApi(21)
    public static boolean a(Context context) {
        if (b == null) {
            b = Boolean.valueOf(l.g() && context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return b.booleanValue();
    }

    public static boolean b() {
        return "user".equals(Build.TYPE);
    }

    @TargetApi(20)
    public static boolean c(Context context) {
        if (a == null) {
            a = Boolean.valueOf(l.f() && context.getPackageManager().hasSystemFeature("android.hardware.type.watch"));
        }
        return a.booleanValue();
    }

    @TargetApi(26)
    public static boolean d(Context context) {
        if (!c(context)) {
            return false;
        }
        if (l.h()) {
            return a(context) && !l.i();
        }
        return true;
    }

    public static boolean e(Context context) {
        if (c == null) {
            c = Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.type.iot") || context.getPackageManager().hasSystemFeature("android.hardware.type.embedded"));
        }
        return c.booleanValue();
    }
}
