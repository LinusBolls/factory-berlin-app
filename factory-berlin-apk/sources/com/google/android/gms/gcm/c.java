package com.google.android.gms.gcm;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.google.android.gms.iid.d;
import java.util.concurrent.atomic.AtomicInteger;

@Deprecated
public class c {
    static {
        new AtomicInteger(1);
    }

    public static int a(Context context) {
        String c = d.c(context);
        if (c == null) {
            return -1;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(c, 0);
            if (packageInfo != null) {
                return packageInfo.versionCode;
            }
            return -1;
        } catch (PackageManager.NameNotFoundException unused) {
            return -1;
        }
    }
}
