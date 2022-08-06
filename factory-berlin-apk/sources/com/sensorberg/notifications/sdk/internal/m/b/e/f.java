package com.sensorberg.notifications.sdk.internal.m.b.e;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.net.URLEncoder;
import k.b0;
import kotlin.jvm.internal.k;
import n.a.a;

/* compiled from: UserAgent.kt */
public final class f implements a {
    private final String a;

    public f(Context context) {
        k.f(context, "context");
        String packageName = context.getPackageName();
        String encode = URLEncoder.encode(context.getPackageManager().getApplicationLabel(context.getApplicationInfo()).toString());
        String b = b(context);
        this.a = encode + '/' + packageName + '/' + b + ' ' + "(Android " + Build.VERSION.RELEASE + ' ' + Build.CPU_ABI + ") " + '(' + Build.MANUFACTURER + ':' + Build.MODEL + ':' + Build.PRODUCT + ") " + "Sensorberg Notifications SDK 2.7.17";
        StringBuilder sb = new StringBuilder();
        sb.append("Backend header User-Agent: ");
        sb.append(this.a);
        a.f(sb.toString(), new Object[0]);
    }

    private final String b(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            return URLEncoder.encode(packageInfo.versionName) + "/" + packageInfo.versionCode;
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            return "<unknown>";
        }
    }

    public void a(b0.a aVar) {
        k.f(aVar, "builder");
        aVar.e("User-Agent", this.a);
    }
}
