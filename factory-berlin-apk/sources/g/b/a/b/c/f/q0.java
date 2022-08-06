package g.b.a.b.c.f;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class q0 implements Parcelable.Creator<p0> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int x = SafeParcelReader.x(parcel);
        String str = null;
        x0 x0Var = null;
        boolean z = false;
        while (parcel.dataPosition() < x) {
            int p = SafeParcelReader.p(parcel);
            int i2 = SafeParcelReader.i(p);
            if (i2 == 1) {
                str = SafeParcelReader.d(parcel, p);
            } else if (i2 == 2) {
                x0Var = (x0) SafeParcelReader.c(parcel, p, x0.CREATOR);
            } else if (i2 != 3) {
                SafeParcelReader.w(parcel, p);
            } else {
                z = SafeParcelReader.j(parcel, p);
            }
        }
        SafeParcelReader.h(parcel, x);
        return new p0(str, x0Var, z);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new p0[i2];
    }
}
