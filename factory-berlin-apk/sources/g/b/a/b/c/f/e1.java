package g.b.a.b.c.f;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public final class e1 extends a {
    public static final Parcelable.Creator<e1> CREATOR = new f1();

    /* renamed from: j  reason: collision with root package name */
    public static final e1 f9376j = new e1("", (String) null);

    /* renamed from: g  reason: collision with root package name */
    private final int f9377g;

    /* renamed from: h  reason: collision with root package name */
    private final String f9378h;

    /* renamed from: i  reason: collision with root package name */
    private final String f9379i;

    e1(int i2, String str, String str2) {
        Integer valueOf = Integer.valueOf(i2);
        r.k(valueOf);
        this.f9377g = valueOf.intValue();
        this.f9378h = str == null ? "" : str;
        this.f9379i = str2;
    }

    private e1(String str, String str2) {
        this(1, str, (String) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj;
        return p.a(this.f9378h, e1Var.f9378h) && p.a(this.f9379i, e1Var.f9379i);
    }

    public final int hashCode() {
        return p.b(this.f9378h, this.f9379i);
    }

    public final String toString() {
        String str = this.f9378h;
        String str2 = this.f9379i;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(str2).length());
        sb.append("NearbyDevice{handle=");
        sb.append(str);
        sb.append(", bluetoothAddress=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = b.a(parcel);
        b.q(parcel, 3, this.f9378h, false);
        b.q(parcel, 6, this.f9379i, false);
        b.l(parcel, 1000, this.f9377g);
        b.b(parcel, a);
    }
}
