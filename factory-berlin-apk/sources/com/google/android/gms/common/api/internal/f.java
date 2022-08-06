package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.s0;
import com.google.android.gms.common.internal.v;
import com.google.android.gms.common.j;

@Deprecated
public final class f {

    /* renamed from: d  reason: collision with root package name */
    private static final Object f2082d = new Object();

    /* renamed from: e  reason: collision with root package name */
    private static f f2083e;
    private final String a;
    private final Status b;
    private final boolean c;

    f(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("google_app_measurement_enable", "integer", resources.getResourcePackageName(j.common_google_play_services_unknown_issue));
        boolean z = false;
        if (identifier != 0) {
            this.c = !(resources.getInteger(identifier) != 0 ? true : z);
        } else {
            this.c = false;
        }
        String a2 = s0.a(context);
        a2 = a2 == null ? new v(context).a("google_app_id") : a2;
        if (TextUtils.isEmpty(a2)) {
            this.b = new Status(10, "Missing google app id value from from string resources with name google_app_id.");
            this.a = null;
            return;
        }
        this.a = a2;
        this.b = Status.f2025k;
    }

    private static f a(String str) {
        f fVar;
        synchronized (f2082d) {
            if (f2083e != null) {
                fVar = f2083e;
            } else {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34);
                sb.append("Initialize must be called before ");
                sb.append(str);
                sb.append(".");
                throw new IllegalStateException(sb.toString());
            }
        }
        return fVar;
    }

    public static String b() {
        return a("getGoogleAppId").a;
    }

    public static Status c(Context context) {
        Status status;
        r.l(context, "Context must not be null.");
        synchronized (f2082d) {
            if (f2083e == null) {
                f2083e = new f(context);
            }
            status = f2083e.b;
        }
        return status;
    }

    public static boolean d() {
        return a("isMeasurementExplicitlyDisabled").c;
    }
}
