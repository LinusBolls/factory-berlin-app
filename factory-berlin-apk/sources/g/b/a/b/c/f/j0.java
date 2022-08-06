package g.b.a.b.c.f;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public final class j0 extends a {
    public static final Parcelable.Creator<j0> CREATOR = new k0();

    /* renamed from: g  reason: collision with root package name */
    private String f9392g;

    private j0() {
    }

    j0(String str) {
        this.f9392g = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j0) {
            return p.a(this.f9392g, ((j0) obj).f9392g);
        }
        return false;
    }

    public final int hashCode() {
        return p.b(this.f9392g);
    }

    public final String l() {
        return this.f9392g;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = b.a(parcel);
        b.q(parcel, 1, this.f9392g, false);
        b.b(parcel, a);
    }
}
