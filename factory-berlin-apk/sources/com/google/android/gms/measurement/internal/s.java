package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
public final class s extends a {
    public static final Parcelable.Creator<s> CREATOR = new r();

    /* renamed from: g  reason: collision with root package name */
    public final String f3081g;

    /* renamed from: h  reason: collision with root package name */
    public final n f3082h;

    /* renamed from: i  reason: collision with root package name */
    public final String f3083i;

    /* renamed from: j  reason: collision with root package name */
    public final long f3084j;

    public s(String str, n nVar, String str2, long j2) {
        this.f3081g = str;
        this.f3082h = nVar;
        this.f3083i = str2;
        this.f3084j = j2;
    }

    public final String toString() {
        String str = this.f3083i;
        String str2 = this.f3081g;
        String valueOf = String.valueOf(this.f3082h);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(str2).length() + String.valueOf(valueOf).length());
        sb.append("origin=");
        sb.append(str);
        sb.append(",name=");
        sb.append(str2);
        sb.append(",params=");
        sb.append(valueOf);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = b.a(parcel);
        b.q(parcel, 2, this.f3081g, false);
        b.o(parcel, 3, this.f3082h, i2, false);
        b.q(parcel, 4, this.f3083i, false);
        b.m(parcel, 5, this.f3084j);
        b.b(parcel, a);
    }

    s(s sVar, long j2) {
        r.k(sVar);
        this.f3081g = sVar.f3081g;
        this.f3082h = sVar.f3082h;
        this.f3083i = sVar.f3083i;
        this.f3084j = j2;
    }
}
