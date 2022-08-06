package g.b.a.b.c.e;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.location.LocationRequest;
import java.util.Collections;
import java.util.List;

public final class w extends a {
    public static final Parcelable.Creator<w> CREATOR = new x();

    /* renamed from: n  reason: collision with root package name */
    static final List<d> f9347n = Collections.emptyList();

    /* renamed from: g  reason: collision with root package name */
    private LocationRequest f9348g;

    /* renamed from: h  reason: collision with root package name */
    private List<d> f9349h;

    /* renamed from: i  reason: collision with root package name */
    private String f9350i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f9351j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f9352k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f9353l;

    /* renamed from: m  reason: collision with root package name */
    private String f9354m;

    w(LocationRequest locationRequest, List<d> list, String str, boolean z, boolean z2, boolean z3, String str2) {
        this.f9348g = locationRequest;
        this.f9349h = list;
        this.f9350i = str;
        this.f9351j = z;
        this.f9352k = z2;
        this.f9353l = z3;
        this.f9354m = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return p.a(this.f9348g, wVar.f9348g) && p.a(this.f9349h, wVar.f9349h) && p.a(this.f9350i, wVar.f9350i) && this.f9351j == wVar.f9351j && this.f9352k == wVar.f9352k && this.f9353l == wVar.f9353l && p.a(this.f9354m, wVar.f9354m);
    }

    public final int hashCode() {
        return this.f9348g.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f9348g);
        if (this.f9350i != null) {
            sb.append(" tag=");
            sb.append(this.f9350i);
        }
        if (this.f9354m != null) {
            sb.append(" moduleId=");
            sb.append(this.f9354m);
        }
        sb.append(" hideAppOps=");
        sb.append(this.f9351j);
        sb.append(" clients=");
        sb.append(this.f9349h);
        sb.append(" forceCoarseLocation=");
        sb.append(this.f9352k);
        if (this.f9353l) {
            sb.append(" exemptFromBackgroundThrottle");
        }
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = b.a(parcel);
        b.o(parcel, 1, this.f9348g, i2, false);
        b.t(parcel, 5, this.f9349h, false);
        b.q(parcel, 6, this.f9350i, false);
        b.c(parcel, 7, this.f9351j);
        b.c(parcel, 8, this.f9352k);
        b.c(parcel, 9, this.f9353l);
        b.q(parcel, 10, this.f9354m, false);
        b.b(parcel, a);
    }
}
