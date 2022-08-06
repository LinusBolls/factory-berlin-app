package g.b.a.b.c.e;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.location.t;
import java.util.Collections;
import java.util.List;

public final class g0 extends a {
    public static final Parcelable.Creator<g0> CREATOR = new h0();

    /* renamed from: j  reason: collision with root package name */
    static final List<d> f9335j = Collections.emptyList();

    /* renamed from: k  reason: collision with root package name */
    static final t f9336k = new t();

    /* renamed from: g  reason: collision with root package name */
    private t f9337g;

    /* renamed from: h  reason: collision with root package name */
    private List<d> f9338h;

    /* renamed from: i  reason: collision with root package name */
    private String f9339i;

    g0(t tVar, List<d> list, String str) {
        this.f9337g = tVar;
        this.f9338h = list;
        this.f9339i = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return p.a(this.f9337g, g0Var.f9337g) && p.a(this.f9338h, g0Var.f9338h) && p.a(this.f9339i, g0Var.f9339i);
    }

    public final int hashCode() {
        return this.f9337g.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = b.a(parcel);
        b.o(parcel, 1, this.f9337g, i2, false);
        b.t(parcel, 2, this.f9338h, false);
        b.q(parcel, 3, this.f9339i, false);
        b.b(parcel, a);
    }
}
