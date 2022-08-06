package com.google.android.gms.measurement;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.measurement.internal.y4;
import com.google.android.gms.measurement.internal.z4;
import e.n.a.a;

/* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
public final class AppMeasurementReceiver extends a implements y4 {

    /* renamed from: i  reason: collision with root package name */
    private z4 f2702i;

    public final void a(Context context, Intent intent) {
        a.c(context, intent);
    }

    public final void onReceive(Context context, Intent intent) {
        if (this.f2702i == null) {
            this.f2702i = new z4(this);
        }
        this.f2702i.a(context, intent);
    }
}
