package g.b.a.b.c.f;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class v0 implements Parcelable.Creator<u0> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int x = SafeParcelReader.x(parcel);
        int i2 = 0;
        while (parcel.dataPosition() < x) {
            int p = SafeParcelReader.p(parcel);
            if (SafeParcelReader.i(p) != 1) {
                SafeParcelReader.w(parcel, p);
            } else {
                i2 = SafeParcelReader.r(parcel, p);
            }
        }
        SafeParcelReader.h(parcel, x);
        return new u0(i2);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new u0[i2];
    }
}
