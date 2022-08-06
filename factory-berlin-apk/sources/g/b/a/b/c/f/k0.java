package g.b.a.b.c.f;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class k0 implements Parcelable.Creator<j0> {
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
        return new j0(str);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new j0[i2];
    }
}
