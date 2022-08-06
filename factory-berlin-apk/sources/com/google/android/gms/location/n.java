package com.google.android.gms.location;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.List;

public final class n implements Parcelable.Creator<LocationResult> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int x = SafeParcelReader.x(parcel);
        List<Location> list = LocationResult.f2676h;
        while (parcel.dataPosition() < x) {
            int p = SafeParcelReader.p(parcel);
            if (SafeParcelReader.i(p) != 1) {
                SafeParcelReader.w(parcel, p);
            } else {
                list = SafeParcelReader.g(parcel, p, Location.CREATOR);
            }
        }
        SafeParcelReader.h(parcel, x);
        return new LocationResult(list);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new LocationResult[i2];
    }
}
