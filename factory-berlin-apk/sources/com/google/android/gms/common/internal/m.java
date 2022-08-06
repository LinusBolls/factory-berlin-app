package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import g.b.a.b.c.c.b;
import g.b.a.b.c.c.c;

public interface m extends IInterface {

    public static abstract class a extends b implements m {
        public a() {
            super("com.google.android.gms.common.internal.IGmsCallbacks");
        }

        /* access modifiers changed from: protected */
        public final boolean i(int i2, Parcel parcel, Parcel parcel2, int i3) {
            if (i2 == 1) {
                O0(parcel.readInt(), parcel.readStrongBinder(), (Bundle) c.b(parcel, Bundle.CREATOR));
            } else if (i2 == 2) {
                C0(parcel.readInt(), (Bundle) c.b(parcel, Bundle.CREATOR));
            } else if (i2 != 3) {
                return false;
            } else {
                r0(parcel.readInt(), parcel.readStrongBinder(), (f0) c.b(parcel, f0.CREATOR));
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void C0(int i2, Bundle bundle);

    void O0(int i2, IBinder iBinder, Bundle bundle);

    void r0(int i2, IBinder iBinder, f0 f0Var);
}
