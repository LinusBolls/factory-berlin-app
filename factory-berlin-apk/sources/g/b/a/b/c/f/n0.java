package g.b.a.b.c.f;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public final class n0 extends a {
    public static final Parcelable.Creator<n0> CREATOR = new o0();

    /* renamed from: g  reason: collision with root package name */
    private String f9397g;

    private n0() {
    }

    n0(String str) {
        this.f9397g = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n0) {
            return p.a(this.f9397g, ((n0) obj).f9397g);
        }
        return false;
    }

    public final int hashCode() {
        return p.b(this.f9397g);
    }

    public final String l() {
        return this.f9397g;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = b.a(parcel);
        b.q(parcel, 1, this.f9397g, false);
        b.b(parcel, a);
    }
}
