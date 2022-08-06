package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.c;
import androidx.work.i;
import androidx.work.impl.l.j;
import java.util.List;

abstract class ConstraintProxy extends BroadcastReceiver {
    private static final String a = i.f("ConstraintProxy");

    public static class BatteryChargingProxy extends ConstraintProxy {
    }

    public static class BatteryNotLowProxy extends ConstraintProxy {
    }

    public static class NetworkStateProxy extends ConstraintProxy {
    }

    public static class StorageNotLowProxy extends ConstraintProxy {
    }

    ConstraintProxy() {
    }

    static void a(Context context, List<j> list) {
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        for (j jVar : list) {
            c cVar = jVar.f1728j;
            z |= cVar.f();
            z2 |= cVar.g();
            z3 |= cVar.i();
            z4 |= cVar.b() != androidx.work.j.NOT_REQUIRED;
            if (z && z2 && z3 && z4) {
                break;
            }
        }
        context.sendBroadcast(ConstraintProxyUpdateReceiver.a(context, z, z2, z3, z4));
    }

    public void onReceive(Context context, Intent intent) {
        i.c().a(a, String.format("onReceive : %s", new Object[]{intent}), new Throwable[0]);
        context.startService(b.b(context));
    }
}
