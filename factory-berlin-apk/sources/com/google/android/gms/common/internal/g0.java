package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.d;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class g0 implements Parcelable.Creator<f0> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int x = SafeParcelReader.x(parcel);
        Bundle bundle = null;
        d[] dVarArr = null;
        while (parcel.dataPosition() < x) {
            int p = SafeParcelReader.p(parcel);
            int i2 = SafeParcelReader.i(p);
            if (i2 == 1) {
                bundle = SafeParcelReader.a(parcel, p);
            } else if (i2 != 2) {
                SafeParcelReader.w(parcel, p);
            } else {
                dVarArr = (d[]) SafeParcelReader.f(parcel, p, d.CREATOR);
            }
        }
        SafeParcelReader.h(parcel, x);
        return new f0(bundle, dVarArr);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new f0[i2];
    }
}
