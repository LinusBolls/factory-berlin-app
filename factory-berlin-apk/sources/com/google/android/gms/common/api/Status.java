package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public final class Status extends a implements g, ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR = new l();

    /* renamed from: k  reason: collision with root package name */
    public static final Status f2025k = new Status(0);

    /* renamed from: l  reason: collision with root package name */
    public static final Status f2026l = new Status(14);

    /* renamed from: m  reason: collision with root package name */
    public static final Status f2027m = new Status(15);

    /* renamed from: n  reason: collision with root package name */
    public static final Status f2028n = new Status(16);

    /* renamed from: g  reason: collision with root package name */
    private final int f2029g;

    /* renamed from: h  reason: collision with root package name */
    private final int f2030h;

    /* renamed from: i  reason: collision with root package name */
    private final String f2031i;

    /* renamed from: j  reason: collision with root package name */
    private final PendingIntent f2032j;

    Status(int i2, int i3, String str, PendingIntent pendingIntent) {
        this.f2029g = i2;
        this.f2030h = i3;
        this.f2031i = str;
        this.f2032j = pendingIntent;
    }

    public final String K() {
        String str = this.f2031i;
        if (str != null) {
            return str;
        }
        return b.a(this.f2030h);
    }

    public final Status a() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        if (this.f2029g != status.f2029g || this.f2030h != status.f2030h || !p.a(this.f2031i, status.f2031i) || !p.a(this.f2032j, status.f2032j)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return p.b(Integer.valueOf(this.f2029g), Integer.valueOf(this.f2030h), this.f2031i, this.f2032j);
    }

    public final int l() {
        return this.f2030h;
    }

    public final String n() {
        return this.f2031i;
    }

    public final boolean o() {
        return this.f2032j != null;
    }

    public final boolean q() {
        return this.f2030h <= 0;
    }

    public final String toString() {
        p.a c = p.c(this);
        c.a("statusCode", K());
        c.a("resolution", this.f2032j);
        return c.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = b.a(parcel);
        b.l(parcel, 1, l());
        b.q(parcel, 2, n(), false);
        b.o(parcel, 3, this.f2032j, i2, false);
        b.l(parcel, 1000, this.f2029g);
        b.b(parcel, a);
    }

    public Status(int i2) {
        this(i2, (String) null);
    }

    public Status(int i2, String str) {
        this(1, i2, str, (PendingIntent) null);
    }

    public Status(int i2, String str, PendingIntent pendingIntent) {
        this(1, i2, str, pendingIntent);
    }
}
