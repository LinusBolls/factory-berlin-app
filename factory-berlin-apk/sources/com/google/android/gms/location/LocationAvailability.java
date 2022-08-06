package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.Arrays;

public final class LocationAvailability extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationAvailability> CREATOR = new l();
    @Deprecated

    /* renamed from: g  reason: collision with root package name */
    private int f2663g;
    @Deprecated

    /* renamed from: h  reason: collision with root package name */
    private int f2664h;

    /* renamed from: i  reason: collision with root package name */
    private long f2665i;

    /* renamed from: j  reason: collision with root package name */
    private int f2666j;

    /* renamed from: k  reason: collision with root package name */
    private p[] f2667k;

    LocationAvailability(int i2, int i3, int i4, long j2, p[] pVarArr) {
        this.f2666j = i2;
        this.f2663g = i3;
        this.f2664h = i4;
        this.f2665i = j2;
        this.f2667k = pVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && LocationAvailability.class == obj.getClass()) {
            LocationAvailability locationAvailability = (LocationAvailability) obj;
            return this.f2663g == locationAvailability.f2663g && this.f2664h == locationAvailability.f2664h && this.f2665i == locationAvailability.f2665i && this.f2666j == locationAvailability.f2666j && Arrays.equals(this.f2667k, locationAvailability.f2667k);
        }
    }

    public final int hashCode() {
        return p.b(Integer.valueOf(this.f2666j), Integer.valueOf(this.f2663g), Integer.valueOf(this.f2664h), Long.valueOf(this.f2665i), this.f2667k);
    }

    public final boolean l() {
        return this.f2666j < 1000;
    }

    public final String toString() {
        boolean l2 = l();
        StringBuilder sb = new StringBuilder(48);
        sb.append("LocationAvailability[isLocationAvailable: ");
        sb.append(l2);
        sb.append("]");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = b.a(parcel);
        b.l(parcel, 1, this.f2663g);
        b.l(parcel, 2, this.f2664h);
        b.m(parcel, 3, this.f2665i);
        b.l(parcel, 4, this.f2666j);
        b.s(parcel, 5, this.f2667k, i2, false);
        b.b(parcel, a);
    }
}
