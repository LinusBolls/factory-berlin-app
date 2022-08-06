package g.b.a.b.c.f;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import g.b.a.b.d.b.i;

public final class s0 implements Parcelable.Creator<r0> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int x = SafeParcelReader.x(parcel);
        String str = null;
        i iVar = null;
        while (parcel.dataPosition() < x) {
            int p = SafeParcelReader.p(parcel);
            int i2 = SafeParcelReader.i(p);
            if (i2 == 1) {
                str = SafeParcelReader.d(parcel, p);
            } else if (i2 != 2) {
                SafeParcelReader.w(parcel, p);
            } else {
                iVar = (i) SafeParcelReader.c(parcel, p, i.CREATOR);
            }
        }
        SafeParcelReader.h(parcel, x);
        return new r0(str, iVar);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new r0[i2];
    }
}
