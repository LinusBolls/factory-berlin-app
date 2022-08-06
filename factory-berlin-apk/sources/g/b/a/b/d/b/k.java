package g.b.a.b.d.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class k implements Parcelable.Creator<i> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int x = SafeParcelReader.x(parcel);
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        int i2 = 0;
        while (parcel.dataPosition() < x) {
            int p = SafeParcelReader.p(parcel);
            int i3 = SafeParcelReader.i(p);
            if (i3 == 1) {
                j2 = SafeParcelReader.s(parcel, p);
            } else if (i3 == 2) {
                i2 = SafeParcelReader.r(parcel, p);
            } else if (i3 == 3) {
                j3 = SafeParcelReader.s(parcel, p);
            } else if (i3 != 4) {
                SafeParcelReader.w(parcel, p);
            } else {
                j4 = SafeParcelReader.s(parcel, p);
            }
        }
        SafeParcelReader.h(parcel, x);
        return new i(j2, i2, j3, j4);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new i[i2];
    }
}
