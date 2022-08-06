package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
public final class f extends a {
    public static final Parcelable.Creator<f> CREATOR = new i();

    /* renamed from: g  reason: collision with root package name */
    public final long f2284g;

    /* renamed from: h  reason: collision with root package name */
    public final long f2285h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f2286i;

    /* renamed from: j  reason: collision with root package name */
    public final String f2287j;

    /* renamed from: k  reason: collision with root package name */
    public final String f2288k;

    /* renamed from: l  reason: collision with root package name */
    public final String f2289l;

    /* renamed from: m  reason: collision with root package name */
    public final Bundle f2290m;

    public f(long j2, long j3, boolean z, String str, String str2, String str3, Bundle bundle) {
        this.f2284g = j2;
        this.f2285h = j3;
        this.f2286i = z;
        this.f2287j = str;
        this.f2288k = str2;
        this.f2289l = str3;
        this.f2290m = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = b.a(parcel);
        b.m(parcel, 1, this.f2284g);
        b.m(parcel, 2, this.f2285h);
        b.c(parcel, 3, this.f2286i);
        b.q(parcel, 4, this.f2287j, false);
        b.q(parcel, 5, this.f2288k, false);
        b.q(parcel, 6, this.f2289l, false);
        b.e(parcel, 7, this.f2290m, false);
        b.b(parcel, a);
    }
}
