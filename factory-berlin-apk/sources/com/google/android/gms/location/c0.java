package com.google.android.gms.location;

import android.os.IBinder;
import android.os.Parcel;
import g.b.a.b.c.e.a;
import g.b.a.b.c.e.d0;

public final class c0 extends a implements a0 {
    c0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.ILocationCallback");
    }

    public final void P0(LocationAvailability locationAvailability) {
        Parcel i2 = i();
        d0.c(i2, locationAvailability);
        S0(2, i2);
    }

    public final void R(LocationResult locationResult) {
        Parcel i2 = i();
        d0.c(i2, locationResult);
        S0(1, i2);
    }
}
