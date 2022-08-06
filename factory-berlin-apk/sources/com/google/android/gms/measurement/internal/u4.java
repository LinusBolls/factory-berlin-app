package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import com.google.android.gms.common.l.a;
import com.google.android.gms.common.m.b;
import com.google.android.gms.common.m.c;
import com.google.android.gms.internal.measurement.e2;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
public final class u4 {
    final h5 a;

    u4(h5 h5Var) {
        this.a = h5Var;
    }

    private final boolean c() {
        try {
            b a2 = c.a(this.a.j());
            if (a2 == null) {
                this.a.i().M().a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
                return false;
            } else if (a2.d("com.android.vending", 128).versionCode >= 80837300) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e2) {
            this.a.i().M().b("Failed to retrieve Play Store version for Install Referrer", e2);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public final Bundle a(String str, e2 e2Var) {
        this.a.a().c();
        if (e2Var == null) {
            this.a.i().H().a("Attempting to use Install Referrer Service while it is not initialized");
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("package_name", str);
        try {
            Bundle f2 = e2Var.f(bundle);
            if (f2 != null) {
                return f2;
            }
            this.a.i().E().a("Install Referrer Service returned a null response");
            return null;
        } catch (Exception e2) {
            this.a.i().E().b("Exception occurred while retrieving the Install Referrer", e2.getMessage());
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final void b(String str) {
        if (str == null || str.isEmpty()) {
            this.a.i().I().a("Install Referrer Reporter was called with invalid app package name");
            return;
        }
        this.a.a().c();
        if (!c()) {
            this.a.i().K().a("Install Referrer Reporter is not available");
            return;
        }
        x4 x4Var = new x4(this, str);
        this.a.a().c();
        Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
        intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
        PackageManager packageManager = this.a.j().getPackageManager();
        if (packageManager == null) {
            this.a.i().I().a("Failed to obtain Package Manager to verify binding conditions for Install Referrer");
            return;
        }
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
            this.a.i().K().a("Play Service for fetching Install Referrer is unavailable on device");
            return;
        }
        ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
        if (serviceInfo != null) {
            String str2 = serviceInfo.packageName;
            if (serviceInfo.name == null || !"com.android.vending".equals(str2) || !c()) {
                this.a.i().H().a("Play Store version 8.3.73 or higher required for Install Referrer");
                return;
            }
            try {
                this.a.i().M().b("Install Referrer Service is", a.b().a(this.a.j(), new Intent(intent), x4Var, 1) ? "available" : "not available");
            } catch (Exception e2) {
                this.a.i().E().b("Exception occurred while binding to Install Referrer Service", e2.getMessage());
            }
        }
    }
}
