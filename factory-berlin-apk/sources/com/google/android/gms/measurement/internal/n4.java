package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.common.internal.r;

/* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
class n4 extends BroadcastReceiver {
    /* access modifiers changed from: private */
    public final x9 a;
    private boolean b;
    private boolean c;

    static {
        Class<n4> cls = n4.class;
    }

    n4(x9 x9Var) {
        r.k(x9Var);
        this.a = x9Var;
    }

    public final void b() {
        this.a.g0();
        this.a.a().c();
        if (!this.b) {
            this.a.j().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.c = this.a.X().x();
            this.a.i().M().b("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.c));
            this.b = true;
        }
    }

    public final void c() {
        this.a.g0();
        this.a.a().c();
        this.a.a().c();
        if (this.b) {
            this.a.i().M().a("Unregistering connectivity change receiver");
            this.b = false;
            this.c = false;
            try {
                this.a.j().unregisterReceiver(this);
            } catch (IllegalArgumentException e2) {
                this.a.i().E().b("Failed to unregister the network broadcast receiver", e2);
            }
        }
    }

    public void onReceive(Context context, Intent intent) {
        this.a.g0();
        String action = intent.getAction();
        this.a.i().M().b("NetworkBroadcastReceiver received action", action);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            boolean x = this.a.X().x();
            if (this.c != x) {
                this.c = x;
                this.a.a().y(new m4(this, x));
                return;
            }
            return;
        }
        this.a.i().H().b("NetworkBroadcastReceiver received unknown action", action);
    }
}
