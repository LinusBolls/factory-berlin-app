package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public final class LocationRequest extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationRequest> CREATOR = new m();

    /* renamed from: g  reason: collision with root package name */
    private int f2668g;

    /* renamed from: h  reason: collision with root package name */
    private long f2669h;

    /* renamed from: i  reason: collision with root package name */
    private long f2670i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f2671j;

    /* renamed from: k  reason: collision with root package name */
    private long f2672k;

    /* renamed from: l  reason: collision with root package name */
    private int f2673l;

    /* renamed from: m  reason: collision with root package name */
    private float f2674m;

    /* renamed from: n  reason: collision with root package name */
    private long f2675n;

    public LocationRequest() {
        this.f2668g = 102;
        this.f2669h = 3600000;
        this.f2670i = 600000;
        this.f2671j = false;
        this.f2672k = Long.MAX_VALUE;
        this.f2673l = Integer.MAX_VALUE;
        this.f2674m = 0.0f;
        this.f2675n = 0;
    }

    LocationRequest(int i2, long j2, long j3, boolean z, long j4, int i3, float f2, long j5) {
        this.f2668g = i2;
        this.f2669h = j2;
        this.f2670i = j3;
        this.f2671j = z;
        this.f2672k = j4;
        this.f2673l = i3;
        this.f2674m = f2;
        this.f2675n = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationRequest)) {
            return false;
        }
        LocationRequest locationRequest = (LocationRequest) obj;
        return this.f2668g == locationRequest.f2668g && this.f2669h == locationRequest.f2669h && this.f2670i == locationRequest.f2670i && this.f2671j == locationRequest.f2671j && this.f2672k == locationRequest.f2672k && this.f2673l == locationRequest.f2673l && this.f2674m == locationRequest.f2674m && l() == locationRequest.l();
    }

    public final int hashCode() {
        return p.b(Integer.valueOf(this.f2668g), Long.valueOf(this.f2669h), Float.valueOf(this.f2674m), Long.valueOf(this.f2675n));
    }

    public final long l() {
        long j2 = this.f2675n;
        long j3 = this.f2669h;
        return j2 < j3 ? j3 : j2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request[");
        int i2 = this.f2668g;
        sb.append(i2 != 100 ? i2 != 102 ? i2 != 104 ? i2 != 105 ? "???" : "PRIORITY_NO_POWER" : "PRIORITY_LOW_POWER" : "PRIORITY_BALANCED_POWER_ACCURACY" : "PRIORITY_HIGH_ACCURACY");
        if (this.f2668g != 105) {
            sb.append(" requested=");
            sb.append(this.f2669h);
            sb.append("ms");
        }
        sb.append(" fastest=");
        sb.append(this.f2670i);
        sb.append("ms");
        if (this.f2675n > this.f2669h) {
            sb.append(" maxWait=");
            sb.append(this.f2675n);
            sb.append("ms");
        }
        if (this.f2674m > 0.0f) {
            sb.append(" smallestDisplacement=");
            sb.append(this.f2674m);
            sb.append("m");
        }
        long j2 = this.f2672k;
        if (j2 != Long.MAX_VALUE) {
            sb.append(" expireIn=");
            sb.append(j2 - SystemClock.elapsedRealtime());
            sb.append("ms");
        }
        if (this.f2673l != Integer.MAX_VALUE) {
            sb.append(" num=");
            sb.append(this.f2673l);
        }
        sb.append(']');
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = b.a(parcel);
        b.l(parcel, 1, this.f2668g);
        b.m(parcel, 2, this.f2669h);
        b.m(parcel, 3, this.f2670i);
        b.c(parcel, 4, this.f2671j);
        b.m(parcel, 5, this.f2672k);
        b.l(parcel, 6, this.f2673l);
        b.i(parcel, 7, this.f2674m);
        b.m(parcel, 8, this.f2675n);
        b.b(parcel, a);
    }
}
