package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.a;
import g.b.a.b.c.c.a;
import g.b.a.b.c.c.c;

public final class g extends a implements f {
    g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final int L(com.google.android.gms.dynamic.a aVar, String str, boolean z) {
        Parcel i2 = i();
        c.c(i2, aVar);
        i2.writeString(str);
        c.a(i2, z);
        Parcel l2 = l(3, i2);
        int readInt = l2.readInt();
        l2.recycle();
        return readInt;
    }

    public final com.google.android.gms.dynamic.a V(com.google.android.gms.dynamic.a aVar, String str, int i2) {
        Parcel i3 = i();
        c.c(i3, aVar);
        i3.writeString(str);
        i3.writeInt(i2);
        Parcel l2 = l(4, i3);
        com.google.android.gms.dynamic.a l3 = a.C0065a.l(l2.readStrongBinder());
        l2.recycle();
        return l3;
    }

    public final com.google.android.gms.dynamic.a n0(com.google.android.gms.dynamic.a aVar, String str, int i2) {
        Parcel i3 = i();
        c.c(i3, aVar);
        i3.writeString(str);
        i3.writeInt(i2);
        Parcel l2 = l(2, i3);
        com.google.android.gms.dynamic.a l3 = a.C0065a.l(l2.readStrongBinder());
        l2.recycle();
        return l3;
    }

    public final int p(com.google.android.gms.dynamic.a aVar, String str, boolean z) {
        Parcel i2 = i();
        c.c(i2, aVar);
        i2.writeString(str);
        c.a(i2, z);
        Parcel l2 = l(5, i2);
        int readInt = l2.readInt();
        l2.recycle();
        return readInt;
    }

    public final int s0() {
        Parcel l2 = l(6, i());
        int readInt = l2.readInt();
        l2.recycle();
        return readInt;
    }
}
