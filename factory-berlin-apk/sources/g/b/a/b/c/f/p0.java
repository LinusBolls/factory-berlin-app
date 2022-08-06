package g.b.a.b.c.f;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public final class p0 extends a {
    public static final Parcelable.Creator<p0> CREATOR = new q0();

    /* renamed from: g  reason: collision with root package name */
    private String f9408g;

    /* renamed from: h  reason: collision with root package name */
    private x0 f9409h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f9410i;

    private p0() {
    }

    p0(String str, x0 x0Var, boolean z) {
        this.f9408g = str;
        this.f9409h = x0Var;
        this.f9410i = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p0) {
            p0 p0Var = (p0) obj;
            return p.a(this.f9408g, p0Var.f9408g) && p.a(this.f9409h, p0Var.f9409h) && p.a(Boolean.valueOf(this.f9410i), Boolean.valueOf(p0Var.f9410i));
        }
    }

    public final int hashCode() {
        return p.b(this.f9408g, this.f9409h, Boolean.valueOf(this.f9410i));
    }

    public final String l() {
        return this.f9408g;
    }

    public final x0 n() {
        return this.f9409h;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = b.a(parcel);
        b.q(parcel, 1, this.f9408g, false);
        b.o(parcel, 2, this.f9409h, i2, false);
        b.c(parcel, 3, this.f9410i);
        b.b(parcel, a);
    }
}
