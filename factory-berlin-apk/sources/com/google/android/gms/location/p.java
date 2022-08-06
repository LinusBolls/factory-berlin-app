package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public final class p extends a {
    public static final Parcelable.Creator<p> CREATOR = new q();

    /* renamed from: g  reason: collision with root package name */
    private final int f2688g;

    /* renamed from: h  reason: collision with root package name */
    private final int f2689h;

    /* renamed from: i  reason: collision with root package name */
    private final long f2690i;

    /* renamed from: j  reason: collision with root package name */
    private final long f2691j;

    p(int i2, int i3, long j2, long j3) {
        this.f2688g = i2;
        this.f2689h = i3;
        this.f2690i = j2;
        this.f2691j = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p.class == obj.getClass()) {
            p pVar = (p) obj;
            return this.f2688g == pVar.f2688g && this.f2689h == pVar.f2689h && this.f2690i == pVar.f2690i && this.f2691j == pVar.f2691j;
        }
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.p.b(Integer.valueOf(this.f2689h), Integer.valueOf(this.f2688g), Long.valueOf(this.f2691j), Long.valueOf(this.f2690i));
    }

    public final String toString() {
        return "NetworkLocationStatus:" + " Wifi status: " + this.f2688g + " Cell status: " + this.f2689h + " elapsed time NS: " + this.f2691j + " system time ms: " + this.f2690i;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = b.a(parcel);
        b.l(parcel, 1, this.f2688g);
        b.l(parcel, 2, this.f2689h);
        b.m(parcel, 3, this.f2690i);
        b.m(parcel, 4, this.f2691j);
        b.b(parcel, a);
    }
}
