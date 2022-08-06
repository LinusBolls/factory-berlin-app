package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import g.b.a.b.c.c.b;

public abstract class q0 extends b implements p0 {
    public static p0 l(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
        if (queryLocalInterface instanceof p0) {
            return (p0) queryLocalInterface;
        }
        return new r0(iBinder);
    }
}
