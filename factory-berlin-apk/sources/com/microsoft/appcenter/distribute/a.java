package com.microsoft.appcenter.distribute;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import java.net.URI;
import java.util.Iterator;
import java.util.List;

/* compiled from: BrowserUtils */
class a {
    static String a(String str, String str2) {
        URI uri = new URI(str);
        String query = uri.getQuery();
        if (query != null) {
            str2 = query + "&" + str2;
        }
        return new URI(uri.getScheme(), uri.getAuthority(), uri.getPath(), str2, uri.getFragment()).toString();
    }

    static void b(String str, Activity activity) {
        try {
            c(str, activity);
        } catch (SecurityException e2) {
            com.microsoft.appcenter.utils.a.j("AppCenterDistribute", "Browser could not be opened by trying to avoid intent chooser, starting implicit intent instead.", e2);
            activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        }
    }

    private static void c(String str, Activity activity) {
        String str2;
        String str3;
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        List<ResolveInfo> queryIntentActivities = activity.getPackageManager().queryIntentActivities(intent, 0);
        if (queryIntentActivities.isEmpty()) {
            com.microsoft.appcenter.utils.a.b("AppCenterDistribute", "No browser found on device, abort login.");
            return;
        }
        ResolveInfo resolveActivity = activity.getPackageManager().resolveActivity(intent, 65536);
        String str4 = null;
        if (resolveActivity != null) {
            ActivityInfo activityInfo = resolveActivity.activityInfo;
            str2 = activityInfo.packageName;
            str3 = activityInfo.name;
            com.microsoft.appcenter.utils.a.a("AppCenterDistribute", "Default browser seems to be " + str2 + "/" + str3);
        } else {
            str3 = null;
            str2 = null;
        }
        Iterator<ResolveInfo> it = queryIntentActivities.iterator();
        while (true) {
            if (!it.hasNext()) {
                str3 = null;
                break;
            }
            ActivityInfo activityInfo2 = it.next().activityInfo;
            if (activityInfo2.packageName.equals(str2) && activityInfo2.name.equals(str3)) {
                com.microsoft.appcenter.utils.a.a("AppCenterDistribute", "And its not the picker.");
                str4 = str2;
                break;
            }
        }
        if (resolveActivity != null && str4 == null) {
            com.microsoft.appcenter.utils.a.a("AppCenterDistribute", "Default browser is actually a picker...");
        }
        if (str4 == null) {
            com.microsoft.appcenter.utils.a.a("AppCenterDistribute", "Picking first browser in list.");
            ActivityInfo activityInfo3 = queryIntentActivities.iterator().next().activityInfo;
            str4 = activityInfo3.packageName;
            str3 = activityInfo3.name;
        }
        com.microsoft.appcenter.utils.a.a("AppCenterDistribute", "Launch browser=" + str4 + "/" + str3);
        intent.setClassName(str4, str3);
        activity.startActivity(intent);
    }
}
