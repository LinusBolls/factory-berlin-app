package g.b.a.b.e.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.t;

public final class l implements Parcelable.Creator<k> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int x = SafeParcelReader.x(parcel);
        b bVar = null;
        t tVar = null;
        int i2 = 0;
        while (parcel.dataPosition() < x) {
            int p = SafeParcelReader.p(parcel);
            int i3 = SafeParcelReader.i(p);
            if (i3 == 1) {
                i2 = SafeParcelReader.r(parcel, p);
            } else if (i3 == 2) {
                bVar = (b) SafeParcelReader.c(parcel, p, b.CREATOR);
            } else if (i3 != 3) {
                SafeParcelReader.w(parcel, p);
            } else {
                tVar = (t) SafeParcelReader.c(parcel, p, t.CREATOR);
            }
        }
        SafeParcelReader.h(parcel, x);
        return new k(i2, bVar, tVar);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new k[i2];
    }
}
