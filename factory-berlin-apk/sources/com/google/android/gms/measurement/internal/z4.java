package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.internal.measurement.f;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
public final class z4 {
    private final y4 a;

    public z4(y4 y4Var) {
        r.k(y4Var);
        this.a = y4Var;
    }

    public static boolean b(Context context) {
        ActivityInfo receiverInfo;
        r.k(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) == null || !receiverInfo.enabled) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public final void a(Context context, Intent intent) {
        c4 i2 = h5.b(context, (f) null, (Long) null).i();
        if (intent == null) {
            i2.H().a("Receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        i2.M().b("Local receiver got", action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            i2.M().a("Starting wakeful intent.");
            this.a.a(context, className);
        } else if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
            i2.H().a("Install Referrer Broadcasts are deprecated");
        }
    }
}
