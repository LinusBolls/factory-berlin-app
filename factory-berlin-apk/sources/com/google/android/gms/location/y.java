package com.google.android.gms.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import g.b.a.b.c.e.t;

public class y extends t implements x {
    public static x l(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.IDeviceOrientationListener");
        return queryLocalInterface instanceof x ? (x) queryLocalInterface : new z(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean i(int i2, Parcel parcel, Parcel parcel2, int i3) {
        throw new NoSuchMethodError();
    }
}
