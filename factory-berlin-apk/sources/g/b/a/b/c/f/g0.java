package g.b.a.b.c.f;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class g0 implements Parcelable.Creator<f0> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int x = SafeParcelReader.x(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        byte[] bArr = null;
        boolean z = false;
        while (parcel.dataPosition() < x) {
            int p = SafeParcelReader.p(parcel);
            int i2 = SafeParcelReader.i(p);
            if (i2 == 1) {
                str = SafeParcelReader.d(parcel, p);
            } else if (i2 == 2) {
                str2 = SafeParcelReader.d(parcel, p);
            } else if (i2 == 3) {
                str3 = SafeParcelReader.d(parcel, p);
            } else if (i2 == 4) {
                z = SafeParcelReader.j(parcel, p);
            } else if (i2 != 5) {
                SafeParcelReader.w(parcel, p);
            } else {
                bArr = SafeParcelReader.b(parcel, p);
            }
        }
        SafeParcelReader.h(parcel, x);
        return new f0(str, str2, str3, z, bArr);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new f0[i2];
    }
}
