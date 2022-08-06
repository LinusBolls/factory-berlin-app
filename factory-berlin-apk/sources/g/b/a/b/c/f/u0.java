package g.b.a.b.c.f;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public final class u0 extends a {
    public static final Parcelable.Creator<u0> CREATOR = new v0();

    /* renamed from: g  reason: collision with root package name */
    private int f9413g;

    private u0() {
    }

    u0(int i2) {
        this.f9413g = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u0) {
            return p.a(Integer.valueOf(this.f9413g), Integer.valueOf(((u0) obj).f9413g));
        }
        return false;
    }

    public final int hashCode() {
        return p.b(Integer.valueOf(this.f9413g));
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = b.a(parcel);
        b.l(parcel, 1, this.f9413g);
        b.b(parcel, a);
    }
}
