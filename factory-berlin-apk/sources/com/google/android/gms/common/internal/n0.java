package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.a;
import g.b.a.b.c.c.b;
import g.b.a.b.c.c.c;

public abstract class n0 extends b implements m0 {
    public n0() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    public static m0 l(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        if (queryLocalInterface instanceof m0) {
            return (m0) queryLocalInterface;
        }
        return new o0(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean i(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 == 1) {
            a c = c();
            parcel2.writeNoException();
            c.c(parcel2, c);
        } else if (i2 != 2) {
            return false;
        } else {
            int d2 = d();
            parcel2.writeNoException();
            parcel2.writeInt(d2);
        }
        return true;
    }
}
