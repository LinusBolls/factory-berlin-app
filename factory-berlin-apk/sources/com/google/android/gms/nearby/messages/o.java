package com.google.android.gms.nearby.messages;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class o implements Parcelable.Creator<h> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int x = SafeParcelReader.x(parcel);
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        boolean z = false;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (parcel.dataPosition() < x) {
            int p = SafeParcelReader.p(parcel);
            int i9 = SafeParcelReader.i(p);
            if (i9 != 1000) {
                switch (i9) {
                    case 1:
                        i3 = SafeParcelReader.r(parcel, p);
                        break;
                    case 2:
                        i4 = SafeParcelReader.r(parcel, p);
                        break;
                    case 3:
                        i5 = SafeParcelReader.r(parcel, p);
                        break;
                    case 4:
                        z = SafeParcelReader.j(parcel, p);
                        break;
                    case 5:
                        i6 = SafeParcelReader.r(parcel, p);
                        break;
                    case 6:
                        i7 = SafeParcelReader.r(parcel, p);
                        break;
                    case 7:
                        i8 = SafeParcelReader.r(parcel, p);
                        break;
                    default:
                        SafeParcelReader.w(parcel, p);
                        break;
                }
            } else {
                i2 = SafeParcelReader.r(parcel, p);
            }
        }
        SafeParcelReader.h(parcel, x);
        return new h(i2, i3, i4, i5, z, i6, i7, i8);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new h[i2];
    }
}
