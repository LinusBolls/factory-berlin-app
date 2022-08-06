package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
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
    public final Parcel l(int i2, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.a.transact(i2, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e2) {
            throw e2;
        } finally {
            parcel.recycle();
        }
    }

    /* access modifiers changed from: protected */
    public final void o(int i2, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.a.transact(i2, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
