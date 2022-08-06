package g.b.a.b.c.f;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import g.b.a.b.d.b.i;

public final class r0 extends a {
    public static final Parcelable.Creator<r0> CREATOR = new s0();

    /* renamed from: g  reason: collision with root package name */
    private String f9411g;

    /* renamed from: h  reason: collision with root package name */
    private i f9412h;

    private r0() {
    }

    r0(String str, i iVar) {
        this.f9411g = str;
        this.f9412h = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r0) {
            r0 r0Var = (r0) obj;
            return p.a(this.f9411g, r0Var.f9411g) && p.a(this.f9412h, r0Var.f9412h);
        }
    }

    public final int hashCode() {
        return p.b(this.f9411g, this.f9412h);
    }

    public final String l() {
        return this.f9411g;
    }

    public final i n() {
        return this.f9412h;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = b.a(parcel);
        b.q(parcel, 1, this.f9411g, false);
        b.o(parcel, 2, this.f9412h, i2, false);
        b.b(parcel, a);
    }
}
