package com.google.android.gms.location;

import android.location.Location;
import android.os.IBinder;
import android.os.Parcel;
import g.b.a.b.c.e.a;
import g.b.a.b.c.e.d0;

public final class f0 extends a implements d0 {
    f0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.ILocationListener");
    }

    public final void m(Location location) {
        Parcel i2 = i();
        d0.c(i2, location);
        S0(1, i2);
    }
}
