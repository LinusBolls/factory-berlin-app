package com.google.android.gms.nearby.messages;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.nearby.messages.internal.e;
import g.b.a.b.c.f.b1;
import g.b.a.b.c.f.g1;
import java.util.ArrayList;
import java.util.List;

public final class m implements Parcelable.Creator<d> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int x = SafeParcelReader.x(parcel);
        ArrayList<e> arrayList = null;
        ArrayList<g1> arrayList2 = null;
        ArrayList<b1> arrayList3 = null;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        while (parcel.dataPosition() < x) {
            int p = SafeParcelReader.p(parcel);
            int i4 = SafeParcelReader.i(p);
            if (i4 == 1) {
                arrayList = SafeParcelReader.g(parcel, p, e.CREATOR);
            } else if (i4 == 2) {
                arrayList2 = SafeParcelReader.g(parcel, p, g1.CREATOR);
            } else if (i4 == 3) {
                z = SafeParcelReader.j(parcel, p);
            } else if (i4 == 4) {
                arrayList3 = SafeParcelReader.g(parcel, p, b1.CREATOR);
            } else if (i4 == 5) {
                i3 = SafeParcelReader.r(parcel, p);
            } else if (i4 != 1000) {
                SafeParcelReader.w(parcel, p);
            } else {
                i2 = SafeParcelReader.r(parcel, p);
            }
        }
        SafeParcelReader.h(parcel, x);
        return new d(i2, (List<e>) arrayList, (List<g1>) arrayList2, z, (List<b1>) arrayList3, i3);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new d[i2];
    }
}
