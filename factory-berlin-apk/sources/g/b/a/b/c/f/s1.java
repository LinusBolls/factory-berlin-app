package g.b.a.b.c.f;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public final class s1 extends a {
    public static final Parcelable.Creator<s1> CREATOR = new u1();

    s1() {
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof s1);
    }

    public final int hashCode() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        b.b(parcel, b.a(parcel));
    }
}
