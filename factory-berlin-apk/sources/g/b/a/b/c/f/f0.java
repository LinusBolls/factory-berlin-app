package g.b.a.b.c.f;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.Arrays;

public final class f0 extends a {
    public static final Parcelable.Creator<f0> CREATOR = new g0();

    /* renamed from: g  reason: collision with root package name */
    private String f9380g;

    /* renamed from: h  reason: collision with root package name */
    private String f9381h;

    /* renamed from: i  reason: collision with root package name */
    private String f9382i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f9383j;

    /* renamed from: k  reason: collision with root package name */
    private byte[] f9384k;

    private f0() {
    }

    f0(String str, String str2, String str3, boolean z, byte[] bArr) {
        this.f9380g = str;
        this.f9381h = str2;
        this.f9382i = str3;
        this.f9383j = z;
        this.f9384k = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f0) {
            f0 f0Var = (f0) obj;
            return p.a(this.f9380g, f0Var.f9380g) && p.a(this.f9381h, f0Var.f9381h) && p.a(this.f9382i, f0Var.f9382i) && p.a(Boolean.valueOf(this.f9383j), Boolean.valueOf(f0Var.f9383j)) && Arrays.equals(this.f9384k, f0Var.f9384k);
        }
    }

    public final int hashCode() {
        return p.b(this.f9380g, this.f9381h, this.f9382i, Boolean.valueOf(this.f9383j), Integer.valueOf(Arrays.hashCode(this.f9384k)));
    }

    public final String l() {
        return this.f9382i;
    }

    public final String n() {
        return this.f9380g;
    }

    public final String o() {
        return this.f9381h;
    }

    public final boolean q() {
        return this.f9383j;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = b.a(parcel);
        b.q(parcel, 1, this.f9380g, false);
        b.q(parcel, 2, this.f9381h, false);
        b.q(parcel, 3, this.f9382i, false);
        b.c(parcel, 4, this.f9383j);
        b.f(parcel, 5, this.f9384k, false);
        b.b(parcel, a);
    }
}
