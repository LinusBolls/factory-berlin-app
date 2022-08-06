package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.m.c;

public final class s0 {
    private static Object a = new Object();
    private static boolean b;
    private static String c;

    /* renamed from: d  reason: collision with root package name */
    private static int f2168d;

    public static String a(Context context) {
        c(context);
        return c;
    }

    public static int b(Context context) {
        c(context);
        return f2168d;
    }

    private static void c(Context context) {
        synchronized (a) {
            if (!b) {
                b = true;
                try {
                    Bundle bundle = c.a(context).b(context.getPackageName(), 128).metaData;
                    if (bundle != null) {
                        c = bundle.getString("com.google.app.id");
                        f2168d = bundle.getInt("com.google.android.gms.version");
                    }
                } catch (PackageManager.NameNotFoundException e2) {
                    Log.wtf("MetadataValueReader", "This should never happen.", e2);
                }
            }
        }
    }
}
