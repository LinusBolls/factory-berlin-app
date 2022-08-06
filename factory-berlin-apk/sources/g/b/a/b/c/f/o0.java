package g.b.a.b.c.f;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class o0 implements Parcelable.Creator<n0> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int x = SafeParcelReader.x(parcel);
        String str = null;
        while (parcel.dataPosition() < x) {
            int p = SafeParcelReader.p(parcel);
            if (SafeParcelReader.i(p) != 1) {
                SafeParcelReader.w(parcel, p);
            } else {
                str = SafeParcelReader.d(parcel, p);
            }
        }
        SafeParcelReader.h(parcel, x);
        return new n0(str);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new n0[i2];
    }
}
