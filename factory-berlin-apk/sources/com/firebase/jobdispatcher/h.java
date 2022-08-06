package com.firebase.jobdispatcher;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: GooglePlayJobCallback */
final class h implements o {
    private final IBinder a;

    public h(IBinder iBinder) {
        this.a = iBinder;
    }

    public void a(int i2) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.gcm.INetworkTaskCallback");
            obtain.writeInt(i2);
            this.a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            obtain.recycle();
            obtain2.recycle();
        } catch (RemoteException e2) {
            throw new RuntimeException(e2);
        } catch (Throwable th) {
            obtain.recycle();
            obtain2.recycle();
            throw th;
        }
    }
}
