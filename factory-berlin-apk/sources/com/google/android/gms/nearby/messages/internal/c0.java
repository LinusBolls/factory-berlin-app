package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.nearby.messages.b;
import java.util.Locale;

public final class c0 extends a implements b {
    public static final Parcelable.Creator<c0> CREATOR = new d0();

    /* renamed from: g  reason: collision with root package name */
    private final int f3290g;

    /* renamed from: h  reason: collision with root package name */
    private final int f3291h;

    /* renamed from: i  reason: collision with root package name */
    private final double f3292i;

    c0(int i2, int i3, double d2) {
        this.f3290g = i2;
        this.f3291h = i3;
        this.f3292i = d2;
    }

    public final double P() {
        return this.f3292i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return n() == c0Var.n() && compareTo(c0Var) == 0;
    }

    public final int hashCode() {
        return p.b(Integer.valueOf(n()), Double.valueOf(P()));
    }

    /* renamed from: l */
    public final int compareTo(b bVar) {
        if (!Double.isNaN(P()) || !Double.isNaN(bVar.P())) {
            return Double.compare(P(), bVar.P());
        }
        return 0;
    }

    public final int n() {
        return this.f3291h;
    }

    public final String toString() {
        Locale locale = Locale.US;
        Object[] objArr = new Object[2];
        objArr[0] = Double.valueOf(this.f3292i);
        objArr[1] = this.f3291h != 1 ? "UNKNOWN" : "LOW";
        return String.format(locale, "(%.1fm, %s)", objArr);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = com.google.android.gms.common.internal.safeparcel.b.a(parcel);
        com.google.android.gms.common.internal.safeparcel.b.l(parcel, 1, this.f3290g);
        com.google.android.gms.common.internal.safeparcel.b.l(parcel, 2, this.f3291h);
        com.google.android.gms.common.internal.safeparcel.b.g(parcel, 3, this.f3292i);
        com.google.android.gms.common.internal.safeparcel.b.b(parcel, a);
    }
}
