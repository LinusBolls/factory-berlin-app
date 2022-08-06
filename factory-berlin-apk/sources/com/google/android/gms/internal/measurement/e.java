package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
public final class e extends a implements c {
    e(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    public final void D(String str, String str2, Bundle bundle, long j2) {
        Parcel i2 = i();
        i2.writeString(str);
        i2.writeString(str2);
        v.c(i2, bundle);
        i2.writeLong(j2);
        o(1, i2);
    }

    public final int b() {
        Parcel l2 = l(2, i());
        int readInt = l2.readInt();
        l2.recycle();
        return readInt;
    }
}
