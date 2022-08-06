package com.google.android.gms.common;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.util.Log;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.s0;
import com.google.android.gms.common.m.c;
import com.google.android.gms.common.util.i;
import com.google.android.gms.common.util.l;
import com.google.android.gms.common.util.o;
import com.google.android.gms.common.util.p;
import java.util.concurrent.atomic.AtomicBoolean;

public class h {
    @Deprecated
    public static final int a = 12451000;
    private static boolean b = false;
    private static boolean c = false;

    /* renamed from: d  reason: collision with root package name */
    static final AtomicBoolean f2111d = new AtomicBoolean();

    /* renamed from: e  reason: collision with root package name */
    private static final AtomicBoolean f2112e = new AtomicBoolean();

    @Deprecated
    public static int a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    @Deprecated
    public static String b(int i2) {
        return b.L(i2);
    }

    public static Context c(Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static Resources d(Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static boolean e(Context context) {
        if (!c) {
            try {
                PackageInfo d2 = c.a(context).d("com.google.android.gms", 64);
                i.a(context);
                if (d2 == null || i.f(d2, false) || !i.f(d2, true)) {
                    b = false;
                } else {
                    b = true;
                }
            } catch (PackageManager.NameNotFoundException e2) {
                Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e2);
            } finally {
                c = true;
            }
        }
        return b || !i.b();
    }

    @Deprecated
    public static int f(Context context, int i2) {
        try {
            context.getResources().getString(j.common_google_play_services_unknown_issue);
        } catch (Throwable unused) {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        if (!"com.google.android.gms".equals(context.getPackageName()) && !f2112e.get()) {
            int b2 = s0.b(context);
            if (b2 == 0) {
                throw new IllegalStateException("A required meta-data tag in your app's AndroidManifest.xml does not exist.  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
            } else if (b2 != a) {
                int i3 = a;
                StringBuilder sb = new StringBuilder(320);
                sb.append("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ");
                sb.append(i3);
                sb.append(" but found ");
                sb.append(b2);
                sb.append(".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
                throw new IllegalStateException(sb.toString());
            }
        }
        return l(context, !i.d(context) && !i.e(context), i2);
    }

    @Deprecated
    public static boolean g(Context context, int i2) {
        if (i2 == 18) {
            return true;
        }
        if (i2 == 1) {
            return i(context, "com.google.android.gms");
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r1 = ((android.os.UserManager) r1.getSystemService("user")).getApplicationRestrictions(r1.getPackageName());
     */
    @android.annotation.TargetApi(18)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean h(android.content.Context r1) {
        /*
            boolean r0 = com.google.android.gms.common.util.l.d()
            if (r0 == 0) goto L_0x0028
            java.lang.String r0 = "user"
            java.lang.Object r0 = r1.getSystemService(r0)
            android.os.UserManager r0 = (android.os.UserManager) r0
            java.lang.String r1 = r1.getPackageName()
            android.os.Bundle r1 = r0.getApplicationRestrictions(r1)
            if (r1 == 0) goto L_0x0028
            java.lang.String r0 = "restricted_profile"
            java.lang.String r1 = r1.getString(r0)
            java.lang.String r0 = "true"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0028
            r1 = 1
            return r1
        L_0x0028:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.h.h(android.content.Context):boolean");
    }

    @TargetApi(21)
    static boolean i(Context context, String str) {
        boolean equals = str.equals("com.google.android.gms");
        if (l.g()) {
            try {
                for (PackageInstaller.SessionInfo appPackageName : context.getPackageManager().getPackageInstaller().getAllSessions()) {
                    if (str.equals(appPackageName.getAppPackageName())) {
                        return true;
                    }
                }
            } catch (Exception unused) {
                return false;
            }
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 8192);
            if (equals) {
                return applicationInfo.enabled;
            }
            return applicationInfo.enabled && !h(context);
        } catch (PackageManager.NameNotFoundException unused2) {
        }
    }

    @Deprecated
    public static boolean j(int i2) {
        return i2 == 1 || i2 == 2 || i2 == 3 || i2 == 9;
    }

    @TargetApi(19)
    @Deprecated
    public static boolean k(Context context, int i2, String str) {
        return o.b(context, i2, str);
    }

    private static int l(Context context, boolean z, int i2) {
        r.a(i2 >= 0);
        PackageManager packageManager = context.getPackageManager();
        PackageInfo packageInfo = null;
        if (z) {
            try {
                packageInfo = packageManager.getPackageInfo("com.android.vending", 8256);
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("GooglePlayServicesUtil", "Google Play Store is missing.");
                return 9;
            }
        }
        try {
            PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 64);
            i.a(context);
            if (!i.f(packageInfo2, true)) {
                Log.w("GooglePlayServicesUtil", "Google Play services signature invalid.");
                return 9;
            } else if (z && (!i.f(packageInfo, true) || !packageInfo.signatures[0].equals(packageInfo2.signatures[0]))) {
                Log.w("GooglePlayServicesUtil", "Google Play Store signature invalid.");
                return 9;
            } else if (p.a(packageInfo2.versionCode) < p.a(i2)) {
                int i3 = packageInfo2.versionCode;
                StringBuilder sb = new StringBuilder(77);
                sb.append("Google Play services out of date.  Requires ");
                sb.append(i2);
                sb.append(" but found ");
                sb.append(i3);
                Log.w("GooglePlayServicesUtil", sb.toString());
                return 2;
            } else {
                ApplicationInfo applicationInfo = packageInfo2.applicationInfo;
                if (applicationInfo == null) {
                    try {
                        applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                    } catch (PackageManager.NameNotFoundException e2) {
                        Log.wtf("GooglePlayServicesUtil", "Google Play services missing when getting application info.", e2);
                        return 1;
                    }
                }
                if (!applicationInfo.enabled) {
                    return 3;
                }
                return 0;
            }
        } catch (PackageManager.NameNotFoundException unused2) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 1;
        }
    }
}
