package com.google.firebase.crashlytics.d.h;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* compiled from: BatteryState */
class e {
    private final Float a;
    private final boolean b;

    private e(Float f2, boolean z) {
        this.b = z;
        this.a = f2;
    }

    public static e a(Context context) {
        boolean z;
        Float f2 = null;
        Intent registerReceiver = context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            z = e(registerReceiver);
            f2 = d(registerReceiver);
        } else {
            z = false;
        }
        return new e(f2, z);
    }

    private static Float d(Intent intent) {
        int intExtra = intent.getIntExtra("level", -1);
        int intExtra2 = intent.getIntExtra("scale", -1);
        if (intExtra == -1 || intExtra2 == -1) {
            return null;
        }
        return Float.valueOf(((float) intExtra) / ((float) intExtra2));
    }

    private static boolean e(Intent intent) {
        int intExtra = intent.getIntExtra("status", -1);
        if (intExtra == -1) {
            return false;
        }
        return intExtra == 2 || intExtra == 5;
    }

    public Float b() {
        return this.a;
    }

    public int c() {
        Float f2;
        if (!this.b || (f2 = this.a) == null) {
            return 1;
        }
        return ((double) f2.floatValue()) < 0.99d ? 2 : 3;
    }
}
