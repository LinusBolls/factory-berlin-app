package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
public abstract class gf extends s0 implements df {
    public gf() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    /* access modifiers changed from: protected */
    public final boolean i(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 != 1) {
            return false;
        }
        f((Bundle) v.a(parcel, Bundle.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
