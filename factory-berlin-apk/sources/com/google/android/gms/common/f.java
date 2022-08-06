package com.google.android.gms.common;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.gms.common.internal.k0;
import com.google.android.gms.common.m.c;
import com.google.android.gms.common.util.i;

public class f {
    public static final int a = h.a;
    private static final f b = new f();

    f() {
    }

    public static f f() {
        return b;
    }

    private static String j(Context context, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("gcore_");
        sb.append(a);
        sb.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append("-");
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append("-");
        if (context != null) {
            try {
                sb.append(c.a(context).d(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return sb.toString();
    }

    public int a(Context context) {
        return h.a(context);
    }

    public Intent b(Context context, int i2, String str) {
        if (i2 == 1 || i2 == 2) {
            if (context == null || !i.d(context)) {
                return k0.a("com.google.android.gms", j(context, str));
            }
            return k0.c();
        } else if (i2 != 3) {
            return null;
        } else {
            return k0.b("com.google.android.gms");
        }
    }

    public PendingIntent c(Context context, int i2, int i3) {
        return d(context, i2, i3, (String) null);
    }

    public PendingIntent d(Context context, int i2, int i3, String str) {
        Intent b2 = b(context, i2, str);
        if (b2 == null) {
            return null;
        }
        return PendingIntent.getActivity(context, i3, b2, 134217728);
    }

    public String e(int i2) {
        return h.b(i2);
    }

    public int g(Context context) {
        return h(context, a);
    }

    public int h(Context context, int i2) {
        int f2 = h.f(context, i2);
        if (h.g(context, f2)) {
            return 18;
        }
        return f2;
    }

    public boolean i(int i2) {
        return h.j(i2);
    }
}
