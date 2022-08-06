package g.b.a.b.c.e;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class b0 implements Parcelable.Creator<a0> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int x = SafeParcelReader.x(parcel);
        double d2 = 0.0d;
        double d3 = 0.0d;
        String str = null;
        long j2 = 0;
        int i2 = 0;
        short s = 0;
        float f2 = 0.0f;
        int i3 = 0;
        int i4 = -1;
        while (parcel.dataPosition() < x) {
            int p = SafeParcelReader.p(parcel);
            switch (SafeParcelReader.i(p)) {
                case 1:
                    str = SafeParcelReader.d(parcel2, p);
                    break;
                case 2:
                    j2 = SafeParcelReader.s(parcel2, p);
                    break;
                case 3:
                    s = SafeParcelReader.u(parcel2, p);
                    break;
                case 4:
                    d2 = SafeParcelReader.l(parcel2, p);
                    break;
                case 5:
                    d3 = SafeParcelReader.l(parcel2, p);
                    break;
                case 6:
                    f2 = SafeParcelReader.n(parcel2, p);
                    break;
                case 7:
                    i2 = SafeParcelReader.r(parcel2, p);
                    break;
                case 8:
                    i3 = SafeParcelReader.r(parcel2, p);
                    break;
                case 9:
                    i4 = SafeParcelReader.r(parcel2, p);
                    break;
                default:
                    SafeParcelReader.w(parcel2, p);
                    break;
            }
        }
        SafeParcelReader.h(parcel2, x);
        return new a0(str, i2, s, d2, d3, f2, j2, i3, i4);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new a0[i2];
    }
}
