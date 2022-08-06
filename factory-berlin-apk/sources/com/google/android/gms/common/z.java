package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class z implements Parcelable.Creator<y> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int x = SafeParcelReader.x(parcel);
        boolean z = false;
        String str = null;
        IBinder iBinder = null;
        boolean z2 = false;
        while (parcel.dataPosition() < x) {
            int p = SafeParcelReader.p(parcel);
            int i2 = SafeParcelReader.i(p);
            if (i2 == 1) {
                str = SafeParcelReader.d(parcel, p);
            } else if (i2 == 2) {
                iBinder = SafeParcelReader.q(parcel, p);
            } else if (i2 == 3) {
                z = SafeParcelReader.j(parcel, p);
            } else if (i2 != 4) {
                SafeParcelReader.w(parcel, p);
            } else {
                z2 = SafeParcelReader.j(parcel, p);
            }
        }
        SafeParcelReader.h(parcel, x);
        return new y(str, iBinder, z, z2);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new y[i2];
    }
}
