package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.Parcel;
import g.b.a.b.c.f.a;
import g.b.a.b.c.f.s;

public final class o0 extends a implements n0 {
    o0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
    }

    public final void b0(e0 e0Var) {
        Parcel i2 = i();
        s.b(i2, e0Var);
        o(9, i2);
    }

    public final void d0(y yVar) {
        Parcel i2 = i();
        s.b(i2, yVar);
        o(4, i2);
    }

    public final void o0(SubscribeRequest subscribeRequest) {
        Parcel i2 = i();
        s.b(i2, subscribeRequest);
        o(3, i2);
    }
}
