package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public final class Scope extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new k();

    /* renamed from: g  reason: collision with root package name */
    private final int f2023g;

    /* renamed from: h  reason: collision with root package name */
    private final String f2024h;

    Scope(int i2, String str) {
        r.h(str, "scopeUri must not be null or empty");
        this.f2023g = i2;
        this.f2024h = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f2024h.equals(((Scope) obj).f2024h);
    }

    public final int hashCode() {
        return this.f2024h.hashCode();
    }

    public final String l() {
        return this.f2024h;
    }

    public final String toString() {
        return this.f2024h;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = b.a(parcel);
        b.l(parcel, 1, this.f2023g);
        b.q(parcel, 2, l(), false);
        b.b(parcel, a);
    }

    public Scope(String str) {
        this(1, str);
    }
}
