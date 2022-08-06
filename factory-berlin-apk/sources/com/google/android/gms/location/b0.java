package com.google.android.gms.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import g.b.a.b.c.e.d0;
import g.b.a.b.c.e.t;

public abstract class b0 extends t implements a0 {
    public static a0 l(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
        return queryLocalInterface instanceof a0 ? (a0) queryLocalInterface : new c0(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean i(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 == 1) {
            R((LocationResult) d0.a(parcel, LocationResult.CREATOR));
        } else if (i2 != 2) {
            return false;
        } else {
            P0((LocationAvailability) d0.a(parcel, LocationAvailability.CREATOR));
        }
        return true;
    }
}
