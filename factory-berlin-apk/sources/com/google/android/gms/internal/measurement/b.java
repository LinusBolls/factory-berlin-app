package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
public abstract class b extends s0 implements c {
    public b() {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    /* access modifiers changed from: protected */
    public final boolean i(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 == 1) {
            D(parcel.readString(), parcel.readString(), (Bundle) v.a(parcel, Bundle.CREATOR), parcel.readLong());
            parcel2.writeNoException();
        } else if (i2 != 2) {
            return false;
        } else {
            int b = b();
            parcel2.writeNoException();
            parcel2.writeInt(b);
        }
        return true;
    }
}
