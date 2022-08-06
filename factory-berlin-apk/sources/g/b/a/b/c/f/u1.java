package g.b.a.b.c.f;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class u1 implements Parcelable.Creator<s1> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int x = SafeParcelReader.x(parcel);
        while (parcel.dataPosition() < x) {
            int p = SafeParcelReader.p(parcel);
            SafeParcelReader.i(p);
            SafeParcelReader.w(parcel, p);
        }
        SafeParcelReader.h(parcel, x);
        return new s1();
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new s1[i2];
    }
}
