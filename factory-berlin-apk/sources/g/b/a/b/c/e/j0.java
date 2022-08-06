package g.b.a.b.c.e;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class j0 implements Parcelable.Creator<i0> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int x = SafeParcelReader.x(parcel);
        g0 g0Var = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        int i2 = 1;
        while (parcel.dataPosition() < x) {
            int p = SafeParcelReader.p(parcel);
            int i3 = SafeParcelReader.i(p);
            if (i3 == 1) {
                i2 = SafeParcelReader.r(parcel, p);
            } else if (i3 == 2) {
                g0Var = (g0) SafeParcelReader.c(parcel, p, g0.CREATOR);
            } else if (i3 == 3) {
                iBinder = SafeParcelReader.q(parcel, p);
            } else if (i3 != 4) {
                SafeParcelReader.w(parcel, p);
            } else {
                iBinder2 = SafeParcelReader.q(parcel, p);
            }
        }
        SafeParcelReader.h(parcel, x);
        return new i0(i2, g0Var, iBinder, iBinder2);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new i0[i2];
    }
}
