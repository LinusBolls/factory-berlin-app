package g.b.a.b.c.f;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.nearby.messages.internal.g0;
import java.util.UUID;

public final class g1 extends a {
    public static final Parcelable.Creator<g1> CREATOR = new h1();

    /* renamed from: g  reason: collision with root package name */
    private final int f9385g;

    /* renamed from: h  reason: collision with root package name */
    private final int f9386h;

    /* renamed from: i  reason: collision with root package name */
    private final byte[] f9387i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f9388j;

    g1(int i2, int i3, byte[] bArr, boolean z) {
        this.f9385g = i2;
        this.f9386h = i3;
        this.f9387i = bArr;
        this.f9388j = z;
    }

    private g1(int i2, byte[] bArr) {
        this(1, i2, bArr, false);
    }

    public static g1 l(UUID uuid, Short sh, Short sh2) {
        return new g1(3, new g0(uuid, sh, sh2).a());
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = b.a(parcel);
        b.l(parcel, 1, this.f9386h);
        b.f(parcel, 2, this.f9387i, false);
        b.c(parcel, 3, this.f9388j);
        b.l(parcel, 1000, this.f9385g);
        b.b(parcel, a);
    }
}
