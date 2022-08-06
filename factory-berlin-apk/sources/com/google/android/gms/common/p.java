package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class p implements Parcelable.Creator<d> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int x = SafeParcelReader.x(parcel);
        String str = null;
        int i2 = 0;
        long j2 = -1;
        while (parcel.dataPosition() < x) {
            int p = SafeParcelReader.p(parcel);
            int i3 = SafeParcelReader.i(p);
            if (i3 == 1) {
                str = SafeParcelReader.d(parcel, p);
            } else if (i3 == 2) {
                i2 = SafeParcelReader.r(parcel, p);
            } else if (i3 != 3) {
                SafeParcelReader.w(parcel, p);
            } else {
                j2 = SafeParcelReader.s(parcel, p);
            }
        }
        SafeParcelReader.h(parcel, x);
        return new d(str, i2, j2);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new d[i2];
    }
}
