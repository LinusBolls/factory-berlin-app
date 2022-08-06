package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
public final class la extends a {
    public static final Parcelable.Creator<la> CREATOR = new ka();
    public final List<String> A;
    public final String B;
    public final String C;

    /* renamed from: g  reason: collision with root package name */
    public final String f2956g;

    /* renamed from: h  reason: collision with root package name */
    public final String f2957h;

    /* renamed from: i  reason: collision with root package name */
    public final String f2958i;

    /* renamed from: j  reason: collision with root package name */
    public final String f2959j;

    /* renamed from: k  reason: collision with root package name */
    public final long f2960k;

    /* renamed from: l  reason: collision with root package name */
    public final long f2961l;

    /* renamed from: m  reason: collision with root package name */
    public final String f2962m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f2963n;
    public final boolean o;
    public final long p;
    public final String q;
    public final long r;
    public final long s;
    public final int t;
    public final boolean u;
    public final boolean v;
    public final boolean w;
    public final String x;
    public final Boolean y;
    public final long z;

    la(String str, String str2, String str3, long j2, String str4, long j3, long j4, String str5, boolean z2, boolean z3, String str6, long j5, long j6, int i2, boolean z4, boolean z5, boolean z6, String str7, Boolean bool, long j7, List<String> list, String str8, String str9) {
        r.g(str);
        this.f2956g = str;
        this.f2957h = TextUtils.isEmpty(str2) ? null : str2;
        this.f2958i = str3;
        this.p = j2;
        this.f2959j = str4;
        this.f2960k = j3;
        this.f2961l = j4;
        this.f2962m = str5;
        this.f2963n = z2;
        this.o = z3;
        this.q = str6;
        this.r = j5;
        this.s = j6;
        this.t = i2;
        this.u = z4;
        this.v = z5;
        this.w = z6;
        this.x = str7;
        this.y = bool;
        this.z = j7;
        this.A = list;
        this.B = str8;
        this.C = str9;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = b.a(parcel);
        b.q(parcel, 2, this.f2956g, false);
        b.q(parcel, 3, this.f2957h, false);
        b.q(parcel, 4, this.f2958i, false);
        b.q(parcel, 5, this.f2959j, false);
        b.m(parcel, 6, this.f2960k);
        b.m(parcel, 7, this.f2961l);
        b.q(parcel, 8, this.f2962m, false);
        b.c(parcel, 9, this.f2963n);
        b.c(parcel, 10, this.o);
        b.m(parcel, 11, this.p);
        b.q(parcel, 12, this.q, false);
        b.m(parcel, 13, this.r);
        b.m(parcel, 14, this.s);
        b.l(parcel, 15, this.t);
        b.c(parcel, 16, this.u);
        b.c(parcel, 17, this.v);
        b.c(parcel, 18, this.w);
        b.q(parcel, 19, this.x, false);
        b.d(parcel, 21, this.y, false);
        b.m(parcel, 22, this.z);
        b.r(parcel, 23, this.A, false);
        b.q(parcel, 24, this.B, false);
        b.q(parcel, 25, this.C, false);
        b.b(parcel, a);
    }

    la(String str, String str2, String str3, String str4, long j2, long j3, String str5, boolean z2, boolean z3, long j4, String str6, long j5, long j6, int i2, boolean z4, boolean z5, boolean z6, String str7, Boolean bool, long j7, List<String> list, String str8, String str9) {
        this.f2956g = str;
        this.f2957h = str2;
        this.f2958i = str3;
        this.p = j4;
        this.f2959j = str4;
        this.f2960k = j2;
        this.f2961l = j3;
        this.f2962m = str5;
        this.f2963n = z2;
        this.o = z3;
        this.q = str6;
        this.r = j5;
        this.s = j6;
        this.t = i2;
        this.u = z4;
        this.v = z5;
        this.w = z6;
        this.x = str7;
        this.y = bool;
        this.z = j7;
        this.A = list;
        this.B = str8;
        this.C = str9;
    }
}
