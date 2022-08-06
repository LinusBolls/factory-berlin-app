package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.work.i;
import androidx.work.impl.background.systemalarm.ConstraintProxy;
import androidx.work.impl.h;
import androidx.work.impl.utils.d;

public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {
    static final String a = i.f("ConstrntProxyUpdtRecvr");

    class a implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ Intent f1601g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Context f1602h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ BroadcastReceiver.PendingResult f1603i;

        a(ConstraintProxyUpdateReceiver constraintProxyUpdateReceiver, Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult) {
            this.f1601g = intent;
            this.f1602h = context;
            this.f1603i = pendingResult;
        }

        public void run() {
            try {
                boolean booleanExtra = this.f1601g.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra2 = this.f1601g.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                boolean booleanExtra3 = this.f1601g.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra4 = this.f1601g.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                i.c().a(ConstraintProxyUpdateReceiver.a, String.format("Updating proxies: BatteryNotLowProxy enabled (%s), BatteryChargingProxy enabled (%s), StorageNotLowProxy (%s), NetworkStateProxy enabled (%s)", new Object[]{Boolean.valueOf(booleanExtra), Boolean.valueOf(booleanExtra2), Boolean.valueOf(booleanExtra3), Boolean.valueOf(booleanExtra4)}), new Throwable[0]);
                d.a(this.f1602h, ConstraintProxy.BatteryNotLowProxy.class, booleanExtra);
                d.a(this.f1602h, ConstraintProxy.BatteryChargingProxy.class, booleanExtra2);
                d.a(this.f1602h, ConstraintProxy.StorageNotLowProxy.class, booleanExtra3);
                d.a(this.f1602h, ConstraintProxy.NetworkStateProxy.class, booleanExtra4);
            } finally {
                this.f1603i.finish();
            }
        }
    }

    public static Intent a(Context context, boolean z, boolean z2, boolean z3, boolean z4) {
        Intent intent = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
        intent.setComponent(new ComponentName(context, ConstraintProxyUpdateReceiver.class));
        intent.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z2).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z3).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z4);
        return intent;
    }

    public void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if (!"androidx.work.impl.background.systemalarm.UpdateProxies".equals(action)) {
            i.c().a(a, String.format("Ignoring unknown action %s", new Object[]{action}), new Throwable[0]);
        } else {
            h.q(context).v().b(new a(this, intent, context, goAsync()));
        }
    }
}
