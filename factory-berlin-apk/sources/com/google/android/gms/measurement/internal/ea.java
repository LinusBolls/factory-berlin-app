package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
public final class ea extends a {
    public static final Parcelable.Creator<ea> CREATOR = new da();

    /* renamed from: g  reason: collision with root package name */
    private final int f2822g;

    /* renamed from: h  reason: collision with root package name */
    public final String f2823h;

    /* renamed from: i  reason: collision with root package name */
    public final long f2824i;

    /* renamed from: j  reason: collision with root package name */
    public final Long f2825j;

    /* renamed from: k  reason: collision with root package name */
    public final String f2826k;

    /* renamed from: l  reason: collision with root package name */
    public final String f2827l;

    /* renamed from: m  reason: collision with root package name */
    public final Double f2828m;

    ea(ga gaVar) {
        this(gaVar.c, gaVar.f2865d, gaVar.f2866e, gaVar.b);
    }

    public final Object l() {
        Long l2 = this.f2825j;
        if (l2 != null) {
            return l2;
        }
        Double d2 = this.f2828m;
        if (d2 != null) {
            return d2;
        }
        String str = this.f2826k;
        if (str != null) {
            return str;
        }
        return null;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = b.a(parcel);
        b.l(parcel, 1, this.f2822g);
        b.q(parcel, 2, this.f2823h, false);
        b.m(parcel, 3, this.f2824i);
        b.n(parcel, 4, this.f2825j, false);
        b.j(parcel, 5, (Float) null, false);
        b.q(parcel, 6, this.f2826k, false);
        b.q(parcel, 7, this.f2827l, false);
        b.h(parcel, 8, this.f2828m, false);
        b.b(parcel, a);
    }

    ea(String str, long j2, Object obj, String str2) {
        r.g(str);
        this.f2822g = 2;
        this.f2823h = str;
        this.f2824i = j2;
        this.f2827l = str2;
        if (obj == null) {
            this.f2825j = null;
            this.f2828m = null;
            this.f2826k = null;
        } else if (obj instanceof Long) {
            this.f2825j = (Long) obj;
            this.f2828m = null;
            this.f2826k = null;
        } else if (obj instanceof String) {
            this.f2825j = null;
            this.f2828m = null;
            this.f2826k = (String) obj;
        } else if (obj instanceof Double) {
            this.f2825j = null;
            this.f2828m = (Double) obj;
            this.f2826k = null;
        } else {
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }

    ea(int i2, String str, long j2, Long l2, Float f2, String str2, String str3, Double d2) {
        this.f2822g = i2;
        this.f2823h = str;
        this.f2824i = j2;
        this.f2825j = l2;
        if (i2 == 1) {
            this.f2828m = f2 != null ? Double.valueOf(f2.doubleValue()) : null;
        } else {
            this.f2828m = d2;
        }
        this.f2826k = str2;
        this.f2827l = str3;
    }
}
