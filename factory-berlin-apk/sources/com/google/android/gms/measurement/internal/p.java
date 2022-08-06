package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
public final class p implements Parcelable.Creator<n> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int x = SafeParcelReader.x(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < x) {
            int p = SafeParcelReader.p(parcel);
            if (SafeParcelReader.i(p) != 2) {
                SafeParcelReader.w(parcel, p);
            } else {
                bundle = SafeParcelReader.a(parcel, p);
            }
        }
        SafeParcelReader.h(parcel, x);
        return new n(bundle);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new n[i2];
    }
}
