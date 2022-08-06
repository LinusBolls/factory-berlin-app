package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class o implements Parcelable.Creator<a> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int x = SafeParcelReader.x(parcel);
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (parcel.dataPosition() < x) {
            int p = SafeParcelReader.p(parcel);
            int i5 = SafeParcelReader.i(p);
            if (i5 == 1) {
                i2 = SafeParcelReader.r(parcel, p);
            } else if (i5 == 2) {
                i3 = SafeParcelReader.r(parcel, p);
            } else if (i5 != 3) {
                SafeParcelReader.w(parcel, p);
            } else {
                i4 = SafeParcelReader.r(parcel, p);
            }
        }
        SafeParcelReader.h(parcel, x);
        return new a(i2, i3, i4);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new a[i2];
    }
}
