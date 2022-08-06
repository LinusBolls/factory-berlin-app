package g.b.a.b.c.f;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.Arrays;

public final class h0 extends a {
    public static final Parcelable.Creator<h0> CREATOR = new i0();

    /* renamed from: g  reason: collision with root package name */
    private String f9389g;

    /* renamed from: h  reason: collision with root package name */
    private int f9390h;

    /* renamed from: i  reason: collision with root package name */
    private byte[] f9391i;

    private h0() {
    }

    h0(String str, int i2, byte[] bArr) {
        this.f9389g = str;
        this.f9390h = i2;
        this.f9391i = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h0) {
            h0 h0Var = (h0) obj;
            return p.a(this.f9389g, h0Var.f9389g) && p.a(Integer.valueOf(this.f9390h), Integer.valueOf(h0Var.f9390h)) && Arrays.equals(this.f9391i, h0Var.f9391i);
        }
    }

    public final int hashCode() {
        return p.b(this.f9389g, Integer.valueOf(this.f9390h), Integer.valueOf(Arrays.hashCode(this.f9391i)));
    }

    public final int l() {
        return this.f9390h;
    }

    public final String n() {
        return this.f9389g;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = b.a(parcel);
        b.q(parcel, 1, this.f9389g, false);
        b.l(parcel, 2, this.f9390h);
        b.f(parcel, 3, this.f9391i, false);
        b.b(parcel, a);
    }
}
