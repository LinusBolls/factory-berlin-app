package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import g.b.a.b.c.e.a0;
import java.util.ArrayList;

public final class w implements Parcelable.Creator<g> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int x = SafeParcelReader.x(parcel);
        ArrayList<a0> arrayList = null;
        int i2 = 0;
        String str = "";
        while (parcel.dataPosition() < x) {
            int p = SafeParcelReader.p(parcel);
            int i3 = SafeParcelReader.i(p);
            if (i3 == 1) {
                arrayList = SafeParcelReader.g(parcel, p, a0.CREATOR);
            } else if (i3 == 2) {
                i2 = SafeParcelReader.r(parcel, p);
            } else if (i3 != 3) {
                SafeParcelReader.w(parcel, p);
            } else {
                str = SafeParcelReader.d(parcel, p);
            }
        }
        SafeParcelReader.h(parcel, x);
        return new g(arrayList, i2, str);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new g[i2];
    }
}
