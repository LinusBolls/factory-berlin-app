package g.b.a.b.e.b;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class c implements Parcelable.Creator<b> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int x = SafeParcelReader.x(parcel);
        int i2 = 0;
        Intent intent = null;
        int i3 = 0;
        while (parcel.dataPosition() < x) {
            int p = SafeParcelReader.p(parcel);
            int i4 = SafeParcelReader.i(p);
            if (i4 == 1) {
                i2 = SafeParcelReader.r(parcel, p);
            } else if (i4 == 2) {
                i3 = SafeParcelReader.r(parcel, p);
            } else if (i4 != 3) {
                SafeParcelReader.w(parcel, p);
            } else {
                intent = (Intent) SafeParcelReader.c(parcel, p, Intent.CREATOR);
            }
        }
        SafeParcelReader.h(parcel, x);
        return new b(i2, i3, intent);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new b[i2];
    }
}
