package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class f0 implements Parcelable.Creator<e0> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int x = SafeParcelReader.x(parcel);
        int i2 = 0;
        ClientAppContext clientAppContext = null;
        int i3 = 0;
        while (parcel.dataPosition() < x) {
            int p = SafeParcelReader.p(parcel);
            int i4 = SafeParcelReader.i(p);
            if (i4 == 1) {
                i2 = SafeParcelReader.r(parcel, p);
            } else if (i4 == 2) {
                clientAppContext = (ClientAppContext) SafeParcelReader.c(parcel, p, ClientAppContext.CREATOR);
            } else if (i4 != 3) {
                SafeParcelReader.w(parcel, p);
            } else {
                i3 = SafeParcelReader.r(parcel, p);
            }
        }
        SafeParcelReader.h(parcel, x);
        return new e0(i2, clientAppContext, i3);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new e0[i2];
    }
}
