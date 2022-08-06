package d.a.a.a;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: IResultReceiver */
public interface a extends IInterface {

    /* renamed from: d.a.a.a.a$a  reason: collision with other inner class name */
    /* compiled from: IResultReceiver */
    public static abstract class C0547a extends Binder implements a {

        /* renamed from: d.a.a.a.a$a$a  reason: collision with other inner class name */
        /* compiled from: IResultReceiver */
        private static class C0548a implements a {
            public static a b;
            private IBinder a;

            C0548a(IBinder iBinder) {
                this.a = iBinder;
            }

            public void M0(int i2, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.os.IResultReceiver");
                    obtain.writeInt(i2);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.a.transact(1, obtain, (Parcel) null, 1) || C0547a.l() == null) {
                        obtain.recycle();
                    } else {
                        C0547a.l().M0(i2, bundle);
                    }
                } finally {
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.a;
            }
        }

        public C0547a() {
            attachInterface(this, "android.support.v4.os.IResultReceiver");
        }

        public static a i(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof a)) {
                return new C0548a(iBinder);
            }
            return (a) queryLocalInterface;
        }

        public static a l() {
            return C0548a.b;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            if (i2 == 1) {
                parcel.enforceInterface("android.support.v4.os.IResultReceiver");
                M0(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                return true;
            } else if (i2 != 1598968902) {
                return super.onTransact(i2, parcel, parcel2, i3);
            } else {
                parcel2.writeString("android.support.v4.os.IResultReceiver");
                return true;
            }
        }
    }

    void M0(int i2, Bundle bundle);
}
