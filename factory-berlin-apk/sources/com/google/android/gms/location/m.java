package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class m implements Parcelable.Creator<LocationRequest> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int x = SafeParcelReader.x(parcel);
        long j2 = 3600000;
        long j3 = 600000;
        long j4 = Long.MAX_VALUE;
        long j5 = 0;
        int i2 = 102;
        boolean z = false;
        int i3 = Integer.MAX_VALUE;
        float f2 = 0.0f;
        while (parcel.dataPosition() < x) {
            int p = SafeParcelReader.p(parcel);
            switch (SafeParcelReader.i(p)) {
                case 1:
                    i2 = SafeParcelReader.r(parcel2, p);
                    break;
                case 2:
                    j2 = SafeParcelReader.s(parcel2, p);
                    break;
                case 3:
                    j3 = SafeParcelReader.s(parcel2, p);
                    break;
                case 4:
                    z = SafeParcelReader.j(parcel2, p);
                    break;
                case 5:
                    j4 = SafeParcelReader.s(parcel2, p);
                    break;
                case 6:
                    i3 = SafeParcelReader.r(parcel2, p);
                    break;
                case 7:
                    f2 = SafeParcelReader.n(parcel2, p);
                    break;
                case 8:
                    j5 = SafeParcelReader.s(parcel2, p);
                    break;
                default:
                    SafeParcelReader.w(parcel2, p);
                    break;
            }
        }
        SafeParcelReader.h(parcel2, x);
        return new LocationRequest(i2, j2, j3, z, j4, i3, f2, j5);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new LocationRequest[i2];
    }
}
