package com.google.android.gms.iid;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.common.util.l;
import java.util.Iterator;

public class d {
    private static String a = null;

    static {
        e.b().a("gcm_iid_use_messenger_ipc", true);
    }

    private static boolean a(PackageManager packageManager, String str) {
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 0);
            a = applicationInfo.packageName;
            int i2 = applicationInfo.uid;
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    private static boolean b(PackageManager packageManager, String str, String str2) {
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", str) == 0) {
            return a(packageManager, str);
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 56 + String.valueOf(str2).length());
        sb.append("Possible malicious package ");
        sb.append(str);
        sb.append(" declares ");
        sb.append(str2);
        sb.append(" without permission");
        Log.w("InstanceID", sb.toString());
        return false;
    }

    public static String c(Context context) {
        boolean z;
        String str = a;
        if (str != null) {
            return str;
        }
        Process.myUid();
        PackageManager packageManager = context.getPackageManager();
        boolean z2 = true;
        if (!l.i()) {
            Iterator<ResolveInfo> it = packageManager.queryIntentServices(new Intent("com.google.android.c2dm.intent.REGISTER"), 0).iterator();
            while (true) {
                if (it.hasNext()) {
                    if (b(packageManager, it.next().serviceInfo.packageName, "com.google.android.c2dm.intent.REGISTER")) {
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            if (z) {
                return a;
            }
        }
        Iterator<ResolveInfo> it2 = packageManager.queryBroadcastReceivers(new Intent("com.google.iid.TOKEN_REQUEST"), 0).iterator();
        while (true) {
            if (it2.hasNext()) {
                if (b(packageManager, it2.next().activityInfo.packageName, "com.google.iid.TOKEN_REQUEST")) {
                    break;
                }
            } else {
                z2 = false;
                break;
            }
        }
        if (z2) {
            return a;
        }
        Log.w("InstanceID", "Failed to resolve IID implementation package, falling back");
        if (a(packageManager, "com.google.android.gms")) {
            l.i();
            return a;
        } else if (!l.g() && a(packageManager, "com.google.android.gsf")) {
            return a;
        } else {
            Log.w("InstanceID", "Google Play services is missing, unable to get tokens");
            return null;
        }
    }
}
