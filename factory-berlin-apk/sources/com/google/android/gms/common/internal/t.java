package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.b;
import com.google.android.gms.common.internal.l;
import com.google.android.gms.common.internal.safeparcel.a;

public class t extends a {
    public static final Parcelable.Creator<t> CREATOR = new e0();

    /* renamed from: g  reason: collision with root package name */
    private final int f2169g;

    /* renamed from: h  reason: collision with root package name */
    private IBinder f2170h;

    /* renamed from: i  reason: collision with root package name */
    private b f2171i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f2172j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f2173k;

    t(int i2, IBinder iBinder, b bVar, boolean z, boolean z2) {
        this.f2169g = i2;
        this.f2170h = iBinder;
        this.f2171i = bVar;
        this.f2172j = z;
        this.f2173k = z2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f2171i.equals(tVar.f2171i) && l().equals(tVar.l());
    }

    public l l() {
        return l.a.l(this.f2170h);
    }

    public b n() {
        return this.f2171i;
    }

    public boolean o() {
        return this.f2172j;
    }

    public boolean q() {
        return this.f2173k;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a = com.google.android.gms.common.internal.safeparcel.b.a(parcel);
        com.google.android.gms.common.internal.safeparcel.b.l(parcel, 1, this.f2169g);
        com.google.android.gms.common.internal.safeparcel.b.k(parcel, 2, this.f2170h, false);
        com.google.android.gms.common.internal.safeparcel.b.o(parcel, 3, n(), i2, false);
        com.google.android.gms.common.internal.safeparcel.b.c(parcel, 4, o());
        com.google.android.gms.common.internal.safeparcel.b.c(parcel, 5, q());
        com.google.android.gms.common.internal.safeparcel.b.b(parcel, a);
    }
}
