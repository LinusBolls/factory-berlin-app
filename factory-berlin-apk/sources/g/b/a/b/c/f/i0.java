package g.b.a.b.c.f;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class i0 implements Parcelable.Creator<h0> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int x = SafeParcelReader.x(parcel);
        String str = null;
        byte[] bArr = null;
        int i2 = 0;
        while (parcel.dataPosition() < x) {
            int p = SafeParcelReader.p(parcel);
            int i3 = SafeParcelReader.i(p);
            if (i3 == 1) {
                str = SafeParcelReader.d(parcel, p);
            } else if (i3 == 2) {
                i2 = SafeParcelReader.r(parcel, p);
            } else if (i3 != 3) {
                SafeParcelReader.w(parcel, p);
            } else {
                bArr = SafeParcelReader.b(parcel, p);
            }
        }
        SafeParcelReader.h(parcel, x);
        return new h0(str, i2, bArr);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new h0[i2];
    }
}
