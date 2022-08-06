package g.b.a.b.c.e;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.location.t;
import java.util.List;

public final class h0 implements Parcelable.Creator<g0> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int x = SafeParcelReader.x(parcel);
        t tVar = g0.f9336k;
        List<d> list = g0.f9335j;
        String str = null;
        while (parcel.dataPosition() < x) {
            int p = SafeParcelReader.p(parcel);
            int i2 = SafeParcelReader.i(p);
            if (i2 == 1) {
                tVar = (t) SafeParcelReader.c(parcel, p, t.CREATOR);
            } else if (i2 == 2) {
                list = SafeParcelReader.g(parcel, p, d.CREATOR);
            } else if (i2 != 3) {
                SafeParcelReader.w(parcel, p);
            } else {
                str = SafeParcelReader.d(parcel, p);
            }
        }
        SafeParcelReader.h(parcel, x);
        return new g0(tVar, list, str);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new g0[i2];
    }
}
