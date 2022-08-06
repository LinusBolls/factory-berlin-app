package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
public final class ff extends a implements df {
    ff(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    public final void f(Bundle bundle) {
        Parcel i2 = i();
        v.c(i2, bundle);
        o(1, i2);
    }
}
