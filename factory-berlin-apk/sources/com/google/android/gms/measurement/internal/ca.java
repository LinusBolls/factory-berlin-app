package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.internal.r;

/* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
public final class ca {
    final Context a;

    public ca(Context context) {
        r.k(context);
        Context applicationContext = context.getApplicationContext();
        r.k(applicationContext);
        this.a = applicationContext;
    }
}
