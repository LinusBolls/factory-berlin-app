package com.google.android.gms.common.util;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.internal.r;

public final class g {
    public static boolean a(Context context, Throwable th) {
        return b(context, th, 536870912);
    }

    private static boolean b(Context context, Throwable th, int i2) {
        try {
            r.k(context);
            r.k(th);
            return false;
        } catch (Exception e2) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e2);
            return false;
        }
    }
}
