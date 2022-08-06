package g.b.a.b.c.f;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class h1 implements Parcelable.Creator<g1> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int x = SafeParcelReader.x(parcel);
        int i2 = 0;
        byte[] bArr = null;
        int i3 = 0;
        boolean z = false;
        while (parcel.dataPosition() < x) {
            int p = SafeParcelReader.p(parcel);
            int i4 = SafeParcelReader.i(p);
            if (i4 == 1) {
                i3 = SafeParcelReader.r(parcel, p);
            } else if (i4 == 2) {
                bArr = SafeParcelReader.b(parcel, p);
            } else if (i4 == 3) {
                z = SafeParcelReader.j(parcel, p);
            } else if (i4 != 1000) {
                SafeParcelReader.w(parcel, p);
            } else {
                i2 = SafeParcelReader.r(parcel, p);
            }
        }
        SafeParcelReader.h(parcel, x);
        return new g1(i2, i3, bArr, z);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new g1[i2];
    }
}
