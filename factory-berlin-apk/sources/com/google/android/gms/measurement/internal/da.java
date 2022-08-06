package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
public final class da implements Parcelable.Creator<ea> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int x = SafeParcelReader.x(parcel);
        String str = null;
        Long l2 = null;
        Float f2 = null;
        String str2 = null;
        String str3 = null;
        Double d2 = null;
        long j2 = 0;
        int i2 = 0;
        while (parcel.dataPosition() < x) {
            int p = SafeParcelReader.p(parcel);
            switch (SafeParcelReader.i(p)) {
                case 1:
                    i2 = SafeParcelReader.r(parcel2, p);
                    break;
                case 2:
                    str = SafeParcelReader.d(parcel2, p);
                    break;
                case 3:
                    j2 = SafeParcelReader.s(parcel2, p);
                    break;
                case 4:
                    l2 = SafeParcelReader.t(parcel2, p);
                    break;
                case 5:
                    f2 = SafeParcelReader.o(parcel2, p);
                    break;
                case 6:
                    str2 = SafeParcelReader.d(parcel2, p);
                    break;
                case 7:
                    str3 = SafeParcelReader.d(parcel2, p);
                    break;
                case 8:
                    d2 = SafeParcelReader.m(parcel2, p);
                    break;
                default:
                    SafeParcelReader.w(parcel2, p);
                    break;
            }
        }
        SafeParcelReader.h(parcel2, x);
        return new ea(i2, str, j2, l2, f2, str2, str3, d2);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new ea[i2];
    }
}
