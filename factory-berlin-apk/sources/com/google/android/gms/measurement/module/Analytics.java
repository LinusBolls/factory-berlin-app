package com.google.android.gms.measurement.module;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.internal.measurement.f;
import com.google.android.gms.measurement.internal.h5;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
public class Analytics {
    private static volatile Analytics a;

    private Analytics(h5 h5Var) {
        r.k(h5Var);
    }

    @Keep
    public static Analytics getInstance(Context context) {
        if (a == null) {
            synchronized (Analytics.class) {
                if (a == null) {
                    a = new Analytics(h5.b(context, (f) null, (Long) null));
                }
            }
        }
        return a;
    }
}
