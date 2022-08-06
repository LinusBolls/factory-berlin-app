package com.google.firebase.crashlytics.d.h;

import android.content.Context;
import android.content.pm.PackageInfo;

/* compiled from: AppData */
class b {
    public final String a;
    public final String b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public final String f3903d;

    /* renamed from: e  reason: collision with root package name */
    public final String f3904e;

    /* renamed from: f  reason: collision with root package name */
    public final String f3905f;

    public b(String str, String str2, String str3, String str4, String str5, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.f3903d = str4;
        this.f3904e = str5;
        this.f3905f = str6;
    }

    public static b a(Context context, x xVar, String str, String str2) {
        String packageName = context.getPackageName();
        String e2 = xVar.e();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String num = Integer.toString(packageInfo.versionCode);
        String str3 = packageInfo.versionName;
        if (str3 == null) {
            str3 = "0.0";
        }
        return new b(str, str2, e2, packageName, num, str3);
    }
}
