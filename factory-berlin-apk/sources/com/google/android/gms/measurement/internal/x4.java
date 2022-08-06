package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.measurement.e2;
import com.google.android.gms.internal.measurement.g5;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
public final class x4 implements ServiceConnection {
    /* access modifiers changed from: private */
    public final String a;
    final /* synthetic */ u4 b;

    x4(u4 u4Var, String str) {
        this.b = u4Var;
        this.a = str;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            this.b.a.i().H().a("Install Referrer connection returned with null binder");
            return;
        }
        try {
            e2 l2 = g5.l(iBinder);
            if (l2 == null) {
                this.b.a.i().H().a("Install Referrer Service implementation was not found");
                return;
            }
            this.b.a.i().M().a("Install Referrer Service connected");
            this.b.a.a().y(new w4(this, l2, this));
        } catch (Exception e2) {
            this.b.a.i().H().b("Exception occurred while calling Install Referrer API", e2);
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.b.a.i().M().a("Install Referrer Service disconnected");
    }
}
