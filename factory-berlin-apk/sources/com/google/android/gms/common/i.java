package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Log;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.m.c;

public class i {
    private static i b;
    private final Context a;

    private i(Context context) {
        this.a = context.getApplicationContext();
    }

    public static i a(Context context) {
        r.k(context);
        synchronized (i.class) {
            if (b == null) {
                q.c(context);
                b = new i(context);
            }
        }
        return b;
    }

    private static s d(PackageInfo packageInfo, s... sVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null) {
            return null;
        }
        if (signatureArr.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        t tVar = new t(packageInfo.signatures[0].toByteArray());
        for (int i2 = 0; i2 < sVarArr.length; i2++) {
            if (sVarArr[i2].equals(tVar)) {
                return sVarArr[i2];
            }
        }
        return null;
    }

    private final a0 e(String str, int i2) {
        try {
            PackageInfo g2 = c.a(this.a).g(str, 64, i2);
            boolean e2 = h.e(this.a);
            if (g2 == null) {
                return a0.d("null pkg");
            }
            if (g2.signatures.length != 1) {
                return a0.d("single cert required");
            }
            t tVar = new t(g2.signatures[0].toByteArray());
            String str2 = g2.packageName;
            a0 a2 = q.a(str2, tVar, e2, false);
            return (!a2.a || g2.applicationInfo == null || (g2.applicationInfo.flags & 2) == 0 || !q.a(str2, tVar, false, true).a) ? a2 : a0.d("debuggable release cert app rejected");
        } catch (PackageManager.NameNotFoundException unused) {
            String valueOf = String.valueOf(str);
            return a0.d(valueOf.length() != 0 ? "no pkg ".concat(valueOf) : new String("no pkg "));
        }
    }

    public static boolean f(PackageInfo packageInfo, boolean z) {
        s sVar;
        if (!(packageInfo == null || packageInfo.signatures == null)) {
            if (z) {
                sVar = d(packageInfo, v.a);
            } else {
                sVar = d(packageInfo, v.a[0]);
            }
            if (sVar != null) {
                return true;
            }
        }
        return false;
    }

    public boolean b(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (f(packageInfo, false)) {
            return true;
        }
        if (f(packageInfo, true)) {
            if (h.e(this.a)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }

    public boolean c(int i2) {
        a0 a0Var;
        String[] e2 = c.a(this.a).e(i2);
        if (e2 != null && e2.length != 0) {
            a0Var = null;
            for (String e3 : e2) {
                a0Var = e(e3, i2);
                if (a0Var.a) {
                    break;
                }
            }
        } else {
            a0Var = a0.d("no pkgs");
        }
        a0Var.g();
        return a0Var.a;
    }
}
