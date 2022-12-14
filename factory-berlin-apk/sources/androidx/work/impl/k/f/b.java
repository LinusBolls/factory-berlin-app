package androidx.work.impl.k.f;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.i;
import androidx.work.impl.utils.k.a;

/* compiled from: BatteryNotLowTracker */
public class b extends c<Boolean> {

    /* renamed from: i  reason: collision with root package name */
    private static final String f1707i = i.f("BatteryNotLowTracker");

    public b(Context context, a aVar) {
        super(context, aVar);
    }

    public IntentFilter g() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0046, code lost:
        if (r6.equals("android.intent.action.BATTERY_OKAY") != false) goto L_0x004a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0055  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void h(android.content.Context r6, android.content.Intent r7) {
        /*
            r5 = this;
            java.lang.String r6 = r7.getAction()
            if (r6 != 0) goto L_0x0007
            return
        L_0x0007:
            androidx.work.i r6 = androidx.work.i.c()
            java.lang.String r0 = f1707i
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r3 = r7.getAction()
            r4 = 0
            r2[r4] = r3
            java.lang.String r3 = "Received %s"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            java.lang.Throwable[] r3 = new java.lang.Throwable[r4]
            r6.a(r0, r2, r3)
            java.lang.String r6 = r7.getAction()
            r7 = -1
            int r0 = r6.hashCode()
            r2 = -1980154005(0xffffffff89f93f6b, float:-6.0004207E-33)
            if (r0 == r2) goto L_0x0040
            r2 = 490310653(0x1d398bfd, float:2.4556918E-21)
            if (r0 == r2) goto L_0x0036
            goto L_0x0049
        L_0x0036:
            java.lang.String r0 = "android.intent.action.BATTERY_LOW"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0049
            r4 = 1
            goto L_0x004a
        L_0x0040:
            java.lang.String r0 = "android.intent.action.BATTERY_OKAY"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0049
            goto L_0x004a
        L_0x0049:
            r4 = -1
        L_0x004a:
            if (r4 == 0) goto L_0x0055
            if (r4 == r1) goto L_0x004f
            goto L_0x005a
        L_0x004f:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r5.d(r6)
            goto L_0x005a
        L_0x0055:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r5.d(r6)
        L_0x005a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.k.f.b.h(android.content.Context, android.content.Intent):void");
    }

    /* renamed from: i */
    public Boolean b() {
        Intent registerReceiver = this.b.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z = false;
        if (registerReceiver == null) {
            i.c().b(f1707i, "getInitialState - null intent received", new Throwable[0]);
            return null;
        }
        int intExtra = registerReceiver.getIntExtra("plugged", 0);
        int intExtra2 = registerReceiver.getIntExtra("status", -1);
        float intExtra3 = ((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1));
        if (intExtra != 0 || intExtra2 == 1 || intExtra3 > 0.15f) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
