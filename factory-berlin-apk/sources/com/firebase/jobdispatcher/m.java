package com.firebase.jobdispatcher;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: IRemoteJobService */
public interface m extends IInterface {

    /* compiled from: IRemoteJobService */
    public static abstract class a extends Binder implements m {

        /* renamed from: com.firebase.jobdispatcher.m$a$a  reason: collision with other inner class name */
        /* compiled from: IRemoteJobService */
        private static class C0055a implements m {
            private IBinder a;

            C0055a(IBinder iBinder) {
                this.a = iBinder;
            }

            public void J(Bundle bundle, l lVar) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.firebase.jobdispatcher.IRemoteJobService");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(lVar != null ? lVar.asBinder() : null);
                    this.a.transact(1, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.a;
            }

            public void q0(Bundle bundle, boolean z) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.firebase.jobdispatcher.IRemoteJobService");
                    int i2 = 0;
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (z) {
                        i2 = 1;
                    }
                    obtain.writeInt(i2);
                    this.a.transact(2, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public static m i(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.firebase.jobdispatcher.IRemoteJobService");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof m)) {
                return new C0055a(iBinder);
            }
            return (m) queryLocalInterface;
        }
    }

    void J(Bundle bundle, l lVar);

    void q0(Bundle bundle, boolean z);
}
