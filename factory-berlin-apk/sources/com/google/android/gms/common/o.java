package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class o implements Parcelable.Creator<b> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int x = SafeParcelReader.x(parcel);
        PendingIntent pendingIntent = null;
        String str = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < x) {
            int p = SafeParcelReader.p(parcel);
            int i4 = SafeParcelReader.i(p);
            if (i4 == 1) {
                i2 = SafeParcelReader.r(parcel, p);
            } else if (i4 == 2) {
                i3 = SafeParcelReader.r(parcel, p);
            } else if (i4 == 3) {
                pendingIntent = (PendingIntent) SafeParcelReader.c(parcel, p, PendingIntent.CREATOR);
            } else if (i4 != 4) {
                SafeParcelReader.w(parcel, p);
            } else {
                str = SafeParcelReader.d(parcel, p);
            }
        }
        SafeParcelReader.h(parcel, x);
        return new b(i2, i3, pendingIntent, str);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new b[i2];
    }
}
