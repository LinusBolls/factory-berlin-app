package com.google.android.gms.gcm;

import android.os.IBinder;
import android.os.Parcel;
import g.b.a.b.c.d.a;

public final class g extends a implements f {
    g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gcm.INetworkTaskCallback");
    }

    public final void e0(int i2) {
        Parcel i3 = i();
        i3.writeInt(i2);
        l(2, i3);
    }
}
