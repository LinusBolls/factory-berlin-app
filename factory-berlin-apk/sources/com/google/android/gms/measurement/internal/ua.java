package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
public final class ua extends a {
    public static final Parcelable.Creator<ua> CREATOR = new xa();

    /* renamed from: g  reason: collision with root package name */
    public String f3163g;

    /* renamed from: h  reason: collision with root package name */
    public String f3164h;

    /* renamed from: i  reason: collision with root package name */
    public ea f3165i;

    /* renamed from: j  reason: collision with root package name */
    public long f3166j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f3167k;

    /* renamed from: l  reason: collision with root package name */
    public String f3168l;

    /* renamed from: m  reason: collision with root package name */
    public s f3169m;

    /* renamed from: n  reason: collision with root package name */
    public long f3170n;
    public s o;
    public long p;
    public s q;

    ua(ua uaVar) {
        r.k(uaVar);
        this.f3163g = uaVar.f3163g;
        this.f3164h = uaVar.f3164h;
        this.f3165i = uaVar.f3165i;
        this.f3166j = uaVar.f3166j;
        this.f3167k = uaVar.f3167k;
        this.f3168l = uaVar.f3168l;
        this.f3169m = uaVar.f3169m;
        this.f3170n = uaVar.f3170n;
        this.o = uaVar.o;
        this.p = uaVar.p;
        this.q = uaVar.q;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = b.a(parcel);
        b.q(parcel, 2, this.f3163g, false);
        b.q(parcel, 3, this.f3164h, false);
        b.o(parcel, 4, this.f3165i, i2, false);
        b.m(parcel, 5, this.f3166j);
        b.c(parcel, 6, this.f3167k);
        b.q(parcel, 7, this.f3168l, false);
        b.o(parcel, 8, this.f3169m, i2, false);
        b.m(parcel, 9, this.f3170n);
        b.o(parcel, 10, this.o, i2, false);
        b.m(parcel, 11, this.p);
        b.o(parcel, 12, this.q, i2, false);
        b.b(parcel, a);
    }

    ua(String str, String str2, ea eaVar, long j2, boolean z, String str3, s sVar, long j3, s sVar2, long j4, s sVar3) {
        this.f3163g = str;
        this.f3164h = str2;
        this.f3165i = eaVar;
        this.f3166j = j2;
        this.f3167k = z;
        this.f3168l = str3;
        this.f3169m = sVar;
        this.f3170n = j3;
        this.o = sVar2;
        this.p = j4;
        this.q = sVar3;
    }
}
