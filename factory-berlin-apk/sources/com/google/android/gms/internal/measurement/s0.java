package com.google.android.gms.internal.measurement;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
public class s0 extends Binder implements IInterface {
    protected s0(String str) {
        attachInterface(this, str);
    }

    public IBinder asBinder() {
        return this;
    }

    /* access modifiers changed from: protected */
    public abstract boolean i(int i2, Parcel parcel, Parcel parcel2, int i3);

    public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
        boolean z;
        if (i2 > 16777215) {
            z = super.onTransact(i2, parcel, parcel2, i3);
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
            z = false;
        }
        if (z) {
            return true;
        }
        return i(i2, parcel, parcel2, i3);
    }
}
