package androidx.core.content;

import android.content.Context;
import android.os.Binder;
import android.os.Process;
import androidx.core.app.e;

/* compiled from: PermissionChecker */
public final class b {
    public static int a(Context context, String str) {
        return b(context, str, Binder.getCallingPid(), Binder.getCallingUid(), Binder.getCallingPid() == Process.myPid() ? context.getPackageName() : null);
    }

    public static int b(Context context, String str, int i2, int i3, String str2) {
        if (context.checkPermission(str, i2, i3) == -1) {
            return -1;
        }
        String b = e.b(str);
        if (b == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i3);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        if (e.a(context, b, str2) != 0) {
            return -2;
        }
        return 0;
    }

    public static int c(Context context, String str) {
        return b(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }
}
