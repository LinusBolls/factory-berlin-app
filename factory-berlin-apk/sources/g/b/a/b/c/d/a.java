package g.b.a.b.c.d;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class a implements IInterface {
    private final IBinder a;
    private final String b;

    protected a(IBinder iBinder, String str) {
        this.a = iBinder;
        this.b = str;
    }

    public IBinder asBinder() {
        return this.a;
    }

    /* access modifiers changed from: protected */
    public final Parcel i() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    public final void l(int i2, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.a.transact(2, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
