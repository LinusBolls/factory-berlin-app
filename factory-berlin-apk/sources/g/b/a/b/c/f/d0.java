package g.b.a.b.c.f;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public final class d0 extends a {
    public static final Parcelable.Creator<d0> CREATOR = new e0();

    /* renamed from: g  reason: collision with root package name */
    private String f9369g;

    /* renamed from: h  reason: collision with root package name */
    private int f9370h;

    private d0() {
    }

    d0(String str, int i2) {
        this.f9369g = str;
        this.f9370h = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d0) {
            d0 d0Var = (d0) obj;
            return p.a(this.f9369g, d0Var.f9369g) && p.a(Integer.valueOf(this.f9370h), Integer.valueOf(d0Var.f9370h));
        }
    }

    public final int hashCode() {
        return p.b(this.f9369g, Integer.valueOf(this.f9370h));
    }

    public final int l() {
        return this.f9370h;
    }

    public final String n() {
        return this.f9369g;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = b.a(parcel);
        b.q(parcel, 1, this.f9369g, false);
        b.l(parcel, 2, this.f9370h);
        b.b(parcel, a);
    }
}
