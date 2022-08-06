package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class l implements Parcelable.Creator<Status> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int x = SafeParcelReader.x(parcel);
        String str = null;
        PendingIntent pendingIntent = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < x) {
            int p = SafeParcelReader.p(parcel);
            int i4 = SafeParcelReader.i(p);
            if (i4 == 1) {
                i3 = SafeParcelReader.r(parcel, p);
            } else if (i4 == 2) {
                str = SafeParcelReader.d(parcel, p);
            } else if (i4 == 3) {
                pendingIntent = (PendingIntent) SafeParcelReader.c(parcel, p, PendingIntent.CREATOR);
            } else if (i4 != 1000) {
                SafeParcelReader.w(parcel, p);
            } else {
                i2 = SafeParcelReader.r(parcel, p);
            }
        }
        SafeParcelReader.h(parcel, x);
        return new Status(i2, i3, str, pendingIntent);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new Status[i2];
    }
}
