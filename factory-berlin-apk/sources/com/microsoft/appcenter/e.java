package com.microsoft.appcenter;

import android.content.Context;
import com.microsoft.appcenter.utils.a;

/* compiled from: Constants */
public class e {
    public static String a = null;
    public static boolean b = false;

    private static void a(Context context) {
        if (context != null) {
            try {
                a = context.getFilesDir().getAbsolutePath();
            } catch (Exception e2) {
                a.c("AppCenter", "Exception thrown when accessing the application filesystem", e2);
            }
        }
    }

    public static void b(Context context) {
        a(context);
        c(context);
    }

    private static void c(Context context) {
        if (context != null && context.getApplicationInfo() != null) {
            b = (context.getApplicationInfo().flags & 2) > 0;
        }
    }
}
