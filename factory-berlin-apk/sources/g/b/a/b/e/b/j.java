package g.b.a.b.e.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class j implements Parcelable.Creator<i> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int x = SafeParcelReader.x(parcel);
        int i2 = 0;
        s sVar = null;
        while (parcel.dataPosition() < x) {
            int p = SafeParcelReader.p(parcel);
            int i3 = SafeParcelReader.i(p);
            if (i3 == 1) {
                i2 = SafeParcelReader.r(parcel, p);
            } else if (i3 != 2) {
                SafeParcelReader.w(parcel, p);
            } else {
                sVar = (s) SafeParcelReader.c(parcel, p, s.CREATOR);
            }
        }
        SafeParcelReader.h(parcel, x);
        return new i(i2, sVar);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new i[i2];
    }
}
