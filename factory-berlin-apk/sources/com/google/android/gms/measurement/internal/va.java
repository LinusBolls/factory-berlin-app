package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Looper;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
public final class va {
    va(Context context) {
    }

    public static boolean a() {
        return Looper.myLooper() == Looper.getMainLooper();
    }
}
