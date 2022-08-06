package com.google.android.gms.location;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

public final class s implements Parcelable.Creator<r> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int x = SafeParcelReader.x(parcel);
        ArrayList<String> arrayList = null;
        String str = "";
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < x) {
            int p = SafeParcelReader.p(parcel);
            int i2 = SafeParcelReader.i(p);
            if (i2 == 1) {
                arrayList = SafeParcelReader.e(parcel, p);
            } else if (i2 == 2) {
                pendingIntent = (PendingIntent) SafeParcelReader.c(parcel, p, PendingIntent.CREATOR);
            } else if (i2 != 3) {
                SafeParcelReader.w(parcel, p);
            } else {
                str = SafeParcelReader.d(parcel, p);
            }
        }
        SafeParcelReader.h(parcel, x);
        return new r(arrayList, pendingIntent, str);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new r[i2];
    }
}
