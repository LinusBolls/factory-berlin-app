package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class f implements Parcelable.Creator<e> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int x = SafeParcelReader.x(parcel);
        String str = null;
        String str2 = null;
        int i2 = 0;
        while (parcel.dataPosition() < x) {
            int p = SafeParcelReader.p(parcel);
            int i3 = SafeParcelReader.i(p);
            if (i3 == 1) {
                str = SafeParcelReader.d(parcel, p);
            } else if (i3 == 2) {
                str2 = SafeParcelReader.d(parcel, p);
            } else if (i3 != 1000) {
                SafeParcelReader.w(parcel, p);
            } else {
                i2 = SafeParcelReader.r(parcel, p);
            }
        }
        SafeParcelReader.h(parcel, x);
        return new e(i2, str, str2);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new e[i2];
    }
}
