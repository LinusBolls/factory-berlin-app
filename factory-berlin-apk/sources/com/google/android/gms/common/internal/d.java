package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class d extends a {
    public static final Parcelable.Creator<d> CREATOR = new w();

    /* renamed from: g  reason: collision with root package name */
    private final int f2131g;

    /* renamed from: h  reason: collision with root package name */
    private final String f2132h;

    public d(int i2, String str) {
        this.f2131g = i2;
        this.f2132h = str;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof d)) {
            d dVar = (d) obj;
            return dVar.f2131g == this.f2131g && p.a(dVar.f2132h, this.f2132h);
        }
    }

    public int hashCode() {
        return this.f2131g;
    }

    public String toString() {
        int i2 = this.f2131g;
        String str = this.f2132h;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
        sb.append(i2);
        sb.append(":");
        sb.append(str);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a = b.a(parcel);
        b.l(parcel, 1, this.f2131g);
        b.q(parcel, 2, this.f2132h, false);
        b.b(parcel, a);
    }
}
