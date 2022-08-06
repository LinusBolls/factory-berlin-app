package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.a;
import g.b.a.b.c.c.a;
import g.b.a.b.c.c.c;

public final class i extends a implements h {
    i(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final com.google.android.gms.dynamic.a H(com.google.android.gms.dynamic.a aVar, String str, int i2, com.google.android.gms.dynamic.a aVar2) {
        Parcel i3 = i();
        c.c(i3, aVar);
        i3.writeString(str);
        i3.writeInt(i2);
        c.c(i3, aVar2);
        Parcel l2 = l(2, i3);
        com.google.android.gms.dynamic.a l3 = a.C0065a.l(l2.readStrongBinder());
        l2.recycle();
        return l3;
    }

    public final com.google.android.gms.dynamic.a I(com.google.android.gms.dynamic.a aVar, String str, int i2, com.google.android.gms.dynamic.a aVar2) {
        Parcel i3 = i();
        c.c(i3, aVar);
        i3.writeString(str);
        i3.writeInt(i2);
        c.c(i3, aVar2);
        Parcel l2 = l(3, i3);
        com.google.android.gms.dynamic.a l3 = a.C0065a.l(l2.readStrongBinder());
        l2.recycle();
        return l3;
    }
}
