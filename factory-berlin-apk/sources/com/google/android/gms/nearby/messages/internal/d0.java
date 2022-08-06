package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class d0 implements Parcelable.Creator<c0> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int x = SafeParcelReader.x(parcel);
        int i2 = 0;
        double d2 = 0.0d;
        int i3 = 0;
        while (parcel.dataPosition() < x) {
            int p = SafeParcelReader.p(parcel);
            int i4 = SafeParcelReader.i(p);
            if (i4 == 1) {
                i2 = SafeParcelReader.r(parcel, p);
            } else if (i4 == 2) {
                i3 = SafeParcelReader.r(parcel, p);
            } else if (i4 != 3) {
                SafeParcelReader.w(parcel, p);
            } else {
                d2 = SafeParcelReader.l(parcel, p);
            }
        }
        SafeParcelReader.h(parcel, x);
        return new c0(i2, i3, d2);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new c0[i2];
    }
}
