package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;

final class n implements o {
    private final IBinder a;

    n(IBinder iBinder) {
        this.a = iBinder;
    }

    public final void W(m mVar, h hVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(mVar != null ? mVar.asBinder() : null);
            if (hVar != null) {
                obtain.writeInt(1);
                hVar.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.a.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.a;
    }
}
