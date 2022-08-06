package com.microsoft.appcenter.distribute;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import com.microsoft.appcenter.utils.a;
import java.util.HashSet;
import java.util.Set;
import k.h0.d.d;

/* compiled from: InstallerUtils */
public class e {
    private static final Set<String> a;
    private static Boolean b;

    static {
        HashSet hashSet = new HashSet();
        a = hashSet;
        hashSet.add("adb");
        a.add("com.android.packageinstaller");
        a.add("com.google.android.packageinstaller");
        a.add("com.android.managedprovisioning");
        a.add("com.miui.packageinstaller");
        a.add("com.samsung.android.packageinstaller");
        a.add("pc");
        a.add("com.google.android.apps.nbu.files");
        a.add("org.mozilla.firefox");
        a.add("com.android.chrome");
    }

    static Intent a(Uri uri) {
        Intent intent = new Intent("android.intent.action.INSTALL_PACKAGE");
        intent.setData(uri);
        intent.addFlags(1);
        intent.addFlags(268435456);
        intent.addFlags(536870912);
        return intent;
    }

    static synchronized boolean b(String str, Context context) {
        boolean booleanValue;
        synchronized (e.class) {
            if (b == null) {
                String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                a.a(str, "InstallerPackageName=" + installerPackageName);
                b = Boolean.valueOf(installerPackageName != null && !a.contains(installerPackageName));
            }
            booleanValue = b.booleanValue();
        }
        return booleanValue;
    }

    public static boolean c(Context context) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            return context.getApplicationInfo().targetSdkVersion < 26 || context.getPackageManager().canRequestPackageInstalls();
        }
        if (i2 < 17 || i2 >= 21) {
            return d.F.equals(Settings.Secure.getString(context.getContentResolver(), "install_non_market_apps"));
        }
        return d.F.equals(Settings.Global.getString(context.getContentResolver(), "install_non_market_apps"));
    }
}
