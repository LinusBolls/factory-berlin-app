package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.y;
import g.b.a.b.c.c.a;
import g.b.a.b.c.c.c;

public final class r0 extends a implements p0 {
    r0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    public final boolean c0(y yVar, com.google.android.gms.dynamic.a aVar) {
        Parcel i2 = i();
        c.d(i2, yVar);
        c.c(i2, aVar);
        Parcel l2 = l(5, i2);
        boolean e2 = c.e(l2);
        l2.recycle();
        return e2;
    }
}
