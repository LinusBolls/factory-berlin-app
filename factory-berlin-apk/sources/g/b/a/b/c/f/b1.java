package g.b.a.b.c.f;

import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.Arrays;

public final class b1 extends a {
    public static final Parcelable.Creator<b1> CREATOR = new c1();

    /* renamed from: g  reason: collision with root package name */
    private final int f9361g;

    /* renamed from: h  reason: collision with root package name */
    private final ParcelUuid f9362h;

    /* renamed from: i  reason: collision with root package name */
    private final ParcelUuid f9363i;

    /* renamed from: j  reason: collision with root package name */
    private final ParcelUuid f9364j;

    /* renamed from: k  reason: collision with root package name */
    private final byte[] f9365k;

    /* renamed from: l  reason: collision with root package name */
    private final byte[] f9366l;

    /* renamed from: m  reason: collision with root package name */
    private final int f9367m;

    /* renamed from: n  reason: collision with root package name */
    private final byte[] f9368n;
    private final byte[] o;

    b1(int i2, ParcelUuid parcelUuid, ParcelUuid parcelUuid2, ParcelUuid parcelUuid3, byte[] bArr, byte[] bArr2, int i3, byte[] bArr3, byte[] bArr4) {
        this.f9361g = i2;
        this.f9362h = parcelUuid;
        this.f9363i = parcelUuid2;
        this.f9364j = parcelUuid3;
        this.f9365k = bArr;
        this.f9366l = bArr2;
        this.f9367m = i3;
        this.f9368n = bArr3;
        this.o = bArr4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b1.class == obj.getClass()) {
            b1 b1Var = (b1) obj;
            return this.f9367m == b1Var.f9367m && Arrays.equals(this.f9368n, b1Var.f9368n) && Arrays.equals(this.o, b1Var.o) && p.a(this.f9364j, b1Var.f9364j) && Arrays.equals(this.f9365k, b1Var.f9365k) && Arrays.equals(this.f9366l, b1Var.f9366l) && p.a(this.f9362h, b1Var.f9362h) && p.a(this.f9363i, b1Var.f9363i);
        }
    }

    public final int hashCode() {
        return p.b(Integer.valueOf(this.f9367m), Integer.valueOf(Arrays.hashCode(this.f9368n)), Integer.valueOf(Arrays.hashCode(this.o)), this.f9364j, Integer.valueOf(Arrays.hashCode(this.f9365k)), Integer.valueOf(Arrays.hashCode(this.f9366l)), this.f9362h, this.f9363i);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = b.a(parcel);
        b.l(parcel, 1, this.f9361g);
        b.o(parcel, 4, this.f9362h, i2, false);
        b.o(parcel, 5, this.f9363i, i2, false);
        b.o(parcel, 6, this.f9364j, i2, false);
        b.f(parcel, 7, this.f9365k, false);
        b.f(parcel, 8, this.f9366l, false);
        b.l(parcel, 9, this.f9367m);
        b.f(parcel, 10, this.f9368n, false);
        b.f(parcel, 11, this.o, false);
        b.b(parcel, a);
    }
}
