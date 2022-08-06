package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.a;
import g.b.a.b.c.c.a;

public final class o0 extends a implements m0 {
    o0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    public final com.google.android.gms.dynamic.a c() {
        Parcel l2 = l(1, i());
        com.google.android.gms.dynamic.a l3 = a.C0065a.l(l2.readStrongBinder());
        l2.recycle();
        return l3;
    }

    public final int d() {
        Parcel l2 = l(2, i());
        int readInt = l2.readInt();
        l2.recycle();
        return readInt;
    }
}
