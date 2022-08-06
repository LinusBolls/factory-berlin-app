package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class k implements Parcelable.Creator<Scope> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int x = SafeParcelReader.x(parcel);
        int i2 = 0;
        String str = null;
        while (parcel.dataPosition() < x) {
            int p = SafeParcelReader.p(parcel);
            int i3 = SafeParcelReader.i(p);
            if (i3 == 1) {
                i2 = SafeParcelReader.r(parcel, p);
            } else if (i3 != 2) {
                SafeParcelReader.w(parcel, p);
            } else {
                str = SafeParcelReader.d(parcel, p);
            }
        }
        SafeParcelReader.h(parcel, x);
        return new Scope(i2, str);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new Scope[i2];
    }
}
