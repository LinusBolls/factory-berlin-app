package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
public final class i implements Parcelable.Creator<f> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int x = SafeParcelReader.x(parcel);
        long j2 = 0;
        long j3 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        Bundle bundle = null;
        boolean z = false;
        while (parcel.dataPosition() < x) {
            int p = SafeParcelReader.p(parcel);
            switch (SafeParcelReader.i(p)) {
                case 1:
                    j2 = SafeParcelReader.s(parcel2, p);
                    break;
                case 2:
                    j3 = SafeParcelReader.s(parcel2, p);
                    break;
                case 3:
                    z = SafeParcelReader.j(parcel2, p);
                    break;
                case 4:
                    str = SafeParcelReader.d(parcel2, p);
                    break;
                case 5:
                    str2 = SafeParcelReader.d(parcel2, p);
                    break;
                case 6:
                    str3 = SafeParcelReader.d(parcel2, p);
                    break;
                case 7:
                    bundle = SafeParcelReader.a(parcel2, p);
                    break;
                default:
                    SafeParcelReader.w(parcel2, p);
                    break;
            }
        }
        SafeParcelReader.h(parcel2, x);
        return new f(j2, j3, z, str, str2, str3, bundle);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new f[i2];
    }
}
