package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class d extends a {
    public static final Parcelable.Creator<d> CREATOR = new p();

    /* renamed from: g  reason: collision with root package name */
    private final String f2106g;
    @Deprecated

    /* renamed from: h  reason: collision with root package name */
    private final int f2107h;

    /* renamed from: i  reason: collision with root package name */
    private final long f2108i;

    public d(String str, int i2, long j2) {
        this.f2106g = str;
        this.f2107h = i2;
        this.f2108i = j2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (((l() == null || !l().equals(dVar.l())) && (l() != null || dVar.l() != null)) || n() != dVar.n()) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return p.b(l(), Long.valueOf(n()));
    }

    public String l() {
        return this.f2106g;
    }

    public long n() {
        long j2 = this.f2108i;
        return j2 == -1 ? (long) this.f2107h : j2;
    }

    public String toString() {
        p.a c = p.c(this);
        c.a("name", l());
        c.a("version", Long.valueOf(n()));
        return c.toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a = b.a(parcel);
        b.q(parcel, 1, l(), false);
        b.l(parcel, 2, this.f2107h);
        b.m(parcel, 3, n());
        b.b(parcel, a);
    }
}
