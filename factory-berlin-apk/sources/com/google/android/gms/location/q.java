package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class q implements Parcelable.Creator<p> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int x = SafeParcelReader.x(parcel);
        long j2 = -1;
        long j3 = -1;
        int i2 = 1;
        int i3 = 1;
        while (parcel.dataPosition() < x) {
            int p = SafeParcelReader.p(parcel);
            int i4 = SafeParcelReader.i(p);
            if (i4 == 1) {
                i2 = SafeParcelReader.r(parcel, p);
            } else if (i4 == 2) {
                i3 = SafeParcelReader.r(parcel, p);
            } else if (i4 == 3) {
                j2 = SafeParcelReader.s(parcel, p);
            } else if (i4 != 4) {
                SafeParcelReader.w(parcel, p);
            } else {
                j3 = SafeParcelReader.s(parcel, p);
            }
        }
        SafeParcelReader.h(parcel, x);
        return new p(i2, i3, j2, j3);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new p[i2];
    }
}
