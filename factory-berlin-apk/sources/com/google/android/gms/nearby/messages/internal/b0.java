package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class b0 implements Parcelable.Creator<ClientAppContext> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int x = SafeParcelReader.x(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        while (parcel.dataPosition() < x) {
            int p = SafeParcelReader.p(parcel);
            switch (SafeParcelReader.i(p)) {
                case 1:
                    i2 = SafeParcelReader.r(parcel, p);
                    break;
                case 2:
                    str = SafeParcelReader.d(parcel, p);
                    break;
                case 3:
                    str2 = SafeParcelReader.d(parcel, p);
                    break;
                case 4:
                    z = SafeParcelReader.j(parcel, p);
                    break;
                case 5:
                    i3 = SafeParcelReader.r(parcel, p);
                    break;
                case 6:
                    str3 = SafeParcelReader.d(parcel, p);
                    break;
                default:
                    SafeParcelReader.w(parcel, p);
                    break;
            }
        }
        SafeParcelReader.h(parcel, x);
        return new ClientAppContext(i2, str, str2, z, i3, str3);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new ClientAppContext[i2];
    }
}
