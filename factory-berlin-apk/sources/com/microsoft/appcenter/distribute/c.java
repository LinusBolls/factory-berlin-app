package com.microsoft.appcenter.distribute;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.net.Uri;
import com.microsoft.appcenter.utils.DeviceInfoHelper;
import com.microsoft.appcenter.utils.a;
import com.microsoft.appcenter.utils.f;
import com.microsoft.appcenter.utils.g;
import com.microsoft.appcenter.utils.i;
import com.microsoft.appcenter.utils.o.d;
import java.util.UUID;
import org.json.JSONException;

/* compiled from: DistributeUtils */
class c {
    static String a(PackageInfo packageInfo) {
        return f.b(packageInfo.packageName + ":" + packageInfo.versionName + ":" + DeviceInfoHelper.c(packageInfo));
    }

    static int b() {
        return Distribute.class.getName().hashCode();
    }

    static int c() {
        return d.c("Distribute.download_state", 0);
    }

    static h d() {
        String f2 = d.f("Distribute.release_details");
        if (f2 == null) {
            return null;
        }
        try {
            return h.l(f2);
        } catch (JSONException e2) {
            a.c("AppCenterDistribute", "Invalid release details in cache.", e2);
            d.p("Distribute.release_details");
            return null;
        }
    }

    static void e(Activity activity, String str, String str2, PackageInfo packageInfo) {
        if (!i.k(activity).o()) {
            a.e("AppCenterDistribute", "Postpone enabling in app updates via browser as network is disconnected.");
            Distribute.getInstance().J();
            return;
        }
        String a = a(packageInfo);
        String uuid = UUID.randomUUID().toString();
        String str3 = (((((((str + String.format("/apps/%s/private-update-setup/", new Object[]{str2})) + "?release_hash=" + a) + "&redirect_id=" + activity.getPackageName()) + "&redirect_scheme=appcenter") + "&request_id=" + uuid) + "&platform=Android") + "&enable_failure_redirect=true") + "&install_id=" + g.a().toString();
        a.a("AppCenterDistribute", "No token, need to open browser to url=" + str3);
        d.n("Distribute.request_id", uuid);
        a.b(str3, activity);
    }

    static void f(Activity activity, PackageInfo packageInfo) {
        String a = a(packageInfo);
        String uuid = UUID.randomUUID().toString();
        String str = (((("ms-actesterapp://update-setup" + "?release_hash=" + a) + "&redirect_id=" + activity.getPackageName()) + "&redirect_scheme=appcenter") + "&request_id=" + uuid) + "&platform=Android";
        a.a("AppCenterDistribute", "No token, need to open tester app to url=" + str);
        d.n("Distribute.request_id", uuid);
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        intent.addFlags(268435456);
        activity.startActivity(intent);
    }
}
