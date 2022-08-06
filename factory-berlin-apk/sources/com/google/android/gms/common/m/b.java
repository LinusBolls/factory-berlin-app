package com.google.android.gms.common.m;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Binder;
import android.os.Process;
import com.google.android.gms.common.util.l;

public class b {
    private final Context a;

    public b(Context context) {
        this.a = context;
    }

    public int a(String str) {
        return this.a.checkCallingOrSelfPermission(str);
    }

    public ApplicationInfo b(String str, int i2) {
        return this.a.getPackageManager().getApplicationInfo(str, i2);
    }

    public CharSequence c(String str) {
        return this.a.getPackageManager().getApplicationLabel(this.a.getPackageManager().getApplicationInfo(str, 0));
    }

    public PackageInfo d(String str, int i2) {
        return this.a.getPackageManager().getPackageInfo(str, i2);
    }

    public final String[] e(int i2) {
        return this.a.getPackageManager().getPackagesForUid(i2);
    }

    public boolean f() {
        String nameForUid;
        if (Binder.getCallingUid() == Process.myUid()) {
            return a.a(this.a);
        }
        if (!l.i() || (nameForUid = this.a.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        return this.a.getPackageManager().isInstantApp(nameForUid);
    }

    public final PackageInfo g(String str, int i2, int i3) {
        return this.a.getPackageManager().getPackageInfo(str, 64);
    }

    @TargetApi(19)
    public final boolean h(int i2, String str) {
        if (l.e()) {
            try {
                ((AppOpsManager) this.a.getSystemService("appops")).checkPackage(i2, str);
                return true;
            } catch (SecurityException unused) {
                return false;
            }
        } else {
            String[] packagesForUid = this.a.getPackageManager().getPackagesForUid(i2);
            if (!(str == null || packagesForUid == null)) {
                for (String equals : packagesForUid) {
                    if (str.equals(equals)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }
}
