package com.google.android.gms.location;

import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import g.b.a.b.c.e.d0;
import g.b.a.b.c.e.t;

public abstract class e0 extends t implements d0 {
    public static d0 l(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
        return queryLocalInterface instanceof d0 ? (d0) queryLocalInterface : new f0(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean i(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 != 1) {
            return false;
        }
        m((Location) d0.a(parcel, Location.CREATOR));
        return true;
    }
}
