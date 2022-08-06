package com.microsoft.appcenter.utils;

import android.content.Context;
import android.content.pm.ApplicationInfo;

/* compiled from: AppNameHelper */
public class b {
    public static String a(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        int i2 = applicationInfo.labelRes;
        if (i2 == 0) {
            return String.valueOf(applicationInfo.nonLocalizedLabel);
        }
        return context.getString(i2);
    }
}
