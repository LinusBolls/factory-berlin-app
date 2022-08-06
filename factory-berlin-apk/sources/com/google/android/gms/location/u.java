package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class u implements Parcelable.Creator<t> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int x = SafeParcelReader.x(parcel);
        long j2 = 50;
        long j3 = Long.MAX_VALUE;
        boolean z = true;
        float f2 = 0.0f;
        int i2 = Integer.MAX_VALUE;
        while (parcel.dataPosition() < x) {
            int p = SafeParcelReader.p(parcel);
            int i3 = SafeParcelReader.i(p);
            if (i3 == 1) {
                z = SafeParcelReader.j(parcel2, p);
            } else if (i3 == 2) {
                j2 = SafeParcelReader.s(parcel2, p);
            } else if (i3 == 3) {
                f2 = SafeParcelReader.n(parcel2, p);
            } else if (i3 == 4) {
                j3 = SafeParcelReader.s(parcel2, p);
            } else if (i3 != 5) {
                SafeParcelReader.w(parcel2, p);
            } else {
                i2 = SafeParcelReader.r(parcel2, p);
            }
        }
        SafeParcelReader.h(parcel2, x);
        return new t(z, j2, f2, j3, i2);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new t[i2];
    }
}
