package com.google.android.gms.common.l;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.util.Log;
import com.google.android.gms.common.util.d;
import java.util.Collections;
import java.util.List;

public class a {
    private static final Object a = new Object();
    private static volatile a b;

    private a() {
        List list = Collections.EMPTY_LIST;
    }

    public static a b() {
        if (b == null) {
            synchronized (a) {
                if (b == null) {
                    b = new a();
                }
            }
        }
        return b;
    }

    public boolean a(Context context, Intent intent, ServiceConnection serviceConnection, int i2) {
        return d(context, context.getClass().getName(), intent, serviceConnection, i2);
    }

    @SuppressLint({"UntrackedBindService"})
    public void c(Context context, ServiceConnection serviceConnection) {
        context.unbindService(serviceConnection);
    }

    public final boolean d(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i2) {
        boolean z;
        ComponentName component = intent.getComponent();
        if (component == null) {
            z = false;
        } else {
            z = d.a(context, component.getPackageName());
        }
        if (!z) {
            return context.bindService(intent, serviceConnection, i2);
        }
        Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
        return false;
    }
}
