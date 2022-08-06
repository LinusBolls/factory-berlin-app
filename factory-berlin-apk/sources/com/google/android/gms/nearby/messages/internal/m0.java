package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import g.b.a.b.c.f.a;
import g.b.a.b.c.f.s;

public final class m0 extends a implements k0 {
    m0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.nearby.messages.internal.INearbyMessagesCallback");
    }

    public final void P(Status status) {
        Parcel i2 = i();
        s.b(i2, status);
        o(1, i2);
    }
}
